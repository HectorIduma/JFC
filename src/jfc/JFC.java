package jfc;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JFC {

    public static Set<Object> union(Set<Object> a, Set<Object> b) {
        Set<Object> result = new HashSet<>(a);
        result.addAll(b);
        return result;
    }

    public static Set<Object> intersect(Set<Object> a, Set<Object> b) {
        Set<Object> result = new HashSet<>(a);
        result.retainAll(b);
        return result;
    }

    public static Set<Object> diff(Set<Object> a, Set<Object> b) {
        Set<Object> result = new HashSet<>(a);
        result.removeAll(b);
        return result;
    }

    public static boolean isSubset(Set<Object> a, Set<Object> b) {
        return a.containsAll(b);
    }

    public static Set<String> cartesiano(Set<Object> a, Set<Object> b) {
        Set<String> result = new HashSet<>();
        for (Object elementoA : a) {
            for (Object elementoB : b) {
                result.add("(" + elementoA + ", " + elementoB + ")");
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Object> setA = new HashSet<>();
        Set<Object> setB = new HashSet<>();

        System.out.println("introduce los elementos del conjunto A (separados por espacio):");
        String[] elementosA = scanner.nextLine().split(" ");
        for (String elemento : elementosA) {
            setA.add(elemento);
        }

        System.out.println("introduce los elementos del conjunto B (separados por espacio):");
        String[] elementosB = scanner.nextLine().split(" ");
        for (String elemento : elementosB) {
            setB.add(elemento);
        }

        System.out.println("union: " + union(setA, setB));
        System.out.println("interseccion: " + intersect(setA, setB));
        System.out.println("diferencia: " + diff(setA, setB));
        System.out.println("es subconjunto: " + isSubset(setA, setB));
        System.out.println("producto cartesiano: " + cartesiano(setA, setB));

        scanner.close();
    }
}
