package HashMap;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedHashMapTest {

	@Test
	public void givenASentence_WhenWordsAreAddedToList_ShouldReturn_ParanoidFrequency() {
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
		Assert.assertEquals(3, (int) linkedHashMap.get("paranoid"));
	}
}
