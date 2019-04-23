package com.csy.filesystem.mapper;

import com.csy.filesystem.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> query(java.util.Map map);

    int delete(@Param("id") Long id);
}
