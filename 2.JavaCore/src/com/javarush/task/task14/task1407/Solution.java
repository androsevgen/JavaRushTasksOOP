package com.javarush.task.task14.task1407;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Player and Dancer
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Person person = null;
        String key;
        while (!(key = reader.readLine()).equals("exit")) {
            if ("player".equals(key)) {
                person = new Player();
            } else if ("dancer".equals(key)) {
                person = new Dancer();
            }
            haveRest(person);
        }
    }
/* play, если person имеет тип Player.
— dance, если person имеет тип Dancer.*/
    public static void haveRest(Person person) {
//        Player player = new Player();
//        Dancer dancer = new Dancer();

        if (person instanceof Player) {
            Player player = (Player) person ;
            player.play();
        }
        if (person instanceof Dancer) {
           Dancer dancer = (Dancer) person;
            dancer.dance();
        }

        //напишите тут ваш код
    }

    interface Person {
    }

    static class Player implements Person {
        void play() {
            System.out.println("playing");
        }
    }

    static class Dancer implements Person {
        void dance() {
            System.out.println("dancing");
        }
    }
}
