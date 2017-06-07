package survivalButtons;

import java.awt.Color;

import gui.components.Action;
import gui.components.Button;

public class ChoiceButton extends Button {

	public ChoiceButton(int choiceNumber, String text, Action action) {
		super(50+250*choiceNumber, 350, 225, 100, text, Color.CYAN, action);
	}

}
