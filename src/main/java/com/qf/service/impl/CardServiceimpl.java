package com.qf.service.impl;

import com.qf.common.BaseResp;
import com.qf.dao.CardRespository;
import com.qf.pojo.Card;
import com.qf.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CardServiceimpl implements CardService {
    @Autowired
    CardRespository cardRespository;
    @Override
    public BaseResp findAll() {
        List<Card> all = cardRespository.findAll();
        BaseResp baseResp = new BaseResp();
        baseResp.setCode(200);
        baseResp.setData(all);
        baseResp.setMessage("查询银行卡成功");
        return baseResp;
    }
}
