package gui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import gui.components.Visible;

public abstract class Screen {

	private BufferedImage image;
	private ArrayList<Visible> viewObjects;

	public Screen(int width, int height) {
		viewObjects = new ArrayList<Visible>();
		initObjects(viewObjects);
		initImage(width, height);
	}

	public abstract void initObjects(ArrayList<Visible> viewObjects);

	public void initImage(int width, int height) {
		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		update();
	}

	public void update() {
		Graphics2D g = image.createGraphics();
		// smooth the graphics
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.white);
		g.fillRect(0, 0, image.getWidth(), image.getHeight());
		g.setColor(Color.black);
		// for(int i = 0; i < viewObjects.size(); i++){
		//
		// }
		for (int i = 0; i < viewObjects.size(); i++) {
			Visible v = viewObjects.get(i);
			if(v != null){
				g.drawImage(v.getImage(), v.getX(), v.getY(), null);
			}
		}
	}

	public MouseMotionListener getMouseMotionListener() {
		return null;
	}

	public MouseListener getMouseListener() {
		return null;
	}

	public BufferedImage getImage() {
		return image;
	}

	public int getWidth() {
		return image.getWidth();
	}

	public int getHeight() {
		return image.getHeight();
	}

	public void addObject(Visible v) {
		viewObjects.add(v);
	}

	public void remove(Visible v) {
		/**
		 * Note: In this implementation, we have a very simple command:
		 * remove(v) however, remove is sorta a big deal on the AP exam. Here's
		 * why:
		 * 
		 * When an object is removed from a List, every other object AFTER that
		 * object is moved up in order. Therefore, all of their respective
		 * indices change. You MUST, MUST MUST be aware of this.
		 * 
		 * Here is a CLAAAAAASSIC example:
		 * 
		 * The following is WRONG Supose you have a List<Integer> greater than
		 * 5. You do this: for(int i = 0; i < list.size(); i++){ if(list.get(i)
		 * > 5) list .remove(i); } YOU FAAAAAAAIIILLL
		 * 
		 * Why do you fail? i = 0, nothing changes i = 1, the '8' is removed now
		 * we have: {4,7,1}
		 * 
		 * THESE TWO WAYS ARE CORRECT:
		 * 
		 * for(int i = 0; i < list.size(); i++){ while(list.get(i) > 5) list
		 * .remove(i); }
		 * 
		 * for(int i = 0; i < list.size(); i++){ if(list.get(i) > 5){ list
		 * .remove(i); i--; } }
		 * 
		 * for the same reason, this doesn't even work (because the size can be
		 * changed) for(Integer i: list){ if(i > 5) list.remove(i); }
		 * 
		 * ONE MORE NOTE: if you call list.remove(int) it will return the object
		 * being removed at that index So you could use something like this
		 * System.out.println(list.remove(0).toString() + " was removed.");
		 * 
		 */

		viewObjects.remove(v);
	}

	public void moveToBack(Visible v) {
		if (viewObjects.contains(v)) {
			viewObjects.remove(v);
			// the "back" is index 0
			viewObjects.add(0, v);
			// this moves everything else forward in the list
		}
	}

	public void moveToFront(Visible v) {
		if (viewObjects.contains(v)) {
			viewObjects.remove(v);
			viewObjects.add(v);
		}
	}
}
