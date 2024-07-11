package com.spring.UmDevocional.controller;


import com.spring.UmDevocional.service.UmDevoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UmDevoController {

    @Autowired
    UmDevoService umDevoService;

    public ModelAndView getPosts(){
        
    }

}
