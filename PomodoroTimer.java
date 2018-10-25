package pomodorotimer;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author harkken
 */
public class PomodoroTimer extends JFrame implements ActionListener {

    private Timer timer;
    private int ticks = 1500;

    private JTextField mins, secs;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PomodoroTimer frame = new PomodoroTimer();
        frame.setSize(200, 300);
        frame.createGUI();
        frame.setTitle("Pomodoro Timer");
        frame.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        timer = new Timer(1000, this);
        timer.start();

        mins = new JTextField(10);
        window.add(mins);

        secs = new JTextField(10);
        window.add(secs);
    }

    public void actionPerformed(ActionEvent event) {
        
        mins.setText(Integer.toString(ticks / 60));
        secs.setText(Integer.toString(ticks % 60));
        ticks = ticks - 1;
        
        
        if (Integer.parseInt(mins.getText()) ==0 ){
            if (Integer.parseInt(secs.getText()) ==0 ){
                JOptionPane.showMessageDialog(null, "Time's up!");
                timer.stop();
            }
        }
    }
}
