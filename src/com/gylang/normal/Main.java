package com.gylang.normal;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gylang,
 * @version 1.0
 * @date 2020/1/12,
 */
public class Main {

    public static void main(String[] args) {
        List<Phone> phoneList = new ArrayList<>();
        phoneList.add(new Phone("小米8", "小米", "烈焰红",
                1299.99, 4, 64, 4600));
         phoneList.add(new Phone("小米9", "小米", "烈焰白",
                2299.99, 4, 128, 3600));
         phoneList.add(new Phone("华为p30", "华为", "烈焰黑",
                5299.99, 8, 32, 4600));
         //获取小米手机
        List<Phone> xiaomi = filterPhones(phoneList,new PhoneBrandIsXiaomi());
        xiaomi = filterPhones(phoneList, new PhoneFilter() {
            @Override
            public boolean filter(Phone phone) {
                return "小米".equals(phone.getBrand());
            }
        });
        xiaomi = filterPhones(phoneList, phone -> "小米".equals(phone.getBrand()));
        System.out.println(xiaomi);
        PhoneFilter.compare();

    }
    private static List<Phone> filterPhones (List<Phone> bfList, PhoneFilter filter) {

        List<Phone> result = new ArrayList<>();
        for (Phone phone : bfList) {
            if (filter.filter(phone) ){
                result.add(phone);
            }
        }
        return result;
    }
}
