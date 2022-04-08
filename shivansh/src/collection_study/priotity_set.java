package collection_study;

import java.util.PriorityQueue;

public class priotity_set {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		pq.add(1);
		pq.add(2);
		pq.add(3);
		pq.add(4);
		pq.add(5);
		pq.add(6);
		System.out.println(pq);
		System.out.println(pq.element());//retrive but does not remove head of the queue .this method differs only peek
		System.out.println(pq);
		System.out.println(pq.poll());//retrive n removes the head of the queue
		System.out.println(pq);
		System.out.println(pq.peek());//retrive but does not remove the head of the queue
		System.out.println(pq);
		pq.poll();//in this case only removes head of the queue
		System.out.println(pq);//n finally printed the without head of the queue
		
	}

}
