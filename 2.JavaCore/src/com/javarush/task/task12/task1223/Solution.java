package com.javarush.task.task12.task1223;

/* 
Добавь один метод в класс Cat
*/

public class Solution {
    public static void main(String[] args) {
        Pet pet = new Cat();
        pet.setName("Я - пушистик");


        System.out.println(pet.getName());
    }

    public static class Pet {
        protected String name;

        public Pet() {
        }

        public final String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public static class Cat extends Pet {
//        protected String name;

        @Override
        public void setName(String name) {
            this.name = "";
        }
    }
}
