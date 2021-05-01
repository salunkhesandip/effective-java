package com.inhouse.leetcode;

import java.util.HashSet;
import java.util.Set;

public class TownJudge {

	public static void main(String[] args) {
		int N = 3;
		int[][] trust = {{1,3},{2,3}};
		int result = findJudge(N, trust);
		System.out.println(result);

	}

	private static int findJudge(int n, int[][] trust) {
		final int NOT_FOUND = -1;
		final int len = trust.length;
		
		final int [] degreeArr = new int[n+1];
		
		for(int i = 0; i < len; i++) {
			int[] itemInTrustArr = trust[i];
			degreeArr[itemInTrustArr[0]]--;
			degreeArr[itemInTrustArr[1]]++;
		}
		
		for(int i = 1; i <= n; i++) {
			if(degreeArr[i] == n -1)
				return i;
		}
		return NOT_FOUND;
	}
}
/*
	private static int findJudge(int n, int[][] trust) {
	     int rowNum = trust.length;
	        if(rowNum == 0 && n == 1)
	            return 1;
	        
			Set<Integer> set1 = new HashSet<Integer>(n);
			Set<Integer> set2 = new HashSet<Integer>(n);
			Set<Integer> set3 = new HashSet<Integer>(n);
			for(int i = 0; i < rowNum; i++) {
				set1.add(trust[i][0]);
				set2.add(trust[i][1]);
			}
			Set<Integer> diff = new HashSet<Integer>(set2);
			diff.removeAll(set1);
			
			if(diff.size() == 1) {
				int judge = diff.iterator().next();
			
				for(int i = 0; i < rowNum; i++) {
					if(trust[i][1] ==judge) {
						set3.add(trust[i][0]);
					}
					if(set3.size() == (n - 1))
						return judge;
				}
			}	
			return -1;
	}

}
*/
	