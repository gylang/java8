package com.gylang.lambda;

import com.gylang.normal.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 * @author gylang,
 * @version 1.0
 * @date 2020/1/16,
 */
public class LocalVar {
    public static void main(String[] args) throws InterruptedException {
        int test = 1;
        ConcurrentSkipListSet<Phone> phoneList = new ConcurrentSkipListSet<Phone>();
        phoneList.add(new Phone("小米8", "小米", "烈焰红",
                1299.99, 4, 64, 4600));
        phoneList.add(new Phone("小米9", "小米", "烈焰白",
                2299.99, 4, 128, 3600));
        phoneList.add(new Phone("华为p30", "华为", "烈焰黑",
                5299.99, 8, 32, 4600));
        new Thread(()-> {
            phoneList.pollFirst();
            System.out.println(phoneList);
        }).start();
        System.out.println(phoneList);
    }
}
