		
public class Employee {
	private Employee boss;
	private String ID;
	private double total_bonus;
	
	public Employee(String ID) {
		this.ID=ID;
		this.boss= null;
	}
	
	public Employee(String ID,Employee boss) {
		this.ID=ID;
		this.boss= boss;
	}
	
	public void addBonus(double valve) {
		total_bonus+=valve/10;
		if(boss!=null)
			boss.addBonus(valve/10);
	}
	
	public double getBonus() {
		return total_bonus;
	}
	
	public String toString(){
		return ID;
	}
	
}
