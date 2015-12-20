package com.xjk.project.admin.controller;

import com.xjk.project.admin.constant.SessionConstant;
import com.xjk.project.common.constant.UrlConstant;
import com.xjk.project.common.model.UserModel;
import com.xjk.project.common.service.UserService;
import com.xjk.project.common.utils.CommonProperty;
import com.xjk.project.common.utils.MD5Util;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @Verfion:
 * @author: jinkai.xu
 * @Date: 15/11/19 下午2:22
 */

@RequestMapping("/admin/login")
@Controller
public class LoginController {


    private static final String LOGIN_PAGE = CommonProperty.getIntance().getAdminTemplate().getProperty("LOGIN_PAGE");


    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public Object index(HttpServletRequest request,Model model){
        String userName = request.getParameter(SessionConstant.SESSION_USER_NAME);

        String userPass = request.getParameter(SessionConstant.SESSION_USER_PASS);

        if (StringUtils.isNotBlank(userName) && StringUtils.isNotBlank(userPass)) {

            UserModel userInfo = userService.checkLogin(userName, MD5Util.getPassMD5(userPass));

            if (null != userInfo && !userInfo.getUserName().isEmpty()) {

                request.getSession().setAttribute(SessionConstant.SESSION_USER_NAME,userInfo.getUserName());

                request.getSession().setAttribute(SessionConstant.SESSION_USER_ID,userInfo.getUserId());
                
                return "redirect:"+ UrlConstant.ADMIN_INDEX_URL;
            }

        }

        model.addAttribute("loginName",SessionConstant.SESSION_USER_NAME);

        model.addAttribute("loginPass",SessionConstant.SESSION_USER_PASS);

        model.addAttribute("loginAction",UrlConstant.ADMIN_LOGIN_URL);

        return new ModelAndView(LOGIN_PAGE);
    }



    @RequestMapping("/loginout")
    @ResponseBody
    public String loginOut(HttpServletRequest request, Model model){

        request.getSession().setAttribute(SessionConstant.SESSION_USER_NAME, null);

        request.getSession().setAttribute(SessionConstant.SESSION_USER_ID,null);

        return "1";
    }




}
