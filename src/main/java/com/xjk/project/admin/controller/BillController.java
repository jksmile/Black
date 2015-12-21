package com.xjk.project.admin.controller;

import com.xjk.project.common.utils.CommonProperty;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Verfion:
 * @author: jinkai.xu
 * @Date: 15/12/21 下午12:07
 */
@Controller
@RequestMapping("/admin/bill")
public class BillController {


    private static final String BILL_ADD_PAGE = CommonProperty.getIntance().getAdminTemplate().getProperty("ADMIN_BILL_ADD_INDEX");

    @RequestMapping("/index")
    public Object index(HttpServletRequest request){


        return BILL_ADD_PAGE;
    }



}
