package com.house.sell.dao;

import com.house.sell.model.Agency;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AgencyMapper {
    int insert(Agency record);

    int insertSelective(Agency record);
}