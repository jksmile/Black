package com.xjk.project.admin.service.imp;

import com.xjk.project.admin.dao.ConsumeTypeDao;
import com.xjk.project.admin.model.ConsumeTypeModel;
import com.xjk.project.admin.model.ConsumeTypeResult;
import com.xjk.project.admin.service.ConsumeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

/**
 * @Verfion:
 * @author: jinkai.xu
 * @Date: 15/12/26 下午12:48
 */
@Service("consumeService")
public class ConsumeImpService implements ConsumeService {


    @Resource
    private ConsumeTypeDao consumeTypeDao;


    public ArrayList<ConsumeTypeResult> getConsumeTypeList() {

        ArrayList<ConsumeTypeModel> consumeTypeList = consumeTypeDao.selectAllType();

        ArrayList<ConsumeTypeResult> consumeTypeResultList = new ArrayList<ConsumeTypeResult>();

        for (ConsumeTypeModel consumeTypeModel : consumeTypeList) {

            if (consumeTypeModel.getConsumeTypePid() == 0) {

                ConsumeTypeResult consumeTypeResult = new ConsumeTypeResult();

                consumeTypeResult.setConsumeTypeModel(consumeTypeModel);

                consumeTypeResultList.add(consumeTypeResult);
            }
        }



        for(ConsumeTypeResult first : consumeTypeResultList){

            ArrayList<ConsumeTypeResult>  second = new ArrayList<ConsumeTypeResult>();

            for(ConsumeTypeModel consumeTypeModel : consumeTypeList){

                if(first.getConsumeTypeModel().getConsumeTypeId() == consumeTypeModel.getConsumeTypePid()){

                    ConsumeTypeResult sub = new ConsumeTypeResult();

                    sub.setConsumeTypeModel(consumeTypeModel);

                    second.add(sub);
                }
            }

            first.setConsumeTypeResultList(second);
        }


        int len = consumeTypeResultList.size();

        for(int i=0; i<len; i++){

            ConsumeTypeResult first = consumeTypeResultList.get(i);

            for(ConsumeTypeResult second : first.getConsumeTypeResultList()){

                ArrayList<ConsumeTypeResult> tmp = new ArrayList<ConsumeTypeResult>();

                for(ConsumeTypeModel consumeTypeModel : consumeTypeList){

                    if(second.getConsumeTypeModel().getConsumeTypeId() == consumeTypeModel.getConsumeTypePid()){

                        ConsumeTypeResult sub = new ConsumeTypeResult();

                        sub.setConsumeTypeModel(consumeTypeModel);

                        tmp.add(sub);
                    }
                }

                second.setConsumeTypeResultList(tmp);
            }
        }

        return consumeTypeResultList;
    }



    public Boolean delConsumeType(Integer consumeTypeId){



        return true;
    }


}
