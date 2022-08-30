package day11_stringManipulation;

import java.util.Scanner;

public class C07_startWith {
    public static void main(String[] args) {
        String input="java gun gectikce guzellesir";
        System.out.println(input.startsWith("J"));//true
        System.out.println(input.startsWith(""));//true
        System.out.println(input.startsWith("gun",5));//true
        System.out.println(input.startsWith("gectikce",9));//true
        System.out.println(input.startsWith("gun",10));//false
        System.out.println(input.startsWith("java"));


        }
    }

