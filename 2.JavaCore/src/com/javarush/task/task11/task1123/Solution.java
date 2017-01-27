package com.javarush.task.task11.task1123;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("Minimum is " + result.x);
        System.out.println("Maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }

        int[] numbers = array;
        int min = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(min>numbers[i])
                min = numbers[i];
        }

        int[] numbers1 = array;
        int max = numbers1[0];
        for(int i = 0; i < numbers1.length; i++){
            if(max<numbers1[i])
                max = numbers1[i];
        }

        //Напишите тут ваше решение

        return new Pair<Integer, Integer>(min, max);
    }


    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
