package com.javarush.task.task12.task1216;

/* 
Интерфейс Fly
*/

public class Solution {
    public static void main(String[] args)  {


        Fly fly = new Fly() {
            @Override
            public void met1() {
                System.out.println("1");
            }

            @Override
            public void met2() {

            }
        };
                fly.met1();


    }


    public interface Fly {
        void met1();
        void met2();
    }

    //add an interface here - добавь интерфейс тут

}
