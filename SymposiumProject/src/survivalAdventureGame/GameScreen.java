package survivalAdventureGame;

import java.awt.Color;
import java.util.ArrayList;

import gui.components.Action;
import gui.components.Button;
import gui.components.TextLabel;
import gui.components.Visible;
import gui.screens.ClickableScreen;

public class GameScreen extends ClickableScreen implements Runnable {

	private TextLabel title;
	private TextLabel author;
	private Button gameStarter;
	private TextLabel intro;
	private Button exitIntro;

	public GameScreen(int width, int height) {
		super(width, height);
	}

	public void run() {

	}

	public void initAllObjects(ArrayList<Visible> viewObjects) {
		title = new TextLabel(300, 100, 200, 50, "Survival Adventure");
		author = new TextLabel(300, 150, 200, 50, "By Matthew Yarmolinsky");
		intro = new TextLabel(300, 100, 700, 300,
				"Welcome to the Introduction/Tutorial."
				+ " This is a text- and image-based survival adventure."
				+ " Your goal is to survive as long as possible."
				+ " There will be many challenges throughout your time surviving,"
				+ " but know that they will get harder and harder the longer you progress."
				+ " Your actions in response to events are only part of what determines your fate,"
				+ " there is also some random chance involved, so just keep that in mind."
				+ " Without further ado, you may begin surviving!");
		gameStarter = new Button(300, 200, 200, 50, "Start Game", Color.GREEN, new Action() {
			public void act() {
				viewObjects.remove(title);
				viewObjects.remove(author);
				viewObjects.remove(gameStarter);
				viewObjects.add(intro);
				// add starter text/tutorial (whatever comes after the initial
				// screen)
				exitIntro = new Button(400, 400, 200, 50, "Exit Intro", Color.GREEN, new Action() {

					public void act() {
						viewObjects.remove(intro);
						viewObjects.remove(exitIntro);
					}
					
				});
				viewObjects.add(exitIntro);
			}
		});
		viewObjects.add(title);
		viewObjects.add(author);
		viewObjects.add(gameStarter);
	}

}
