package ch13;

interface Pair<K,V>
{
	public K getKey();
	public V getValue();
}

class OrderPair<K,V> implements Pair<K,V>
{
	public K key;
	public V value;
	
	public OrderPair(K key, V value) {
		// TODO Auto-generated constructor stub
		this.key=key;
		this.value=value;
	}
	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return key;
	}
	@Override
	public V getValue() {
		// TODO Auto-generated method stub
		return value;
	}
}

public class GenericEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderPair<String, Integer> p1=new OrderPair<String,Integer>("Even",8);
		OrderPair<String, String> p2=new OrderPair<String,String>("Hello","World");

	}

}
