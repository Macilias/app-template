package com.macilias.apps.view;

import java.util.Scanner;

/**
 * Created by mac on 19.08.17.
 */
public class Main {


    public static void main(String... args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Hello, to end reading line type END:");

        while (in.hasNextLine()) {

            String line = in.nextLine();

            System.out.println("Ok, got it: " + line);

            if (line.trim().equalsIgnoreCase("END")) {
                System.exit(0);
            }
        }

    }
}
