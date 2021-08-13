package hackerEarth;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

import java.util.Arrays;
import java.util.Scanner;

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        /*Scanner s=new Scanner(System.in);
        String name= s.nextLine();*/
        String name="232Hello";
        System.out.println(name);
        String[] split = name.split("0-1");
        System.out.println("split "+ split.toString());
        //System.out.println(Arrays.stream(split).mapToInt(s -> s.split()));
    }
    public static void printOurput(int n,String s){
        System.out.println(n*2);
        System.out.println(s);
    }
}

