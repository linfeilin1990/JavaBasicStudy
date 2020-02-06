package com.linxitec.study.basic.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class generateObject {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> studentClass = Class.forName("com.linxitec.study.basic.reflect.Student");
        //获取公共的带参构造public Student(String name, int age)
        Constructor<?> publicParameterConstructor = studentClass.getDeclaredConstructor(String.class, int.class);
        Object instance = publicParameterConstructor.newInstance("胡歌", 23);
        System.out.println(instance);
        //获取私有的构造方法private Student(String name)
        Constructor<?> privateParameterConstructor = studentClass.getDeclaredConstructor(String.class);
        privateParameterConstructor.setAccessible(true);
        Object newInstance = privateParameterConstructor.newInstance("彭于晏");
        System.out.println(newInstance);
    }
}
