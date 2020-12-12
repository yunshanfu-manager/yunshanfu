package com.qf.dao;


import com.qf.pojo.Category;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;




@Mapper
public interface CategoryMapper extends JpaRepository <Category,Integer>{


}
