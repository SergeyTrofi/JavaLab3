package com.example.task08;

public class Task08Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = new int[2];
        arr[0] = 2;
        arr[1] = 3;
        System.out.println(mult(arr));

    }

    static long mult(int[] arr) {

        long myMulti = 1L;

        if (arr. length== 0){
            myMulti = 0L;
        }
        else {
            for (int i : arr){
                myMulti *= i;
            }
        }

        return myMulti;
    }

}