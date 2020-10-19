package com.company;

import java.util.ArrayList;

public class H1_34 {

    public Integer arrayListSum(ArrayList<Integer> pList) {

        if (pList == null){
            return 0;
        }
        int sum = 0;
        for (int num : pList) {
            sum = sum + num;
        }

        return sum;
    }
}

