import java.util.regex.*;

public class TaskRE03 {
	
	public static void main(String [] args) {
		
		Pattern p = Pattern.compile("<.+?>");
		Matcher m = p.matcher(
			"<div><span><p><b>Hello</b></p>"
		);
		while (m.find()) {
			System.out.println(m.group());
		}
		
	}
	
}