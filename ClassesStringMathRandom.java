
public class ClassesStringMathRandom {

	public static void main(String[] args) {
		// String class
		String text = "Welcome to our Java Lesson Welcome";

		System.out.println(text);
		System.out.println(text.substring(4, 16));// [4, 16[
		System.out.println(text.substring(8));// [8, to the end]
		System.out.println(text.length());
		System.out.println(text.toUpperCase());
		System.out.println(text.toLowerCase());
		System.out.println(text.charAt(15));
		System.out.println(text.indexOf('e'));
		System.out.println(text.indexOf("to"));
		System.out.println(text.endsWith("on"));
		System.out.println(text.concat(" it is awsome"));

		String welcome = text.substring(0, 7);
		String result = welcome.concat(" it is amazing");
		result = result.concat(text.substring(7));
		System.out.println(result);

		System.out.println("hi".equals("Hi"));
		System.out.println("hi".equalsIgnoreCase("Hi"));
		System.out.println("".isEmpty());
		System.out.println(text.isEmpty());

		System.out.println(text.lastIndexOf('s'));
		System.out.println(text.indexOf('s'));
		System.out.println(text.indexOf('o', 5));
		System.out.println(text.indexOf("Welcome", 1));
		System.out.println(text.lastIndexOf('o', 6));// [0, 6]
		System.out.println(text.startsWith("Welcome"));
		System.out.println(text.endsWith("Welcome"));
		System.out.println(text.replace('o', 'k'));

		System.out.println(" h h ".trim());
		System.out.println(" h h ");

	}

}
