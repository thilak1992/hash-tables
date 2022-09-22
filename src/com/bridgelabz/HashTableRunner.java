package com.bridgelabz;

public class HashTableRunner {

public static void main(String[] args) {

        String paragraph = "Paranoids are not paranoid because they are paranoid but " +
        "because they keep putting themselves deliberately into paranoid avoidable situations";

        String[] words = paragraph.toLowerCase().split(" ");

        MyhashMap<String, Integer> myhashMap = new MyhashMap<>();

        for (String word : words) {
        Integer value = myhashMap.get(word);
        if (value == null) value = 1;
        else value = value + 1;
        myhashMap.add(word, value);
        }
        System.out.println(myhashMap);
        int frequency = (int) myhashMap.get("paranoid");
        System.out.println(frequency);


        }
}
