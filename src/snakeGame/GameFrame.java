package snakeGame;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GameFrame extends JFrame {
	GameFrame(){
		
		this.add(new GamePanel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
		ImageIcon image = new ImageIcon("C:\\Users\\UserPC\\Desktop\\eclipse\\Snake Game\\snake.png");
		this.setIconImage(image.getImage());
	}
}
