package com.qf.dao;

import com.qf.pojo.Good;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodMapper {

    List<Good> findAllByCid(Integer cid);

    Good findGoodByGid(Integer gid);


    List<Good> findByGoodShopName();

    List<Good> findAllByTag1();

    List<Good> findAllByTag2();

    List<Good> findAllByTag3();

    List<Good> findAllByTag4();

    List<Good> findAllByTag5();


    List<Good> findAllByTag6();
    List<Good> findAllByTag7();
    List<Good> findAllByTag8();
    List<Good> findAllByTag9();


}
