package com.linxitec.study.basic.innerclass.anonymousInnerClass;

public class NewComputer {
    public static void main(String[] args) {
        //格式一
        new GPU(){
            @Override
            public void addGPU() {
                System.out.println("新增英伟达显卡1060");
            }
        }.addGPU();
        //格式二
        GPU gpu=new GPU() {
            @Override
            public void addGPU() {
                System.out.println("新增英伟达显卡1060");
            }
        };
        gpu.addGPU();
    }
}
