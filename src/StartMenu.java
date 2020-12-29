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
                if (textArea1.getText().length() != 0 && textArea2.getText().length() != 0 && textArea3.getText().length() != 0) {
                    JavaSweeper javaSweeper = new JavaSweeper(Integer.parseInt(textArea1.getText()),
                            Integer.parseInt(textArea2.getText()),
                            Integer.parseInt(textArea3.getText()));
                    dispose();
                } else JOptionPane.showMessageDialog(null, "Введены не все параметры или введены неккоректно!");
            }
        });
    }

    public static void main(String[] args) {
        StartMenu dialog = new StartMenu();
        dialog.pack();
        dialog.setVisible(true);
    }
}
