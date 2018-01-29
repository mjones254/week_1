package com.michaeljones.week_1;


public class Main {

    public static void main(String[] args) {
        String city = "Columbus";
        String zipCode = "43215";

        int majVersion = 1;
        int minorVersion = 2;
        int release = 3;

        System.out.println(majVersion + "." + minorVersion + "." + release);


        int highTemperatures[] = {32, 25, 27, 40, 45};
        int highTemperatureCt = 5;

        float averageHigh = (highTemperatures[0] + highTemperatures[1] + highTemperatures[2] + highTemperatures[3] +
                highTemperatures[4]) / (float) highTemperatureCt;

        System.out.println("City: " + city);
        System.out.println("Zip Code: " + zipCode);
        System.out.println("Average High Temperature: " + averageHigh);
    }
}
