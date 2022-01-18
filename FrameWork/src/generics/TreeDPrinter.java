package generics;

//material을 상속받은 t만 사용할 수 있게하여 water는 사용 못하게 함.
public class TreeDPrinter<T extends Material> {
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
		
	}
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
		//extends Material을 한 덕에 Material에 있는 메서드를 사용할 수 있다.
		//전에는 object메서드만 쓸 수 있었음.
	}
}
