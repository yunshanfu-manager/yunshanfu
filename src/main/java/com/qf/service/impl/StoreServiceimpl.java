package com.qf.service.impl;

import com.qf.common.BaseResp;
import com.qf.dao.StoreRespository;
import com.qf.pojo.Store;
import com.qf.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreServiceimpl implements StoreService {
    @Autowired
    StoreRespository storeRespository;
    @Override
    public BaseResp findAll() {
        List<Store> all = storeRespository.findAll();
        BaseResp baseResp = new BaseResp();
        baseResp.setCode(200);
        baseResp.setData(all);
        baseResp.setMessage("查询银行卡成功");
        return baseResp;
    }
}
