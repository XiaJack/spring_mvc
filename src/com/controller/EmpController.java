package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class EmpController {
    @RequestMapping("/empShow")
    public String empShow(){
        //跳转到 /WEB-INF/pages/empShow.jsp页面
        return "empShow";
    }
    @RequestMapping("/empAdd")
    public String empAdd(){
        return "empAdd";
    }
}
