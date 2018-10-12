package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class OddNumbersExterminator {
    /*
    public ArrayList<Integer> exterminate0(ArrayList<Integer> numbers){
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (Integer evenElement:numbers) {
            if (evenElement%2==0){
                evenNumbers.add(evenElement);
            }
        }
        return evenNumbers;
    }
    */

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        ArrayList<Integer> evenNumbers = numbers.stream()
                .filter(n-> n%2==0)
                .collect(Collectors.toCollection(ArrayList::new));
        return evenNumbers;
    }
}
