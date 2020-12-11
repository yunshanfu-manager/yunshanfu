package com.qf.service.impl;

import com.qf.common.BaseResp;
import com.qf.dao.YhkRespository;
import com.qf.pojo.Yhk;
import com.qf.service.YhkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class YhkServiceimpl implements YhkService {
    @Autowired
    YhkRespository yhkRespository;

    @Override
    public BaseResp findAll() {
        List<Yhk> all = yhkRespository.findAll();
        BaseResp baseResp = new BaseResp();
        baseResp.setCode(200);
        baseResp.setData(all);
        baseResp.setMessage("查询银行卡成功");
        return baseResp;
    }
}
