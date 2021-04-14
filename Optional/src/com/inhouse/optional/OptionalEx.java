package com.inhouse.optional;

import java.util.Optional;

public class OptionalEx {

	public static void main(String[] args) {
		Optional<String> gender = Optional.of("Male");
		String answer1 = "Yes";
		String answer2 = null;
		
		System.out.println(gender);
		System.out.println(gender.get());
		System.out.println(Optional.ofNullable(answer1)); // returns Optional[Yes]
		System.out.println(Optional.ofNullable(answer2)); // returns Optional.empty
		//System.out.println(Optional.of(answer2)); // returns NPE
		
		String[] words = new String[10];
		Optional<String> checkNull = Optional.ofNullable(words[5]);
		
		if(checkNull.isPresent()) {
			String word = words[5].toLowerCase();
			System.out.println(word);
		} else
			System.out.println("word is null");
	}
}
