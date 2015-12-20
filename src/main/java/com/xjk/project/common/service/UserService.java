package com.xjk.project.common.service;

import com.xjk.project.common.model.UserModel;

/**
 * @Verfion:
 * @author: jinkai.xu
 * @Date: 15/11/19 下午3:14
 */


public interface UserService {


    UserModel checkLogin(String userName,String userPass);


    Boolean updatePwd(int userId, String oldPwd, String newPwd);

}
