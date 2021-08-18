package com.inhouse.leetcodemedium;

import java.util.LinkedList;

/* 207. Course Schedule
 * There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.
 * For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
 * Return true if you can finish all courses. Otherwise, return false.
 */
public class CourseSchedule {

	public static void main(String[] args) {
		int numCourses = 3;
		int[][] prerequisites = {{1,0},{0,2},{2,1}};
		boolean result = canFinish(numCourses, prerequisites);
		System.out.println(result);
	}

	// BFS
	private static boolean canFinish(int numCourses, int[][] prerequisites) {
		if(prerequisites == null) throw new IllegalArgumentException("Illegal prerequisites");
		int len = prerequisites.length;
		
		if(numCourses == 0 || len == 0) return true;
		
		// counter for number of prerequisites
		int[] pCount = new int[numCourses];
		for(int i = 0; i < len; i++)
			pCount[prerequisites[i][0]]++;
		
		// store course that have no prerequisite.
		LinkedList<Integer> queue = new LinkedList<Integer>();
		for(int i = 0; i < numCourses; i++) {
			if(pCount[i] == 0)
				queue.add(i);
		}
		
		// number of courses that have no prerequisite
		int numNoPre = queue.size();
		
		while(!queue.isEmpty()) {
			int top = queue.remove();
			
			for(int i = 0; i < len; i++) {
				 if(prerequisites[i][1]==top){
					 pCount[prerequisites[i][0]]--;
					 }
				 
				 if(pCount[prerequisites[i][0]]==0){
					 numNoPre++;
					 queue.add(prerequisites[i][0]);
					 }
				 }		
		}
		return numNoPre == numCourses;
	}
}
