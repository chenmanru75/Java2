package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> list = new ArrayList<>();
        for(int num:array){
            if(num%2 == 0){
                list.add(num);
            }
        }
        return list;
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> list = new ArrayList<>();
        for(int num:array){
            if(num%3 == 0){
                list.add(num);
            }
        }
        return list;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> intersection = new ArrayList<Integer>();
        for(Integer a:firstList){
            if(secondList.contains(a)){
                intersection.add(a);
            }
        }
        return intersection;
    }

    public List<Integer> getDifferentElements() {
        List<Integer> list = new ArrayList<>();
        for(Integer a:array){
            if(!list.contains(a)){
                list.add(a);
            }
        }
        return list;
    }
}