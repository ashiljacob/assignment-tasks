package com.assignements;

import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] start = new int[2];
        int[] end = new int[2];

        System.out.print("Enter the starting x and y coordinates: ");
        start[0] = scan.nextInt();
        start[1] = scan.nextInt();

        System.out.print("Enter the direction string: ");
        String path = scan.next();

        int x = start[0];
        int y = start[1];

        for (int i = 0; i < path.length(); i++) {
            char move = path.charAt(i);
            switch (move) {
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
            }
        }
        end[0] = x;
        end[1] = y;

        double distance = Math.sqrt(Math.pow((end[0] - start[0]),2) + Math.pow((end[1] - start[1]),2));
        System.out.println("Shortest Manhattan distance between the two points is: " + distance);
    }
}
