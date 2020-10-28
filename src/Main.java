import codeWars.WhoLikesIt;
import codeWars.YesOrNo;

public class Main {

	public static void main(String[] args) {
		System.out.println(WhoLikesIt.whoLikesIt(args));
		
		System.out.println(String.format("%s or %s", YesOrNo.boolToWord(true), YesOrNo.boolToWord(false)));
	}

}
