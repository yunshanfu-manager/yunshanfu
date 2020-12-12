package com.qf.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.common.BaseResp;
import com.qf.dao.CategoryMapper;
import com.qf.pojo.Category;
import com.qf.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryMapper categoryMapper;


    @Override
    public BaseResp findAll() {


        List<Category> all = categoryMapper.findAll();

        BaseResp baseResp = new BaseResp();
        if(all!=null){
            baseResp.setCode(200);
            baseResp.setData(all);
            baseResp.setMessage("查询成功");
        }else {
            baseResp.setCode(201);
            baseResp.setMessage("查询失败");
        }

        return baseResp;
    }
}
