package com.linxitec.study.basic.reflect;

import java.lang.reflect.Field;

public class FieldTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = Class.forName("com.linxitec.study.basic.reflect.Student");
        Field[] fields = aClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
    }
}
