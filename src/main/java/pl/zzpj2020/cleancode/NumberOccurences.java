package pl.zzpj2020.cleancode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class NumberOccurences {

	private Map<Integer, Integer> integerMap = new HashMap<>();
	private int minValue = Integer.MIN_VALUE;
	private int maxValue = Integer.MAX_VALUE;

	public NumberOccurences(List<Integer> integerList) {
		for (Integer number : integerList) {
			addEntry(number);
		}
	}

	public int getMinValue() {
		return minValue;
	}

	public int getMaxValue() {
		return maxValue;
	}

	public void addEntry(Integer number) {
		if (integerMap.containsKey(number)) {
			Integer count = integerMap.get(number);
			integerMap.put(number, count + 1);
		} else {
			integerMap.put(number, 1);
		}

		if (integerMap.get(number) > minValue) {
			minValue = number;
		}

		if (integerMap.get(number) < maxValue) {
			maxValue = number;
		}
	}

	public double average() {
		double sum = 0;
		double count = 0;
		for (Entry<Integer, Integer> u : integerMap.entrySet()) {
			sum += u.getKey() * u.getValue();
			count += u.getValue();
		}
		return sum/count;
	}

	@Override
	public String toString() {
		return integerMap.toString();
	}
}
