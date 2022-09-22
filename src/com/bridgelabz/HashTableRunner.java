package com.bridgelabz;

public class HashTableRunner {
    public static void main(String[] args) {

        String sentence = "To be or not to be";

        String[] words = sentence.toLowerCase().split(" ");

        MyhashMap<String, Integer> myhashMap = new MyhashMap<>();

        for (String word : words) {
            Integer value = myhashMap.get(word);
            if (value == null) value = 1;
            else value = value + 1;
            myhashMap.add(word, value);
        }

        int frequency = (int) myhashMap.get("to");

        System.out.println(myhashMap);
        System.out.println(frequency);


    }
}
