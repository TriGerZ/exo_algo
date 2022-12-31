package exo_algo;

import java.util.Scanner;

public class Tail {


	public static final String SEPARATOR = "\n";

	public String execute(String text, int linesToTail) {
		int firstLinetoTail = this.numberOfLines(text) - linesToTail;
		return getTailedString(text, firstLinetoTail);
	}

	 String getTailedString(String text, int firstLinetoTail) {
		Scanner scanner = new Scanner(text);
		StringBuilder tailedLines = new StringBuilder();

		int index = 1;

		while(scanner.hasNextLine()){
			String nextLine = scanner.nextLine();
			if(index>=firstLinetoTail) {
				tailedLines.append(nextLine);
				addSeparator(scanner, tailedLines);
			}
			index++;
		}
		return tailedLines.toString();
	}

	private static void addSeparator(Scanner scanner, StringBuilder tailedLines) {
		if(scanner.hasNextLine())
			tailedLines.append(SEPARATOR);
	}

	int numberOfLines(String text) {
		Scanner scanner = new Scanner(text);
		int numberOfLine = 0;
		while (scanner.hasNext()){
			numberOfLine++;
			scanner.nextLine();
		}
		return numberOfLine;
	}
}
