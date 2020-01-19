package com.linxitec.study.designpattern.factoryPattern.generalFactory;

import com.linxitec.study.designpattern.factoryPattern.simpleFactory.Drink;
import com.linxitec.study.designpattern.factoryPattern.simpleFactory.FreshAppleJuice;

public class FreshAppleJuiceFactory implements AbstractItsTime {
    @Override
    public Drink createDrink() {
        return new FreshAppleJuice();
    }
}
