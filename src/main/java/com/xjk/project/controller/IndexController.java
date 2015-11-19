package com.xjk.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @Verfion:
 * @author: jinkai.xu
 * @Date: 15/11/18 下午3:47
 */
@RequestMapping("/Index")
@Controller
public class IndexController {




    @RequestMapping("/index")
    public Object index (HttpServletRequest request, Model model){


        System.out.println("OK-------------------------------\n");

        return new ModelAndView("Index/index");
    }


}
