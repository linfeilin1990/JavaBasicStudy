package com.linxitec.study.basic.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        System.out.println("=========获取构造方法：获取所有的构造方法========");
        Class<Student> aClass = Student.class;
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        System.out.println("=========获取构造方法：只能获得pulic修饰的构造方法========");
        Class<?> studentClass = Class.forName("com.linxitec.study.basic.reflect.Student");
        Constructor<?>[] constructors = studentClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println("=========获取指定的构造方法========");
        Constructor<?> constructor = studentClass.getDeclaredConstructor(String.class);

        System.out.println(constructor);
        Constructor<?> constructor1 = studentClass.getDeclaredConstructor(String.class,int.class);
        Object alex = constructor1.newInstance("alex", 23);
        System.out.println(alex);

    }
}
