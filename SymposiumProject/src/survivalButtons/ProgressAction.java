package survivalButtons;

import survivalAdventureGame.GameScreen;

public class ProgressAction {

	private Boolean tool1;
	private Boolean tool2;

	public ProgressAction(GameScreen target, Boolean tool1, Boolean tool2, int healthChange, boolean health, int progressChange) {
		if (tool1 != null) {
			this.tool1 = tool1;
		} else {
			this.tool1 = true;
		}

		if (tool2 != null) {
			this.tool2 = tool2;
		} else {
			this.tool2 = true;
		}

		if(health){
			if (this.tool1 && this.tool2) {
				target.setHealth(target.getHealth() + healthChange);
				if (target.getHealth() < 0) {
					target.setHealth(0);
				}
				target.setProgress(target.getProgress() + progressChange);
				if (target.getProgress() < 0) {
					target.setProgress(0);
				}
			} else if (tool1 != null && this.tool1 || tool2 != null && this.tool2) {
				target.setHealth(target.getHealth() + healthChange / 2);
				if (target.getHealth() < 0) {
					target.setHealth(0);
				}
				target.setProgress(target.getProgress() + progressChange / 2);
				if (target.getProgress() < 0) {
					target.setProgress(0);
				}
			} else {
				target.setHealth(target.getHealth() + healthChange / 3);
				if (target.getHealth() < 0) {
					target.setHealth(0);
				}
				target.setProgress(target.getProgress() + progressChange / 3);
				if (target.getProgress() < 0) {
					target.setProgress(0);
				}
			}
		} else {
			if (this.tool1 && this.tool2) {
				target.setHealth(target.getHealth() - healthChange / 3);
				if (target.getHealth() < 0) {
					target.setHealth(0);
				}
				target.setProgress(target.getProgress() + progressChange);
				if (target.getProgress() < 0) {
					target.setProgress(0);
				}
			} else if (tool1 != null && this.tool1 || tool2 != null && this.tool2) {
				target.setHealth(target.getHealth() - healthChange / 2);
				if (target.getHealth() < 0) {
					target.setHealth(0);
				}
				target.setProgress(target.getProgress() + progressChange / 2);
				if (target.getProgress() < 0) {
					target.setProgress(0);
				}
			} else {
				target.setHealth(target.getHealth() - healthChange);
				if (target.getHealth() < 0) {
					target.setHealth(0);
				}
				target.setProgress(target.getProgress() + progressChange / 3);
				if (target.getProgress() < 0) {
					target.setProgress(0);
				}
			}
		}

	}

}
