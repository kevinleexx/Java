public class Component {
	private final double cost;
	private final String id;

	public Component(String id, double cost) {
		this.id = id;
		this.cost = cost;
	}

	public double getCost() {
		return cost;
	}
}

class Frame extends Component {
	String string2;

	public Frame(String s1, String s2, int c) {
		super(s1, c);
		string2 = s2;
		// TODO Auto-generated constructor stub
	}
}

class Wheel extends Component {
	int inch;

	Wheel(String s, int i, int c) {
		super(s, c);
		inch = i;
	}
}

class Bicycle {
	static int num;
	Wheel w;
	Frame f;

	public Bicycle(Wheel w, Frame f) {
		num++;
		this.w = w;
		this.f = f;
	}

	public void changeWheel(Wheel w) {
		this.w = w;
	}

	public void changeFrame(Frame f) {
		this.f = f;
	}

	public double getCost() {
		return f.getCost() + w.getCost() + 500;
	}
}