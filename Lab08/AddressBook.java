//imports all needed items.
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


/**
 * 
 * @author Ethan Gutknecht
 *
 */
public class AddressBook extends JFrame implements ActionListener{
	private JLabel labelName, labelAddress, labelPhone, labelEmail;
	private JTextField textFieldName, textFieldAddress, textFieldPhone, textFieldEmail;
	private JButton buttonAddContact, buttonSaveToFile;
	private JPanel panel;
	private JTextArea textArea;
	
	
	/**
	 * Address book class creates a program that lets you
	 * add contacts to a text box then has the abiltiy to
	 * save it
	 */
	public AddressBook() {
		
		//create labels and text boxes
		labelName = new JLabel("Name:");
		textFieldName = new JTextField(50);
		labelAddress = new JLabel("Address:");
		textFieldAddress = new JTextField(50);
		labelPhone = new JLabel("Phone:");
		textFieldPhone = new JTextField(50);
		labelEmail = new JLabel("Email:");
		textFieldEmail = new JTextField(50);
		
		// create buttons and register to listen to events
		buttonAddContact = new JButton("Add Contact");
		buttonAddContact.addActionListener(this);
		buttonSaveToFile = new JButton("Save to File");
		buttonSaveToFile.addActionListener(this);
		
		JTextArea contactsTextArea = new JTextArea(20, 50);
		textArea = new JTextArea();
		textArea.add(contactsTextArea);
		
		// added components to the panel in correct order
		panel = new JPanel();
		panel.add(labelName);
		panel.add(textFieldName);
		panel.add(labelAddress);
		panel.add(textFieldAddress);
		panel.add(labelPhone);
		panel.add(textFieldPhone);
		panel.add(labelEmail);
		panel.add(textFieldEmail);
		
		panel.add(buttonAddContact);
		panel.add(buttonSaveToFile);
		panel.add(textArea);
		
		// add panel to the JFrame
		add(panel);
		
	}
	
	
	/**
	 * This method overrides and creates functions
	 * for our two butons save and create contact
	 */
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getActionCommand().equals("Add Contact")) {
			textArea.append(textFieldName.getText() + ", " + textFieldAddress.getText() + ", " + 
					textFieldPhone.getText() + ", " + textFieldEmail.getText() + "\n");
			
		}
		else if(event.getActionCommand().equals("Save to File")) {
			writeContactsToFile();
		}
	}
	
	
	/**
	 * When run, this method writes the textArea
	 * to the contacts.txt file.
	 */
	public void writeContactsToFile () {
		PrintWriter fileWriter = null;
		try {
			fileWriter = new PrintWriter("contacts.txt");
			fileWriter.print(textArea.getText());
			fileWriter.close();
		}
		catch(Exception e) {
			System.out.print("Failed to write contacts.");
		}
	}
	
	
	/**
	 * 
	 * Main method, driver for all previous methods.
	 */
	public static void main(String [] args) {
		AddressBook ab = new AddressBook();
		ab.setSize(685	, 550);
		ab.setTitle("Address Book");
		ab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ab.setVisible(true);
	}

	
	
}
