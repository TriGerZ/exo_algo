package exo_algo;

import java.util.ArrayList;
import java.util.List;

public class Balancing {
	public List<List<Integer>> execute(List<Integer> integerList) {
		var BalanceIntegerArrays = new ArrayList<List<Integer>>();
		var leftArray = new ArrayList<Integer>();
		var rightArray = new ArrayList<Integer>();

		integerList.sort(null);

		int index = 0;
		while(index < integerList.size()){
			if (index%2==0)
				leftArray.add(integerList.get(index));
			else rightArray.add(integerList.get(index));
			index++;
		}

		BalanceIntegerArrays.add(leftArray);
		BalanceIntegerArrays.add(rightArray);

		return BalanceIntegerArrays;
	}
}
