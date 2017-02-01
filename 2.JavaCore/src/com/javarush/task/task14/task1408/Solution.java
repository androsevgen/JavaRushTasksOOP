package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {

        //        RussianHen russianHen = new RussianHen();
//        System.out.println(russianHen.getDescription());

        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            if (country.equals(Country.BELARUS)){
                hen = new BelarusianHen();
            }
            if (country.equals(Country.MOLDOVA)){
                hen = new MoldovanHen();
            }
            if (country.equals(Country.RUSSIA)){
                hen = new RussianHen();
            }
            if (country.equals(Country.UKRAINE)){
                hen = new UkrainianHen();
            }

            //напишите тут ваш код
            return hen;
        }
    }
/*

* 8. В классе HenFactory реализовать метод getHen, который возвращает соответствующую стране породу кур.
9

*/

}
