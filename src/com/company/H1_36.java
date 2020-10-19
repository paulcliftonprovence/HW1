package com.company;
import java.util.ArrayList;

public class H1_36 {
    public void insertName(ArrayList<String> pList, String pName) {
        int sizeOfPList = pList.size();
        String stringToBeAdded = pName;

        if (sizeOfPList == 0){
            pList.add(stringToBeAdded);
        }

        for (int i = 0; i < sizeOfPList; i++) {
            String currentName = pList.get(i);
            if (currentName.compareToIgnoreCase(stringToBeAdded) >= 0) {
                pList.add(i, stringToBeAdded);
                break;
            }
        }
    }
}
