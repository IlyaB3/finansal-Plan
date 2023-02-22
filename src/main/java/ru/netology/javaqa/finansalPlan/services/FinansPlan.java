package ru.netology.javaqa.finansalPlan.services;
public class FinansPlan {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - expenses)/3;
            } else {
                money = (income + money) - expenses;
            }
        }
        return count;
    }
}

