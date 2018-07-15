package com.company;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static class Calc extends Main {
        public static void main(String[] args) {
            int num1 = getInt();
            char operation = getOperation();
            int num3 = calc(num1, operation);
            System.out.println("ss pudge");
        }

        public static char getOperation() {
            System.out.println("che mutim?");
            char operation;
            if (scanner.hasNext()) {
                operation = scanner.next().charAt(0);
            } else {
                System.out.println("ti che durak?");
                scanner.next();//rekursia
                operation = getOperation();
            }

            return operation;
        }

        public static int getInt() {
            System.out.println("chislo");
            int num;
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
            } else {
                System.out.println("ti che durak?");
                scanner.next();//rekursia
                num = getInt();
            }
            return num;
        }


        public static int calc(int num1, char operation) {
            int num3;
            switch (operation) {
                case '+':
                    num1 = num1 + getInt();
                    num3 = calc(num1, getOperation());
                    break;
                case '-':
                    num1 = num1 - getInt();
                    num3 = calc(num1, getOperation());
                    break;
                case '*':
                    num1 = num1 * getInt();
                    num3 = calc(num1, getOperation());
                    break;
                case '/':
                    num1 = num1 / getInt();
                    num3 = calc(num1, getOperation());
                    break;
                case '=':
                    num3 = num1;
                    System.out.println("resultat:" + num3);
                    break;
                default:
                    System.out.println("ss pudge");
                    num3 = calc(num1, getOperation());//рекурсия
            }
            return num3;
        }
    }
}