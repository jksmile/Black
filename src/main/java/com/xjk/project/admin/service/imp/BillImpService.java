package com.xjk.project.admin.service.imp;

import com.xjk.project.admin.dao.BillDao;
import com.xjk.project.admin.model.BillModel;
import com.xjk.project.admin.service.BillService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Jinkai.Xu
 * @Datetime 16/1/1 下午11:01
 */
@Service("billService")
public class BillImpService implements BillService {

    @Resource
    private BillDao billDao;


    public Boolean addBill(BillModel billModel){


        return billDao.addBill(billModel);
    }

}
