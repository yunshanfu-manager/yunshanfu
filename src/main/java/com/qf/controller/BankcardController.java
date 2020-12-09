package com.qf.controller;

import com.qf.common.BaseResp;
import com.qf.service.BankcardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/bankcard")
@CrossOrigin
public class BankcardController {
    @Autowired
    BankcardService bankcardService;

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public BaseResp findAll(){
        return bankcardService.findAll();
    }
    @RequestMapping(value = "/findById",method = RequestMethod.POST)
    public  BaseResp findById(@RequestBody Map map){
       return bankcardService.findById((Integer) map.get("id"));
    }

}
