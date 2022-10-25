package one;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionTest3 {
	
	public static void main(String[] args) {
		
		//100000개의 데이터를 가진 ArrayList와 LinkedList 생성
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0; i < 100000; i++) {
			al.add(i);
		}
		
		LinkedList<Integer> li = new LinkedList<>();
		for(int i = 0; i < 100000; i++) {
			li.add(i);
		}
		
		//ArrayList에서 100000개의 데이터를 읽는데 걸리는 시간
		//데이터를 가져오는 메서드는 get(인덱스)
		//실행해서 가장 마지막에 나오는 숫자를 확인을 한 후 al을 li로 변경해서 실행하고 숫자는 확인
		long start = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++) {
//			System.out.println(li.get(i)); 
			System.out.println(al.get(i)); //크기가 10배정도 빠름
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		
		//print가 자체적으로 al을 불러 출력함
		//.toString 안써도 됨
		System.out.println(al);
		
	}
	
}
