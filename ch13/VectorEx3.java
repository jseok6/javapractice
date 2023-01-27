package ch13;

import java.util.Vector;

public class VectorEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vlist=new Vector(4,3);
		System.out.println(vlist.capacity());
		for(int i=0; i<10; i++)
		{
			vlist.add(i*10);
		}
		System.out.println(vlist.size());
		System.out.println(vlist.capacity());
		System.out.println("첫번째 요소:"+vlist.firstElement());
		System.out.println("마지막 요소:"+vlist.lastElement());
		System.out.println("두번째 요소:"+vlist.elementAt(1));
		System.out.println(vlist.isEmpty());
		vlist.remove(2);//세번째 요소 삭제
		System.out.println(vlist.size());//요소가 하나 줄어들어서 9
		System.out.println(vlist.capacity());//방은 여전히 10개라서
		vlist.trimToSize();//필요없는 용량 제거
		if(vlist.contains(50))//저장된 객체 찾는요소
		{
			System.out.println("저장된 객체");
		}
		vlist.removeAllElements();//모든 요소 삭제
	}

}
