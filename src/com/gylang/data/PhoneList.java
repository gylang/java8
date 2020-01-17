package com.gylang.data;

import com.gylang.normal.Phone;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gylang,
 * @version 1.0
 * @date 2020/1/17,
 */
public class PhoneList {

    public static List<Phone> getList() {
        List<Phone> phoneList = new ArrayList<>();
        phoneList.add(new Phone("小米8", "小米", "烈焰红",
                5299.99, 4, 64, 4600));
        phoneList.add(new Phone("小米9", "小米", "烈焰白",
                2299.99, 4, 128, 3600));
        phoneList.add(new Phone("华为p30", "华为", "烈焰黑",2299.991
                , 8, 32, 4600));
        return phoneList;
    }
}
