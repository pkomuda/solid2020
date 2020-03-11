package pl.zzpj2020.cleancode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(4, 5, 6, 6));
        NumberOccurences occurences = new NumberOccurences(numbers);
        System.out.println(occurences.average());
    }
}
