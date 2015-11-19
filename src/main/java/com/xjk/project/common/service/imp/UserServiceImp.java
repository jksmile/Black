package com.xjk.project.common.service.imp;

import com.xjk.project.common.dao.UserDao;
import com.xjk.project.common.model.UserModel;
import com.xjk.project.common.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Verfion:
 * @author: jinkai.xu
 * @Date: 15/11/19 下午3:16
 */
@Service("userService")
public class UserServiceImp implements UserService {




    @Resource
    private UserDao userDao;

    public UserModel checkLogin(String userName, String userPass) {
        return userDao.checkLogin(userName,userPass);


    }
}
