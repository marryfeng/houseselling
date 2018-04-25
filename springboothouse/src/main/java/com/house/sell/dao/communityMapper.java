package com.house.sell.dao;

import com.house.sell.model.community;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface communityMapper {
    int insert(community record);

    int insertSelective(community record);
}