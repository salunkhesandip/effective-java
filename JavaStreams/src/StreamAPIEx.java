import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIEx {

	public static void main(String[] args) {
		String [] vowels = {"a","e","i","o","u"};
		Stream<String> stream1 = Arrays.stream(vowels);
		Stream<String> stream2 = Stream.of("a","e","i","o","u");
		List<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("def");
		list.add("foo");
		list.add("bar");
		
		Stream<String> stream3 = list.stream();
		System.out.println("######### stream1 #########");
		stream1.forEach((i)-> System.out.println(i));
		
		System.out.println("######### stream2 #########");
		stream2.forEach((i)-> System.out.println(i));
		
		System.out.println("######### stream3 #########");
		stream3.forEach((i)-> System.out.println(i));

		// Filter -- Lamda expression (parameter1, parameter2) -> { code block }
		Stream<String> stream4 = list.stream().filter(element -> element.contains("b"));
		System.out.println("######### stream4 #########");
		stream4.forEach((i)-> System.out.println(i));
		
		List<Integer> numbers = new ArrayList<Integer>();
		for(int i=0;i<10;i++)
			numbers.add(i);
		for(int i=8;i<15;i++)
			numbers.add(i);
		
		System.out.println("######### parallel stream #########");
		numbers.parallelStream().forEach(i -> System.out.println(i));

		System.out.println("count " + numbers.stream().count());
		System.out.println("count " + numbers.stream().distinct().count());
		
		System.out.println(System.getProperty("java.runtime.version"));
	}

}
