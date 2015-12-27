package com.xjk.project.admin.controller;

import com.xjk.project.admin.model.ConsumeTypeModel;
import com.xjk.project.admin.model.ConsumerModel;
import com.xjk.project.admin.service.ConsumeService;
import com.xjk.project.common.utils.CommonProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

/**
 * @Verfion:
 * @author: jinkai.xu
 * @Date: 15/12/21 下午12:07
 */
@Controller
@RequestMapping("/admin/bill")
public class BillController {


    private static final String BILL_ADD_PAGE = CommonProperty.getIntance().getAdminTemplate().getProperty("ADMIN_BILL_ADD_INDEX");

    @Autowired
    private ConsumeService consumeService;

    @RequestMapping("/index")
    public Object index(HttpServletRequest request, Model model){

        ArrayList<ConsumerModel> consumerList = consumeService.getAllConsumer();

        model.addAttribute("consumerList",consumerList);


        ArrayList<ConsumeTypeModel> consumeTypeList = consumeService.getConsumeTypeByPid(0);

        model.addAttribute("consumeTypeList",consumeTypeList);

        return new ModelAndView(BILL_ADD_PAGE);
    }



}
