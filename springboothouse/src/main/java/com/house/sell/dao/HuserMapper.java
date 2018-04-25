package com.house.sell.dao;

import com.house.sell.model.Huser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HuserMapper {
    int insert(Huser record);

    int insertSelective(Huser record);
    Huser findById(Long id);
}