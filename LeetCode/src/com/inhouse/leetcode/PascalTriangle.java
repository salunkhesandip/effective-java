package com.inhouse.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	public static void main(String[] args) {
		int numRows = 5;
		List <List<Integer>> result = generate(numRows);
		System.out.println(result);

	}

	private static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		if(numRows == 0) {
			return triangle;
		}
		
		triangle.add( new ArrayList <Integer>());
		triangle.get(0).add(1); // first row is always [1].
		
		for(int rowNum = 1; rowNum < numRows; rowNum++) {
			List<Integer> row = new ArrayList<Integer>();
			List<Integer> prevRow = triangle.get(rowNum-1);
			row.add(1); // First row element is always 1
			
			for(int j = 1 ; j < rowNum; j++) {
				row.add(prevRow.get(j-1) + prevRow.get(j));
			}
			row.add(1); // Last row element is always 1
			triangle.add(row);
		}
		return triangle;
	}

}
