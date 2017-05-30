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
	// private Button bear1;
	// private Button bear2;
	// private Button bear3;
	// private Button clearing1;
	// private Button clearing2;
	// private Button clearing3;
	// private Button smoke1;
	// private Button smoke2;
	// private Button smoke3;
	// private Button tracks1;
	// private Button tracks2;
	// private Button tracks3;
	// private Button bee1;
	// private Button bee2;
	// private Button bee3;
	// private Button trail1;
	// private Button trail2;
	// private Button trail3;
	// private Button river1;
	// private Button river2;
	// private Button river3;
	// private Button lake1;
	// private Button lake2;
	// private Button lake3;
	// private Button corpse1;
	// private Button corpse2;
	// private Button corpse3;
	// private Button cave1;
	// private Button cave2;
	// private Button cave3;
	private ChoiceButton option1;
	private ChoiceButton option2;
	private ChoiceButton option3;
	private int health = 100;
	private int progress;

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
		option1 = new ChoiceButton(0, "", new Action() {

			public void act() {

			}

		});
		option3 = new ChoiceButton(1, "", new Action() {

			public void act() {

			}

		});
		option3 = new ChoiceButton(2, "", new Action() {

			public void act() {

			}

		});
		// bear1 = new ChoiceButton(0, "Fight Back",new Action() {
		//
		// public void act() {
		//
		// }
		//
		// });
		// bear2 = new ChoiceButton(1, "Run Away", new Action() {
		//
		// public void act() {
		//
		// }
		//
		// });
		// bear3 = new Button(400, 250, 100, 100, "Play Dead", Color.CYAN, new
		// Action() {
		//
		// public void act() {
		//
		// }
		//
		// });
		// clearing1 = new Button(400, 250, 100, 100, "Rest", Color.CYAN, new
		// Action() {
		//
		// public void act() {
		//
		// }
		//
		// });
		// clearing2 = new Button(400, 250, 100, 100, "Keep Walking",
		// Color.CYAN, new Action() {
		//
		// public void act() {
		//
		// }
		//
		// });
		// clearing3 = new Button(400, 250, 100, 100, "Drink/Eat", Color.CYAN,
		// new Action() {
		//
		// public void act() {
		//
		// }
		//
		// });
		// smoke1 = new Button(400, 250, 100, 100, "Go To It", Color.CYAN, new
		// Action() {
		//
		// public void act() {
		//
		// }
		//
		// });
		// smoke2 = new Button(400, 250, 100, 100, "Go Away From It",
		// Color.CYAN, new Action() {
		//
		// public void act() {
		//
		// }
		//
		// });
		// smoke3 = new Button(400, 250, 100, 100, "Keep Going In The Direction
		// You Were Going", Color.CYAN, new Action() {
		//
		// public void act() {
		//
		// }
		//
		// });
		// tracks1 = new Button(400, 250, 100, 100, "Follow The Tracks",
		// Color.CYAN, new Action() {
		//
		// public void act() {
		//
		// }
		//
		// });
		// tracks2 = new Button(400, 250, 100, 100, "Go Away From The Tracks",
		// Color.CYAN, new Action() {
		//
		// public void act() {
		//
		// }
		//
		// });
		// tracks3 = new Button(400, 250, 100, 100, "Keep Going In The Direction
		// You Were Going", Color.CYAN,
		// new Action() {
		//
		// public void act() {
		//
		// }
		//
		// });
		// bee1 = new Button(400, 250, 100, 100, "Stand Still", Color.CYAN, new
		// Action() {
		//
		// public void act() {
		//
		// }
		//
		// });
		// bee2 = new Button(400, 250, 100, 100, "Slowly Walk Away", Color.CYAN,
		// new Action() {
		//
		// public void act() {
		//
		// }
		//
		// });
		// bee3 = new Button(400, 250, 100, 100, "Run Away", Color.CYAN, new
		// Action() {
		//
		// public void act() {
		//
		// }
		//
		// });
		// trail1 = new Button(400, 250, 100, 100, "Follow The Trail Right",
		// Color.CYAN, new Action() {
		//
		// public void act() {
		//
		// }
		//
		// });
		// trail2 = new Button(400, 250, 100, 100, "Follow The Trail Left",
		// Color.CYAN, new Action() {
		//
		// public void act() {
		//
		// }
		//
		// });
		// trail3 = new Button(400, 250, 100, 100, "Keep Going In The Direction
		// You Were Going", Color.CYAN, new Action() {
		//
		// public void act() {
		//
		// }
		//
		// });
		// river1 = new Button(400, 250, 100, 100, "Fill Up On/Drink Water",
		// Color.CYAN, new Action() {
		//
		// public void act() {
		//
		// }
		//
		// });
		// river2 = new Button(400, 250, 100, 100, "Follow The River Upstream",
		// Color.CYAN, new Action() {
		//
		// public void act() {
		//
		// }
		//
		// });
		// river3 = new Button(400, 250, 100, 100, "Follow The River
		// Downstream", Color.CYAN, new Action() {
		//
		// public void act() {
		//
		// }
		//
		// });
		// lake1 = new Button(400, 250, 100, 100, "Fill Up On/Drink Water",
		// Color.CYAN, new Action() {
		//
		// public void act() {
		//
		// }
		//
		// });
		// lake2 = new Button(400, 250, 100, 100, "Swim Through The Lake To Get
		// To The Other Side", Color.CYAN,
		// new Action() {
		//
		// public void act() {
		//
		// }
		//
		// });
		// lake3 = new Button(400, 250, 100, 100, "Walk Around The Lake To Get
		// To The Other Side", Color.CYAN,
		// new Action() {
		//
		// public void act() {
		//
		// }
		//
		// });
		// corpse1 = new Button(400, 250, 100, 100, "Loot Corpse", Color.CYAN,
		// new Action() {
		//
		// public void act() {
		//
		// }
		//
		// });
		// corpse2 = new Button(400, 250, 100, 100, "Ignore The Corpse",
		// Color.CYAN, new Action() {
		//
		// public void act() {
		//
		// }
		//
		// });
		// corpse3 = new Button(400, 250, 100, 100, "Call Out", Color.CYAN, new
		// Action() {
		//
		// public void act() {
		//
		// }
		//
		// });
		// cave1 = new Button(400, 250, 100, 100, "Go Into Cave And Rest",
		// Color.CYAN, new Action() {
		//
		// public void act() {
		//
		// }
		//
		// });
		// cave2 = new Button(400, 250, 100, 100, "Ignore The Cave", Color.CYAN,
		// new Action() {
		//
		// public void act() {
		//
		// }
		//
		// });
		// cave3 = new Button(400, 250, 100, 100, "Call Out", Color.CYAN, new
		// Action() {
		//
		// public void act() {
		//
		// }
		//
		// });
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
									addObject(option1);
									addObject(option2);
									addObject(option3);
									while (turnCounter < 51) {
										String chosenEvent = chooseEvent();
										text.setText(chosenEvent);
										if (text.getText().contains(events[0])) {
											option1.setText("Fight Back");
											option1.setAction(new Action() {

												public void act() {

												}

											});
											option2.setText("Run Away");
											option2.setAction(new Action() {

												public void act() {

												}

											});
											option3.setText("Play Dead");
											option3.setAction(new Action() {

												public void act() {

												}

											});
										}
										if (text.getText().contains(events[1])) {
											option1.setText("Fight Back");
											option1.setAction(new Action() {

												public void act() {

												}

											});
											option2.setText("Run Away");
											option2.setAction(new Action() {

												public void act() {

												}

											});
											option3.setText("Play Dead");
											option3.setAction(new Action() {

												public void act() {

												}

											});
										}
										if (text.getText().contains(events[2])) {
											option1.setText("Fight Back");
											option1.setAction(new Action() {

												public void act() {

												}

											});
											option2.setText("Run Away");
											option2.setAction(new Action() {

												public void act() {

												}

											});
											option3.setText("Play Dead");
											option3.setAction(new Action() {

												public void act() {

												}

											});
										}
										if (text.getText().contains(events[3])) {
											option1.setText("Fight Back");
											option1.setAction(new Action() {

												public void act() {

												}

											});
											option2.setText("Run Away");
											option2.setAction(new Action() {

												public void act() {

												}

											});
											option3.setText("Play Dead");
											option3.setAction(new Action() {

												public void act() {

												}

											});
										}
										if (text.getText().contains(events[4])) {
											option1.setText("Fight Back");
											option1.setAction(new Action() {

												public void act() {

												}

											});
											option2.setText("Run Away");
											option2.setAction(new Action() {

												public void act() {

												}

											});
											option3.setText("Play Dead");
											option3.setAction(new Action() {

												public void act() {

												}

											});
										}
										if (text.getText().contains(events[5])) {
											option1.setText("Fight Back");
											option1.setAction(new Action() {

												public void act() {

												}

											});
											option2.setText("Run Away");
											option2.setAction(new Action() {

												public void act() {

												}

											});
											option3.setText("Play Dead");
											option3.setAction(new Action() {

												public void act() {

												}

											});
										}
										if (text.getText().contains(events[6])) {
											option1.setText("Fight Back");
											option1.setAction(new Action() {

												public void act() {

												}

											});
											option2.setText("Run Away");
											option2.setAction(new Action() {

												public void act() {

												}

											});
											option3.setText("Play Dead");
											option3.setAction(new Action() {

												public void act() {

												}

											});
										}
										if (text.getText().contains(events[7])) {
											option1.setText("Fight Back");
											option1.setAction(new Action() {

												public void act() {

												}

											});
											option2.setText("Run Away");
											option2.setAction(new Action() {

												public void act() {

												}

											});
											option3.setText("Play Dead");
											option3.setAction(new Action() {

												public void act() {

												}

											});
										}
										if (text.getText().contains(events[8])) {
											option1.setText("Fight Back");
											option1.setAction(new Action() {

												public void act() {

												}

											});
											option2.setText("Run Away");
											option2.setAction(new Action() {

												public void act() {

												}

											});
											option3.setText("Play Dead");
											option3.setAction(new Action() {

												public void act() {

												}

											});
										}
										if (text.getText().contains(events[9])) {
											option1.setText("Fight Back");
											option1.setAction(new Action() {

												public void act() {

												}

											});
											option2.setText("Run Away");
											option2.setAction(new Action() {

												public void act() {

												}

											});
											option3.setText("Play Dead");
											option3.setAction(new Action() {

												public void act() {

												}

											});
										}
									}
									remove(defaultButton);
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
