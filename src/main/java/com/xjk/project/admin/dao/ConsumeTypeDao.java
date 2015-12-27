package com.xjk.project.admin.dao;

import com.xjk.project.admin.model.ConsumeTypeModel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * @Verfion:
 * @author: jinkai.xu
 * @Date: 15/12/26 下午12:32
 */

@Repository
public interface ConsumeTypeDao {

    ArrayList<ConsumeTypeModel> selectAllType();


    Boolean delConsumeType(@Param("id") Integer consumeTypeId);

}
