package com.qf.controller;

import com.qf.common.BaseResp;
import com.qf.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/good")
@CrossOrigin
public class GoodController {

    @Autowired
    GoodService goodService;


    //根据一级类别的ID查询所有的二级商品
    @RequestMapping(value = "/findAllByCid",method = RequestMethod.GET)
    public BaseResp findAllByCid(Integer cid){

        return goodService.findAllByCid(cid);
    }

    //根据二级菜单查询单个商品详情
    @RequestMapping(value = "/findGoodByGid",method = RequestMethod.GET)
    public BaseResp findGoodByGid(Integer gid){

        return goodService.findGoodByGid(gid);
    }




    //查询商品店铺名
    @RequestMapping(value = "/findByGoodShopName",method = RequestMethod.GET)
    public BaseResp findByGoodShopName(){

        return goodService.findByGoodShopName();
    }

    @RequestMapping(value = "/findAllByTag1",method = RequestMethod.GET)
    public BaseResp findAllByTag1(){

        return goodService.findAllByTag1();
    }

    @RequestMapping(value = "/findAllByTag2",method = RequestMethod.GET)
    public BaseResp findAllByTag2(){

        return goodService.findAllByTag2();
    }

    @RequestMapping(value = "/findAllByTag3",method = RequestMethod.GET)
    public BaseResp findAllByTag3(){

        return goodService.findAllByTag3();
    }

    @RequestMapping(value = "/findAllByTag4",method = RequestMethod.GET)
    public BaseResp findAllByTag4(){

        return goodService.findAllByTag4();
    }

    @RequestMapping(value = "/findAllByTag5",method = RequestMethod.GET)
    public BaseResp findAllByTag5(){

        return goodService.findAllByTag5();
    }

    @RequestMapping(value = "/findAllByTag6",method = RequestMethod.GET)
    public BaseResp findAllByTag6(){

        return goodService.findAllByTag6();
    }


    @RequestMapping(value = "/findAllByTag7",method = RequestMethod.GET)
    public BaseResp findAllByTag7(){

        return goodService.findAllByTag7();
    }
    @RequestMapping(value = "/findAllByTag8",method = RequestMethod.GET)
    public BaseResp findAllByTag8(){

        return goodService.findAllByTag8();
    }

    @RequestMapping(value = "/findAllByTag9",method = RequestMethod.GET)
    public BaseResp findAllByTag9(){

        return goodService.findAllByTag9();
    }



}
