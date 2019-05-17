package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Select 1, 2, 3, for Rock, Paper, Scissors");
        Scanner keyboard=new Scanner(System.in);
        String username= keyboard.nextLine();
        int randomNumber;
        int b= keyboard.nextInt();





        while (b == b) {
            int rock = 1, paper = 2, scissors = 3;
            int array;
            String[][] number = {
                    {"1", "2", "3"}};


            if (rock == b) {
                if (b == rock) {
                    System.out.println("Tie");
                } else if (b == paper) {
                    System.out.println("Congrats! you win");
                } else if (b == scissors) {
                    System.out.println("You lose");
                } else if (b == paper) {
                    if (b == rock) {
                        System.out.println("You lose!");
                    } else if (b == scissors) {
                        System.out.println("You win!");
                    } else if (b == paper) {
                        System.out.println("tie");

                        if (b == scissors) {
                            if (b == rock) {
                                System.out.println("You win!");
                            } else if (b == scissors) {
                                System.out.println("tie");
                            } else if (b == paper) {
                                System.out.println("You lose!");
                                System.out.println("play again?");
                            }


                        }
                    }
                }
            }
            b = 1;
            System.out.println("do you want to play again? if yes, type 4, if no type 5");
            int yes = 4, no = 5;
            int answer;
            answer = keyboard.nextInt();

            if (answer == yes) {
                System.out.println("rock, paper, scissors, SHOOT");

            }
            if (answer == no) {
            System.out.println("okay, i hope you had fun");
        }
            }

    }}