package com.juhee.we.util;

/**
 * String Util
 */
public class StrUtil {
    public static String nvl(String str){
        if(str == null | "".equals(str)){
            str = "";
        }

        return str;
    }
}
