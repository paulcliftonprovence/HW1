package com.company;
import java.util.ArrayList;

public class H1_35 {
    public ArrayList<Integer> arrayListCreate(int pLen, int pInitValue){

        if (pLen == 0){
            return null;
        }

        ArrayList<Integer> arrayListForUser = new ArrayList<>();

        for(int i = 0; i < pLen; i++){
            arrayListForUser.add(pInitValue);
        }

        return arrayListForUser;
    }


}
