import java.util.Scanner;

public class MakeStars {
	public static void main(String[] Args){
		Scanner inputFile = new Scanner(System.in);
		while (inputFile.hasNextLine()){
			Scanner currentLine = new Scanner(inputFile.nextLine());
			String outputLine = "";
			while (currentLine.hasNext()){
				String currentWord = currentLine.next();
				for (int i = 0; i < currentWord.length(); i++){
					outputLine += "*";
				}
				if (currentLine.hasNext()){
					outputLine += " ";
				}
			}
			System.out.println(outputLine);
		}
	}
}
