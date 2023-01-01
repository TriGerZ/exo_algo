package exo_algo;

import java.util.*;
import java.util.stream.Collectors;

public class Balancing {
	public List<List<Integer>> execute(List<Integer> integerList) {

		var leftArray = new ArrayList<>(integerList);
		var rightArray = new ArrayList<Integer>();

		generateBalance(rightArray, leftArray);

		leftArray.sort(null);
		rightArray.sort(null);

		return new ArrayList<List<Integer>>(Arrays.asList(leftArray, rightArray));
	}

	private void generateBalance(ArrayList<Integer> leftArray, ArrayList<Integer> rightArray) {
		int index = 0;
		int size = rightArray.size();
		while(index < size){
			int balancingArraysDelta = getSumOfAllIntegerInArray(rightArray) - getSumOfAllIntegerInArray(leftArray);
			int max;

			try {
				max = getBiggestIntegerByFilter(rightArray, balancingArraysDelta/2);
			} catch (NoSuchElementException e){
				break;
			}

			rightArray.remove(Integer.valueOf(max));
			leftArray.add(max);
			index++;
		}
	}

	public int getBiggestIntegerByFilter(List<Integer> sourceArray, int filter) throws NoSuchElementException {
		sourceArray = sourceArray.stream().filter(integer -> integer<=filter).toList();
		return Collections.max(sourceArray);
	}

	public int getSumOfAllIntegerInArray(List<Integer> sourceArray){
		int sumOfIntegerInArray = 0;
		return sourceArray.stream().reduce(0,Integer::sum);
	}
}
