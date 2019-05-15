package com.thoughtworks.collection;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.lang.reflect.Array;
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
        LinkedHashMap<Integer,String> staff = new LinkedHashMap<>();
//        int j = 0;
        for(int num:array){
            staff.put(num,letters[num-1]);
//            j++;
        }
        String[] res = new String[array.size()];
        int i=0;
        for(int key: staff.keySet()){
            res[i] = staff.get(key);
            i++;
        }
        List<String> list = Arrays.asList(res);
        return list;
    }

    public List<String> mapLetters() {
        LinkedHashMap<Integer,String> staff = new LinkedHashMap<>();
        for(int num:array){
            int chushu = num/26;
            int yushu = num%26;
            String after;
            String before;
            if(yushu == 0){
                after = "z";
                if(chushu == 1 || chushu == 0){
                    before = "";
                }else{
                    before = letters[chushu-2];
                }
            }else{
                after = letters[yushu-1];
                if(chushu == 0){
                    before = "";
                }else{
                    before = letters[chushu-1];
                }
            }
            staff.put(num,before + after);
        }
        String[] res = new String[array.size()];
        int i=0;
        for(int key: staff.keySet()){
            res[i] = staff.get(key);
            i++;
        }
        List<String> list = Arrays.asList(res);
        return list;
    }

    public List<Integer> sortFromBig() {
        Integer[] arr = new Integer[array.size()];
        Integer[] arr2 = new Integer[array.size()];
        int i = 0;
        for(int num:array){
            arr[i] = num;
            i++;
        }
        Arrays.sort(arr);

        int j = array.size()-1;
        for(int num:arr){
            arr2[j] = num;
            j--;
        }
        List<Integer> res = Arrays.asList(arr2);
        return res;
    }

    public List<Integer> sortFromSmall() {
        Integer[] arr = new Integer[array.size()];
        int i = 0;
        for(int num:array){
            arr[i] = num;
            i++;
        }
        Arrays.sort(arr);
        List<Integer> res = Arrays.asList(arr);
        return res;
    }
}
