package com.linxitec.study.basic.innerclass.fieldclass;

public class Men {
    private String husbandName="梁山伯";
    private String gender="男";
    private int age=23;

    public void showHusbandInfo(){
        System.out.println("丈夫名字："+husbandName+"  性别："+gender+" 年龄："+age);
        
        /*修改内容*/
        new Woman().showWifeInfo();
        /*修改内容*/
    }
    //成员内部类
    public class Woman  {
        private String wifeName="祝英台";
        private String gender="女";
        private int age=22;
        public void showWifeInfo(){
            System.out.println("妻子名字："+wifeName+"  性别："+gender+" 年龄："+age);
        }
    }
}
