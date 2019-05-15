package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        LinkedHashMap<Integer,Integer> staff = new LinkedHashMap<>();
        for(int num:array){
            staff.put(num,num*3);
        }
        Integer[] res = new Integer[array.size()];
        int i=0;
        for(int key: staff.keySet()){
            res[i] = staff.get(key);
            i++;
        }
        List<Integer> list = Arrays.asList(res);
        return list;
    }

    public List<String> mapLetter() {
        throw new NotImplementedException();
    }

    public List<String> mapLetters() {
        throw new NotImplementedException();
    }

    public List<Integer> sortFromBig() {
        throw new NotImplementedException();
    }

    public List<Integer> sortFromSmall() {
        throw new NotImplementedException();
    }
}
