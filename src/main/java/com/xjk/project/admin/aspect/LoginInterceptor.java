package com.xjk.project.admin.aspect;

import com.xjk.project.admin.constant.SessionConstant;
import com.xjk.project.common.constant.UrlConstant;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Verfion:
 * @author: jinkai.xu
 * @Date: 15/11/19 下午2:16
 */
public class LoginInterceptor implements HandlerInterceptor {


    private String[] allowUrls;

    public void setAllowUrls(String[] allowUrls) {
        this.allowUrls = allowUrls;
    }


    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {

        String requestUrl = request.getRequestURI().replace(request.getContextPath(), "");

        if(null != allowUrls && allowUrls.length>=1){
            for(String url:allowUrls){
                if(requestUrl.contains(url)){
                    return true;
                }
            }
        }

        try {

            HttpSession session = request.getSession(true);

            Object userName = session.getAttribute(SessionConstant.SESSION_USER_NAME);

            if(null == userName || "".equals(userName)){

                response.sendRedirect(UrlConstant.ADMIN_LOGIN_URL);
                return false;

            }else{

                return true;
            }


        }catch (Exception e){

            response.sendRedirect(UrlConstant.ADMIN_LOGIN_URL);
            return false;
        }





    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
