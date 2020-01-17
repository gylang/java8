package com.gylang.lambda;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author gylang,
 * @version 1.0
 * @date 2020/1/15,
 */
public class surround {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            System.out.println(br.readLine());
            System.out.println(br.read());
        }
    }
}
