package com.xjk.project.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Verfion:
 * @author: jinkai.xu
 * @Date: 15/12/20 下午1:57
 */

@Controller
@RequestMapping("/admin/member")
public class MemberController {



    @RequestMapping("/index")
    public Object index(HttpServletRequest request, Model model){




        return null;
    }



}
