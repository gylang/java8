package com.gylang.normal;

/**
 * @author gylang,
 * @version 1.0
 * @date 2020/1/12,
 */
public interface PhoneFilter {

    boolean filter(Phone phone);
     static void compare() {
        System.out.println("hahaha 接口可以使用静态方法 compare");
    }
}
