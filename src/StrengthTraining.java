import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StrengthTraining {

    /*
        STRENGHT TRAINING APP

        This is a simple app that will be used to record and store gym progress results from workout routines. The gym program will be split into three different programs

        The goal is to find some "fun" statistics about the workout including the total amount of weight lifted, power output, calorie burn, ect

        -Chest and Arm Day
            -10 min jog
            -5x5 Bench press
            -5x5 Curls
            -5x10 Pull Down
            -5x10 Dumbell
        -Back and Core Day
            -10 min jog
            -5x5 Bar Squats
            -5x10 Rows
            -5x10 Inclined Sit ups
            -5x5 Deadlifts

        -Leg Day
            -30 min run
            -5x5 Leg press
            -5x5 Pull Up Bar (Statchchi)


        workouts should be aimed for 45min to a 1hour routine with flex to go up to 90min.
        The data collected will be stored in a JSON or other kind of file (txt?).
        This class will require JOptionPane for a visual interface to add in new entries
        of what was done and accomplished throuought the gym program for the day

        We want to use Lists since we will have duplicate workouts




        Each day will have List associated with the routine
     */


   static List<ChestDay> chestDays = new ArrayList<>();
   static  List<LegDay>  legDays = new ArrayList<>();



    public static void main(String[] args){


        chestDays.add(addToChestDayBench());
        chestDays.add(addToChestDayDumbell());
        chestDays.add(addToChestDayPullDown());


        int weightTotal = 0;
        for(ChestDay temp: chestDays){
            weightTotal += temp.getWeight()*temp.getSets()*temp.getSets();
        }
        System.out.println("number of excersices: " + chestDays.size());
        System.out.println("total weight moved: " + weightTotal);


    }


    public static ChestDay addToChestDayBench(){
        String workout;
        int weight;
        int reps;
        int sets;

        System.out.println("Chest Day: ");
        Scanner scanner = new Scanner(System.in);

        //we don't want to risk a typo so the workout is set to
        // the exercise BENCH, this format will prevent users adding
        //new excercise routines, but we can guarantee the format
        //needed for JSON when we make the file
        System.out.println("name of equipment / exercise: BENCH");
        workout = "BENCH";
        System.out.println("weight used: ");
        weight = scanner.nextInt();
        System.out.println("number of reps: ");
        reps = scanner.nextInt();
        System.out.println("number of sets: ");
        sets = scanner.nextInt();

        System.out.println("compiled -> adding to List");

        ChestDay someChestDay = new ChestDay(workout, weight, sets, reps);
        return someChestDay;
    }

    public static ChestDay addToChestDayDumbell(){
        String workout;
        int weight;
        int reps;
        int sets;

        System.out.println("Chest Day: ");
        Scanner scanner = new Scanner(System.in);

        //we don't want to risk a typo so the workout is set to
        // the exercise BENCH, this format will prevent users adding
        //new excercise routines, but we can guarantee the format
        //needed for JSON when we make the file
        System.out.println("name of equipment / exercise: DUMBELL");
        workout = "DUMBELL";
        System.out.println("weight used: ");
        weight = scanner.nextInt();
        System.out.println("number of reps: ");
        reps = scanner.nextInt();
        System.out.println("number of sets: ");
        sets = scanner.nextInt();

        System.out.println("compiled -> adding to List");

        ChestDay someChestDay = new ChestDay(workout, weight, sets, reps);
        return someChestDay;
    }

    public static ChestDay addToChestDayPullDown(){
        String workout;
        int weight;
        int reps;
        int sets;

        System.out.println("Chest Day: ");
        Scanner scanner = new Scanner(System.in);

        //we don't want to risk a typo so the workout is set to
        // the exercise BENCH, this format will prevent users adding
        //new excercise routines, but we can guarantee the format
        //needed for JSON when we make the file
        System.out.println("name of equipment / exercise: PULLDOWN");
        workout = "PULLDOWN";
        System.out.println("weight used: ");
        weight = scanner.nextInt();
        System.out.println("number of reps: ");
        reps = scanner.nextInt();
        System.out.println("number of sets: ");
        sets = scanner.nextInt();

        System.out.println("compiled -> adding to List");

        ChestDay someChestDay = new ChestDay(workout, weight, sets, reps);
        return someChestDay;


    }



}
