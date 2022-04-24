package com;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public  static Scanner sc = new Scanner(System.in);
    public  static Random rand = new Random();
    public  static int selectChoice;
    public static ArrayList<List<Integer>> pickThree;
    public static ArrayList<List<Integer>> pickFour;
    public static ArrayList<List<Integer>> cashFive;

    public static void main(String[] args) {
        System.out.println("Lottery number picker");
        selectionMenu();

    }


    public static void lottoNumberGeneratorPick3(){
        List<Integer> randThree;
        randThree= new Random().ints(3,2,9).boxed().toList();
        System.out.println("The following number generated : " + randThree);
        pickThree.add(randThree);





    }

    public static void lottoNumberGeneratorPick4(){
        List<Integer> randFour;
        randFour = new Random().ints(4, 2,9).boxed().toList();
        System.out.println("The following number generated : " + randFour);
        System.out.println(pickFour);



    }


    public static void lottoNumberGeneratorCash5(){
        List<Integer> pickFive;
        pickFive = new Random().ints(5, 2,9).boxed().toList();
        System.out.println("The following number generated : " + pickFive);
        cashFive.add(pickFive);


    }

    public static void selectionMenu(){
        boolean exit = true;
        do{

            exit = true;


            System.out.println("Select what lotto play to generate \n 1. for pick 3 \n 2. for pick 4 \n 3. for cash 5. \n 4. to exit");

            selectChoice = sc.nextInt();
            switch (selectChoice){
                case 1:
                    int pickThreeMenu = sc.nextInt();
                    switch (pickThreeMenu){
                        case 1:
                            lottoNumberGeneratorPick3();
                            break;
                        case 2:
                            //view the lottery numbers that was stored
                            break;

                    }


                    break;
                case 2:
                    lottoNumberGeneratorPick4();
                    break;
                case 3:
                    lottoNumberGeneratorCash5();
                    break;
                case 4:
                    exit = false;




            }

        }while(exit);

    }



}
