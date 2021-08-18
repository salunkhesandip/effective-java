package com.inhouse.leetcodemedium;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

	public static void main(String[] args) {
		char[][] board = {{'8','3','.','.','7','.','.','.','.'}
		,{'6','.','.','1','9','5','.','.','.'}
		,{'.','9','8','.','.','.','.','6','.'}
		,{'8','.','.','.','6','.','.','.','3'}
		,{'4','.','.','8','.','3','.','.','1'}
		,{'7','.','.','.','2','.','.','.','6'}
		,{'.','6','.','.','.','.','2','8','.'}
		,{'.','.','.','4','1','9','.','.','5'}
		,{'.','.','.','.','8','.','.','7','9'}};
		
		boolean result = isValidSudoku(board);
		System.out.println(result);
	}

	private static boolean isValidSudoku(char[][] board) {
		Set<Character> helper = new HashSet<Character>();
		int m = board.length;
		int n = board[0].length;
		
		for(int i = 0; i < m; i++) {
			helper.clear();
			for(int j = 0; j < n; j++) {
				if(!process(helper,board[i][j]))
					return false;
			}
		}
		
		for(int j = 0; j < n; j++) {
			helper.clear();
			for(int i = 0; i < m; i++) {
				if(!process(helper,board[i][j]))
					return false;
			}
		}
		
		for(int i = 0; i < m; i+=3) {
			for(int j = 0; j < n; j+=3) {
				helper.clear();
				for(int k = 0; k < m; k++) {
					if(!process(helper,board[i + k / 3][j + k % 3]))
						return false;
				}
			}
		}		
		return true;
	}

	private static boolean process(Set<Character> helper, char c) {
		if(c == '.') return true;
		if(helper.contains(c)) return false;
		helper.add(c);
		return true;
	}
}
