package pomodorocounter;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author harkken
 */
public class PomodoroCounter extends JFrame implements ActionListener {

    private JButton button;
    private JButton reset;
    //private JPanel panel;
    private JTextField field;
    private int pomodoros;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PomodoroCounter frame = new PomodoroCounter();
        frame.setSize(200, 300);
        frame.createGUI();
        frame.setTitle("Pomodoro Counter! ");
        frame.setVisible(true);

    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

       // panel = new JPanel();
       // panel.setPreferredSize(new Dimension(300, 200));
        //panel.setBackground(Color.white);
        button = new JButton("Add pomodoro");
        field = new JTextField(10);
        reset = new JButton("Reset");
        //window.add(panel);
        window.add(button);
        window.add(field);
        window.add(reset);
        button.addActionListener(this);
        reset.addActionListener(this);
    }
   

    public void actionPerformed(ActionEvent e) {
        
        //Graphics paper = panel.getGraphics();
        
        if (e.getSource() == button) {
            
            pomodoros = pomodoros+1;
            String pomodoroString = Integer.toString(pomodoros);
            field.setText(pomodoroString);
            //paper.drawString(pomodoroString, 10, 10);
            
        }
        if (e.getSource() == reset){
            pomodoros = 0;
            String pomodoroString = Integer.toString(pomodoros);
            field.setText(pomodoroString);
        }
    }

}
