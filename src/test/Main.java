package test;

import java.util.*;
import java.util.function.*;
import java.lang.*;
import java.io.*;

class Main {
	public int lengthOfLongestSubstring(String s) {
      int res=0;
      char[] carr=s.toCharArray();
     StringBuilder sb = new StringBuilder();
    
        for(char c: carr)
        {
        	for (int i = 0; i < carr.length; i++) {
        		 IntPredicate isOdd = argument -> argument!=1;
        		 Predicate<String> p = new Predicate<String>() {
					
					@Override
					public boolean test(String t) {
						// TODO Auto-generated method stub
						return false;
					}
				};
				if(!sb.chars().noneMatch(isOdd))
				{
					
				}
			}
        }
        return res;
    }

	public static void main(String args[]) {
		// Your code goes here
		Main ob = new Main();
		String s = "Hello";
		System.out.println(ob.lengthOfLongestSubstring(s));
	}
}