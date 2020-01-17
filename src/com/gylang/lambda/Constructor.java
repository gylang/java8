package com.gylang.lambda;

import com.gylang.normal.Phone;

import java.util.function.Function;
import java.util.function.Supplier;
//import static java.util.Comparator.comparing;

/**
 * @author gylang,
 * @version 1.0
 * @date 2020/1/16,
 */
public class Constructor {
    public static void main(String[] args) {
        Supplier<Phone> phoneSup = Phone::new;
        Phone phone = phoneSup.get();
        Supplier<Phone> phoneSup1 = () -> new Phone();

        Function<String,Phone> phoneFunc = Phone::new;
        phone = phoneFunc.apply("hongmi");
        Function<String,Phone> phoneFunc1 = (str) -> new Phone(str);
    }
}
