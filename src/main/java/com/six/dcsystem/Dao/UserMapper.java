package com.six.dcsystem.Dao;

import com.six.dcsystem.Bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.*;

@Mapper
public interface UserMapper {
    //查询数据
    List<User> userSelect(User user);
}
