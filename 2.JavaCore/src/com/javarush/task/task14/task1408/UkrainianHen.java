package com.javarush.task.task14.task1408;

/**
 * Created by admin on 01.02.2017.
 */
public class UkrainianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 12312;
    }
    public String getDescription() {

        return super.getDescription() + " Моя страна - " + Country.UKRAINE+ ". Я несу "+getCountOfEggsPerMonth() +" яиц в месяц.";
    }

}
