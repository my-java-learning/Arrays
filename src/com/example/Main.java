package com.example;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//	    int[] myIntArray = new int[10];
//	    myIntArray[0] = 25;
//	    myIntArray[1] = 30;
//	    myIntArray[5] = 50;

//        int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};

//        int[] myIntArray = new int[10];
//
//        for (int i = 0; i < myIntArray.length; i++){
//            myIntArray[i] = i*10;
//            System.out.println("Element " + i + ", value = " + myIntArray[i]);
//        }
//
//	      double[] myDoubleArray = new double[10];
//        System.out.println(myIntArray[0];
//        int[] myIntegers = getIntegers(5);
//        for(int i = 0 ; i < myIntegers.length; i++){
//            System.out.println("Element " + i + ", value = " + myIntegers[i]);
//        }
//
//        System.out.println("The average is " + getAverage(myIntegers));
//    }
//
//    public static int[] getIntegers(int number){
//        System.out.println("Enter " + number + " integer values.\r");
//        int[] values = new int[number];
//        for (int i = 0 ; i < values.length; i++){
//            values[i] = scanner.nextInt();
//        }
//        return values;
//    }
//
//    public static double getAverage(int[] array){
//        int sum = 0;
//        for(int i = 0 ; i < array.length ; i++){
//            sum += array[i];
//        }
//        return (double) sum / array.length;

        printArray(sortIntegers(getIntegers()));

    }

    public static int[] getIntegers(){
        int[] array = new int[5];
        System.out.println("Enter " + array.length + " integer values\r");
        for(int i = 0 ; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Element " + (i+1) + " : " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        int oldInt;
        for(int i = 0 ; i < array.length ; i++){
            for(int j = i+1 ; j < array.length; j++){
                if(array[i] < array[j]) {
                    oldInt = array[i];
                    array[i] = array[j];
                    array[j] = oldInt;
                }
            }
        }
        return array;
    }

}
