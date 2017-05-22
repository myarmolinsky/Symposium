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
	private String[] events;// = String{"A Bear attacks", "You've reached a
							// clearing", "You see smoke in the distance", "You
							// found animal tracks, but you don't know which
							// animal they belong to", "You walk into a bee
							// hive", "You walk onto a trail", "You walk up to a
							// river", "You walk up to a lake", "You up to a
							// bear bed", "You walk up to a cave"};
	private int turnCounter;
	private Button defaultButton;
	private TextLabel gameover;
	private Button[][] optionButtons;
	private Button bearEncounter1;
	private Button bearEncounter2;
	private Button bearEncounter3;
	private Button clearingEncounter1;
	private Button clearingEncounter2;
	private Button clearingEncounter3;
	private Button smokeEncounter1;
	private Button smokeEncounter2;
	private Button smokeEncounter3;
	private Button tracksEncounter1;
	private Button tracksEncounter2;
	private Button tracksEncounter3;
	private Button beeEncounter1;
	private Button beeEncounter2;
	private Button beeEncounter3;
	private Button trailEncounter1;
	private Button trailEncounter2;
	private Button trailEncounter3;
	private Button riverEncounter1;
	private Button riverEncounter2;
	private Button riverEncounter3;
	private Button lakeEncounter1;
	private Button lakeEncounter2;
	private Button lakeEncounter3;
	private Button corpseEncounter1;
	private Button corpseEncounter2;
	private Button corpseEncounter3;
	private Button caveEncounter1;
	private Button caveEncounter2;
	private Button caveEncounter3;

	public GameScreen(int width, int height) {
		super(width, height);
	}

	public void run() {

	}

	public void initAllObjects(ArrayList<Visible> viewObjects) {
		String[] setTo = { "A Bear attacks", "You've reached a clearing", "You see smoke in the distance",
				"You found animal tracks, but you don't know which animal they belong to", "You walk into a bee hive",
				"You walk onto a trail", "You walk up to a river", "You walk up to a lake", "You up to a corpse",
				"You walk up to a cave" };
		events = setTo;
		Button[][] buttons = { { new Button(400, 250, 100, 100, "option1", Color.CYAN, new Action() {

			public void act() {

			}

		}), new Button(400, 250, 100, 100, "option2", Color.CYAN, new Action() {

			public void act() {

			}

		}), new Button(400, 250, 100, 100, "option3", Color.CYAN, new Action() {

			public void act() {

			}

		}) }, { new Button(400, 250, 100, 100, "option1", Color.CYAN, new Action() {

			public void act() {

			}

		}), new Button(400, 250, 100, 100, "option2", Color.CYAN, new Action() {

			public void act() {

			}

		}), new Button(400, 250, 100, 100, "option3", Color.CYAN, new Action() {

			public void act() {

			}

		}) }, { new Button(400, 250, 100, 100, "option1", Color.CYAN, new Action() {

			public void act() {

			}

		}), new Button(400, 250, 100, 100, "option2", Color.CYAN, new Action() {

			public void act() {

			}

		}), new Button(400, 250, 100, 100, "option3", Color.CYAN, new Action() {

			public void act() {

			}

		}) }, { new Button(400, 250, 100, 100, "option1", Color.CYAN, new Action() {

			public void act() {

			}

		}), new Button(400, 250, 100, 100, "option2", Color.CYAN, new Action() {

			public void act() {

			}

		}), new Button(400, 250, 100, 100, "option3", Color.CYAN, new Action() {

			public void act() {

			}

		}) }, { new Button(400, 250, 100, 100, "option1", Color.CYAN, new Action() {

			public void act() {

			}

		}), new Button(400, 250, 100, 100, "option2", Color.CYAN, new Action() {

			public void act() {

			}

		}), new Button(400, 250, 100, 100, "option3", Color.CYAN, new Action() {

			public void act() {

			}

		}) }, { new Button(400, 250, 100, 100, "option1", Color.CYAN, new Action() {

			public void act() {

			}

		}), new Button(400, 250, 100, 100, "option2", Color.CYAN, new Action() {

			public void act() {

			}

		}), new Button(400, 250, 100, 100, "option3", Color.CYAN, new Action() {

			public void act() {

			}

		}) }, { new Button(400, 250, 100, 100, "option1", Color.CYAN, new Action() {

			public void act() {

			}

		}), new Button(400, 250, 100, 100, "option2", Color.CYAN, new Action() {

			public void act() {

			}

		}), new Button(400, 250, 100, 100, "option3", Color.CYAN, new Action() {

			public void act() {

			}

		}) }, { new Button(400, 250, 100, 100, "option1", Color.CYAN, new Action() {

			public void act() {

			}

		}), new Button(400, 250, 100, 100, "option2", Color.CYAN, new Action() {

			public void act() {

			}

		}), new Button(400, 250, 100, 100, "option3", Color.CYAN, new Action() {

			public void act() {

			}

		}) }, { new Button(400, 250, 100, 100, "option1", Color.CYAN, new Action() {

			public void act() {

			}

		}), new Button(400, 250, 100, 100, "option2", Color.CYAN, new Action() {

			public void act() {

			}

		}), new Button(400, 250, 100, 100, "option3", Color.CYAN, new Action() {

			public void act() {

			}

		}) }, { new Button(400, 250, 100, 100, "option1", Color.CYAN, new Action() {

			public void act() {

			}

		}), new Button(400, 250, 100, 100, "option2", Color.CYAN, new Action() {

			public void act() {

			}

		}), new Button(400, 250, 100, 100, "option3", Color.CYAN, new Action() {

			public void act() {

			}

		}) } };
		optionButtons = buttons;
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
						text = new TextArea(50, 50, 700, 300, "Your story begins here. "
								+ "You were camping with your friend "
								+ "and foolishly forgot to put out the fire before going to sleep "
								+ "and the fire ended up lighting your camp ablaze. "
								+ "You wake up in the nick of time to grab a few of your things and get out alive. "
								+ "Choose three items to take with you to aid in your journey to get back to civilization.");
						addObject(text);
						chosenItems = new TextArea(50, 250, 750, 200, returnChosenItems());
						flashlight = new Button(50, 350, 150, 50, "Flashlight", Color.YELLOW, new Action() {

							public void act() {
								if (!flashlightTaken) {
									flashlightTaken = true;
									flashlight.setColor(Color.GREEN);
									chosenItems.setText(returnChosenItems());
								} else {
									flashlightTaken = false;
									flashlight.setColor(Color.YELLOW);
									chosenItems.setText(returnChosenItems());
								}
							}

						});
						survivalKnife = new Button(200, 350, 150, 50, "Survival Knife", Color.YELLOW, new Action() {

							public void act() {
								if (!survivalKnifeTaken) {
									survivalKnifeTaken = true;
									survivalKnife.setColor(Color.GREEN);
									chosenItems.setText(returnChosenItems());
								} else {
									survivalKnifeTaken = false;
									survivalKnife.setColor(Color.YELLOW);
									chosenItems.setText(returnChosenItems());
								}
							}

						});
						matchBox = new Button(350, 350, 150, 50, "Match Box", Color.YELLOW, new Action() {

							public void act() {
								if (!matchBoxTaken) {
									matchBoxTaken = true;
									matchBox.setColor(Color.GREEN);
									chosenItems.setText(returnChosenItems());
								} else {
									matchBoxTaken = false;
									matchBox.setColor(Color.YELLOW);
									chosenItems.setText(returnChosenItems());
								}
							}

						});
						rag = new Button(500, 350, 150, 50, "Rag", Color.YELLOW, new Action() {

							public void act() {
								if (!ragTaken) {
									ragTaken = true;
									rag.setColor(Color.GREEN);
									chosenItems.setText(returnChosenItems());
								} else {
									ragTaken = false;
									rag.setColor(Color.YELLOW);
									chosenItems.setText(returnChosenItems());
								}
							}

						});
						medKit = new Button(50, 425, 150, 50, "Med Kit", Color.YELLOW, new Action() {

							public void act() {
								if (!medKitTaken) {
									medKitTaken = true;
									medKit.setColor(Color.GREEN);
									chosenItems.setText(returnChosenItems());
								} else {
									medKitTaken = false;
									medKit.setColor(Color.YELLOW);
									chosenItems.setText(returnChosenItems());
								}
							}

						});
						gps = new Button(200, 425, 150, 50, "GPS", Color.YELLOW, new Action() {

							public void act() {
								if (!gpsTaken) {
									gpsTaken = true;
									gps.setColor(Color.GREEN);
									chosenItems.setText(returnChosenItems());
								} else {
									gpsTaken = false;
									gps.setColor(Color.YELLOW);
									chosenItems.setText(returnChosenItems());
								}
							}

						});
						friend = new Button(350, 425, 150, 50, "Friend", Color.YELLOW, new Action() {

							public void act() {
								if (!friendTaken) {
									friendTaken = true;
									friend.setColor(Color.GREEN);
									chosenItems.setText(returnChosenItems());
								} else {
									friendTaken = false;
									friend.setColor(Color.YELLOW);
									chosenItems.setText(returnChosenItems());
								}
							}

						});
						waterBottle = new Button(500, 425, 150, 50, "Water Bottle", Color.YELLOW, new Action() {

							public void act() {
								if (!waterBottleTaken) {
									waterBottleTaken = true;
									waterBottle.setColor(Color.GREEN);
									chosenItems.setText(returnChosenItems());
								} else {
									waterBottleTaken = false;
									waterBottle.setColor(Color.YELLOW);
									chosenItems.setText(returnChosenItems());
								}
							}

						});
						submitChosenItems = new Button(675, 425, 100, 50, "Submit", Color.CYAN, new Action() {

							public void act() {
								if (checkChosenItems()) {
									remove(flashlight);
									remove(survivalKnife);
									remove(matchBox);
									remove(rag);
									remove(medKit);
									remove(gps);
									remove(friend);
									remove(waterBottle);
									defaultButton = new Button(500, 425, 150, 50, "Die", Color.RED, new Action() {

										public void act() {
											gameover = new TextLabel(400, 250, 100, 100, "Game Over");
											viewObjects.add(gameover);
											viewObjects.remove(text);
											viewObjects.remove(defaultButton);
											viewObjects.remove(bearEncounter1);
											viewObjects.remove(bearEncounter2);
											viewObjects.remove(bearEncounter3);
											viewObjects.remove(clearingEncounter1);
											viewObjects.remove(clearingEncounter2);
											viewObjects.remove(clearingEncounter3);
											viewObjects.remove(smokeEncounter1);
											viewObjects.remove(smokeEncounter2);
											viewObjects.remove(smokeEncounter3);
											viewObjects.remove(tracksEncounter1);
											viewObjects.remove(tracksEncounter2);
											viewObjects.remove(tracksEncounter3);
											viewObjects.remove(beeEncounter1);
											viewObjects.remove(beeEncounter2);
											viewObjects.remove(beeEncounter3);
											viewObjects.remove(trailEncounter1);
											viewObjects.remove(trailEncounter2);
											viewObjects.remove(trailEncounter3);
											viewObjects.remove(riverEncounter1);
											viewObjects.remove(riverEncounter2);
											viewObjects.remove(riverEncounter3);
											viewObjects.remove(lakeEncounter1);
											viewObjects.remove(lakeEncounter2);
											viewObjects.remove(lakeEncounter3);
											viewObjects.remove(corpseEncounter1);
											viewObjects.remove(corpseEncounter2);
											viewObjects.remove(corpseEncounter3);
											viewObjects.remove(caveEncounter1);
											viewObjects.remove(caveEncounter2);
											viewObjects.remove(caveEncounter3);
										}

									});
									while (turnCounter < 51) {
										String chosenEvent = chooseEvent();
										text.setText(chosenEvent);
										if (chosenEvent.equals(events[0])) {
											addObject(bearEncounter1);
											addObject(bearEncounter2);
											addObject(bearEncounter3);
											addObject(defaultButton);
										}
										if (chosenEvent.equals(events[1])) {
											addObject(bearEncounter1);
											addObject(bearEncounter2);
											addObject(bearEncounter3);
											addObject(defaultButton);
										}
										if (chosenEvent.equals(events[2])) {
											addObject(bearEncounter1);
											addObject(bearEncounter2);
											addObject(bearEncounter3);
											addObject(defaultButton);
										}
										if (chosenEvent.equals(events[3])) {
											addObject(bearEncounter1);
											addObject(bearEncounter2);
											addObject(bearEncounter3);
											addObject(defaultButton);
										}
										if (chosenEvent.equals(events[4])) {
											addObject(bearEncounter1);
											addObject(bearEncounter2);
											addObject(bearEncounter3);
											addObject(defaultButton);
										}
										if (chosenEvent.equals(events[5])) {
											addObject(bearEncounter1);
											addObject(bearEncounter2);
											addObject(bearEncounter3);
											addObject(defaultButton);
										}
										if (chosenEvent.equals(events[6])) {
											addObject(bearEncounter1);
											addObject(bearEncounter2);
											addObject(bearEncounter3);
											addObject(defaultButton);
										}
										if (chosenEvent.equals(events[7])) {
											addObject(bearEncounter1);
											addObject(bearEncounter2);
											addObject(bearEncounter3);
											addObject(defaultButton);
										}
										if (chosenEvent.equals(events[8])) {
											addObject(bearEncounter1);
											addObject(bearEncounter2);
											addObject(bearEncounter3);
											addObject(defaultButton);
										}
										if (chosenEvent.equals(events[9])) {
											addObject(bearEncounter1);
											addObject(bearEncounter2);
											addObject(bearEncounter3);
											addObject(defaultButton);
										}
										remove(submitChosenItems);
									}
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
		if (flashlightTaken) {
			takens++;
		}
		if (survivalKnifeTaken) {
			takens++;
		}
		if (matchBoxTaken) {
			takens++;
		}
		if (ragTaken) {
			takens++;
		}
		if (medKitTaken) {
			takens++;
		}
		if (gpsTaken) {
			takens++;
		}
		if (friendTaken) {
			takens++;
		}
		if (waterBottleTaken) {
			takens++;
		}
		if (takens == 3) {
			return true;
		}
		return false;
	}

	public String returnChosenItems() {
		String chosenItemsString = "Inventory:  ";
		if (flashlightTaken) {
			chosenItemsString += "Flashlight, ";
		}
		if (survivalKnifeTaken) {
			chosenItemsString += "Survival Knife, ";
		}
		if (matchBoxTaken) {
			chosenItemsString += "Match Box, ";
		}
		if (ragTaken) {
			chosenItemsString += "Rag, ";
		}
		if (medKitTaken) {
			chosenItemsString += "Med kit, ";
		}
		if (gpsTaken) {
			chosenItemsString += "GPS, ";
		}
		if (friendTaken) {
			chosenItemsString += "Friend, ";
		}
		if (waterBottleTaken) {
			chosenItemsString += "Water Bottle, ";
		}
		return chosenItemsString.substring(0, chosenItemsString.length() - 2);
	}

	public String chooseEvent() {
		String chosenEvent = "";
		if (turnCounter < 50) {
			chosenEvent = events[(int) (Math.random() * events.length)];
			turnCounter++;
		}
		return chosenEvent + ", what do you do?";
	}

}
