import javax.swing.*;
import java.awt.event.*;

public class StartMenu extends JDialog {
    private JPanel contentPane;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JTextArea textArea3;
    private JLabel Rows;
    private JButton startNewGameButton;

    public StartMenu() {
        setContentPane(contentPane);
        //setModal(true);

        startNewGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    JavaSweeper javaSweeper = new JavaSweeper(Integer.parseInt(textArea1.getText()),
                            Integer.parseInt(textArea2.getText()),
                            Integer.parseInt(textArea3.getText()));
                    dispose();
                }

        });
    }

    public static void main(String[] args) {
        StartMenu dialog = new StartMenu();
        dialog.pack();
        dialog.setVisible(true);
    }
}
