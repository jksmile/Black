package com.xjk.project.index.controller;

import com.xjk.project.common.utils.CommonProperty;
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


    private static final String INDEX_PAGE = CommonProperty.getIntance().getIndexTemplate().getProperty("INDEX_PAGE");


    @RequestMapping("/index")
    public Object index (HttpServletRequest request, Model model){


        System.out.println("OK-------------------------------OK\n");

        return new ModelAndView(INDEX_PAGE);
    }


}
