package com.six.dcsystem.Service;

import com.six.dcsystem.Bean.Check;

public interface CheckService {

    //单条数据的插入
    int cheinsert(Check check);

    //数据的删除
    int chedelete(int id);

    //单条数据的查询
    Check cheselect(int id);

    //单条数据的修改
    int cheUpdate(Check check);

    //查询所有数据
    Check cheadd();
}
