package com.qf.service.impl;

import com.qf.common.BaseResp;
import com.qf.dao.GoodMapper;
import com.qf.pojo.Good;
import com.qf.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class GoodServiceImpl implements GoodService {
    @Autowired
    GoodMapper goodMapper;


    @Override
    public BaseResp findAllByCid(Integer cid) {
        List<Good> allByCid = goodMapper.findAllByCid(cid);
        BaseResp baseResp = new BaseResp();
        if (allByCid!=null){
            baseResp.setCode(200);
            baseResp.setMessage("查询成功");
            baseResp.setData(allByCid);
        }else {
            baseResp.setCode(201);
            baseResp.setMessage("查询失败");
        }
        return null;
    }

    @Override
    public BaseResp findGoodByGid(Integer gid) {
        Good byGid = goodMapper.findGoodByGid(gid);
        BaseResp baseResp = new BaseResp();
        if (byGid!=null){
            baseResp.setData(byGid);
            baseResp.setCode(200);
            baseResp.setMessage("查询成功");
        }else {
            baseResp.setCode(201);
            baseResp.setMessage("查询失败");
        }
        return baseResp;
    }



    @Override
    public BaseResp findByGoodShopName() {

        List<Good> all = goodMapper.findByGoodShopName();
        BaseResp baseResp = new BaseResp();
        if (all !=null){
            baseResp.setData(all);
            baseResp.setMessage("查询成功");
            baseResp.setCode(200);
        }else {
            baseResp.setMessage("查询失败");
            baseResp.setCode(201);
        }
        return baseResp;
    }

    @Override
    public BaseResp findAllByTag1() {

        List<Good> all = goodMapper.findAllByTag1();
        BaseResp baseResp = new BaseResp();
        if (all !=null){
            baseResp.setData(all);
            baseResp.setMessage("查询成功");
            baseResp.setCode(200);
        }else {
            baseResp.setMessage("查询失败");
            baseResp.setCode(201);
        }
        return baseResp;
    }

    @Override
    public BaseResp findAllByTag2() {

        List<Good> all = goodMapper.findAllByTag2();
        BaseResp baseResp = new BaseResp();
        if (all !=null){
            baseResp.setData(all);
            baseResp.setMessage("查询成功");
            baseResp.setCode(200);
        }else {
            baseResp.setMessage("查询失败");
            baseResp.setCode(201);
        }
        return baseResp;
    }

    @Override
    public BaseResp findAllByTag3() {

        List<Good> all = goodMapper.findAllByTag3();
        BaseResp baseResp = new BaseResp();
        if (all !=null){
            baseResp.setData(all);
            baseResp.setMessage("查询成功");
            baseResp.setCode(200);
        }else {
            baseResp.setMessage("查询失败");
            baseResp.setCode(201);
        }
        return baseResp;
    }

    @Override
    public BaseResp findAllByTag4() {

        List<Good> all = goodMapper.findAllByTag4();
        BaseResp baseResp = new BaseResp();
        if (all !=null){
            baseResp.setData(all);
            baseResp.setMessage("查询成功");
            baseResp.setCode(200);
        }else {
            baseResp.setMessage("查询失败");
            baseResp.setCode(201);
        }
        return baseResp;
    }

    @Override
    public BaseResp findAllByTag5() {

        List<Good> all = goodMapper.findAllByTag5();
        BaseResp baseResp = new BaseResp();
        if (all !=null){
            baseResp.setData(all);
            baseResp.setMessage("查询成功");
            baseResp.setCode(200);
        }else {
            baseResp.setMessage("查询失败");
            baseResp.setCode(201);
        }
        return baseResp;
    }



    @Override
    public BaseResp findAllByTag6() {

        List<Good> all = goodMapper.findAllByTag6();
        BaseResp baseResp = new BaseResp();
        if (all !=null){
            baseResp.setData(all);
            baseResp.setMessage("查询成功");
            baseResp.setCode(200);
        }else {
            baseResp.setMessage("查询失败");
            baseResp.setCode(201);
        }
        return baseResp;
    }



    @Override
    public BaseResp findAllByTag7() {

        List<Good> all = goodMapper.findAllByTag7();
        BaseResp baseResp = new BaseResp();
        if (all !=null){
            baseResp.setData(all);
            baseResp.setMessage("查询成功");
            baseResp.setCode(200);
        }else {
            baseResp.setMessage("查询失败");
            baseResp.setCode(201);
        }
        return baseResp;
    }

    @Override
    public BaseResp findAllByTag8() {

        List<Good> all = goodMapper.findAllByTag8();
        BaseResp baseResp = new BaseResp();
        if (all !=null){
            baseResp.setData(all);
            baseResp.setMessage("查询成功");
            baseResp.setCode(200);
        }else {
            baseResp.setMessage("查询失败");
            baseResp.setCode(201);
        }
        return baseResp;
    }

    @Override
    public BaseResp findAllByTag9() {

        List<Good> all = goodMapper.findAllByTag9();
        BaseResp baseResp = new BaseResp();
        if (all !=null){
            baseResp.setData(all);
            baseResp.setMessage("查询成功");
            baseResp.setCode(200);
        }else {
            baseResp.setMessage("查询失败");
            baseResp.setCode(201);
        }
        return baseResp;
    }
}
