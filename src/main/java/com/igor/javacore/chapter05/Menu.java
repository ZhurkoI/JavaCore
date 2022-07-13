package main.java.com.igor.javacore.chapter05;

import java.sql.SQLOutput;

public class Menu {
    public static void main(String[] args) throws java.io.IOException {
        char choice;
        do {
            System.out.println("Help:");
            System.out.println("  1. IF");
            System.out.println("  2. SWITCH");
            System.out.println("  3. WHILE");
            System.out.println("  4. DO-WHILE");
            System.out.println("  4. FOR\n");
            System.out.println("Choose a number to get help:");
            choice = (char) System.in.read();
        } while (choice < '1' || choice > '5');
        System.out.println("\n");

        switch (choice) {
            case '1':
                System.out.println("if: \n ");
                System.out.println("if (condition) operator;");
                System.out.println("else operator; ");
                break;
            case '2':
                System.out.println("switch: \n");
                System.out.println("switch (statement) { ");
                System.out.println("    case constant : ");
                System.out.println("    operators ");
                System.out.println("    break; ");
                System.out.println("    // ... ");
                System.out.println("} ");
                break;
            case '3':
                System.out.println("while:\n");
                System.out.println("while (condition) operator;");
                break;
            case '4':
                System.out.println("do-while: \n ");
                System.out.println("    do { ");
                System.out.println("    operators; ");
                System.out.println("    } while (condition) ;");
                break;
            case '5':
                System.out.println("for:\n");
                System.out.print("for(initialization; condition; iteration)");
                System.out.println("    operator");
                break;
        }
    }
}
