package com.gylang.normal;

/**
 * @author gylang,
 * @version 1.0
 * @date 2020/1/12,
 */
public class PhoneRomLt64G implements PhoneFilter {
    @Override
    public boolean filter(Phone phone) {
        return 64 > phone.getRom();
    }
}
