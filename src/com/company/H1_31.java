package com.company;

/**
 * *CLASS: H1_31 (H1_31.java)
 * GROUP 01
 * AUTHOR 1: Molly Coady, mrcoady, mollyrachaelcoady@gmail.com
 * AUTHOR 2: Paul Province,
 * AUTHOR 3: Ansell Scott, Aescot10, aescot10@asu.edu
 */


import java.util.ArrayList;

public class H1_31 {
    public ArrayList<Integer> arrayListInit() {
        ArrayList<Integer> list = new ArrayList<>();
        int size = 5;

        for (int x = 0; x < 2; x++){
            for (int i = 0; i < size; i++){
                list.add(i);
            }
        }

    return list;
    }

}
