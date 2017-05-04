package survivalAdventureGame;

import java.awt.Color;
import java.util.ArrayList;

import gui.components.Action;
import gui.components.Button;
import gui.components.TextLabel;
import gui.components.Visible;
import gui.screens.ClickableScreen;

public class GameScreen extends ClickableScreen implements Runnable{
	
	private TextLabel title;
	private TextLabel author;
	private Button gameStarter;

	public GameScreen(int width, int height) {
		super(width, height);
	}

	public void run() {
		
	}

	public void initAllObjects(ArrayList<Visible> viewObjects) {
		title = new TextLabel(300, 100, 200, 50, "Survival Adventure");
		author = new TextLabel(300, 150, 200, 50, "By Matthew Yarmolinsky");
		gameStarter = new Button(300, 200, 200, 50, "Start Game", Color.GREEN, new Action(){
			public void act() {
				viewObjects.remove(title);
				viewObjects.remove(author);
				viewObjects.remove(gameStarter);
				//add starter text/tutorial (whatever comes after the initial screen)
			}
		});
		viewObjects.add(title);
		viewObjects.add(author);
		viewObjects.add(gameStarter);
	}

}
