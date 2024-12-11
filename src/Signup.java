import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup implements ActionListener
{
    JFrame frame,f;
    JLabel l1;
    JTextField nameField,addressField,addressField2,age,weightField,heightField;
    JButton signupButton;
    String name,address,address2;
    int ages,weight,height;

    Signup(){
        frame = new JFrame("Sign up page");
        frame.setSize(500,700);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
    }

    public void create_textfield()
    {
        // Create label
        l1 = new JLabel("Name :");

        // Create text fields
        nameField = new JTextField();
        addressField = new JTextField();
        addressField2 = new JTextField();
        age = new JTextField();
        weightField = new JTextField();
        heightField = new JTextField();
        signupButton = new JButton("Sign up");

        // Set bounds for label
        l1.setBounds(100, 40, 100, 30);

        // Set bounds for text fields and button
        nameField.setBounds(100, 80, 280, 40);
        addressField.setBounds(100, 160, 280, 40);
        addressField2.setBounds(100, 240, 280, 40);
        age.setBounds(100, 320, 280, 40);
        heightField.setBounds(100, 400, 280, 40);
        weightField.setBounds(100, 480, 280, 40);
        signupButton.setBounds(180, 560, 100, 40);

        // Add ActionListener to the button
        signupButton.addActionListener(this);

        // Add label to the frame
        frame.add(l1);

        // Add text fields and button to the frame
        frame.add(nameField);
        frame.add(addressField);
        frame.add(age);
        frame.add(addressField2);
        frame.add(weightField);
        frame.add(heightField);
        frame.add(signupButton);
    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == signupButton)
        {
            name = nameField.getText();
            address = addressField.getText();
            address2 = addressField2.getText();
            ages = Integer.parseInt(age.getText());
            weight = Integer.parseInt(weightField.getText());
            height = Integer.parseInt(heightField.getText());

            if (name.length() < 3)
            {
                f=new JFrame();
                JOptionPane.showMessageDialog(f,"Name is too short","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else if (!address.equals(address2))
            {
                f=new JFrame();
                JOptionPane.showMessageDialog(f,"Address1 isn't equal address2","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else if (ages < 18)
            {
                f=new JFrame();
                JOptionPane.showMessageDialog(f,"Age is too short","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else if (height < 100)
            {
                f=new JFrame();
                JOptionPane.showMessageDialog(f,"Height is too short","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else if (weight < 40)
            {
                f=new JFrame();
                JOptionPane.showMessageDialog(f,"Weight is too short","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                f=new JFrame();
                JOptionPane.showMessageDialog(f,"Signup seccessful.");
            }
        }
    }
}
