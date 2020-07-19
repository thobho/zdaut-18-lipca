package com.sda.objects;

import java.util.ArrayList;

public class ListDemo {


    public static void main(String[] args) {

        ArrayList<String> listaZakopow = new ArrayList<>();
        listaZakopow.add("Chleb");
        listaZakopow.add("Mleko");
        listaZakopow.set(1, "Śmietana");
        listaZakopow.remove("Chleb");
        String chleb = listaZakopow.get(0);
        listaZakopow.size();
        listaZakopow.clear();

        System.out.println(listaZakopow);


    }

}
