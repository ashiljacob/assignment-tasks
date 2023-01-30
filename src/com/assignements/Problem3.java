package com.assignements;

import java.util.*;

public class Problem3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings in the list: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<String> list = new ArrayList<>();
        System.out.println("Enter the strings: ");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }


        System.out.println("Original List: " + list);
        List<String> L1 = new ArrayList<>(list);
        Collections.sort(L1);
        Map<Character, List<String>> map = new HashMap<>();
        for (String str : L1) {
            char key = str.charAt(0);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        List<String> L2 = new ArrayList<>();
        for (char key : map.keySet()) {
            List<String> value = map.get(key);
            Collections.sort(value, (s1, s2) -> {
                int num1 = Integer.parseInt(s1.substring(1));
                int num2 = Integer.parseInt(s2.substring(1));
                return num2 - num1;
            });
            L2.addAll(value);
        }
        System.out.println("List L1: " + L1);
        System.out.println("List L2: " + L2);
    }
}
