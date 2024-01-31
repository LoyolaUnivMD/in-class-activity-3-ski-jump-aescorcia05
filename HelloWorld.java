// Programmers:  Alejandro Escorcia
// Course:  CS 212, Dr. Nweke
// Due Date: 02/01/24
// In-class activity: 3
// Problem Statement:  Winter is coming! One winter sport is the ski jump, where the score is determined by the distance traveled after skiing down a ramp and into the air. What type of speed does a ski jumper need to achieve on the ramp to make a good distance on their jump? Let’s make a program to calculate the distance traveled based on speed and determine how many points they’d receive if they went that distance.
// System.out.println: XXX
// Output:  XXX
// Credits: XXX

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {

        // Getting tool for user input
        Scanner input = new Scanner(System.in);

        // Initializing variables
        String hillType;
        double jumperSpeed;

        double height = 0;
        double pointsMeter = 0;
        double par = 0;

        // Getting inputs from user
        do {
            System.out.println("Did the jumper jump from a normal (N) hill or a large (L) hill? ");
            hillType = input.nextLine();
        } while (!(hillType.equals("N") || hillType.equals("L")));
        do {
            System.out.println("What is the jumper speed? (m/s) ");
            jumperSpeed = input.nextDouble();
        } while (jumperSpeed < 0 || jumperSpeed > 100);
        
        // Determining what the hill's height, points per meter, and par are
        if (hillType.equals("N")) {
            height = 46;
            pointsMeter = 2;
            par = 90;
        } else {
            height = 70;
            pointsMeter = 1.8;
            par = 120;
        }

        // Doing the necessary calculations
        double timeInAir = Math.sqrt((2 * height) / 9.8);
        double distanceTravelled = jumperSpeed * timeInAir;
        double totalPoints = 60 + (distanceTravelled - par) * pointsMeter;

        // Outputting results
        System.out.println("The jumper travelled " + String.format("%,.2f", distanceTravelled) + " meters and received " + Math.round(totalPoints) + " total points.");

        if (totalPoints >= 61) {System.out.println("Great job for doing better than par!");}
        else if (totalPoints < 10) {System.out.println("What happened??");}
        else {System.out.println("Sorry you didn’t go very far");}

    }
}
