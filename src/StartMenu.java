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


        startNewGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textArea1.getText().length() != 0 && textArea2.getText().length() != 0 && textArea3.getText().length() != 0) {
                    int cols = Integer.parseInt(textArea1.getText());
                    int rows = Integer.parseInt(textArea2.getText());
                    int bombs = Integer.parseInt(textArea3.getText());
                    if (cols > 0 && rows > 0 && bombs > 0) {
                        JavaSweeper javaSweeper = new JavaSweeper(cols, rows, bombs);
                        dispose();
                    } else JOptionPane.showMessageDialog(null, "Введеные параметры неккоректны!");
                } else JOptionPane.showMessageDialog(null, "Введены не все параметры!");
            }
        });
    }

    public static void main(String[] args) {
        StartMenu dialog = new StartMenu();
        dialog.pack();
        dialog.setVisible(true);
    }
}
