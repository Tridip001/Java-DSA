package Array_list;

import java.util.ArrayList;

public class ArrayList_Demo {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(1,80);
		arr.set(0, 25);
//		Integer i = 10;
//		arr.remove(i);
		System.out.println(arr.size());
		//System.out.println(arr.get(0));
//		
//		for(int i=0;i<arr.size();i++) {
//			System.out.println(arr.get(i));
//		}
		
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
}
