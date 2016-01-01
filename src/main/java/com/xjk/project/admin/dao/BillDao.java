package com.xjk.project.admin.dao;

import com.xjk.project.admin.model.BillModel;
import org.springframework.stereotype.Repository;

/**
 * @author Jinkai.Xu
 * @Datetime 16/1/1 下午10:44
 */
@Repository
public interface BillDao {

    Boolean addBill(BillModel billModel);


}
