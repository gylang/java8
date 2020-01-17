package com.gylang.lambda;

import com.gylang.normal.Phone;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author gylang,
 * @version 1.0
 * @date 2020/1/15,
 */
public class PredicateMain {
    static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> results = new ArrayList<>();
        for (T t : list) {
            if (p.test(t)) {
                results.add(t);
            }
        }
        return results;
    }
    public static void main(String[] args) {

        List<Phone> phoneList = new ArrayList<>();
        phoneList.add(new Phone("小米8", "小米", "烈焰红",
                1299.99, 4, 64, 4600));
        phoneList.add(new Phone("小米9", "小米", "烈焰白",
                2299.99, 4, 128, 3600));
        phoneList.add(new Phone("华为p30", "华为", "烈焰黑",
                5299.99, 8, 32, 4600));
        List<Phone> phoneRamGt4 = filter(phoneList, p -> p.getRam() > 4);
        phoneRamGt4.forEach(phone -> System.out.println(phone.getRam()));
        Map<String, Phone> phoneMap = phoneList.stream().collect(Collectors
                .toMap(p1 ->p1.getName(), p2 ->p2));
    }
}
