import java.util.Scanner;

public class MakeStars {
	public static void main(String[] Args){
		String output = "";

		Scanner inputFile = new Scanner(System.in);
		while (inputFile.hasNextLine()){
			Scanner currentLine = new Scanner(inputFile.nextLine());
			while (currentLine.hasNext()){
				String currentWord = currentLine.next();
				for (int i = 0; i < currentWord.length(); i++){
					output += "*";
				}
				if (currentLine.hasNext()){
					output += " ";
				}
			}
			if (inputFile.hasNextLine()){
				output += "%n";
			}
		}
		
		System.out.printf(output);
	}
}
