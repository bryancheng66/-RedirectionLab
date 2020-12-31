import java.util.Arrays;

public class PigLatin {
	public static String[] vowels = {"a", "e", "i", "o", "u"};

	public static boolean startsVowel(String s){
		boolean result = false;
		for (int i = 0; !result && i < vowels.length; i++){
			System.out.println(s.substring(0,1));
			if (vowels[i].equals(s.substring(0,1))){
				result = true;
			}
		}
		return result;
	}

	public static String pigLatinSimple(String s){
		String result = "";

		if (startsVowel(s)){
			result += s + "hay";
		} else {
			result += s.substring(1) + s.substring(0,1) + "ay";
		}
		return result;
	}

	public static void main(String[] Args){
		System.out.println(pigLatinSimple(Args[0]));
	}
}
