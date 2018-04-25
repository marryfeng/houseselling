package com.house.sell.dao;

import com.house.sell.model.Comment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentMapper {
    int insert(Comment record);

    int insertSelective(Comment record);
}