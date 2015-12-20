package com.xjk.project.admin.controller;

import com.xjk.project.admin.constant.SessionConstant;
import com.xjk.project.common.service.UserService;
import com.xjk.project.common.utils.CommonProperty;
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
 * @Date: 15/12/20 下午2:21
 */

@Controller
@RequestMapping("/admin/person")
public class PersonController {

    private static final String PERSON_INDEX = CommonProperty.getIntance().getAdminTemplate().getProperty("ADMIN_PERSON_INDEX");


    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public Object index(HttpServletRequest request, Model model){





        return new ModelAndView(PERSON_INDEX);
    }


    @RequestMapping("/updatePwd")
    @ResponseBody
    public String updatePwd(HttpServletRequest request){

        String oldPwd = request.getParameter("oldPwd");

        String newPwd = request.getParameter("newPwd");

        int  userId = Integer.parseInt(request.getSession().getAttribute(SessionConstant.SESSION_USER_ID).toString());

        Boolean result = userService.updatePwd(userId, oldPwd, newPwd);

        if(result){

            return "1";
        }else{

            return "0";
        }

    }



}
