import java.util.Arrays;
import java.util.Scanner;

public class PigLatin {
	public static String[] vowels = {"a", "e", "i", "o", "u"};

	public static String[] digraphs = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};

	public static boolean startsString(String s, String[] array){
		boolean result = false;
		for (int i = 0; !result && i < vowels.length; i++){
			if (array[i].equals(s.substring(0, array[0].length()))){
				result = true;
			}
		}
		return result;
	}

	public static String pigLatinSimple(String s){
		String result = "";

		if (startsString(s, vowels)){
			result += s + "hay";
		} else {
			result += s.substring(1) + s.substring(0,1) + "ay";
		}
		return result.toLowerCase();
	}

	public static String pigLatin(String s){
		String result = "";
		
		if (startsString(s, vowels)){
			result += s + "hay";
		} else if (startsString(s, digraphs)){
			result += s.substring(2) + s.substring(0,2) + "ay";
		} else {
			result += s.substring(1) + s.substring(0,1) + "ay";
		}
		return result.toLowerCase();
	}

	public static String pigLatinBest(String s){
		String result = "";
		String punct = "";

		if (!Character.isLetter(s.charAt(0))){
			result += s;
		} else {
			if (!Character.isLetter(s.charAt(s.length()-1)) && !Character.isDigit(s.charAt(s.length()-1))){
				punct = s.substring(s.length()-1);
				s = s.substring(0, s.length()-1);
			}
			
			if (startsString(s, vowels)){
				result += s + "hay";
			} else if (startsString(s, digraphs)){
				result += s.substring(2) + s.substring(0,2) + "ay";
			} else {
				result += s.substring(1) + s.substring(0,1) + "ay";
			}
		}
		return (result + punct).toLowerCase();
	}

	public static void main(String[] Args){
		Scanner inputFile = new Scanner(System.in);
		while (inputFile.hasNextLine()){
			Scanner currentLine = new Scanner(inputFile.nextLine());
			String outputLine = "";
			while (currentLine.hasNext()){
				outputLine += pigLatinBest(currentLine.next());
				if (currentLine.hasNext()){
					outputLine += " ";
				}
			}
			System.out.println(outputLine);
		}
	}
}
