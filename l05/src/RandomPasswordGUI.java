import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.*;

public class RandomPasswordGUI extends JFrame 
							implements ActionListener{
	
	private JTextArea display;
	private JButton goButton;
	
	public RandomPasswordGUI(String title) {
		
		buildGUI();
		setTitle(title);
		setSize(300, 200);
		pack();
		
	}
	
	private void buildGUI() {
		Container contentPane = getContentPane() ;
		contentPane.setLayout(new BorderLayout());
		
		
		// instantiate all instance variables
		display = new JTextArea(1,20);
  
		goButton = new JButton("generate password");
		
		
		//adding  listeners
		goButton.addActionListener(this);
		
		
		JPanel inputPanel = new JPanel();
		inputPanel.add(new JLabel("Choose password length: ")); 
		
		contentPane.add("North", inputPanel);
		contentPane.add("Center" , display );
		contentPane.add("South" , goButton );
	}
	
	public void run() {
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource() == goButton) {
			//TODO add call back functionality
		} 
		
	}
	

	
	
	
	public static void main(String[] args) {
		
		RandomPasswordGUI app = new RandomPasswordGUI("Generate Random Password");
		app.run();
	}

	

}
