package com.six.dcsystem.Controller;

import com.six.dcsystem.Bean.User;
import com.six.dcsystem.Service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Api(tags = "user")
@RestController
@CrossOrigin
public class UserController {

    //自动装配
    @Autowired
    private UserService userService;

    @ApiOperation("查询数据")
    @RequestMapping(value = "/userSelect",method = RequestMethod.PUT)
    public List<User> userSelect(@RequestBody User user){
        System.out.println("username="+user.getUsername()+"password="+user.getPassword());
        return userService.userSelect(user);
    }

}
