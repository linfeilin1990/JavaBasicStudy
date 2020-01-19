package com.linxitec.study.designpattern.factoryPattern.generalFactory;

import com.linxitec.study.designpattern.factoryPattern.simpleFactory.Drink;
import com.linxitec.study.designpattern.factoryPattern.simpleFactory.RedBeanMilkTea;

public class RedBeanMilkTeaFactory implements AbstractItsTime {
    @Override
    public Drink createDrink() {
        return new RedBeanMilkTea();
    }
}
