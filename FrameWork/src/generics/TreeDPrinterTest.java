package generics;

public class TreeDPrinterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeDPrinter<Powder> printer=new TreeDPrinter<Powder>();
		printer.setMaterial(new Powder());
		Powder powder=printer.getMaterial();
		System.out.println(printer);
		
		TreeDPrinter<Plastic> printer2=new TreeDPrinter<Plastic>();
		printer2.setMaterial(new Plastic());
		Plastic plastic=printer2.getMaterial();
		System.out.println(printer2);
		
		printer2.printing();
		
		//TŸ�� ���ѵǾ� water����. ����
//		TreeDPrinter<Water> printer3=new TreeDPrinter<Water>();
//		printer3.setMaterial(new Water());
//		System.out.println(printer3);

		//�̰� t�� object��� ��������
		//TreeDPrinter printer=new TreeDPrinter();
		//printer.setMaterial(new Powder());
		//Powder powder=(Powder) printer.getMaterial();
	}

}
