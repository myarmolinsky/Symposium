package survivalAdventureGame;

import java.awt.Color;
import java.util.ArrayList;

import gui.components.Action;
import gui.components.Button;
import gui.components.TextArea;
import gui.components.TextLabel;
import gui.components.Visible;
import gui.screens.ClickableScreen;
import survivalButtons.ChoiceButton;
import survivalButtons.ProgressAction;

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
	private ChoiceButton option1;
	private ChoiceButton option2;
	private ChoiceButton option3;
	private int health = 100;
	private int progress;

	public GameScreen(int width, int height) {
		super(width, height);
	}

	public void nextDecision() {
		if (progress < 100 && health != 0) {
			String chosenEvent = chooseEvent();
			text.setText(chosenEvent + "Progress: " + progress + " | Health:" + health);

			if (text.getText().contains(events[0])) {
				option1.setText("Fight Back");
				option1.setAction(new Action() {

					public void act() {
						ProgressAction progAct = new ProgressAction(GameScreen.this, survivalKnifeTaken, friendTaken,
								50, false, 5);
						nextDecision();
					}

				});
				option2.setText("Run Away");
				option2.setAction(new Action() {

					public void act() {
						ProgressAction progAct = new ProgressAction(GameScreen.this, null, null, 75, false, 0);
						nextDecision();
					}

				});
				option3.setText("Play Dead");
				option3.setAction(new Action() {

					public void act() {
						ProgressAction progAct = new ProgressAction(GameScreen.this, null, null, 0, true, 10);
						nextDecision();
					}

				});
			} else if (text.getText().contains(events[1])) {
				option1.setText("Rest");
				option1.setAction(new Action() {

					public void act() {
						ProgressAction progAct = new ProgressAction(GameScreen.this, medKitTaken, ragTaken, 50, false,
								0);
						nextDecision();
					}

				});
				option2.setText("Keep Walking");
				option2.setAction(new Action() {

					public void act() {
						ProgressAction progAct = new ProgressAction(GameScreen.this, gpsTaken, null, 0, true, 5);
						nextDecision();
					}

				});
				option3.setText("Drink/Eat");
				option3.setAction(new Action() {

					public void act() {
						ProgressAction progAct = new ProgressAction(GameScreen.this, waterBottleTaken, friendTaken, 50,
								true, 5);
						nextDecision();
					}

				});
			} else if (text.getText().contains(events[2])) {
				option1.setText("Go To It");
				option1.setAction(new Action() {

					public void act() {
						ProgressAction progAct = new ProgressAction(GameScreen.this, null, null, 0, true, 10);
						nextDecision();
					}

				});
				option2.setText("Go Away From It");
				option2.setAction(new Action() {

					public void act() {
						ProgressAction progAct = new ProgressAction(GameScreen.this, gpsTaken, null, 5, true, 5);
						nextDecision();
					}

				});
				option3.setText("Keep Going");
				option3.setAction(new Action() {

					public void act() {
						ProgressAction progAct = new ProgressAction(GameScreen.this, gpsTaken, null, 5, true, 10);
						nextDecision();
					}

				});
			} else if (text.getText().contains(events[3])) {
				option1.setText("Follow The Tracks");
				option1.setAction(new Action() {

					public void act() {
						ProgressAction progAct = new ProgressAction(GameScreen.this, survivalKnifeTaken, friendTaken,
								25, false, 5);
						nextDecision();
					}

				});
				option2.setText("Go Away From Them");
				option2.setAction(new Action() {

					public void act() {
						ProgressAction progAct = new ProgressAction(GameScreen.this, null, null, 0, true, 5);
						nextDecision();
					}

				});
				option3.setText("Keep Going");
				option3.setAction(new Action() {

					public void act() {
						ProgressAction progAct = new ProgressAction(GameScreen.this, gpsTaken, null, 5, true, 10);
						nextDecision();
					}

				});
			} else if (text.getText().contains(events[4])) {
				option1.setText("Stand Still");
				option1.setAction(new Action() {

					public void act() {
						ProgressAction progAct = new ProgressAction(GameScreen.this, ragTaken, matchBoxTaken, 5, false,
								0);
						nextDecision();
					}

				});
				option2.setText("Slowly Walk Away");
				option2.setAction(new Action() {

					public void act() {
						ProgressAction progAct = new ProgressAction(GameScreen.this, null, null, 0, true, 5);
						nextDecision();
					}

				});
				option3.setText("Run Away");
				option3.setAction(new Action() {

					public void act() {
						ProgressAction progAct = new ProgressAction(GameScreen.this, friendTaken, null, 20, false, 5);
						nextDecision();
					}

				});
			} else if (text.getText().contains(events[5])) {
				option1.setText("Go Right");
				option1.setAction(new Action() {

					public void act() {
						ProgressAction progAct = new ProgressAction(GameScreen.this, gpsTaken, friendTaken, 10, true,
								10);
						nextDecision();
					}

				});
				option2.setText("Go Left");
				option2.setAction(new Action() {

					public void act() {
						ProgressAction progAct = new ProgressAction(GameScreen.this, gpsTaken, friendTaken, 10, true,
								10);
						nextDecision();
					}

				});
				option3.setText("Keep Going");
				option3.setAction(new Action() {

					public void act() {
						ProgressAction progAct = new ProgressAction(GameScreen.this, gpsTaken, null, 10, true, 10);
						nextDecision();
					}

				});
			} else if (text.getText().contains(events[6])) {
				option1.setText("Fill Up On/Drink Water");
				option1.setAction(new Action() {

					public void act() {
						ProgressAction progAct = new ProgressAction(GameScreen.this, waterBottleTaken, null, 25, true,
								0);
						nextDecision();
					}

				});
				option2.setText("Follow The River Upstream");
				option2.setAction(new Action() {

					public void act() {
						ProgressAction progAct = new ProgressAction(GameScreen.this, gpsTaken, friendTaken, 5, true,
								10);
						nextDecision();
					}

				});
				option3.setText("Follow The River Downstream");
				option3.setAction(new Action() {

					public void act() {
						ProgressAction progAct = new ProgressAction(GameScreen.this, gpsTaken, friendTaken, 5, true,
								10);
						nextDecision();
					}

				});
			} else if (text.getText().contains(events[7])) {
				option1.setText("Fill Up On/Drink Water");
				option1.setAction(new Action() {

					public void act() {
						ProgressAction progAct = new ProgressAction(GameScreen.this, waterBottleTaken, null, 25, true,
								0);
						nextDecision();
					}

				});
				option2.setText("Swim Through It");
				option2.setAction(new Action() {

					public void act() {
						ProgressAction progAct = new ProgressAction(GameScreen.this, gpsTaken, survivalKnifeTaken, 25,
								false, 20);
						nextDecision();
					}

				});
				option3.setText("Walk Around It");
				option3.setAction(new Action() {

					public void act() {
						ProgressAction progAct = new ProgressAction(GameScreen.this, gpsTaken, waterBottleTaken, 10,
								false, 5);
						nextDecision();
					}

				});
			} else if (text.getText().contains(events[8])) {
				option1.setText("Loot Corpse");
				option1.setAction(new Action() {

					public void act() {
						ProgressAction progAct = new ProgressAction(GameScreen.this, ragTaken, null, 10, false, 5);
						nextDecision();
					}

				});
				option2.setText("Ignore Corpse");
				option2.setAction(new Action() {

					public void act() {
						ProgressAction progAct = new ProgressAction(GameScreen.this, ragTaken, null, 10, false, 0);
						nextDecision();
					}

				});
				option3.setText("Call Out");
				option3.setAction(new Action() {

					public void act() {
						ProgressAction progAct = new ProgressAction(GameScreen.this, ragTaken, friendTaken, 10, false,
								5);
						nextDecision();
					}

				});
			} else if (text.getText().contains(events[9])) {
				option1.setText("Go Into Cave And Rest");
				option1.setAction(new Action() {

					public void act() {
						ProgressAction progAct = new ProgressAction(GameScreen.this, flashlightTaken, medKitTaken, 30,
								true, 0);
						nextDecision();
					}

				});
				option2.setText("Ignore Cave");
				option2.setAction(new Action() {

					public void act() {
						ProgressAction progAct = new ProgressAction(GameScreen.this, gpsTaken, null, 5, true, 5);
						nextDecision();
					}

				});
				option3.setText("Call Out");
				option3.setAction(new Action() {

					public void act() {
						ProgressAction progAct = new ProgressAction(GameScreen.this, friendTaken, null, 5, true, 10);
						nextDecision();
					}

				});
			}
			System.out.println(progress + " " + health);
		} else if (health <= 0) {
			text.setText("Game over");
			remove(option1);
			remove(option2);
			remove(option3);
		} else if (progress > 99) {
			text.setText("You Survived! Congrats!");
			remove(option1);
			remove(option2);
			remove(option3);
		}
	}

	public void run() {
		addObject(option2);
		addObject(option1);
		addObject(option3);
		nextDecision();
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getProgress() {
		return progress;
	}

	public void setProgress(int progress) {
		this.progress = progress;
	}

	public void initAllObjects(ArrayList<Visible> viewObjects) {
		String[] setTo = { "A Bear attacks", "You've reached a clearing", "You see smoke in the distance",
				"You found animal tracks, but you don't know which animal they belong to", "You walk into a bee hive",
				"You walk onto a trail", "You walk up to a river", "You walk up to a lake", "You up to a corpse",
				"You walk up to a cave" };
		events = setTo;
		option1 = new ChoiceButton(0, "", new Action() {

			public void act() {

			}

		});
		option2 = new ChoiceButton(1, "", new Action() {

			public void act() {

			}

		});
		option3 = new ChoiceButton(2, "", new Action() {

			public void act() {

			}

		});
		title = new TextLabel(300, 100, 200, 50, "Survival Adventure");
		author = new TextLabel(300, 150, 250, 50, "By Matthew Yarmolinsky");
		intro = new TextArea(50, 100, 700, 300,
				"Welcome to the Introduction/Tutorial." + "This is a text-based survival adventure."
						+ "Your goal is to survive as long as possible."
						+ "There will be many challenges throughout your time surviving,"
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
									remove(submitChosenItems);
									Thread play = new Thread(GameScreen.this);
									play.start();
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
		chosenEvent = events[(int) (Math.random() * events.length)];
		progress++;
		chosenEvent += ", what do you do?";
		return chosenEvent;
	}

}
