package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        List<Integer> list = new ArrayList<>();
        for(Integer[] num1:array){
            for (int num2:num1){
                list.add(num2);
            }
        }
        return list;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        List<Integer> list = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        Flaten flaten = new Flaten(array);
        list = flaten.transformToOneDimesional();
        Filter filter = new Filter(list);
        res = filter.getDifferentElements();
        return res;
    }
}
