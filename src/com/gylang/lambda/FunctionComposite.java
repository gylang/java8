package com.gylang.lambda;

import java.util.function.Function;

/**
 * @author gylang,
 * @version 1.0
 * @date 2020/1/16,
 */
public class FunctionComposite {
    public static void main(String[] args) {
        Function<Integer, Integer> f = x -> x + 1;
        Function<Integer, Integer> g = x -> x * 2;
        Function<Integer, Integer> h = f.andThen(g);
        int result = h.apply(1);
    }
}
