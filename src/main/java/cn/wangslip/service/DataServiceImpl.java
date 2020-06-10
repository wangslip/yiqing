package cn.wangslip.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.wangslip.bean.DataBean;
import cn.wangslip.handler.DataHandler;
import cn.wangslip.handler.JsoupHandler;
import cn.wangslip.mapper.DataMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataServiceImpl extends ServiceImpl<DataMapper, DataBean>
        implements DataService {

//    @Override
//    public List<DataBean> list() {
//        return DataHandler.getData();
//    }
//
//
//    @Override
//    public List<DataBean> listById(int id) {
//        if (id == 2) {
//            return JsoupHandler.getData();
//        }
//        return list();
//    }
}
