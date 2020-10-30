package HashMap;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedHashMapTest {

	@Test
	public void givenALargeSentence_WhenAnalysed_ShouldReturnWordFrequency() {
		String sentence = "Paranoids are not paranoid because they are paranoid "
				+ "but because they keep putting themselves deliberately into paranoid avoidable situations";
		MyLinkedHashMap<String, Integer> linkedHashMap = new MyLinkedHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = linkedHashMap.get(word);
			if (value == null) {
				value = 1;
			} else {
				value += 1;
			}
			linkedHashMap.add(word, value);
		}
		int frequency = linkedHashMap.get("paranoid");
		Assert.assertEquals(3, frequency);
	}

	@Test
	public void deletedWordInLargeSentence_WhenAnalysed_ShouldReturnNull() {
		String sentence = "Paranoids are not paranoid because they are paranoid "
				+ "but because they keep putting themselves deliberately into paranoid avoidable situations";
		MyLinkedHashMap<String, Integer> linkedHashMap = new MyLinkedHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = linkedHashMap.get(word);
			if (value == null) {
				value = 1;
			} else {
				value += 1;
			}
			linkedHashMap.add(word, value);
		}
		linkedHashMap.remove("avoidable"); // Removing the "avoidable" node from the list
		Assert.assertEquals(null, linkedHashMap.get("avoidable"));
	}
}
