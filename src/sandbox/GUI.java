package sandbox;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class GUI {

	private JFrame frame;
	private JTextField inputText;

	// variables 
	ArrayList<String> names = new ArrayList();
	String nameInput = "";
	String nameList = "";
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel titleLabel = new JLabel("Student Records");
		titleLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		titleLabel.setBounds(149, 11, 154, 45);
		frame.getContentPane().add(titleLabel);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setBounds(39, 60, 39, 14);
		frame.getContentPane().add(lblNewLabel);
		
		inputText = new JTextField();
		inputText.setBounds(76, 57, 294, 20);
		frame.getContentPane().add(inputText);
		inputText.setColumns(10);
		
		JTextArea outputArea = new JTextArea();
		outputArea.setBounds(21, 85, 220, 165);
		frame.getContentPane().add(outputArea);
		
		JButton addButton = new JButton("Add");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//addMethod(names, nameList);
				
			}
		});
		addButton.setBounds(310, 88, 60, 23);
		frame.getContentPane().add(addButton);
		
		JButton removeButton = new JButton("Remove");
		removeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//removeMethod(names);
				
			}
		});
		removeButton.setBounds(285, 122, 85, 23);
		frame.getContentPane().add(removeButton);
		
		JButton sortButton = new JButton("Sort");
		sortButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//sortMethod(names);
				
			}
		});
		sortButton.setBounds(310, 154, 60, 23);
		frame.getContentPane().add(sortButton);
		
		JButton listButton = new JButton("List");
		listButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//nameList = listMethod(names);
				
			}
		});
		listButton.setBounds(310, 188, 60, 23);
		frame.getContentPane().add(listButton);
		
		JButton exitButton = new JButton("Exit");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
		});
		exitButton.setBounds(310, 222, 60, 23);
		frame.getContentPane().add(exitButton);
	}
}
