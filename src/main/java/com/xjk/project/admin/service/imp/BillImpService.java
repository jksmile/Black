package com.xjk.project.admin.service.imp;

import com.xjk.project.admin.dao.BillDao;
import com.xjk.project.admin.dao.ConsumeTypeDao;
import com.xjk.project.admin.dao.ConsumerDao;
import com.xjk.project.admin.model.BillModel;
import com.xjk.project.admin.model.BillResult;
import com.xjk.project.admin.model.ConsumeTypeModel;
import com.xjk.project.admin.model.ConsumerModel;
import com.xjk.project.admin.service.BillService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author Jinkai.Xu
 * @Datetime 16/1/1 下午11:01
 */
@Service("billService")
public class BillImpService implements BillService {

    @Resource
    private BillDao billDao;

    @Resource
    private ConsumerDao consumerdao;

    @Resource
    private ConsumeTypeDao consumeTypedao;

    public Boolean addBill(BillModel billModel){


        return billDao.addBill(billModel);
    }


    @Override
    public ArrayList<BillResult> getBillList(Integer startPosition){

        ArrayList<BillModel> billList = billDao.selectBill(startPosition);

        ArrayList<BillResult> billListResult = new ArrayList<BillResult>();


        for(BillModel bill:billList){

            BillResult billResult = new BillResult();

            BeanUtils.copyProperties(bill, billResult);

            try {

                Date consumeDate = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(bill.getConsumeDate());

                String consumeDateFinal = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(consumeDate);

                billResult.setConsumeDate(consumeDateFinal);

                billListResult.add(billResult);

            } catch (ParseException e) {

                e.printStackTrace();
            }
        }

        ArrayList<Integer> consumerIdList = new ArrayList<Integer>();

        ArrayList<Integer> consumeTypeIdList = new ArrayList<Integer>();

        for(BillModel bill : billList){

            consumerIdList.add(bill.getConsumerId());

            consumeTypeIdList.add(bill.getConsumeTypeId());
        }

        ArrayList<ConsumerModel> consumerList = consumerdao.selectConsumerByIds(consumerIdList);


        ArrayList<ConsumeTypeModel> consumeTypeList = consumeTypedao.selectTypeByIds(consumeTypeIdList);


        for(BillResult bill:billListResult){

            for(ConsumerModel consumer:consumerList ){

                if(consumer.getConsumerId()== bill.getConsumerId()){

                    bill.setConsumerName( consumer.getConsumerName() );

                    break;
                }
            }

            for(ConsumeTypeModel consumeType:consumeTypeList){

                if(consumeType.getConsumeTypeId() == bill.getConsumeTypeId()){

                    bill.setConsumeTypeName( consumeType.getConsumeTypeName() );

                    break;
                }

            }
        }


        return billListResult;
    }
}
