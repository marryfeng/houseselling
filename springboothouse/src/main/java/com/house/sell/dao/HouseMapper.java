package com.house.sell.dao;

import com.house.sell.model.House;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HouseMapper {
    int insert(House record);

    int insertSelective(House record);
}