package nebulous.sandbox;

import nebulous.loreEngine.core.game.Game;
import nebulous.loreEngine.core.game.Window;

public class Sandbox extends Game {

	public Sandbox(Window window) {
		super(window);
	}

	@Override
	public void onPreInit() {
		
	}
	
	@Override
	public void onInit() {
		window.center();
		
	}

	@Override
	public void onStart() {
		loadScene(new TestScene());
	}

	@Override
	public void onStop() {
		
	}
	
	public static void main(String[] args) {
		Window window = new Window("Sandbox", 1360, 720);
		Game game = new Sandbox(window);
		game.start();
	}

}
