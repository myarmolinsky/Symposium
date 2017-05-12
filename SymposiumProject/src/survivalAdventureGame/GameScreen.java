package survivalAdventureGame;

import java.awt.Color;
import java.util.ArrayList;

import gui.components.Action;
import gui.components.Button;
import gui.components.TextArea;
import gui.components.TextLabel;
import gui.components.Visible;
import gui.screens.ClickableScreen;

public class GameScreen extends ClickableScreen implements Runnable {

	private TextLabel title;
	private TextLabel author;
	private Button gameStarter;
	private TextArea intro;
	private Button exitIntro;
	private TextArea text;
	private Button flashlight;
	private Button survivalKnife;
	private Button matchBox;
	private Button rag;
	private Button medKit;
	private Button gps;
	private Button friend;
	private Button waterBottle;
	private boolean flashlightTaken;
	private boolean survivalKnifeTaken;
	private boolean matchBoxTaken;
	private boolean ragTaken;
	private boolean medKitTaken;
	private boolean gpsTaken;
	private boolean friendTaken;
	private boolean waterBottleTaken;
	private TextArea chosenItems;
	private Button submitChosenItems;

	public GameScreen(int width, int height) {
		super(width, height);
	}

	public void run() {

	}

	public void initAllObjects(ArrayList<Visible> viewObjects) {
		title = new TextLabel(300, 100, 200, 50, "Survival Adventure");
		author = new TextLabel(300, 150, 250, 50, "By Matthew Yarmolinsky");
		intro = new TextArea(50, 100, 700, 300,
				"Welcome to the Introduction/Tutorial." + "This is a text- and image-based survival adventure."
						+ "Your goal is to survive as long as possible."
						+ "There will be many challenges throughout your time surviving,"
						+ "but know that they will get harder and harder the longer you progress."
						+ "Your actions in response to events are only part of what determines your fate,"
						+ "there is also some random chance involved, so just keep that in mind. "
						+ "Without further ado, you may begin surviving!");
		gameStarter = new Button(300, 200, 200, 50, "Start Game", Color.GREEN, new Action() {
			public void act() {
				viewObjects.remove(title);
				viewObjects.remove(author);
				viewObjects.remove(gameStarter);
				viewObjects.add(intro);
				exitIntro = new Button(400, 400, 200, 50, "Exit Intro", Color.GREEN, new Action() {

					public void act() {
						remove(intro);
						remove(exitIntro);
						text = new TextArea(50, 100, 700, 300, "Your story begins here. "
								+ "You were camping with your friend "
								+ "and foolishly forgot to put out the fire before going to sleep "
								+ "and the fire ended up lighting your camp ablaze. "
								+ "You wake up in the nick of time to grab a few of your things and get out alive. "
								+ "Choose three items to take with you to aid in your journey to get back to civilization.");
						addObject(text);
						chosenItems = new TextArea(50, 450, 100, 50, returnChosenItems());
						flashlight = new Button(50, 425, 100, 50, "Flashlight", Color.YELLOW, new Action() {

							public void act() {
								if (!flashlightTaken) {
									flashlightTaken = true;
								} else {
									flashlightTaken = false;
								}
							}

						});
						survivalKnife = new Button(50, 425, 100, 50, "Survival Knife", Color.YELLOW, new Action() {

							public void act() {
								if (!survivalKnifeTaken) {
									survivalKnifeTaken = true;
								} else {
									survivalKnifeTaken = false;
								}
							}

						});
						matchBox = new Button(50, 425, 100, 50, "Match Box", Color.YELLOW, new Action() {

							public void act() {
								if (!matchBoxTaken) {
									matchBoxTaken = true;
								} else {
									matchBoxTaken = false;
								}
							}

						});
						rag = new Button(50, 425, 100, 50, "Rag", Color.YELLOW, new Action() {

							public void act() {
								if (!ragTaken) {
									ragTaken = true;
								} else {
									ragTaken = false;
								}
							}

						});
						medKit = new Button(50, 425, 100, 50, "Med Kit", Color.YELLOW, new Action() {

							public void act() {
								if (!medKitTaken) {
									medKitTaken = true;
								} else {
									medKitTaken = false;
								}
							}

						});
						gps = new Button(50, 425, 100, 50, "GPS", Color.YELLOW, new Action() {

							public void act() {
								if (!gpsTaken) {
									gpsTaken = true;
								} else {
									gpsTaken = false;
								}
							}

						});
						friend = new Button(50, 425, 100, 50, "Friend", Color.YELLOW, new Action() {

							public void act() {
								if (!friendTaken) {
									friendTaken = true;
								} else {
									friendTaken = false;
								}
							}

						});
						waterBottle = new Button(50, 425, 100, 50, "Water Bottle", Color.YELLOW, new Action() {

							public void act() {
								if (!waterBottleTaken) {
									waterBottleTaken = true;
								} else {
									waterBottleTaken = false;
								}
							}

						});
						submitChosenItems = new Button(50, 425, 100, 50, "Submit", Color.CYAN, new Action() {

							public void act() {
								if(checkChosenItems()){
									remove(flashlight);
									remove(survivalKnife);
									remove(matchBox);
									remove(rag);
									remove(medKit);
									remove(gps);
									remove(friend);
									remove(waterBottle);
									remove(chosenItems);
									remove(submitChosenItems);
								}
							}

						});
						addObject(flashlight);
						addObject(survivalKnife);
						addObject(matchBox);
						addObject(rag);
						addObject(medKit);
						addObject(gps);
						addObject(friend);
						addObject(waterBottle);
						addObject(chosenItems);
						addObject(submitChosenItems);
					}

				});
				addObject(exitIntro);
			}

		});
		viewObjects.add(title);
		viewObjects.add(author);
		viewObjects.add(gameStarter);
	}
	
	public boolean checkChosenItems() {
		int takens = 0;
		if(flashlightTaken){
			takens++;
		}
		if(survivalKnifeTaken){
			takens++;
		}
		if(matchBoxTaken){
			takens++;
		}
		if(ragTaken){
			takens++;
		}
		if(medKitTaken){
			takens++;
		}
		if(gpsTaken){
			takens++;
		}
		if(friendTaken){
			takens++;
		}
		if(waterBottleTaken){
			takens++;
		}
		if(takens == 3){
			return true;
		}
		return false;
	}
	
	public String returnChosenItems() {
		String chosenItemsString = "Inventory:  ";
		if(flashlightTaken){
			chosenItemsString+= "Flashlight, ";
		}
		if(survivalKnifeTaken){
			chosenItemsString+= "Survival Knife, ";
		}
		if(matchBoxTaken){
			chosenItemsString+= "Match Box, ";
		}
		if(ragTaken){
			chosenItemsString+= "Rag, ";
		}
		if(medKitTaken){
			chosenItemsString+= "Med kit, ";
		}
		if(gpsTaken){
			chosenItemsString+= "GPS, ";
		}
		if(friendTaken){
			chosenItemsString+= "Friend, ";
		}
		if(waterBottleTaken){
			chosenItemsString+= "Water Bottle, ";
		}
		return chosenItemsString.substring(0, chosenItemsString.length() - 2);
	}


}
