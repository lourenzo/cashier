package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String ... args) {
        Map<Integer, Integer> registerStatus = new HashMap<Integer, Integer>();
        registerStatus.put(1, 30); // One Dolar, 30 bills;
        registerStatus.put(2, 3); // Two Dolar, 3 bills;
        registerStatus.put(5, 3); // Five Dolar, 3 bills;
        registerStatus.put(10, 2); // Ten Dolar, 2 bills;
        registerStatus.put(20, 1); // twenty Dolar, 2 bills;
        registerStatus.put(50, 0); // fifhty Dolar, 0 bills;
        registerStatus.put(100, 0); // One hundred Dolar, 0 bills;

        boolean result = canIGiveChange(registerStatus, 100, 9);
        System.out.printf("Result " + result);

    }

    public static boolean canIGiveChange(Map<Integer,Integer> registerStatus, Integer customerPayment, Integer productCost) {
        // Find desired change amount
        // List available bills -> exclude zeroed
        // Iterate bills
        //      -> in reverse sorting
        //      -> decrease bill count
        //      -> sum up used bills
        // If bills sum equals expected chance amount return true, else return false
        return false;
    }
}