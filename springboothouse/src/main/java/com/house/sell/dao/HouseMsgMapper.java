package com.house.sell.dao;

import com.house.sell.model.HouseMsg;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HouseMsgMapper {
    int insert(HouseMsg record);

    int insertSelective(HouseMsg record);
}