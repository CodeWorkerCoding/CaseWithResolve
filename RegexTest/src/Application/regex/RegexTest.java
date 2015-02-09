package Application.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs={"130681198712092019","12345678901234x"};
		Pattern p1=Pattern.compile("(\\d{17}[0-9a-zA-Z]|\\d{14}[0-9a-zA-Z])");
		for (int i=0;i<strs.length;i++){
			Matcher matcher=p1.matcher(strs[i]);
			System.out.println(strs[i]+":"+matcher.matches());
		}
		Pattern p2 =Pattern.compile("\\d{6}(\\d{8}).*");
		Pattern p3 =Pattern.compile("(\\d{4}(\\d{2})(\\d{2}))");
		for (int i = 0; i < strs.length; i++) {
			Matcher matcher=p2.matcher(strs[i]);
			System.out.println(matcher+"    matcher");
			boolean b=matcher.find();
			if (b) {
				String s=matcher.group(1);
				Matcher matcher2=p3.matcher(s);
				if (matcher2.find()) {
					System.out.println("the Brithday: Year "+matcher2.group(1)+" Month "
							+matcher2.group(2)+" Day "+matcher2.group(3));
				}
			}
		}
	}

}
