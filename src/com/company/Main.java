package com.company;


import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] output = removeDupes(new int[]{7, 7, 7, 7, 7});
        for (int i : output) {
            System.out.println(i);
        }

        String input = "c4qc4qc4q";
        System.out.println(input);

    }

    public static int countCode(String str){
        if (str.length() < 3){
            return 0;
        }

        return 0;
    }
    public static int[] removeDupes(int[] input) {

        HashMap<Integer, Integer> countNumbers = new HashMap<>();


        for (int i = 0; i < input.length; i++) {
            if (countNumbers.containsKey(input[i])){
                countNumbers.replace(input[i],countNumbers.get(input[i]) + 1);
            } else {
                countNumbers.put(input[i],1);
            }

        }
        ArrayList<Integer> outputAsArrayList = new ArrayList<>();
        for (int i : countNumbers.keySet()){
            if (countNumbers.get(i) == 1){
                outputAsArrayList.add(i);
            }
        }
        int[] output = new int[outputAsArrayList.size()];
        for (int i = 0; i < output.length; i++) {
            output[i] = outputAsArrayList.get(i);
        }
        return output;

    }
}
