package com.house.sell.dao;

import com.house.sell.model.Blog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BlogMapper {
    int insert(Blog record);

    int insertSelective(Blog record);
}