import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import codeWars.BinaryArrayToNumber;
import codeWars.FindOdd;
import codeWars.Metro;
import codeWars.RemoveStringSpaces;
import codeWars.WhoLikesIt;
import codeWars.Xbonacci;
import codeWars.YesOrNo;

public class Main {

	public static void main(String[] args) {
	  
	  System.out.println("Who likes it?");
		System.out.println(WhoLikesIt.whoLikesIt(args));

		System.out.println("Yes or no:");
		System.out.println(String.format("%s or %s", YesOrNo.boolToWord(true), YesOrNo.boolToWord(false)));
		
		System.out.println("Metro:");
		List<int[]> busStopList = new ArrayList<int[]>();
		busStopList.add(new int[] {10, 0});
		busStopList.add(new int[] {5, 3});
		busStopList.add(new int[] {2, 6});
    System.out.println(String.format(
      "There are %s number of people left on the bus.",
      Metro.countPassengers(busStopList)
    ));
    
    System.out.println("Bindary to number:");
    List<Integer> binaryList = new ArrayList<Integer>();
    binaryList.add(1);
    binaryList.add(0);
    binaryList.add(1);
    binaryList.add(1);
    System.out.println(String.format(
      "1011 in binary is %s",
      BinaryArrayToNumber.ConvertBinaryArrayToInt(binaryList)
    ));
    
    System.out.println("Remove spaces:");
    System.out.println(RemoveStringSpaces.noSpace("It should  have no     spaces!"));
    
    System.out.println("Find the odd one:");
    System.out.println(FindOdd.findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
    
    System.out.println("Tribonacci:");
    Xbonacci xbonacci = new Xbonacci();
    System.out.println(Arrays.stream(
      xbonacci.tribonacci(new double[]{1,1,1},10))
        .mapToObj(value -> String.valueOf(value))
        .reduce("", (x, y) -> x + y + ", ")
    );
	}

}
