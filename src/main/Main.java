package main;

import java.util.*;

class A { public int a; }

public class Main {
    
    /**
     * Main methode
     * 
     * @param args Eingabe
     */

    public static void main(String[] args) {
        //List<Integer> ints = new ArrayList<>();
        List<Integer> ints = new LinkedList<>();
        ints.add(5);
        ints.add(9);
        System.out.println(ints.get(1));
        Map<String, A> map = new HashMap<>();
        map.put("Zwölf", new A());
        map.get("Zwölf").a = 12;
        System.out.println(map.get("Zwölf").a);
        map.put("Zwölf", new A());
        map.get("Zwölf").a = 13;
        System.out.println(map.get("Zwölf").a);
    }
    
}
