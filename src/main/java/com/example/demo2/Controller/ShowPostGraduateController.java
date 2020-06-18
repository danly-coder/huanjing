package com.example.demo2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowPostGraduateController {

     @RequestMapping("/index")
     public  String  displayPostGraduate(){
        return "display";
     }

}
