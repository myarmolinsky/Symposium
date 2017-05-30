package survivalButtons;

import java.awt.Color;

import gui.components.Action;
import gui.components.Button;

public class ChoiceButton extends Button {

	public ChoiceButton(int choiceNumber, String text, Action action) {
		super(400+105*choiceNumber, 250, 100, 100, text, Color.CYAN, action);
	}

}
