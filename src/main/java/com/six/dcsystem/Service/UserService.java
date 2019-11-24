package com.six.dcsystem.Service;
import com.six.dcsystem.Bean.User;

import java.util.*;

public interface UserService {
    //查询数据
    List<User> userSelect(User user);
}
