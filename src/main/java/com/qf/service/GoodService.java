package com.qf.service;

import com.qf.common.BaseResp;


public interface GoodService {


    BaseResp findAllByCid(Integer cid);

    BaseResp findGoodByGid(Integer gid);


    BaseResp findByGoodShopName();

    BaseResp findAllByTag1();

    BaseResp findAllByTag2();

    BaseResp findAllByTag3();

    BaseResp findAllByTag4();

    BaseResp findAllByTag5();


    BaseResp findAllByTag6();
    BaseResp findAllByTag7();
    BaseResp findAllByTag8();
    BaseResp findAllByTag9();

}
