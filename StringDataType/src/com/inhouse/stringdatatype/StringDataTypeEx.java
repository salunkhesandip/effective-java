package com.inhouse.stringdatatype;

public class StringDataTypeEx {

	public static void main(String[] args) {
		/*	String is a sequence of characters. But in Java, a string is an object that represents a sequence of characters.
		*/
		String s1 = "apple";
		String s2 = "mango";
		String s3 = "apple";
		String s4 = " Hello World "	;
				
		System.out.println(s1==s2);
		System.out.println(s1==s3);
				
		System.out.println("String s1 length : " + s1.length());
				
		System.out.println(s1.compareTo(s2)); // if s1 < s2, it returns a negative number
		System.out.println(s1.compareTo(s3)); // return 0 because both are equal
				
		System.out.println(s1.isEmpty());
		System.out.println(s4.trim()); // trim() method removes the leading and trailing spaces.
				
		System.out.println(s1.toUpperCase());
				
		int value=20; 
		System.out.println(String.valueOf(value) + 21);  // 21 is concatenated to 20
				
		System.out.println(s4.contains("Hello"));
		System.out.println(s4.matches(".*lo.*"));
		
		String source = "123th St Metcalf";
		String replaced = source.replace("St", "Dr");
		System.out.println("replaced :" + replaced);
		
		System.out.println(source.startsWith("12"));
		System.out.println(source.startsWith("St",6));
		System.out.println(source.indexOf("St"));
		
		
		/*
		 *  If we want to increase the pool size in terms of buckets, 
		 *  we can use the StringTableSize JVM option: -XX:StringTableSize=4901
		 *  Prior to Java 7u40, the default pool size was 1009 buckets but this value was subject to a few changes in more recent Java versions. 
		 *  To be precise, the default pool size from Java 7u40 until Java 11 was 60013 and now it increased to 65536.
		 *  
		 *  Before Java 7, the JVM placed the Java String Pool in the PermGen space, which has a fixed size — it can't be expanded at runtime and is not eligible for garbage collection.
		 *  The risk of interning Strings in the PermGen (instead of the Heap) is that we can get an OutOfMemory error from the JVM if we intern too many Strings.
		 *  From Java 7 onwards, the Java String Pool is stored in the Heap space, which is garbage collected by the JVM. 
		 *  The advantage of this approach is the reduced risk of OutOfMemory error because unreferenced Strings will be removed from the pool, thereby releasing memory.
		 */
	}

}
