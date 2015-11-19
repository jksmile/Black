package com.xjk.project.admin.controller;

import com.xjk.project.common.utils.CommonProperty;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @Verfion:
 * @author: jinkai.xu
 * @Date: 15/11/19 下午12:58
 */
@RequestMapping("/admin/admin")
@Controller
public class AdminController {


    private static final String ADMIN_PAGE = CommonProperty.getIntance().getAdminTemplate().getProperty("ADMIN_PAGE");



    @RequestMapping("/index")
    public Object index(HttpServletRequest request, Model model){


        System.out.println("admin--------------------ok");


        return new ModelAndView(ADMIN_PAGE);

    }




}
