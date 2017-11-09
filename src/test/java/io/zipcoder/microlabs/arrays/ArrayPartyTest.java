package io.zipcoder.microlabs.arrays;

import org.junit.Assert;
import org.junit.Test;

public class ArrayPartyTest {

    @Test
    public void printArrayTest(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" +
                "Sausage\n" +
                "Eggs\n" +
                "Beans\n" +
                "Bacon\n" +
                "Tomatoes\n" +
                "Mushrooms";

        //: When
        String actual = arrayParty.printArray(breakfast);

        //: Then
        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }

    @Test
    public void lastElementTest(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" +
                "Mushrooms";
        //: When
        String actual = arrayParty.lastElement(breakfast);
        //: Then
        Assert.assertEquals(expected,actual);
    }

    //TODO Define the method lastButOneTest
    @Test
    public void secondLastTest(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" +
                "Tomatoes";
        //: When
        String actual = arrayParty.secondLast(breakfast);
        //: Then
        Assert.assertEquals(expected,actual);
    }

    //TODO Define the method reverseTest
    @Test
    public void reverseArrayTest(){
        //: Given
        String[] breakfast = {"Sausage", "Beans", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" +
                "Mushrooms\n"+"Tomatoes\n"+"Bacon\n"+"Beans\n"+"Beans\n"+"Sausage\n";
        //: When
        String actual = arrayParty.reverseArray(breakfast);
        //: Then
        Assert.assertEquals(expected,actual);
    }

    //TODO Define the method isPalindromeTest
    @Test
    public void isPalindrome1(){
        String [] palindromic = {"Sausage", "Eggs", "Beans",
                "Beans", "Eggs", "Sausage"};
        String [] breakfast = {"Sausage", "Eggs", "Beans",
                "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String actual1 = arrayParty.isPalindrome(palindromic);
        String expected1 = "*** Output ***\nTrue";
        String actual2 = arrayParty.isPalindrome(breakfast);
        String expected2 = "*** Output ***\nFalse" ;
        //Assert.assertEquals(actual1,expected1);
        Assert.assertEquals(actual2,expected2);

    }

    //TODO Define the method compressTest
    @Test
    public void duplicatesTest(){
        ArrayParty arrayParty= new ArrayParty();
        int [] nums = {1,1,3,3,3,2,2,2,1,1,1,1,4,4,4,4};
        String expected= "*** Output ***\n1\n3\n2\n1\n4";
        String actual= arrayParty.duplicate(nums);
        Assert.assertEquals(expected,actual);

    }

    //TODO Define the method packTest
    @Test
    public void packTest(){
        ArrayParty arrayParty= new ArrayParty();
        char [] letters = {'a','a','a','a','b','c','c','a','a','d','e','e','e','e'};
        String expected= "*** Output ***\naaaa,b,cc,aa,d,eeee";
        String actual= arrayParty.pack(letters);
        System.out.println(actual);
        Assert.assertEquals(expected,actual);
    }

}
