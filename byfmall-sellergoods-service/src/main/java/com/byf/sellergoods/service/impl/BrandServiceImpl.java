package com.byf.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.byf.mapper.TbBrandMapper;
import com.byf.pojo.TbBrand;
import com.byf.sellergoods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private TbBrandMapper brandMapper;

    @Override
    public List<TbBrand> fidAll() {

        return brandMapper.selectByExample(null);
    }
}
