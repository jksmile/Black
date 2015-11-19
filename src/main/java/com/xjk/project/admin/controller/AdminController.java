package com.xjk.project.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @Verfion:
 * @author: jinkai.xu
 * @Date: 15/11/19 下午12:58
 */
@RequestMapping("/admin")
@Controller
public class AdminController {



    @RequestMapping("/index")
    public @ResponseBody Object index(HttpServletRequest request){


        System.out.println("admin--------------------ok");

        return null;

    }




}
