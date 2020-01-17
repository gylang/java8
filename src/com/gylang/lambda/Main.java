package com.gylang.lambda;

import com.gylang.normal.Phone;

import java.util.*;
import static java.lang.System.out;
import static java.util.Comparator.comparing;

/**
 * @author gylang,
 * @version 1.0
 * @date 2020/1/12,
 */
public class Main {
    public static void main(String[] args) {
        List<Phone> phoneList = new ArrayList<>();
        phoneList.add(new Phone("小米8", "小米", "烈焰红",
                5299.99, 4, 64, 4600));
        phoneList.add(new Phone("小米9", "小米", "烈焰白",
                2299.99, 4, 128, 3600));
        phoneList.add(new Phone("华为p30", "华为", "烈焰黑",2299.991
                , 8, 32, 4600));
     //匿名内部类 实现比较 排序
        Comparator<Phone> byPrice = (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice());
        phoneList.sort(byPrice);
        phoneList.sort(comparing(Phone::getPrice).reversed());
        phoneList.forEach(phone -> System.out.println(phone.getPrice()));
        out.println("sss1");
    }
}
