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

    // < 0 -> wyjątek
    // 10 -> Dog
    // 500 -> Dog
    // 501 -> wyjątek

    Dog(String newDogName, int newDogWeigh){

        if(newDogWeigh <= 0 || newDogWeigh > 500){
            throw new IllegalArgumentException("Niepoprawna waga psa");
        }

        this.name = newDogName;
        this.weight = newDogWeigh;
    }

    //========+ZACHOWANIA+========
    String describeDog(){
        return name + " : " + weight;
    }

}
