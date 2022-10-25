package one;

import java.util.Arrays;

public class CollectionTest1 {

	public static void main(String[] args) {

		String [] ar = {"List", "Set", "Map"};
		//배열의 데이터를 수정하는 것은 가능

		ar[2] = "HashTable";
		System.out.println(Arrays.toString(ar));

		//점만 찍으면 뒤에 어떤 메서드를 사용할 수 있는지 확인 가능함
		//리스트를 어떻게 짤지 내가 구성해야함

		//ar배열에 데이터를 추가
		//ar배열보다 1개 더 큰 공간을 갖는 배열을 생성
		String [] br = new String[ar.length+1];
		//ar의 내용을 복사
		for(int i = 0; i<ar.length;i++) {
			br[i] = ar[i];
		}
		//br의 마지막에 데이터 추가
		br[br.length-1] = "Properties";
		//br이 가리키는 곳을 ar이 가리키도록 합니다.
		ar = br;
		System.out.println(Arrays.toString(ar));

		//데이터가 많을때, 그리고 배열의 크기가 가변성이 있을때 시간이 많이 걸려서 다른 방법을 사용해야함

		//연습 : Set을 삭제하기
		
		//String [] cr = new String[ar.length];
		//for(int i = 0; i < ar.length; i++) {
		//	cr[i] = br[i];
		//}


	}	

}
