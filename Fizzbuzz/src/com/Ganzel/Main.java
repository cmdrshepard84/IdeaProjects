package com.Ganzel;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for (int i=1; i<=100; i++){
            String test = "";
            test += (i%3 == 0 ? "fizz" : " ");
            test += (i%5 == 0 ? "buzz" : " ");
            System.out.println(!test.isEmpty() ? test : i);
        }
    }
}
