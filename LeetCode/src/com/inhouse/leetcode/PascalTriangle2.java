package com.inhouse.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {

	public static void main(String[] args) {
		int rowIndex = 0;
		List<Integer> row =  getRow(rowIndex);
		System.out.println(row);
	}

	private static List<Integer> getRow(int rowIndex) {
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();		
		
		triangle.add( new ArrayList <Integer>());
		triangle.get(0).add(1);
		if(rowIndex == 0)
			return triangle.get(0);
		
		for(int rowNum = 1; rowNum <= rowIndex ; rowNum ++) {
			List<Integer> row = new ArrayList<Integer>();
			List<Integer> prevrow = triangle.get(rowNum -1);
			row.add(1);
			
			for(int j = 1 ; j < rowNum ; j++) {
				row.add(prevrow.get(j - 1) + prevrow.get(j));
			}
			row.add(1);
			triangle.add(row);
		}
		return triangle.get(rowIndex);
	}

}
