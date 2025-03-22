
package jdbcTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        
        // Handle submit button click
        view.setSubmitActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = view.getName();
                String email = view.getEmail();
                String message = view.getMessage();
                
                if (model.storeEnquiry(name, email, message)) {
                    JOptionPane.showMessageDialog(view.getFrame(), "Enquiry submitted successfully!");
                } else {
                    JOptionPane.showMessageDialog(view.getFrame(), "Failed to submit enquiry.");
                }
            }
        });
    }
}

