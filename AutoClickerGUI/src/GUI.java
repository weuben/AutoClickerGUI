import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

/*
    Need to utilise TimerListener: executes automatically at a fixed interval (e.g. every 1000 milliseconds)
    to calculate CPS & update display -> Do I want to display the CPS in a different GUI window?
    

*/
    
    int count = 0;

    private JLabel label;
    private JFrame frame;
    private JPanel panel;

    public GUI() {
        frame = new JFrame();


        JButton button = new JButton("Click");
        button.addActionListener(this);
        label = new JLabel("Number of clicks: 0");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(120, 120, 120, 120));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our AutoClicker.GUI");
        frame.pack();
        frame.setVisible(true);
    }

    static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: " + count);
    }
}
