package interfaceex;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//R,L,P �Է¹ްڴ�.
		System.out.println("��ȭ ��� ��� ����� �����Ͻÿ� R, L, P");
		
		int ch=System.in.read();
		Scheduler schedular =null;
		
		if (ch=='R'||ch=='r') {
			schedular = new RoundRobin();
		}else if(ch=='L' || ch=='l') {
			schedular=new LeastJob();
		}else if(ch=='P'||ch=='p') {
			schedular=new PriorityAllocaiotn();
		}else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return;
		}
		
		schedular.getNextCall();
		schedular.sendCallToAgent();
	}

}
