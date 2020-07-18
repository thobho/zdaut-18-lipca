package com.sda.objects;

public class VetPatientStatus {
    String name; // SEVERE, NORMAL, TRIVIAL (lepszy byłby enum)

    public VetPatientStatus(String name) {
        this.name = name;
    }

    @Override//opcjonalne
    public String toString() {
        return name;
    }
}
