package ch11;

class Point3{}

public class StringEx1 {
	public static void main(String[] args) {
		Point3 p1 = new Point3();
		Point3 p2 = new Point3();
		System.out.println(p1==p2);
		int a = 10;
		int b = 10;
		System.out.println(a==b);
		System.out.println("------");
		/*new ������ ���� ��ü�� �����ϴ� ������ Ŭ����
		*new ���� ������� String ��ü�� String ����ҿ�
		*��������� �����Ҷ� ������ ���ڿ� ���� ������ ����
		*/
		String s1 = new String("Java");
		String s2 = new String("Java");
		String s3 = "Java";//����
		String s4 = "Java";//����
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println(s1==s3);
		System.out.println("------------");
		//��ü�� ���ڿ��� ������ ��
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s4));
		
		System.out.println(p1.equals(p2));
		System.out.println("---------------");
		String s5 = "APPLE";
		String s6 = "apple";
		System.out.println(s5.equals(s6));
		System.out.println(s5.equalsIgnoreCase(s6));

	}
}