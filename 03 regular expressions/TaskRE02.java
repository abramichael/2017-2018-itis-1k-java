import java.util.regex.*;

public class TaskRE02 {
	
	public static void main(String [] args) {
		
		Pattern p = Pattern.compile("[BCDFGHJ-NP-TVWXZ][a-z]*[aeiouy]\\b");
		Matcher m = p.matcher(
			"Timur is reading something on his phone, please stop it! Because Dima and Aina are laughing at you! And this fact is so bad for Nastya."
		);
		while (m.find()) {
			System.out.println(m.group());
		}
		
	}
	
}