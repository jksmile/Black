package com.xjk.project.admin.controller;

import com.xjk.project.admin.model.ConsumeTypeModel;
import com.xjk.project.admin.model.ConsumeTypeResult;
import com.xjk.project.admin.service.ConsumeService;
import com.xjk.project.common.utils.CommonProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @Verfion:
 * @author: jinkai.xu
 * @Date: 15/12/25 下午11:39
 */
@RequestMapping("/admin/consume")
@Controller
public class ConsumeController {

    private static final String CONSUME_TYPE_PAGE = CommonProperty.getIntance().getAdminTemplate().getProperty("ADMIN_CONSUME_TYPE_PAGE");

    @Autowired
    private ConsumeService consumeService;

    @RequestMapping("/index")
    public Object index(HttpServletRequest request, Model model){

        ArrayList<ConsumeTypeResult> consumeTypeResultList = consumeService.getConsumeTypeList();

        model.addAttribute("consumeTypeList",consumeTypeResultList);

        return new ModelAndView(CONSUME_TYPE_PAGE);
    }


    @RequestMapping("/delConsumeType")
    @ResponseBody
    public String delConsumeType(HttpServletRequest request){

        Integer consumeTypeId = Integer.parseInt(request.getParameter("consumeTypeId"));

        Boolean result = consumeService.delConsumeType(consumeTypeId);

        if(result){

            return "1";
        }else{

            return "0";
        }
    }

    @RequestMapping("/getConsumeTypeByPid")
    @ResponseBody
    public List<ConsumeTypeModel> getConsumeTypeByPid(HttpServletRequest request){

        Integer pid = Integer.parseInt(request.getParameter("pid"));

        ArrayList<ConsumeTypeModel> consumeTypeModelList = consumeService.getConsumeTypeByPid(pid);


        return consumeTypeModelList;
    }




}
