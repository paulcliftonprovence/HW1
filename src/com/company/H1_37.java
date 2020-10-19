package com.company;
import java.util.ArrayList;
public class H1_37 {
    public void arrayListRemove(ArrayList<Integer> pList, int pValue){


        for (int i = 0; i < pList.size(); i++){
            int pListElementValue = pList.get(i);

            if (pListElementValue == pValue){
                pList.remove(i);
                i--;
            }
        }
    }
}
