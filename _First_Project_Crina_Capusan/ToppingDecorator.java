package com.company;

import com.company.IceCream;

abstract class ToppingDecorator implements IceCream {

    protected IceCream tempIceCream;

    public ToppingDecorator(IceCream newIceCream) {

        tempIceCream = newIceCream;
    }

}
