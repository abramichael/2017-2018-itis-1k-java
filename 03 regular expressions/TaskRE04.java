import java.util.regex.*;

public class TaskRE04 {
	
	public static void main(String [] args) {
		
		Pattern p = Pattern.compile(
			"([a-z]+)\\.(?<topdomain>[a-z]{2,4})"
		);
		Matcher m = p.matcher(
			"I have mail on yandex.ru and he has mail on kpfu.ru. Naaaaah. I prefer gmail.com"
		);
		while (m.find()) {
			System.out.println(m.group("topdomain"));
		}
		
	}
	
}