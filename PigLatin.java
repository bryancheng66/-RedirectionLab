import java.util.Arrays;

public class PigLatin {
	public static String[] vowels = {"a", "e", "i", "o", "u"};

	public static String pigLatinSimple(String s){
		boolean startsVowels = false;
		for (int i = 0; !startsVowels && i < vowels.length; i++){
			if (vowels[i] == s.substring(0,1)){
				startsVowels = true;
			}
		}
		
		String result = "";

		if (startsVowels){
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
