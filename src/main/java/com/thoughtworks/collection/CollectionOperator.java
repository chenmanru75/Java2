package com.thoughtworks.collection;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        Integer[] arr = new Integer[Math.abs(right-left)+1];
        if(left <= right){
            int leftCopy = left;
            for (int i = 0; i <= right-left; i++) {
                arr[i] = leftCopy;
                leftCopy++;
            }
        }else{
            int Copy = left;
            for (int j = 0; j <= left-right; j++) {
                arr[j] = Copy;
                Copy--;
            }
        }
        List<Integer> resList = Arrays.asList(arr);
        return resList;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        int flag = 0;
        if(left <= right){
            int Copy = left;
            for (int i = 0; i <= right-left; i++) {
                if(Copy%2 == 0){
                    flag++;
                }
                Copy++;
            }
        }else{
            System.out.println(left);
            int Copy = right;
            for (int i = 0; i <= left-right; i++) {
                if(Copy%2 == 0){
                    flag++;
                }
                Copy++;
            }
        }
        Integer[] arr = new Integer[flag];
        if(left <= right){
            int Copy = left;
            int j=0;
            for (int i = 0; i <= right-left; i++) {
                if(Copy%2 == 0){
                    arr[j] = Copy;
                    j++;
                }
                Copy = Copy + 1;
            }
        }else{
            int Copy = left;
            int j=0;
            for (int i = 0; i <= left-right; i++) {
                if(Copy%2 == 0){
                    arr[j] = Copy;
                    j++;
                }
                Copy = Copy - 1;
            }
        }
        List<Integer> resList = Arrays.asList(arr);
        return resList;
    }

    public List<Integer> popEvenElments(int[] array) {
        int flag = 0;
        for(int num:array){
            if(num%2 == 0){
                flag++;
            }
        }
        Integer[] arr = new Integer[flag];
        int i=0;
        for(int num:array){
            if(num%2 == 0){
               arr[i] = num;
               i++;
            }
        }
        List<Integer> resList = Arrays.asList(arr);
        return resList;
    }

    public int popLastElment(int[] array) {
        return array[array.length-1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        ArrayList objArray = new ArrayList();
        ArrayList objArray2 = new ArrayList();
        for (int i = 0; i < firstArray.length ; i++) {
            objArray.add(i,firstArray[i]);
        }
        for (int i = 0; i < secondArray.length ; i++) {
            objArray2.add(i,secondArray[i]);
        }
        objArray.retainAll(objArray2);
        return objArray;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
