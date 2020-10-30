import java.util.ArrayList;
import java.util.List;

import codeWars.Metro;
import codeWars.WhoLikesIt;
import codeWars.YesOrNo;

public class Main {

	public static void main(String[] args) {
	  
		System.out.println(WhoLikesIt.whoLikesIt(args));
		
		System.out.println(String.format("%s or %s", YesOrNo.boolToWord(true), YesOrNo.boolToWord(false)));
		
		List<int[]> list = new ArrayList<int[]>();
		list.add(new int[] {10, 0});
    list.add(new int[] {5, 3});
    list.add(new int[] {2, 6});
    System.out.println(String.format("There are %s number of people left on the bus.",
      Metro.countPassengers(list)
    ));
	}

}
