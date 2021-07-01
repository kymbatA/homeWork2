package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int t = 25;
        int age = generateRandomAge();

        if (20 < age && age < 45 && t < 30 && t > -20) {
            System.out.println("mojno idti");
        } else if (age < 20 && t > 0 && t < 28) {
            System.out.println("mojno");
        } else if (age > 45 && t > -10 && t < 25) {
            System.out.println("ok");
        } else System.out.println("sidi doma ");
        System.out.println(age);
    }

    public static int generateRandomAge (){
        Random randomAge = new Random();
        return randomAge.nextInt(107);
    }



}
