package test;
import java.util.*;
import java.lang.*;
import java.io.*;

class Main2 {
	public static int lengthOfLongestSubstring(String str)
{
    int n = str.length();
    int res = 0;
     
    for(int i = 0; i < n; i++)
    {
 
        boolean[] visited = new boolean[256];
         
        for(int j = i; j < n; j++)
        {
            if (visited[str.charAt(j)] == true)
                break;
 
            else
            {
                res = Math.max(res, j - i + 1);
                visited[str.charAt(j)] = true;
            }
        }
        visited[str.charAt(i)] = false;
    }
    return res;
}

	public static void main(String args[]) {
		// Your code goes here
		String s = "Hello";
		Main2 ob = new Main2();
		System.out.println(Main2.lengthOfLongestSubstring(s));
	}
}