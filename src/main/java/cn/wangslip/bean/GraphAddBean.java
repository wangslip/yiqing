package cn.wangslip.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GraphAddBean {

    private String date;
    private int addConfirm;
    private int addSuspect;
}
