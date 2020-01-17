package com.gylang.lambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author gylang,
 * @version 1.0
 * @date 2020/1/15,
 */
@FunctionalInterface
public interface BufferReaderProcessor {

    String process(BufferedReader b) throws IOException;


}
