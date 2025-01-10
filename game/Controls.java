package game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controls implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {}
	public void keyReleased(KeyEvent e) {}
	public void keyPressed(KeyEvent e) {
		
		int keyCode = e.getKeyCode();

		switch (keyCode) {
			case KeyEvent.VK_UP:
				game.Game.BOARD.moveUp();
				break;
			case KeyEvent.VK_DOWN:
				game.Game.BOARD.moveDown();
				break;
			case KeyEvent.VK_LEFT:
				game.Game.BOARD.moveLeft();
				break;
			case KeyEvent.VK_RIGHT:
				game.Game.BOARD.moveRight();
				break;
			case KeyEvent.VK_ESCAPE:
				Game.WINDOW.dispose();
				break;
			default:
				break;
		}
		
		game.Game.BOARD.isGameOver();
		//Game.BOARD.show();
		Game.WINDOW.repaint();
		
	}

	public void bind() {
		Game.WINDOW.addKeyListener(this);
	}

	public void unbind() {
		Game.WINDOW.removeKeyListener(this);
	}

}
