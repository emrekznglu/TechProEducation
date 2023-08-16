package p10_arraysList;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class ArraysListsToArrays {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("tavsan");
		list.add("horoz");
		System.out.println(list); // [tavsan,horoz]
		
		String arr[]=list.toArray(new String[0]);
		System.out.println(Arrays.toString(arr));
		
		
		
		
	}

}
