package com.house.sell.dao;

import com.house.sell.model.HouseUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HouseUserMapper {
    int insert(HouseUser record);

    int insertSelective(HouseUser record);
}