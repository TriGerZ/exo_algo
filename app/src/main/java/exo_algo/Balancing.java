package exo_algo;

import java.util.*;
import java.util.stream.Collectors;

public class Balancing {
	public List<List<Integer>> execute(List<Integer> integerList) {
		var BalanceIntegerArrays = new ArrayList<List<Integer>>();
		var leftArray = new ArrayList<Integer>(integerList);
		var rightArray = new ArrayList<Integer>();

		integerList.sort(null);

		int index = 0;



		while(index < integerList.size()){
			int balancingArraysDelta = getSumOfAllIntegerInArray(leftArray) - getSumOfAllIntegerInArray(rightArray);

			if (balancingArraysDelta == 0)
				break;

			int max = getBiggestIntegerByFilter(leftArray, balancingArraysDelta);

			if (max == 0){
				break;
			}

			leftArray.remove(Integer.valueOf(max));
			rightArray.add(max);

			index++;
		}

		leftArray.sort(null);
		rightArray.sort(null);

		BalanceIntegerArrays.add(leftArray);
		BalanceIntegerArrays.add(rightArray);

		return BalanceIntegerArrays;
	}

	public int getBiggestIntegerByFilter(List<Integer> sourceArray, int filter){
		sourceArray = sourceArray.stream().filter(integer -> integer<filter).toList();
		try{
			return Collections.max(sourceArray);
		}catch(NoSuchElementException e){
			return 0;
		}
	}

	public int getSumOfAllIntegerInArray(List<Integer> sourceArray){
		int sumOfIntegerInArray = 0;
		return sourceArray.stream().reduce(0,Integer::sum);
	}
}
