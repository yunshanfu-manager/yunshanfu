package com.qf.dao;

import com.qf.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.JpaRepository;

@Mapper
public interface UserMapper{

    @Select("select user.pass_word as passWord from user where user_tel = #{userTel}")
    User findByUserTel(String userTel);

    @Insert("insert into user values (null, #{userTel},#{passWord},#{info},#{codes},#{email})")
    Integer saveAndFlush(User user);
}
