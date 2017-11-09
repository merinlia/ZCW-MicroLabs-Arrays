package io.zipcoder.microlabs.arrays;


import java.util.ArrayList;

public class ArrayParty {
    String str="*** Output ***\n";

    public ArrayParty() {
    }

    public String printArray(String[] inputArray){
        for(int i=0;i<inputArray.length;i++){
            if(i!=inputArray.length-1)
                str+=inputArray[i]+"\n";
            else
                str+=inputArray[i];
        }

        return str;
    }

    public String lastElement(String[] inputArray){
        String str="*** Output ***\n";
        return str+inputArray[inputArray.length-1];
    }

    //TODO Define the method lastButOne
    public String secondLast(String[] inputArray){
        String str="*** Output ***\n";
        return str+inputArray[inputArray.length-2];
    }

    //TODO Define the method reverse
    public String reverseArray(String[] inputArray){
        String str= "*** Output ***\n";
        for(int i=inputArray.length-1;i>=0;i--){
            str+=inputArray[i]+"\n";
        }
        return str;
    }

    //TODO Define the method isPalindrome

    public String isPalindrome(String[] inputArray){
        String str= "*** Output ***\n";
        int count= 0;
        for(int i=0;i<inputArray.length-1;i++){
            for(int j=inputArray.length-1;j>=0;j--){
                if(inputArray[i].equals(inputArray[j]))
                    count++;
            }
        }
        if(count==0) {
            return str+"True";

        }
        else
            return str+"False";
    }


    //TODO Define the method compress
    public String duplicate(int[] nums){
        String str= "*** Output ***\n";
        ArrayList<Integer> intArrayList= new ArrayList<Integer>();
        System.out.println(intArrayList.add(nums[0]));
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]) {
                intArrayList.add(nums[i]);
            }
        }
        for (Integer j:intArrayList) {
            str+=j+"\n";
        }
        return str.trim();
    }

    //TODO Define the method pack
    public  String pack(char[] letters){
        String str= "*** Output ***\n";
        String outputStr= Character.toString(letters[0]);
        for(int i=1;i<letters.length;i++){
            if(letters[i-1]==letters[i]) {
                outputStr += letters[i];
            }
            else {
                outputStr += ",";
                outputStr+= letters[i];
            }
        }

        return str+outputStr;
    }


}
