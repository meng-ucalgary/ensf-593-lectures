import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Code from Fig 4.20 p. 174
 * @author Yves
 *
 */
public class GreeterGUI extends JFrame 
							implements ActionListener{
	
	private JTextArea display;
	private JTextField inField;
	private JButton goButton;
	
	public GreeterGUI(String title) {
		buildGUI();
		setTitle(title);
		setSize(300, 200);
		pack();
		setVisible(true);
		
	}
	
	private void buildGUI() {
		Container contentPane = getContentPane() ;
		contentPane.setLayout(new BorderLayout());
		
		
		// instantiate all instance variables
		display = new JTextArea(10,30);
		inField = new JTextField(10);
		goButton = new JButton("Click here for a greeting");
		
		
		//adding action listeners
		goButton.addActionListener(this);
		
		
		JPanel inputPanel = new JPanel();
		inputPanel.add(new JLabel("Input your name here: ")); 
		inputPanel.add( inField );
		
		contentPane.add("North", inputPanel);
		contentPane.add("Center" , display );
		contentPane.add("South" , goButton );
	}
	

	public void actionPerformed(ActionEvent e) {
		
		//TODO implement button callback
		
	}
	
	//TODO add greet method
	
	public static void main(String[] args) {
		
		//TODO change so that GUI has a run() method similar to GreeterApp
		new GreeterGUI("Greeter");
	}

}
