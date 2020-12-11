package com.qf.controller;

import com.qf.common.BaseResp;
import com.qf.service.BankcardService;
import com.qf.service.CardService;
import com.qf.service.StoreService;
import com.qf.service.YhkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/bankcard")
@CrossOrigin
public class BankcardController {
    @Autowired
    BankcardService bankcardService;
    @Autowired
    CardService cardService;
    @Autowired
    YhkService yhkService;
    @Autowired
    StoreService storeService;
    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public BaseResp findAll(){
        return bankcardService.findAll();
    }
    @RequestMapping(value = "/findAll2",method = RequestMethod.GET)
    public BaseResp findAll2(){
        return cardService.findAll();
    }
    @RequestMapping(value = "/findAll3",method = RequestMethod.GET)
    public BaseResp findAll3(){
        return yhkService.findAll();
    }
    @RequestMapping(value = "/findAll4",method = RequestMethod.GET)
    public BaseResp findAll4(){
        return storeService.findAll();
    }
}
