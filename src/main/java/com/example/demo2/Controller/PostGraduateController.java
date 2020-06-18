package com.example.demo2.Controller;

import com.example.demo2.Dao.*;
import com.example.demo2.Entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/postgraduate")
@CrossOrigin
public class PostGraduateController {
    @Autowired
    private PostGraduateDao postGraduateDao;

    @RequestMapping("/selectAll")
    @ResponseBody
    public Map<String ,Object> selectidname(){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<PostGraduate> postGraduates = postGraduateDao.selectAll();
        modelMap.put("data",postGraduates);
        return modelMap;
    }
    @RequestMapping("/selectId")
    public Map<String ,Object> selectId(int id){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<PostGraduate> postGraduates = postGraduateDao.selectId(id);
        modelMap.put("data", postGraduates);
        return modelMap;
     }
    }
