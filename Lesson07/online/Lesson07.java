package Lesson07.online;

import java.util.Scanner;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 02.08.2021
 */

public class Lesson07 extends Object{

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        String s0 = "Hello_Java!";
//        String s1 = "Hello_";
//        s1 += "Java!";
//
//        String s2 = scanner.nextLine(); //"Hello_Java!"
//        String s3 = "Hello_Java!";
//
//        System.out.println("s0 > " + s0);
//        System.out.println("s1 > " + s1);
//        System.out.println("s2 > " + s2);
//        System.out.println("s3 > " + s3);
//        System.out.println("**********");
//        System.out.println("s0 == s1 > " + (s0 == s1));
//        System.out.println("s0 == s2 > " + (s0 == s2));
//        System.out.println("s0 == s3 > " + (s0 == s3));
//        System.out.println("**********");
//        System.out.println("s0 == s1 > " + (s0.equals(s1)));
//        System.out.println("s0 == s2 > " + (s0.equals(s2)));
//        System.out.println("s0 == s3 > " + (s0.equals(s3)));
        String testString = "Test"; //String testString = new String("Test");
        StringBuilder testStringBuilder = new StringBuilder("Test");
        StringBuffer stringBuffer = new StringBuffer();

        long startTime = System.nanoTime(); //timestamp UNIX


        for (int i = 0; i < 50000; i++) {
            testString += i; //Test012345678910..49999
        }

        float deltaTime = System.nanoTime() - startTime;
        System.out.println(testString);
        System.out.println("Time test string > " + deltaTime * 0.000001f + " millisec.");

        startTime = System.nanoTime();

        for (int i = 0; i < 50000; i++) {
            testStringBuilder.append(i); //Test012345678910..49999
        }

        deltaTime = System.nanoTime() - startTime;
        System.out.println(testStringBuilder.toString());
        System.out.println("Time test StringBuilder > " + deltaTime * 0.000001f + " millisec.");
        System.out.println(testString.equals(testStringBuilder.toString()));


    }
}
