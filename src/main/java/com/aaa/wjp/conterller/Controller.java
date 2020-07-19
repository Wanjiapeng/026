package com.aaa.wjp.conterller;


import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("ceshi")
public class Controller {

       @RequestMapping("wan")
       public String add(){
           return "wan";
       }

}
