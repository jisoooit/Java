package interfaceex;

public interface Sell {
	void Sell();
	
	default void order() {
		System.out.println("�Ǹ��ֹ�");
	}
}
