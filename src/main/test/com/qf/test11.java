package com.qf;

import com.qf.common.BaseResp;
import com.qf.service.BankcardService;
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
    @Test
    public void test(){
        /*BaseResp all = bankcardService.findAll();
        System.out.println(all);*/
        BaseResp byId = bankcardService.findById(2);
        System.out.println(byId);
    }
}
