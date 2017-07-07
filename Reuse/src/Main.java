class GameShape {
	public void displayShape() {
		System.out.println("shape");
	}
}

class PlayerShape extends GameShape {
	public void displayShape() {
		System.out.println("Player");
	}
}

class TileShape extends GameShape {
	public void displayShape() {
		System.out.println("Tile");
	}
}

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlayerShape player = new PlayerShape();
		TileShape tile = new TileShape();
		doshape(player);
		doshape(tile);
	}

	public static void doshape(GameShape shape) {
		shape.displayShape();
	}

}
