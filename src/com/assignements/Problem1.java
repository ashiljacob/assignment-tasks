package com.assignements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Problem1 {
    public static void main(String[] args) throws IOException {
//        int[] a = {1, 2, 6, 5, 1, 2};
//        int[] b = {3, 4, 3, 2, 2, 5};/

        int[] a = {8,7,9,6,5,6,6,5,6,4,6,7,8,5,4,3,2,1,4,5,6,7,8,7,8};
        int[] b = {2,4,5,6,7,6,7,8,9,8,7,6,7,6,5,4,3,2,3,4,5,5,5,4,5};

        System.out.println(minmax(a,b));
    }
    public static int minmax(int[] a, int[] b){
        int n = a.length;

        for(int i = 0; i < n; i++) {
            if (a[i] < b[i]) {
                a[i] = a[i] + b[i];
                b[i] = a[i] - b[i];
                a[i] = a[i] - b[i];

            }

        }

        return getMax(a) * getMax(b);
    }
    public static int getMax(int[] list){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.length; i++){
            if(list[i] > max){
                max = list[i];
            }
        }
        return max;
    }
}


