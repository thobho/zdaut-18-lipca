package com.sda.objects;

import java.util.Scanner;

public class VetMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input dla imienia
        System.out.println("Wpisz imię psa:");
        String dogName = scanner.nextLine();
        //input dla wagi
        System.out.println("Wpisz wagę psa:");

        //!! musi tak być, ze względu na działanie scannera
        //musimy zamienić Stringa na int, i to robi metoda Integer.parseInt
        int dogWeight = Integer.parseInt(scanner.nextLine());

        //input po opis
        System.out.println("Wpisz opis przypadku");
        String description = scanner.nextLine();

        //=======================
        Dog vetPatient = new Dog(dogName, dogWeight);
        VetService vetService = new VetService();

        double priceForVetPatient = vetService.getTreatmentPrice(vetPatient);
        VetPatientStatus status = vetService.classifyPatientStatus(description);

        //=======================

        System.out.println("Cena za psa: " + vetPatient.name + " wynosi " + priceForVetPatient);
        System.out.println("Status przypadku: " + status);
    }
}
