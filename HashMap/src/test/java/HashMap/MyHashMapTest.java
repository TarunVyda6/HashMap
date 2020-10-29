package HashMap;

import org.junit.Assert;
import org.junit.Test;

public class MyHashMapTest {

	@Test
	public void givenASentence_WhenAnalysed_ShouldReturnWordFrequency() {
		MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
		String sentence = "To be or not to be";
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = myHashMap.get(word);
			if (value == null) {
				value = 1;
			} else {
				value = value + 1;
			}
			myHashMap.add(word, value);
		}

		int frequency = myHashMap.get("to");
		Assert.assertEquals(2, frequency);

	}
}
