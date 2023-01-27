package ch13;

import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vlist=new Vector();
		System.out.println(vlist.size());//몇개들어가있는지
		System.out.println(vlist.capacity());//몇개의 방인지
		vlist.add(new String("하하"));
		vlist.add("하하");
		vlist.add(Integer.valueOf(22));
		vlist.add(23);
		System.out.println(vlist.size());
		//배열과 Vector 밑에는 항상 for 있다
		for(int i=0; i<vlist.size(); i++) {
			System.out.println(vlist.get(i));//vlist 요소들 전부 출력
		}
		System.out.println("==================");
		
	}

}
