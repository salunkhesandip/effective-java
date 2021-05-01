package com.inhouse.leetcode;

public class LargestTriangleArea {

	public static void main(String[] args) {
		
	//	(Ax(By - Cy) + Bx(Cy - Ay) + Cx(Ay - By) )/2
		int[][] points = {{1,0},{0,0},{0,1}};
		double area = largestTriangleArea(points);
		System.out.println(area);
	}

	private static double largestTriangleArea(int[][] points) {
		int n = points.length;
		double area = 0 ,area1 = 0;
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				for(int k = j+1; k < n; k++) {
					area1 = 0.5 * Math.abs(points[i][0]*(points[j][1] - points[k][1]) + 
									 points[j][0]*(points[k][1] - points[i][1]) + 
									 points[k][0]*(points[i][1] - points[j][1]));
					area = Math.max(area, area1);
				}
			}
		}	
		return area;
	}
	
	/*
    public double largestTriangleArea(int[][] points) {
        int N = points.length;
        double ans = 0;
        for (int i = 0; i < N; ++i)
            for (int j = i+1; j < N; ++j)
                for (int k = j+1; k < N; ++k)
                    ans = Math.max(ans, area(points[i], points[j], points[k]));
        return ans;
    }

    public double area(int[] P, int[] Q, int[] R) {
        return 0.5 * Math.abs(P[0]*Q[1] + Q[0]*R[1] + R[0]*P[1]
                             -P[1]*Q[0] - Q[1]*R[0] - R[1]*P[0]);
  */
}
