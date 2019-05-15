package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.time.Year;
import java.util.Arrays;
import java.util.List;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int sum = 0;
        if(leftBorder >= rightBorder){
            rightBorder = leftBorder - rightBorder;
            leftBorder = leftBorder - rightBorder;
            rightBorder = leftBorder + rightBorder;
        }
        for (int i = leftBorder; i < rightBorder + 1; i++) {
            if(i%2 == 0){
                sum = sum + i;
            }
        }
        return sum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int sum = 0;
        if(leftBorder >= rightBorder){
            rightBorder = leftBorder - rightBorder;
            leftBorder = leftBorder - rightBorder;
            rightBorder = leftBorder + rightBorder;
        }
        for (int i = leftBorder; i < rightBorder+1; i++) {
            if(i%2 != 0){
                sum = sum + i;
            }
        }
        return sum;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int sum = 0;
        for (int num:arrayList) {
            sum = sum + (num*3+2);
        }
        return sum;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        for (int i=0;i<arrayList.size();i++) {
            if(arrayList.get(i)%2 == 1){
                arrayList.set(i,2+3*arrayList.get(i));
            }
        }
        return arrayList;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int sum = 0;
        for(int num:arrayList){
            if(num%2 == 1){
                sum = sum + (num*3+5);
            }
        }
        return sum;
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        int sum = 0, flag = 0;
        double avg;
        for(int num:arrayList){
            if(num%2 == 0){
                sum = sum + num;
                flag++;
            }
        }
        avg = sum/flag;
        return avg;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        boolean flag = false;
        if(specialElment%2 == 1 ){
            flag = false;
        }else{
            for(int num:arrayList){
                if(num == specialElment){
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        Integer[] arr = new Integer[arrayList.size()-1];
        for (int i=0;i<arrayList.size()-1;i++) {
            int before = arrayList.get(i);
            int after = arrayList.get(i+1);
            arr[i] = 3*(before+after);
        }
        List<Integer> resList = Arrays.asList(arr);
        return resList;
    }
}
