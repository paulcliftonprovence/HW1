package com.company;
import java.util.ArrayList;

public class H1_33 {
    public void countNegatives(){


        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for (Integer value: list)
        {
            if (value < 0){
                count++;
            }
        }

        System.out.println(count);
    }


}
