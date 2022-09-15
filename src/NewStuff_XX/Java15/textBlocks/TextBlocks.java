package NewStuff_XX.Java15.textBlocks;

import org.junit.jupiter.api.Test;

public class TextBlocks {


	@Test
	public void oldMultilineTexts() {
		// old way
		String json = "[{\n" +
				"\t\t\"name\": \"mehmed\",\n" +
				"\t\t\"age\": 27\n" +
				"\t},\n" +
				"\t{\n" +
				"\t\t\"name\": \"keskin\",\n" +
				"\t\t\"age\": 27\n" +
				"\t},\n" +
				"\t{\n" +
				"\t\t\"name\": \"ahmeti\",\n" +
				"\t\t\"age\": 30\n" +
				"\t},\n" +
				"]";

		System.out.println(json);
	}

	@Test
	public void textBlocks() {
		// new way
		String json = """
				[	
					{
						"name": "mehmed",
						"age": 27
					},
					{
						"name": "keskin",
						"age": 27
					},
					{
						"name": "ahmeti",
						"age": 27
					}
				]
				""";

		System.out.println(json);
	}
}
