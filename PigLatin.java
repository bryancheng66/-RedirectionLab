import java.util.Arrays;

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
		return result;
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
		return result;
	}

	public static void main(String[] Args){
		System.out.println(pigLatinSimple(Args[0]));
		System.out.println(pigLatin(Args[1]));
	}
}
