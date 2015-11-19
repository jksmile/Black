package com.xjk.project.common.dao;

import com.xjk.project.common.model.UserModel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Verfion:
 * @author: jinkai.xu
 * @Date: 15/11/19 下午3:18
 */

@Repository
public interface UserDao {


    UserModel checkLogin(@Param("userName") String userName, @Param("userPass") String userPass);


}

