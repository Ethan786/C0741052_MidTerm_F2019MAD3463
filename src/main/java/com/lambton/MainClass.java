package com.lambton;

public class MainClass {


        public static void main(String args[]) {
        LambtonStringTools lambtonStringTools = new LambtonStringTools();
        System.out.println(lambtonStringTools.reverse("Lambton"));
        System.out.println(lambtonStringTools.binaryToDecimal("10000"));
        System.out.println(lambtonStringTools.initials("Srinath suddala"));
        System.out.println("MostFreqCharacter = "+ lambtonStringTools.mostFrequent("ssssssdddddfffff"));
        System.out.println( lambtonStringTools.replaceSubString("The dog jumped over the fence","The","That"));
    }
    }