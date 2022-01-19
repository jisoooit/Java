package collection;

public class Member implements Comparable<Member>{
	
	private int memberID;
	private String memberName;
	
	public Member(int memberID,String memberName) {
		this.memberID=memberID;
		this.memberName=memberName;
	}
	
	public int getMemberID() {
		return memberID;
	}
	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String toString() {
		return memberName+"회원님의 아이디는 "+memberID+"입니다.";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return memberID;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member=(Member)obj;
			if(this.memberID==member.memberID) {
				return true;
			}else {
				return false;
			}
		}	
		return false;
	}

	@Override //무슨 순으로 할 건지 결정해줘야 함, 멤버를 어떻게 비교할건지
	public int compareTo(Member member) {
		//내가 매개변수보다 크면 리턴을 양수로 하고 오름차순으로 정렬되는 트리 만들어진다.
		//음수는 내림차순
		return (this.memberID-member.memberID);
		//이름순로 하고싶다면
		//return(this.memberName.compareTo(member.memberName));
	}
	
	
	
}
