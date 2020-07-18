package com.sda.objects;

public class VetService {
    // >= 10kg -> 100zł
    // < 10kg -> tyle ile waży * 10zł

    double getTreatmentPrice(Dog vetPatient) {
        int weight = vetPatient.weight;
        if (weight >= 10) {
            return 100;
        } else {
            return weight * 10;
        }

    }



    VetPatientStatus classifyPatientStatus(String description){
        if(description.contains("krwawi") || description.contains("złaman")){
            return new VetPatientStatus("SEVERE");
        }
        if(description.contains("kaszle")){
            return new VetPatientStatus("NORMAL");
        }
        return new VetPatientStatus("TRIVIAL");
    }
}
