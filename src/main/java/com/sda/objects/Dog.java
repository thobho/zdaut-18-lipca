package com.sda.objects;

public class Dog {
    //========+STAN+=============
    //polach klasy
    String name;
    int weight;

    //========+KONSTRUKTORY+=====
    Dog(){
        this.name = "Burek";
        this.weight = 10;
    }

    Dog(String newDogName, int newDogWeigh){
        this.name = newDogName;
        this.weight = newDogWeigh;
    }

    //========+ZACHOWANIA+========
    String describeDog(){
        return name + " : " + weight;
    }

}
