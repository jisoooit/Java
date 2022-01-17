package interfaceex;

public interface Sell {
	void Sell();
	
	default void order() {
		System.out.println("판매주문");
	}
}
