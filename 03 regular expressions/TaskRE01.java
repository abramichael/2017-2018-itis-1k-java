import java.util.regex.*;

public class TaskRE01 {
	
	public static void main(String [] args) {
		
		Pattern p = Pattern.compile("a*");
		Matcher m = p.matcher("aaaaaab");
		System.out.println(m.matches());
		
	}
	
}