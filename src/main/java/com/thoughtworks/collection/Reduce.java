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
        throw new NotImplementedException();
    }

    public boolean isEqual(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public Double getMedianInLinkList(SingleLink singleLink) {
        throw new NotImplementedException();
    }

    public int getLastOdd() {
        throw new NotImplementedException();
    }

    public int getIndexOfLastOdd() {
        throw new NotImplementedException();
    }
}
