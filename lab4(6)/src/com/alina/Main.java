package com.alina;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    final int N = 20;
        final int Pos = 6;
        int[] arr = new int[N];
        Random rand = new Random();
        for(int i = 0; i<N;i++){
            arr[i] = rand.nextInt(30);
            System.out.println(arr[i]);
        }
        System.out.println("----------");
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("Max is:"+max);
        var tmpArr1 = Arrays.copyOf(arr, Pos+1);
        var tmpArr2 = Arrays.copyOfRange(arr,Pos,arr.length);
        tmpArr1[tmpArr1.length-1] = max;
        arr = Arrays.copyOf(tmpArr1, tmpArr1.length + tmpArr2.length);
        System.arraycopy(tmpArr2, 0, arr, tmpArr1.length, tmpArr2.length);

        System.out.println("----------");
        for(int t:arr){
            System.out.println(t);
        }
    }
}
