package com.yaodh.parser;

import java.util.Map;

public class JsonParser {
    public static <T> T parse(String json, Class<T> clazz) throws Exception {
        Object obj = clazz.getDeclaredConstructor().newInstance();
        clazz.getField("name").set(obj, "test");
        return (T) obj;
    }

    public static Map<String, Object> read(String json, Map<String, Object> params) {
        for (int i = 0; i < json.length(); i++) {
            char ch = json.charAt(i);
            if (ch == '{') {

            } else if (ch == '\"') {

            }
        }
        return params;
    }
}