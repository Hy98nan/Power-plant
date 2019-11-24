package com.six.dcsystem.Service;

import com.six.dcsystem.Bean.BaseSet;
import java.util.*;

public interface BaseSetService {

    //多表联查全部数据
    List<BaseSet> select();

    //有参数的多表联查
    List<BaseSet> basesetsel(Integer amid);

}
