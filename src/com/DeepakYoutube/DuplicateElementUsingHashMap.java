package com.DeepakYoutube;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementUsingHashMap {

	public static void main(String[] args) {
		int a[] = { 1, 5, 4, 45, 23, 2, 5, 1, 34, 2 };

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i : a) {
			Integer count = map.get(i);

			if (count == null) {
				map.put(i, 1);
			} else {
				count = count + 1;
				map.put(i, count);
			}
		}

		Set<Map.Entry<Integer, Integer>> set = map.entrySet();

		for (Map.Entry<Integer, Integer> entry : set) {
			if (entry.getValue() > 1) {
				System.out.println("Duplicate Element is " + entry.getKey());
			}

		}

	}

}
