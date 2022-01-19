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
		return memberName+"ȸ������ ���̵�� "+memberID+"�Դϴ�.";
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

	@Override //���� ������ �� ���� ��������� ��, ����� ��� ���Ұ���
	public int compareTo(Member member) {
		//���� �Ű��������� ũ�� ������ ����� �ϰ� ������������ ���ĵǴ� Ʈ�� ���������.
		//������ ��������
		return (this.memberID-member.memberID);
		//�̸����� �ϰ�ʹٸ�
		//return(this.memberName.compareTo(member.memberName));
	}
	
	
	
}
