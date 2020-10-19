package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        H1_31 robot = new H1_31();
        ArrayList<Integer> myArray = robot.arrayListInit();
        System.out.println(myArray);

        H1_33 countN = new H1_33();
	    countN.countNegatives();

	    ArrayList<Integer> sumArray = new ArrayList<>();
//	    sumArray.add(1);
//	    sumArray.add(2);
	    H1_34 sumCalculator = new H1_34();
	    Integer total = sumCalculator.arrayListSum(sumArray);
	    System.out.println(total);
	    System.out.println(sumArray);


	    H1_36 nameSorter = new H1_36();
	    ArrayList<String> myNameList = new ArrayList<>();
//	    myNameList.add("Bob");
//	    myNameList.add("Cindy");
//	    myNameList.add("Emily");
	    nameSorter.insertName(myNameList, "Bob");
	    System.out.println(myNameList);

	    H1_37 removeEqualElements = new H1_37();
	    ArrayList<Integer> superList = new ArrayList<>();
//	    superList.add(1);
//	    superList.add(5);
//	    superList.add(8);
//	    superList.add(5);
	    removeEqualElements.arrayListRemove(superList, 5);
		System.out.println(superList);

    }
}
