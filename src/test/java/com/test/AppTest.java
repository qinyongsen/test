package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class AppTest {
	public static void main(String[] args) {
		
	}
	
	public static String[] combine(String[] strList,String[] strList2){
		List<String> list = new ArrayList<>();
		for (String str1 : strList) {
			for (String str2 : strList2) {
				list.add(str1+str2);
			}
		}
		return list.toArray(new String[0]);
	}
	
	@Test
	public void test(){
		int[] arr = {2,3,4,7};
		int first = arr[0];
		int index = 1;
		String[] temp = NumberMapLetters.getByNumber(first).getLetters();
		do{
			temp = combine(temp, NumberMapLetters.getByNumber(arr[index]).getLetters());
			index++;
		}while(index < arr.length);
		System.out.println(Arrays.asList(temp));
	}
}