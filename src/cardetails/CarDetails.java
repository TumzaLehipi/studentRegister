
package cardetails;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class CarDetails extends JFrame
implements ActionListener
{
    
    private JPanel topPanel = new JPanel();
    private JPanel middlePanel = new JPanel();
    private JPanel bottomPanel = new JPanel();
    private JLabel headerLabel = new JLabel("Car Details");
    private JLabel makeModel = new JLabel("Make Model:");
    private JTextField makeModelTextField = new JTextField(20);
    private JLabel yearOfMake = new JLabel ("Year of make:");
    private JTextField yearOfMakeTextField = new JTextField(20);
    private JLabel engineTransmissonType = new JLabel("Engine Transmission Type:");
    private JTextField engineTransmissonTypeTextField = new JTextField(20);
    private JLabel fuelType = new JLabel("Fuel Type:");
    private JTextField fuelTypeTypeTextField = new JTextField(20);
    private JLabel colour = new JLabel("Colour:");
    private JTextField colourTypeTextField = new JTextField(20);
    private JLabel price = new JLabel("Price:");
    private JTextField priceTextField = new JTextField(20);
   
    
    
   
    private JButton saveButton = new JButton("Save");
    private JButton exitButton = new JButton("Exit");
 
    
    public CarDetails()
    {
        this.setTitle("Car Details");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
 
        GridLayout middlePanelLayout = new GridLayout(7,2,5,10);
        middlePanel.setLayout(middlePanelLayout);
        
        middlePanel.add(makeModel);
        makeModel.setHorizontalAlignment(JLabel.CENTER);
        middlePanel.add(makeModelTextField);
        
        middlePanel.add(yearOfMake);
        yearOfMake.setHorizontalAlignment(JLabel.CENTER);
        middlePanel.add(yearOfMakeTextField);
        
        middlePanel.add(engineTransmissonType);
        engineTransmissonType.setHorizontalAlignment(JLabel.CENTER);
        middlePanel.add(engineTransmissonTypeTextField);
        
        middlePanel.add(fuelType);
        fuelType.setHorizontalAlignment(JLabel.CENTER);
        middlePanel.add(fuelTypeTypeTextField);
        
        middlePanel.add(colour);
        colour.setHorizontalAlignment(JLabel.CENTER);
        middlePanel.add(colourTypeTextField);
        
        middlePanel.add(price);
        price.setHorizontalAlignment(JLabel.CENTER);
        middlePanel.add(priceTextField); 
        
        
        bottomPanel.add(saveButton);
        saveButton.addActionListener(this);
        bottomPanel.add(exitButton);
        exitButton.addActionListener(this);
        this.add(topPanel, BorderLayout.NORTH);
        this.add(middlePanel, BorderLayout.CENTER);
        this.add(bottomPanel, BorderLayout.SOUTH);
        
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent evt)
    {
        if(evt.getSource() == saveButton)
        {
           JOptionPane.showMessageDialog(bottomPanel, "Model Make "
           + makeModelTextField.getText() + " \n" + "Year of make:" + 
                yearOfMakeTextField.getText() + "\nEngine Transmission Type:" + 
                engineTransmissonTypeTextField.getText() + "\nFuel Type: " +
                   fuelTypeTypeTextField.getText()+ "\nColour Type: " +
                   colourTypeTextField.getText()+ "\nPrice: "+
                   priceTextField.getText());
        }
        if(evt.getSource() == exitButton)
        {
            System.exit(1);
        }   
    }
  
    public static void main(String[] args) 
    {
        new CarDetails(); 
    }
    
}
