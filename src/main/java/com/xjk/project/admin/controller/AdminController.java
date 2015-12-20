package com.xjk.project.admin.controller;

import com.xjk.project.common.utils.CommonProperty;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Verfion:
 * @author: jinkai.xu
 * @Date: 15/11/19 下午12:58
 */
@RequestMapping("/admin/admin")
@Controller
public class AdminController {


    private static final String ADMIN_PAGE = CommonProperty.getIntance().getAdminTemplate().getProperty("ADMIN_PAGE");

    private static final String ADMIN_MENU_PAGE = CommonProperty.getIntance().getAdminTemplate().getProperty("ADMIN_MENU_PAGE");

    private static final String ADMIN_WELCOME_PAGE = CommonProperty.getIntance().getAdminTemplate().getProperty("ADMIN_WELCOME_PAGE");


    @RequestMapping("/index")
    public Object index(HttpServletRequest request){



        return ADMIN_PAGE;

    }

    @RequestMapping("/menu")
    public Object menu(HttpServletRequest request){


        return ADMIN_MENU_PAGE;
    }


    @RequestMapping("/welcome")
    public Object welcome(HttpServletRequest request, HttpServletResponse response) {


        return ADMIN_WELCOME_PAGE;
    }

}
