package interfaceex;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//R,L,P 입력받겠다.
		System.out.println("전화 상담 배분 방식을 선택하시오 R, L, P");
		
		int ch=System.in.read();
		Scheduler schedular =null;
		
		if (ch=='R'||ch=='r') {
			schedular = new RoundRobin();
		}else if(ch=='L' || ch=='l') {
			schedular=new LeastJob();
		}else if(ch=='P'||ch=='p') {
			schedular=new PriorityAllocaiotn();
		}else {
			System.out.println("지원하지 않는 기능입니다.");
			return;
		}
		
		schedular.getNextCall();
		schedular.sendCallToAgent();
	}

}
