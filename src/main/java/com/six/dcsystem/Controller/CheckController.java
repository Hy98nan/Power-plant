package com.six.dcsystem.Controller;

import com.six.dcsystem.Bean.Check;
import com.six.dcsystem.Service.CheckService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "check")
@RestController
public class CheckController {

    @Autowired
    private CheckService checkService;

    @ApiOperation("单条数据的增加")
    @RequestMapping(value = "/cheinsert",method = RequestMethod.PUT)
    public int cheInsert(@RequestBody Check check){
        return checkService.cheinsert(check);
    }

    @ApiOperation("删除数据")
    @RequestMapping(value = "/chedelete",method = RequestMethod.PUT)
    public int chedelete(int id){
        return checkService.chedelete(id);
    }

    @ApiOperation("单条数据的查询")
    @RequestMapping(value = "/cheselete",method = RequestMethod.PUT)
    public Check cheselect(int id){
        return checkService.cheselect(id);
    }

    @ApiOperation("单条数据的修改")
    @RequestMapping(value = "/cheupdate",method = RequestMethod.PUT)
    public int cheUpdate(Check check){
        return checkService.cheUpdate(check);
    }

    @ApiOperation("查询所有数据")
    @RequestMapping(value = "/cheadd",method = RequestMethod.PUT)
    public Check cheadd(){
        return checkService.cheadd();
    }
}
