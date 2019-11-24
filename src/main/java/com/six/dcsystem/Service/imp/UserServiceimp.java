package com.six.dcsystem.Service.imp;

import com.six.dcsystem.Bean.User;
import com.six.dcsystem.Dao.UserMapper;
import com.six.dcsystem.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimp implements UserService {

    //自动装配
    @Autowired
    private UserMapper userMapper;

    /**
     * 查询数据
     * @param user
     * @return
     */
    @Override
    public List<User> userSelect(User user) {
        return userMapper.userSelect(user);
    }
}
