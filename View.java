package jdbcTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class View {

    private JFrame frame;
    private JTextField txtName, txtEmail;
    private JTextArea txtMessage;
    private JButton btnSubmit;

    public View() {
        frame = new JFrame("Student Enquiry Form");
        frame.setSize(400, 400);
        frame.setLayout(null);

        JLabel lblName = new JLabel("Name:");
        lblName.setBounds(50, 50, 100, 30);
        frame.add(lblName);

        txtName = new JTextField();
        txtName.setBounds(150, 50, 200, 30);
        frame.add(txtName);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setBounds(50, 100, 100, 30);
        frame.add(lblEmail);

        txtEmail = new JTextField();
        txtEmail.setBounds(150, 100, 200, 30);
        frame.add(txtEmail);

        JLabel lblMessage = new JLabel("Message:");
        lblMessage.setBounds(50, 150, 100, 30);
        frame.add(lblMessage);

        txtMessage = new JTextArea();
        txtMessage.setBounds(150, 150, 200, 100);
        frame.add(txtMessage);

        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(150, 270, 100, 30);
        frame.add(btnSubmit);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public String getName() {
        return txtName.getText();
    }

    public String getEmail() {
        return txtEmail.getText();
    }

    public String getMessage() {
        return txtMessage.getText();
    }

    public void setSubmitActionListener(ActionListener actionListener) {
        btnSubmit.addActionListener(actionListener);
    }

    public JFrame getFrame() {
        return frame;
    }
}
