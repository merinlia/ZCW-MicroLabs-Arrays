package io.zipcoder.microlabs.arrays;

public class Main {
    public static void main(String args[]){
        ArrayParty arrayParty= new ArrayParty();
        int [] nums = {1,1,3,3,3,2,2,2,1,1,1,1,4,4,4,4};
        String str= arrayParty.duplicate(nums);
        System.out.println(str);
    }
}
