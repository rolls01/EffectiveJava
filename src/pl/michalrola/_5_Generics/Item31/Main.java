package pl.michalrola._5_Generics.Item31;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> guys = new ArrayList<>();
        guys.addAll(List.of("Tom", "Dick", "Harry"));
        swapWithParameters(guys, 1,0);
        System.out.println(guys);

        List<String> stooges = new ArrayList<>();
        stooges.addAll(List.of("Larry", "Moe", "Curly"));
        swapWithWildcard(stooges, 2, 1);
        System.out.println(stooges);
    }

    //Two possible declarations for the swap method
    //1
    public static <E> void swapWithParameters(List<E> list, int i, int j) {
        list.set(i, list.set(j, list.get(i)));
    }

    //2
    //prefer for API
    public static void swapWithWildcard(List<?> list, int i, int j) {
        swapHelper(list, i, j);
    }

    //helper method to fix set into list with wildcard (List<?>)
    //easy fix to introduce with generic method (no unsafe ast or raw types)
    private static <E> void swapHelper(List<E> list, int i, int j) {
        list.set(i, list.set(j, list.get(i)));
    }

}
