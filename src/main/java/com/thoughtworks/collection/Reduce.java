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
        int min = arrayList.get(0);
        for (int i = 1; i < arrayList.size(); i++) {
            if(arrayList.get(i)<min){
                min = arrayList.get(i);
            }
        }
        return min;
    }

    public double getAverage() {
        double sum = 0;
        double avg = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sum = sum + arrayList.get(i);
        }
        avg = sum/arrayList.size();
        return avg;
    }

    public double getOrderedMedian() {
        throw new NotImplementedException();
    }

    public int getFirstEven() {
        throw new NotImplementedException();
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
