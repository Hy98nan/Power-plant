package com.six.dcsystem.Controller;

import com.six.dcsystem.Bean.Check;
import com.six.dcsystem.Bean.Record;
import com.six.dcsystem.Service.RecordService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api("record")
@RestController
public class RecordController {

    @Autowired
    private RecordService recordService;

    @ApiOperation("进行单条数据的插入")
    @RequestMapping(value = "/recinsert",method = RequestMethod.PUT)
    public int recInsert(@RequestBody Record record){
        return recordService.recordInsert(record);
    }

    @ApiOperation("修改数据")
    @RequestMapping(value = "/recupdate",method = RequestMethod.PUT)
    public int recUpdate(@RequestBody Record record){
        return recordService.recordUpdate(record);
    }

    @ApiOperation("单条数据的查询")
    @RequestMapping(value = "/recselect",method = RequestMethod.PUT)
    public Record recSelect(@RequestBody Record record){
        return recordService.recordSelect(record);
    }

    @ApiOperation("所有数据的查询")
    @RequestMapping(value = "/recselect",method = RequestMethod.GET)
    public Record recSelect(){
        return recordService.recordSelects();
    }

    @ApiOperation("删除数据")
    @RequestMapping(value = "/recdelete",method = RequestMethod.PUT)
    public int recDelete(int id){
        return recordService.recordDelete(id);
    }
}
