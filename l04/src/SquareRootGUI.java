import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Code from Fig 4.20 p. 174
 * @author Yves
 *
 */
public class SquareRootGUI extends JFrame 
						implements ActionListener{
	
	private JTextArea display;
	private JTextField inField;
	private JButton goButton;
//	private Greeter greeter;
	
	public SquareRootGUI(String title) {
//		greeter = new Greeter();
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
		goButton = new JButton("Calculate sqrt");
		
		
		//adding action listeners
		goButton.addActionListener(this);
		
		
		JPanel inputPanel = new JPanel();
		inputPanel.add(new JLabel("Input a positive number, e.g 2.0: ")); 
		inputPanel.add( inField );
		
		contentPane.add("North", inputPanel);
		contentPane.add("Center" , display );
		contentPane.add("South" , goButton );
	}
	

	public void actionPerformed(ActionEvent e) {
		
		//TODO implement button callback
		if(e.getSource() == goButton) {
			String name = inField.getText();
			double number = Double.parseDouble(name);
			
			display.setText("Sqare root of "+number+
			        " = " + NewtonSquareRoot.getSquareRoot(number)) ;
		}
		
	}
	
	//TODO add greet method
	
	public static void main(String[] args) {
		
		//TODO change so that GUI has a run() method similar to GreeterApp
		new SquareRootGUI("Square-rooter");
	}

}
