package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
//        int max = arrayList.get(0);
////        for (int i = 1; i < arrayList.size(); i++) {
////            if(arrayList.get(i)>max){
////                max = arrayList.get(i);
////            }
////        }
////        return max;
        Stream<Integer> stream = Arrays.stream(arrayList.toArray(new Integer[arrayList.size()]));
        return stream.reduce(Integer::max).get();
    }

    public double getMinimum() {
//        int min = arrayList.get(0);
//        for (int i = 1; i < arrayList.size(); i++) {
//            if(arrayList.get(i)<min){
//                min = arrayList.get(i);
//            }
//        }
//        return min;
        Stream<Integer> stream = Arrays.stream(arrayList.toArray(new Integer[arrayList.size()]));
        return stream.reduce(Integer::min).get();
    }

    public double getAverage() {
        Stream<Integer> stream = Arrays.stream(arrayList.toArray(new Integer[arrayList.size()]));
        double sum = stream.reduce((i, j) -> i + j).get();
        double avg = sum/arrayList.size();
        return avg;
    }

    public double getOrderedMedian() {
        double middle;
        if(arrayList.size()%2 == 0){
            middle = arrayList.get(arrayList.size()/2)+arrayList.get((arrayList.size()/2)-1);
            middle = middle/2;
        }else{
            middle = arrayList.get(arrayList.size()/2);
        }
        return middle;
    }

    public int getFirstEven() {
        int res = 0;
        for(int num:arrayList){
            if(num%2 == 0){
                res = num;
                break;
            }
        }
        return res;
    }

    public int getIndexOfFirstEven() {
        int res = 0;
        for(int i=0;i<arrayList.size();i++){
            if(arrayList.get(i)%2 == 0){
                res = i;
                break;
            }
        }
        return res;
    }

    public boolean isEqual(List<Integer> arrayList) {
        Integer[] array = new Integer[]{1, 4, 27, 20, 4, 9, 15, 4, 1, 11};
        List<Integer> arrayList1 = Arrays.asList(array);
        boolean flag = true;
        if(arrayList.size() == arrayList1.size()){
            for(int i = 0; i<arrayList.size();i++){
                if(arrayList.get(i) != arrayList1.get(i)){
                    flag = false;
                    break;
                }
            }
        }else{
            flag = false;
        }
        return flag;
    }

    public Double getMedianInLinkList(SingleLink singleLink) {
        int len = arrayList.size();
        double sum ;
        double res ;
        if(len%2 == 0){
            sum = Integer.parseInt(singleLink.getNode(6).toString())+Integer.parseInt(singleLink.getNode(7).toString());
            res = sum/2;
        }else{
            res = Integer.parseInt(singleLink.getNode(6).toString());
        }
        return res;
    }

    public int getLastOdd() {
        int res = 0;
        for (int i = arrayList.size()-1; i >=0 ; i--) {
            if(arrayList.get(i)%2 == 1){
                res = arrayList.get(i);
                break;
            }
        }
        return res;
    }

    public int getIndexOfLastOdd() {
        int res = 0;
        for (int i = arrayList.size()-1; i >=0 ; i--) {
            if(arrayList.get(i)%2 == 1){
                res = i;
                break;
            }
        }
        return res;
    }
}
