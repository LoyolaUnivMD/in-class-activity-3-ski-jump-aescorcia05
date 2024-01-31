// Programmers:  Alejandro Escorcia
// Course:  CS 212, Dr. Nweke
// Due Date: 02/01/24
// In-class activity: 3
// Problem Statement:  Winter is coming! One winter sport is the ski jump, where the score is determined by the distance traveled after skiing down a ramp and into the air. What type of speed does a ski jumper need to achieve on the ramp to make a good distance on their jump? Let’s make a program to calculate the distance traveled based on speed and determine how many points they’d receive if they went that distance.
// System.out.println: XXX
// Output:  XXX
// Credits: XXX

import java.util.Scanner

class HelloWorld {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in)

        //Getting inputs from user
        System.out.println("Did the jumper jump from a normal (N) hill or a large (L) hill? ")
        char hill_type = inpiut.nextChar()

        System.out.println("What is the jumper speed? ")
        double jumper_speed = input.nextDouble
        
        //Determining what the hill's height, points per meter, and par are based on the System.out.println
        if (hill_type == "N")
          height = 46
          points_meter = 2
          par = 90
        elif hill_type == "large":
          height = 70
          points_meter = 1.8
          par = 120
        else:
          System.out.println("Error: program did not recognize hill type.")
        
        if hill_type == "normal" or hill_type == "large":
          time_in_air = math.sqrt((2*height)/9.8)
          distance_travelled = jumper_speed * time_in_air
          total_points = 60 + (distance_travelled - par)*points_meter    
          
          System.out.println(f"The jumper travelled {distance_travelled:.3f} and received {total_points:.2f} total points.") 
          
          if total_points >= 61:
            System.out.println("Great job for doing better than par!")
          elif total_points < 10:
            System.out.println("What happened??")
          else:
            System.out.println("Sorry you didn’t go very far")



        
    }
}
