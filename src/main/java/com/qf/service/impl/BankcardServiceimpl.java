package com.qf.service.impl;

import com.qf.common.BaseResp;
import com.qf.dao.BankcardRespository;
import com.qf.pojo.Bankcard;
import com.qf.service.BankcardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BankcardServiceimpl implements BankcardService {
    @Autowired
    BankcardRespository bankcardRespository;

    @Override
    public BaseResp findAll() {
        List<Bankcard> all = bankcardRespository.findAll();
        BaseResp baseResp = new BaseResp();
        baseResp.setCode(200);
        baseResp.setData(all);
        baseResp.setMessage("查询银行卡成功");
        return baseResp;


    }


}
