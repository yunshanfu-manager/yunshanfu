package com.qf;

import com.qf.common.BaseResp;
import com.qf.pojo.Store;
import com.qf.service.BankcardService;
import com.qf.service.CardService;
import com.qf.service.StoreService;
import com.qf.service.YhkService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class test11 {
    @Autowired
    BankcardService bankcardService;
    @Autowired
    CardService cardService;
    @Autowired
    YhkService yhkService;
    @Autowired
    StoreService storeService;
    @Test
    public void test(){
        BaseResp all = bankcardService.findAll();
        System.out.println(all);
        BaseResp all1 = cardService.findAll();
        System.out.println(all1);
        BaseResp all2 = yhkService.findAll();
        System.out.println(all2);
        BaseResp all3 = storeService.findAll();
        System.out.println(all3);
    }
}
