package com.gylang.lambda;

import com.gylang.normal.Phone;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author gylang,
 * @version 1.0
 * @date 2020/1/16,
 */
public class Method {
    static String processFile(BufferReaderProcessor p) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
            return p.process(br);
        }
    }
    public static void main(String[] args) throws IOException {
        //方法引用前
        String oneLine =processFile(br ->br.readLine());
        //方法引用后
        String onLine2 = processFile(BufferedReader::readLine);
        System.out.println(oneLine);
    }
}
