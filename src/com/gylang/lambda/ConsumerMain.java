package com.gylang.lambda;

import com.gylang.normal.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author gylang,
 * @version 1.0
 * @date 2020/1/15,
 */
public class ConsumerMain {
    static <T> void filter(List<T> list, Consumer<T> c) {
        for (T t : list) {
           c.accept(t);

        }
    }
    public static void main(String[] args) {
        List<Phone> phoneList = new ArrayList<>();
        phoneList.add(new Phone("小米8", "小米", "烈焰红",
                1299.99, 4, 64, 4600));
        phoneList.add(new Phone("小米9", "小米", "烈焰白",
                2299.99, 4, 128, 3600));
        phoneList.add(new Phone("华为p30", "华为", "烈焰黑",
                5299.99, 8, 32, 4600));
        filter(phoneList, phone -> System.out.println(phone.toString()));

    }}
