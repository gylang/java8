package com.gylang.lambda;

import com.gylang.normal.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author gylang,
 * @version 1.0
 * @date 2020/1/15,
 */
public class FunctionMain {
    static <T, R> List<R> filter(List<T> tList, Function<T, R> f) {

        List<R> rList = new ArrayList<>();
        for (T t : tList) {
            R r = f.apply(t);
            rList.add(r);
        }
        return rList;
    }
    public static void main(String[] args) {
        List<Phone> phoneList = new ArrayList<>();
        phoneList.add(new Phone("小米8", "小米", "烈焰红",
                1299.99, 4, 64, 4600));
        phoneList.add(new Phone("小米9", "小米", "烈焰白",
                2299.99, 4, 128, 3600));
        phoneList.add(new Phone("华为p30", "华为", "烈焰黑",
                5299.99, 8, 32, 4600));
        List<String> phoneInfo = filter(phoneList, phone -> phone.toString());
        phoneInfo.forEach(p -> System.out.println(p));

    }}
