package org.example.service.impl;

import org.example.exception.MyException;
import org.example.service.MyService;

public class MyServiceImpl implements MyService {
    @Override
    public void show1() {
        Object x = "fdsaofj";
        Integer num = (Integer)x;
    }

    @Override
    public void show2() throws MyException {
        throw new MyException();
    }
}
