package JAVA8CODE;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class primitivearraytolistarrayimp {
	public static void main(String[] args) {
		
		int[] nums = {1, 2, 3, 4, 5, 6, 7};
		List<Integer> numsLst = Arrays.stream(nums).boxed().collect(Collectors.toList());
		
		int[] numArr = new int[]{1,2,3,4,5};
		int[] sortedNumArr = Arrays.stream(numArr).boxed().sorted(Collections.reverseOrder())
				.mapToInt(Integer::intValue).toArray();
		
		//System.out.println(sortedNumArr);
		
		
		List<Integer> list = IntStream.of(1,2,3,4,5)
			    .boxed()
			    .collect(Collectors.toList());
		System.out.println(list);
	}

}
