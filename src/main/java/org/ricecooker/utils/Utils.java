package org.ricecooker.utils;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Utils {
    static final Scanner scanner = new Scanner(System.in);
    public static void print(String sentence) {
        System.out.println(sentence);
    }

    public static int intScanner() {
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            print("Invalid input");
            scanner.nextLine();
        }
        return 0;
    }
    public static void notImplemented() {
        print("Not implemented yet.");
    }

    public static void quit() {
        Utils.print("See you later !");
    };
}
