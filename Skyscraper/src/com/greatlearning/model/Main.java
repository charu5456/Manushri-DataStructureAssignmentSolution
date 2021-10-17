package com.greatlearning.model;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the total no of floors in the building");
        int floors = sc.nextInt();

        int[] floorArr = new int[floors];
        int[] arr_sorted = new int[floors];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < floors; i++) {
            System.out.println("enter the floor size given on day :" + (i + 1));
            floorArr[i] = sc.nextInt();
            arr_sorted[i] = floorArr[i];
        }

        MergeSort ob = new MergeSort();
        ob.sortArr(arr_sorted, 0, arr_sorted.length - 1);

        System.out.println("The order of construction is as follows");
        for (int i = 0; i < floors; i++) {
            System.out.println("Day: " + (i + 1));
            if (floorArr[i] == arr_sorted[0]) {
                System.out.println(floorArr[i]);
                arr_sorted[0] = arr_sorted[+1];
            } else {
                stack.push(floorArr[i]);
                System.out.println("Day: " + (i + 2));

                if (floorArr[i + 1] == arr_sorted[0]) {
                    System.out.println(floorArr[i + 1]);
                    System.out.println(stack.pop());
                }
            }
        }
        sc.close();
    }
}
