import java.util.ArrayList;
import java.util.List;

import codeWars.BinaryArrayToNumber;
import codeWars.Metro;
import codeWars.WhoLikesIt;
import codeWars.YesOrNo;

public class Main {

	public static void main(String[] args) {
	  
		System.out.println(WhoLikesIt.whoLikesIt(args));
		
		System.out.println(String.format("%s or %s", YesOrNo.boolToWord(true), YesOrNo.boolToWord(false)));
		
		List<int[]> busStopList = new ArrayList<int[]>();
		busStopList.add(new int[] {10, 0});
		busStopList.add(new int[] {5, 3});
		busStopList.add(new int[] {2, 6});
    System.out.println(String.format(
      "There are %s number of people left on the bus.",
      Metro.countPassengers(busStopList)
    ));
    
    List<Integer> binaryList = new ArrayList<Integer>();
    binaryList.add(1);
    binaryList.add(0);
    binaryList.add(1);
    binaryList.add(1);
    System.out.println(String.format(
      "1011 in binary is %s",
      BinaryArrayToNumber.ConvertBinaryArrayToInt(binaryList)
    ));
    
	}

}
