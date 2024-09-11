package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static int[] removeMoreThen1000(int[] arr) {

        if (arr == null)
        {
            return null;
        }
        else if (arr.length == 0)
        {
            return new int[0];
        }

        StringBuilder stringDi = new StringBuilder();

        for (int i : arr)
        {
            if (i > 1000)
            {
                continue;
            }
            stringDi.append(i).append(" ");
        }

        String[] resultStringDi = stringDi.toString().split(" ");

        int[] resultArray = new int[resultStringDi.length];

        for (int i = 0; i < resultArray.length; i++)
        {
            resultArray[i] = Integer.parseInt(resultStringDi[i]);
        }

        return resultArray;
    }

}