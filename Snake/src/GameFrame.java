
//*****************************************
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class GameFrame extends JFrame {

	JButton resetButton;
	GamePanel gamePanel;
	
	GameFrame() {
			
		this.add(new GamePanel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
				
		this.setVisible(true);
		this.setLocationRelativeTo(null);

	}
	
	}


