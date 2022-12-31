package exo_algo;

import java.util.ArrayList;

public class DistinctCharacters {
	public String execute(String input) {
		var listOfDistinctsChars = getDistinctCharacters(input);
		return getLongestDistinctChars(listOfDistinctsChars);
	}

	private static String getLongestDistinctChars(ArrayList<StringBuilder> listOfDistinctsChars) {
		int index = 0;
		int indexOfLongestDistinctChars = 0;
		int sizeOfLongestDistinctChars = 0;

		while(index < listOfDistinctsChars.size()){
			int currentDistinctCharsSize  = listOfDistinctsChars.get(index).length();
			if (currentDistinctCharsSize>sizeOfLongestDistinctChars) {
				sizeOfLongestDistinctChars = currentDistinctCharsSize;
				indexOfLongestDistinctChars = index;
			}

			index++;
		}

		return listOfDistinctsChars.get(indexOfLongestDistinctChars).toString();
	}

	private static ArrayList<StringBuilder> getDistinctCharacters(String input) {
		char[] chars = input.toCharArray();

		int size = chars.length;

		int index = 0;
		int currentExtractedString = 0;
		ArrayList<StringBuilder> distinctCharsExtractedArray = new ArrayList<>();
		distinctCharsExtractedArray.add(new StringBuilder());

		while (index<size){
			if (distinctCharsExtractedArray.get(currentExtractedString).toString().contains(String.valueOf(chars[index]))){
				distinctCharsExtractedArray.add(new StringBuilder());
				currentExtractedString++;
			}
			distinctCharsExtractedArray.get(currentExtractedString).append(chars[index]);
			index++;
		}
		return distinctCharsExtractedArray;
	}
}
