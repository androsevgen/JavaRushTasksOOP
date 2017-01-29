package com.javarush.task.task12.task1201;

/* 
Я не корова, Я - кит
*/

public class Solution {
    public static void main(String[] args) {
        Cow cow = new Whale();
        Cow cow1 = new Whale();

        }

    public static class Cow {
        public String getName() {
            return "Я - корова";
        }
    }

    public static class Whale extends Cow {

        public String getName(){
            return "Я не корова, Я - кит.";
        }

    }
}
