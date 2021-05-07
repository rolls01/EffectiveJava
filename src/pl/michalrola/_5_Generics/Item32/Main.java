package pl.michalrola._5_Generics.Item32;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> friends = List.of("Mark","John","Beth");
        List<String> romans = List.of("Susie","Kate","Michael");
        List<String> countrymen = List.of("Jack","Dixi","Daniel");

        List<String> audienceVarargs = flattenWithVarargs(friends, romans, countrymen);
        System.out.println("audienceVarargs = " + audienceVarargs);

        List<String> audienceListInList = flattenWithList(List.of(friends, romans, countrymen));
        System.out.println("audienceListInList = " + audienceListInList);
    }

    // Safe method with a generic varargs parameter
    @SafeVarargs
    static <T> List<T> flattenWithVarargs(List<? extends T>... lists) {
        List<T> result = new ArrayList<>();
        for (List<? extends T> list : lists)
            result.addAll(list);
        return result;
    }

    // List as a typesafe alternative to a generic varargs parameter
    static <T> List<T> flattenWithList(List<List<? extends T>> lists) {
        List<T> result = new ArrayList<>();
        for (List<? extends T> list : lists)
            result.addAll(list);
        return result;
    }
}
