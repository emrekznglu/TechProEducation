package p10_arraysList;
import java.util.List;
import java.util.Arrays;

public class ArraysToArraysList {

	public static void main(String[] args) {
		
		String arr[]= {"3","5","7"};
		
		List<String> arrList=Arrays.asList(arr);
		System.out.println("List olarak" + arrList);
		arr[1]="Ali";
		System.out.println("List olarak 2 "+arrList);
	}

}
