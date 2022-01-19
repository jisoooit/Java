package collection.arraylist;

import java.util.ArrayList;

class MyQueue{
	private ArrayList<String> arrayQueue=new ArrayList();
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	public String pop() {
		int len=arrayQueue.size();
		if (len==0) {
			System.out.println("비었습니다.");
			return null;
		}
		String data=arrayQueue.remove(0);
		return data;
	}
}
public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
