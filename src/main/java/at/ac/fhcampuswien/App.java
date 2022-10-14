package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        Scanner Scanner = new Scanner(System.in);
        double number = 1;
        double largestNumber = 0;
        int Ziffer = 1;

        while (number > 0) {
            System.out.print("Number " + Ziffer + ": ");
            Ziffer++;
            number = Scanner.nextDouble();

            if ((Ziffer == 2) && (number <= 0)) {
                System.out.println("No number entered.");
            } else if (number > largestNumber) {
                largestNumber = number;
            } else if ((number <= 0)) {
                System.out.println("The largest number is " + String.format("%.2f", largestNumber));
            }
        }

    }

    //todo Task 2
    public void stairs() {
        System.out.print("n: ");
        Scanner scanner2 = new Scanner(System.in);
        int n = scanner2.nextInt();
        int number = 1;

        if (n > 0) {
            for (int x = 1; x <= n; x++) {
                for (int y = 1; y <= x; y++) {
                    System.out.print(number + " ");
                    number++;
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid number!");
        }
    }

    //todo Task 3
    public void printPyramid(){
        int number = 6;

        for (int x = 1; x <= number; x++) {
            for (int y = number - x; y > 0; y--) {
                System.out.print(" ");
            }
            for (int z = 1; z <= (x * 2)-1; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus(){
        Scanner scanner4 = new Scanner(System.in);
        int noOfColumns = 0;
        System.out.print("h: ");
        int h = scanner4.nextInt();
        int h2 = h / 2;
        int numberOfSpaces = h2;
        int h3 = h2 + 1;
        System.out.print("c: ");
        char c = scanner4.next().charAt(0);
        int letter1 = c;               //H
        int start;
        int letter2 = c - h2;         //D
        int count = 1;

        if (h % 2 == 1) {
            for (int x = 0; x < h; x++) {

                if (x < h3) {
                    start = letter1 - x;
                } else {
                    start = letter2 + count;
                    count++;
                }

                for (int y = 1; y <= numberOfSpaces; y++) {
                    System.out.print(" ");
                }
                if (x < h2) {
                    numberOfSpaces = numberOfSpaces - 1;
                } else {
                    numberOfSpaces = numberOfSpaces + 1;
                }


                for (int z = 0; z <= noOfColumns; z++) {
                    int middleColumn = (noOfColumns / 2);
                    System.out.print((char) (start));

                    if (z < middleColumn) {
                        start++;
                    } else {
                        start--;
                    }

                }
                System.out.println();
                if (x < h2) {
                    noOfColumns = noOfColumns + 2;
                } else {
                    noOfColumns = noOfColumns - 2;
                }

            }
        } else {
            System.out.println("Invalid number!");
        }
    }

    //todo Task 5
    public void marks(){
        Scanner scanner5 = new Scanner(System.in);
        int number = 1;
        double mark = 1;
        double sum = 0;
        double average;
        int countMarks = 0;
        int countNegativeMarks = 0;


        while (mark > 0) {
            System.out.print("Mark " + number + ": ");
            number++;

            mark = scanner5.nextInt();

            if ((number == 2) && (mark == 0)) {
                System.out.println("Average: 0,00");
                System.out.println("Negative marks: 0");

            } else if ((mark > 5) && (mark != 0)) {
                System.out.println("Invalid mark!");
                number--;

            } else if ((mark > 0) && (mark < 6)) {
                sum = sum + mark;
                countMarks++;

                if (mark == 5) {
                    countNegativeMarks++;
                }

            } else if (mark == 0) {
                average = sum / (countMarks);
                System.out.println("Average: " + String.format("%.2f", average));
                System.out.println("Negative marks: " + countNegativeMarks);
            }

        }
    }

    //todo Task 6
    public void happyNumbers(){
        Scanner scanner6 = new Scanner(System.in);
        System.out.print("n: ");
        int number = scanner6.nextInt();
        int sum_2;
        int digit3;
        int digit2;
        int digit1;

        while (number > 0) {

            if (number != 1 && number != 4) {
                digit3 = number % 10;
                digit2 = (number / 10) % 10;
                digit1 = (number / 100) % 10;

                sum_2 = (int) (Math.pow(digit1, 2) + Math.pow(digit2, 2) + Math.pow(digit3, 2));
                number = sum_2;

            } else if (number == 1) {
                System.out.println("Happy number!");
                break;

            } else if (number == 4) {
                System.out.println("Sad number!");
                break;
            }
        }
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}