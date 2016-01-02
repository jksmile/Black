package com.xjk.project.admin.service;

import com.xjk.project.admin.model.BillModel;
import com.xjk.project.admin.model.BillResult;

import java.util.ArrayList;

/**
 * @author Jinkai.Xu
 * @Datetime 16/1/1 下午11:16
 */
public interface BillService {


    Boolean addBill(BillModel billModel);

    ArrayList<BillResult> getBillList(Integer startPosition);


}
