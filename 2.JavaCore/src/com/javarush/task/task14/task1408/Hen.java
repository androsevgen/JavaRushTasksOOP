package com.javarush.task.task14.task1408;

/**
 * Created by admin on 01.02.2017.
 */
public abstract class Hen  {
    abstract int getCountOfEggsPerMonth();

    public String getDescription() {
        return "Я - курица.";
    }
}

/*
* Методы должны возвращать строку вида:
<getDescription() родительского класса> + <» Моя страна — Sssss. Я несу N яиц в месяц.»>
где Sssss — название страны
где N — количество яиц в месяц
* */