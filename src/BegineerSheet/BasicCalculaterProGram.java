package BegineerSheet;

import javax.swing.*;
import java.util.Scanner;

public class BasicCalculaterProGram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("!!!!");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");
        System.out.println("MOD");
        System.out.println("Enter a and b : ");
        int a= sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Select the menu");
        String option= sc.next();
        option=option.toUpperCase();
        switch (option){
            case "ADD": System.out.println("sum is :"+(a+b));
                break;
            case "SUB": System.out.println("sum is :"+(a-b));
                break;
            case "MUL": System.out.println("sum is :"+(a*b));
                break;
            case "DIV": System.out.println("sum is :"+(a/b));
                break;
            case "MOD": System.out.println("sum is :"+(a%b));
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }

}
