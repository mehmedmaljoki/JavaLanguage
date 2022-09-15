package NewStuff_XX.Java9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsExample {
	public void collectionsExample() {
		// old way
		Set<String> namesSet = new HashSet<>();
		namesSet.add("Mehmed");
		namesSet.add("Keskin");

		Map<String, String> countriesMap = new HashMap<>();
		countriesMap.put("Vienna", "Austria");
		countriesMap.put("Berlin", "Germany");

		List<String> namesList = new ArrayList<>();
		namesList.add("Mehmed");
		namesList.add("Keskin");

		// better
		List<String> namesList2 = Arrays.asList("Mehmed", "keskin");

		// new way
		List<String> names = List.of("Mehmed", "Mustafa");
		Set<String> newSet = Set.of("Mehmed", "Mustafa");
		Map<String, String> countries = Map.of("Vienna", "Austria", "Berlin", "Germany");
		Map<String, String> countries2 = Map.ofEntries(Map.entry("Vienna", "Austria"), Map.entry("Berlin", "Germany"));

	}
}
