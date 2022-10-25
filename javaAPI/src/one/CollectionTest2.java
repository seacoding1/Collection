package one;

import java.util.ArrayList;

public class CollectionTest2 {
	
	public static void main(String[] args) {
		
		//문자열을 저장하는 ArrayList 생성
		ArrayList <String> a1 = new ArrayList<>();
		
		//샘플 데이터 추가
		a1.add("one");
		a1.add("three");
		
		//1970년 1월 1일 자정부터 지나온 시간을 밀리초 단위의 정수로 가져오기
		long start = System.currentTimeMillis();
		
		//두번째에 
		for(int i = 0; i < 10000000; i++) {
			a1.add(1,"two");
		}
		//1970년 1월 1일 자정부터 지나온 시간을 밀리초 단위의 정수로 가져오기
		long end = System.currentTimeMillis();
		
		//걸린 시간 확인
		System.out.println(end-start);
		
	}
	
}
