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
										}

									});
									addObject(defaultButton);
									remove(submitChosenItems);
									while (turnCounter < 51) {
										String chosenEvent = chooseEvent();
										text.setText(chosenEvent);
										for (int x = 0; x < events.length; x++) {
											if (text.getText().equals(events[x])) {
												addObject(optionButtons[x][0]);
												addObject(optionButtons[x][1]);
												addObject(optionButtons[x][2]);
											}
										}
										turnCounter++;// fix
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
		if (turnCounter < 51) {
			chosenEvent = events[(int) (Math.random() * events.length)];
			turnCounter++;
			chosenEvent += ", what do you do?";
			return chosenEvent;
		} else {
			return "You made it to safety!";
		}
	}

}
