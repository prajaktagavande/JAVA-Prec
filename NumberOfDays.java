package com.java.NumOfDaysInMonths;
import java.util.Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.print("Enter month: ");
        int month = sc.nextInt();

        int days = 0;

        switch(month){
            case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12:
                days = 31;
                break;

            case 4: case 6 : case 9 : case 11:
                days = 30;
                break;

            case 2:
                if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
                    days = 29;
                }
                else{
                    days = 28;
                }
                break;

            default:
                System.out.println("Invalid month !");
        }

        System.out.println("Num of days in " + month + " of the year " + year + " is: " + days);
    }
}