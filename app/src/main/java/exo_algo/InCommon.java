package exo_algo;

import java.util.ArrayList;
import java.util.List;

public class InCommon {

	public List<Character> execute(List<Character> left, List<Character> right) {
		var charactersInCommon = new ArrayList<Character>();
		left.forEach(character -> addCharacterInCommonList(right, charactersInCommon, character));
		return charactersInCommon;
	}

	private static void addCharacterInCommonList(List<Character> right, ArrayList<Character> charactersInCommon, Character character) {
		if(right.contains(character)){
			charactersInCommon.add(character);
			right.remove(character);
		}
	}
}
