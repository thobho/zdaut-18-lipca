package com.sda.objects;

public class NullDemo {

    int x;
    boolean trueFalse;
    double y;
    String poem;
    Dog dog;

    public static void main(String[] args) {

        NullDemo nullDemo = new NullDemo();
        Dog dogThatIsNullInside = nullDemo.dog;

        dogThatIsNullInside.describeDog();

        System.out.println();



    }

}
