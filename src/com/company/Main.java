package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(getAge(getRandomAge(), 27));
        System.out.println(getAge( getRandomAge(),-23));
        System.out.println(getAge( getRandomAge(),-12));
        System.out.println(getAge( getRandomAge(),2));
        System.out.println(getAge( getRandomAge(),66));

    }

    public static String getAge (int age, int temp) {
        if ((age >= 20 && age < 45) && (temp >= -20 && temp < 30)) {
            return "Можно идти гулять";
        } else if ((age < 20) && (temp >= 0 && temp < 28)) {
            return "Можно идти гулять";
        } else if ((age > 45) && (temp >= -10 && temp < 25)){
            return "Можно идти гулять";

        } else {
            return "Оставайтесь дома";
        }
    }

    public static int getRandomAge (){
        Random random = new Random();
        int age = random.nextInt(100);
        return age;
    }


}
