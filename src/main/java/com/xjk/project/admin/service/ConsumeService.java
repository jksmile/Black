package com.xjk.project.admin.service;

import com.xjk.project.admin.model.ConsumeTypeModel;
import com.xjk.project.admin.model.ConsumeTypeResult;
import com.xjk.project.admin.model.ConsumerModel;

import java.util.ArrayList;

/**
 * @Verfion:
 * @author: jinkai.xu
 * @Date: 15/12/26 下午12:29
 */
public interface ConsumeService {


    ArrayList<ConsumeTypeResult> getConsumeTypeList();

    ArrayList<ConsumeTypeModel> getConsumeTypeByPid(Integer pid);

    Boolean delConsumeType(Integer consumeTypeId);

    ArrayList<ConsumerModel> getAllConsumer();

}
