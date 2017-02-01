package com.javarush.task.task14.task1408;

/**
 * Created by admin on 01.02.2017.
 */
public class RussianHen extends Hen  {

    @Override
    int getCountOfEggsPerMonth() {
        return 1;
    }

    @Override
    public String getDescription() {

        return super.getDescription() + " Моя страна - " + Country.RUSSIA+ ". Я несу "+getCountOfEggsPerMonth() +" яиц в месяц.";

    }
}


/*
* Методы должны возвращать строку вида:
<getDescription() родительского класса> + <» Моя страна — Sssss. Я несу N яиц в месяц.»>
где Sssss — название страны
где N — количество яиц в месяц
* */
