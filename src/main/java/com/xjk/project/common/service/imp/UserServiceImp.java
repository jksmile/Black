package com.xjk.project.common.service.imp;

import com.xjk.project.common.dao.UserDao;
import com.xjk.project.common.model.UserModel;
import com.xjk.project.common.service.UserService;
import com.xjk.project.common.utils.MD5Util;
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
        return userDao.checkLogin(userName, userPass);


    }



    public Boolean updatePwd(int userId, String oldPwd, String newPwd) {

        UserModel userInfo = userDao.getUserInfoById(userId);

            if(userInfo.getUserPass().equals(MD5Util.getPassMD5(oldPwd))){

                return userDao.updatePassById(userId,MD5Util.getPassMD5(newPwd));
            }else{

                return false;
            }
    }







}
