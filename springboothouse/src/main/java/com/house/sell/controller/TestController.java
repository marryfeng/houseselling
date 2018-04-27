package com.house.sell.controller;

import com.house.sell.model.Huser;
import com.house.sell.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 * Created by fengli on 2018/4/25.
 */
@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/hello123")
    public String hello(ModelMap model){
        //自动生成返回值的快捷键：ctrl+alt+v
        Long id=1L;
        Huser user = testService.findById(id);
        model.put("user",user);
        return "hello";
    }

    @RequestMapping("index")
    public String getIndex(){
        return "homepage/index";
    }





}
