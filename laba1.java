package com.company;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<String> spisok = new ArrayList<String>();

        String[] nameBicycle = {"одноколесный", "двухколесный", "трехколесный"};
        int [] digit = new int[3];
        for(int j = 0; j<3; j++){
            digit[j] = (int) Math.round(Math.random()*10+1);
            for(int i = 0;  i<digit[j]; i++){
                spisok.add(nameBicycle[j]);
            }
        }
        PrintInfo(spisok);
        Refit.Repair(spisok, digit);
        Diameter.diameterWheels(spisok, digit);
    }
    public static void PrintInfo(ArrayList<String> spisok){
        System.out.println("В магазине предствлены:");
        System.out.println(spisok);
        System.out.println();
    }
    public static void PrintInfo(String Name) {
        System.out.println("Ремонт " + Name + " велосипедa");
    }
}

class Refit{
    static void Repair(ArrayList<String> spisok, int[] digit){
        int i=0;
        while(i<digit[0]){
            Main.PrintInfo(spisok.get(i)); i++;}
    }
}

class Diameter{
    static void diameterWheels(ArrayList<String> spisok, int[] digit){
        System.out.println();
        for(int i = 0; i<digit[0]; i++){
            spisok.set(i, spisok.get(i)+" "+Math.round(Math.random()*14+9));
        }
        for(int i = digit[0]; i<digit[1]+digit[0]; i++){
            spisok.set(i, spisok.get(i)+" "+(Math.round(Math.random()*14+9))*2);
        }
        for(int i = digit[1]+digit[0]; i<digit[1]+digit[0]+digit[2]; i++){
            spisok.set(i, spisok.get(i)+" "+(Math.round(Math.random()*14+9))*3);
        }

        System.out.println(spisok);
    }
}
