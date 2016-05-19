import java.awt.BorderLayout;

import javax.swing.JFrame;


public class Window extends JFrame
{
	Button but = new Button();
	Panel pan = new Panel();
	
	public Window(){
		this.setTitle("Memory Game");
		this.setSize(400,500);	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setContentPane(pan);

		this.setLayout(new BorderLayout());
		
		
		pan.add(but,BorderLayout.CENTER);
		
		
		
		this.setVisible(true);
		
	}
}
