package com.gylang.lambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author gylang,
 * @version 1.0
 * @date 2020/1/15,
 */
public class BufferMain {
    static String processFile(BufferReaderProcessor p) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
            return p.process(br);
        }
    }
    public static void main(String[] args) throws IOException {
        String oneLine =processFile(br ->br.readLine());
        System.out.println(oneLine);
    }
}
