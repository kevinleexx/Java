
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee a1 = new Employee("001");
		Employee a2 = new Employee("002",a1);
		Employee a3 = new Employee("003",a2);
		Employee a4 = new Employee("004",a3);
		
		a1.addBonus(10000);
		a2.addBonus(20000);
		a3.addBonus(30000);
		a4.addBonus(40000);
		System.out.println(a1+": "+a1.getBonus()+"\n"+a2+": "+a2.getBonus()+"\n"+a3+": "+a3.getBonus()+"\n"+a4+": "+a4.getBonus()+"\n");
	}

}
