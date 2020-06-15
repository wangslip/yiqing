package cn.wangslip.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.wangslip.bean.DataBean;

import java.util.List;

public interface DataService extends IService<DataBean> {

//    List<DataBean> list();
//
//    List<DataBean> listById(int id);

    String getDataUpdatedTime();
}
