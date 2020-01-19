package com.linxitec.study.designpattern.factoryPattern.generalFactory;

import com.linxitec.study.designpattern.factoryPattern.simpleFactory.Drink;
import com.linxitec.study.designpattern.factoryPattern.simpleFactory.PearlMilkTea;

public class PearlMilkTeaFactory implements AbstractItsTime {
    @Override
    public Drink createDrink() {
        return new PearlMilkTea();
    }
}
