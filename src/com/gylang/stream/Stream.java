package com.gylang.stream;

import com.gylang.data.PhoneList;
import com.gylang.normal.Phone;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author gylang,
 * @version 1.0
 * @date 2020/1/17,
 */
public class Stream {

    static List<Phone> phoneList = PhoneList.getList();

    public static void main(String[] args) {
        java8();
    }

    public static void group() {
        Map<String, List<Phone>> phoneByBrand = phoneList.stream()
                .collect(Collectors.groupingBy(Phone::getBrand));
        System.out.println(phoneByBrand.toString());
    }

    public static void bfjava8() {
        List<Phone> ramLt4 = new ArrayList<>();
        for (Phone phone : phoneList) {
            if (phone.getRam() > 4) {
                ramLt4.add(phone);
            }
        }
        Collections.sort(ramLt4, new Comparator<Phone>() {
            @Override
            public int compare(Phone o1, Phone o2) {
                return Integer.compare(o1.getRam(), o2.getRam());
            }
        });
        for (Phone phone : ramLt4) {
            System.out.println(phone.toString());
        }
    }

    public static void java8() {
        phoneList = phoneList.stream().filter(phone -> phone.getRam() >= 4)
                .sorted(Comparator.comparing(Phone::getRam))
                .limit(2)
                .collect(Collectors.toList());
        phoneList.forEach(System.out::println);
    }
}
