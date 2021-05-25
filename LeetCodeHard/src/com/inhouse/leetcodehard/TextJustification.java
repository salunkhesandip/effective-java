package com.inhouse.leetcodehard;

import java.util.ArrayList;
import java.util.List;

/* 68. Text Justification
 * Given an array of words and a width maxWidth, format the text such that each line has exactly maxWidth characters and is fully (left and right) justified.
 * You should pack your words in a greedy approach; that is, pack as many words as you can in each line. Pad extra spaces ' ' when necessary so that each line has exactly maxWidth characters.
 * Extra spaces between words should be distributed as evenly as possible. If the number of spaces on a line do not divide evenly between words, the empty slots on the left will be assigned more spaces than the slots on the right.
 * For the last line of text, it should be left justified and no extra space is inserted between words.
 */
public class TextJustification {

	public static void main(String[] args) {
		String[] words = {"What","must","be","acknowledgment","shall","be"};
		int maxWidth = 16;
		List<String> answer = fullJustify(words, maxWidth);
		System.out.println(answer);
	}

	private static List<String> fullJustify(String[] words, int maxWidth) {
		int initWidth = 0;
		int nextWidth = 0;
		int start = 0;
		int end = 0;
		int wordSize = 0;
		List<String> answer = new ArrayList<String>();
		for(int i = 0; i < words.length - 1; i++) {
			nextWidth = words[i+1].length();
			initWidth += words[i].length() +  1;
			wordSize += words[i].length();

			end = i;
			if((initWidth + nextWidth - 1 >= maxWidth)) {
				initWidth = 0;
				System.out.println(wordSize);
				buildLine(start,end,words,answer);
				start = end + 1;
				wordSize = 0;
			}
		}
		if(start <= words.length)
			buildLine(start,words.length -1,words,answer);
		return answer;
	}

	private static void buildLine(int start, int end,String[] words, List<String> answer) {
		StringBuffer sb = new StringBuffer();
		for(int i = start; i <= end;i++) {
			sb.append(words[i]);
			if(i!=end)
				sb.append(" ");
		}
		answer.add(sb.toString());
	}

}
