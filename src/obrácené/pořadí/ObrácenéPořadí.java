package obrácené.pořadí;

import java.util.ArrayList;
import java.util.Scanner;

public class ObrácenéPořadí {

    public static void main(String[] args) {
        ArrayList<String> seznam = new ArrayList<>();
        Scanner vstup = new Scanner(System.in);
        
        System.out.println("Ukončení prázným vstupem.");
        System.out.print("Zadej něco: ");
        String něco = vstup.nextLine();
        
        while (! něco.isEmpty()) {
            seznam.add(něco);
            System.out.print("Zadej něco: ");
            něco = vstup.nextLine();
        }
        
        System.out.println("Obrácené pořadí:");
        for (int i=seznam.size(); i>=1; i--) {
            System.out.println(seznam.get(i-1));
        }
    }
}
