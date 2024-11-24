package array_ds_ques;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TopKFrequentElements {

	public static void main(String[] args) {
		int[] nums = { 1, 2 };
		int k = 2;
		topKFrequent(nums, k);
		topKFrequentOpt(nums, k);
	}

	public static int[] topKFrequent(int[] nums, int k) {
		int[] out = new int[k];
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		int index = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() >= k) {

				out[index++] = entry.getKey();
			}
		}

		return out;

	}

	public static int[] topKFrequentOpt(int[] nums, int k) {

		List<Integer>[] bucket = new List[nums.length + 1];
		Map<Integer, Integer> frequencyMap = new HashMap<>();

		for (int n : nums) {
			frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
		}

		for (int key : frequencyMap.keySet()) {
			int frequency = frequencyMap.get(key);
			if (bucket[frequency] == null) {
				bucket[frequency] = new ArrayList<>();
			}
			bucket[frequency].add(key);
		}

		List<Integer> topK = new ArrayList<>();
		for (int pos = bucket.length - 1; pos >= 0 && topK.size() < k; pos--) {
			if (bucket[pos] != null) {
				topK.addAll(bucket[pos]);
			}
		}

		return topK.stream().mapToInt(i -> i).toArray();

	}

}
