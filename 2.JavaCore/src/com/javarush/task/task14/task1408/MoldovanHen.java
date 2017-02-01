package com.javarush.task.task14.task1408;

/**
 * Created by admin on 01.02.2017.
 */
public class MoldovanHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 23;
    }

    public String getDescription() {

        return super.getDescription() + " Моя страна - " + Country.MOLDOVA+ ". Я несу "+getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
