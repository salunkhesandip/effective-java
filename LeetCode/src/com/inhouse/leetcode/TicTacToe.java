package com.inhouse.leetcode;

import java.io.IOException;
import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		System.out.println("> tic-tac-toe");
		System.out.println("Welcome! Here is your board:");
		char arr[][] = {{'_', '_', '_'}, {'_', '_', '_'}, {'_', '_', '_'}};
		
		displayBoard(arr);
		startGame(arr);

	}

	private static void startGame(char[][] arr) {
		String winner = null;
			
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					play(arr,'X');
					winner = checkWinner(arr,'X');
					
					if(winner.equals("X")) {
						System.out.println("X is winner");
						break;
					}
					
					play(arr,'O');
					
					winner = checkWinner(arr,'O');
					
					if(winner.equals("O")) {
						System.out.println("O is winner");
						break;
					}
				}
				System.out.println();
			}		
	}

	private static String checkWinner(char[][] arr,char ch) {
		int d = 0;
		for(int i = 0; i < 3; i++) {
			int r = 0;
			int c = 0;
			for(int j = 0; j < 3; j++) {
				
				if(arr[i][j] == ch){
					r++;
				}
				
				if(arr[j][i] == ch){
					c++;
				}
				
				if(i==j) {
					if(arr[i][j] == ch){
						d++;
					}
				}

			}
			
			if(r == 3 || c == 3) {
				if(ch == 'X') {
					System.out.println("X is winner.");
					return "X";
				} else if(ch == 'O') {
					System.out.println("O is winner.");
					return "O";
				}				
			}
		}
		
		if(d == 3) {			
			if(ch == 'X') {
				return "X";
			} else if(ch == 'O') {
				return "O";
			}				
		}
		return "draw";
	}

	private static void play (char[][] arr,char c) {
		if(c == 'X')
			System.out.println("Player1 (X) where would you like to move?");
		else
			System.out.println("Player2 (O) where would you like to move?");
		
		Scanner scanner = new Scanner(System.in);
		String move = scanner.nextLine();
		System.out.println(move);
		int i = Integer.parseInt(move.substring(0,1));
		int j = Integer.parseInt(move.substring(2,3));
		if(i < 1 || j > 3) {
			System.out.println("Invalid input - try again");
			play (arr,c);
		}
		arr[i -1][j -1] = c;
		displayBoard(arr);
	}	

	private static void displayBoard(char[][] arr)  {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(j == 2) 
					System.out.print(arr[i][j]);
				else 
					System.out.print(arr[i][j] +",");
			}
			System.out.println();
		}
		System.out.println();
	}
}
