package generics;

//material�� ��ӹ��� t�� ����� �� �ְ��Ͽ� water�� ��� ���ϰ� ��.
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
		//extends Material�� �� ���� Material�� �ִ� �޼��带 ����� �� �ִ�.
		//������ object�޼��常 �� �� �־���.
	}
}
