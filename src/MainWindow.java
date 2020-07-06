import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow {
    private JTextField textField1;
    private JButton addBookButton;
    private JButton removeBookButton;
    private JButton infoButton;
    private JList list1;
    private JPanel mainPanel;

    public MainWindow(){
        JFrame w = new JFrame();
        w.setContentPane(mainPanel);
        w.pack();
        w.setSize(800,800);
        w.setVisible(true);
        w.setLocationRelativeTo(null);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addBookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Book();
            }
        });
        infoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new BookInfo(list1.getSelectedIndex());
            }
        });
    }

    public static void main(String[] args) {
        new MainWindow();
    }
}
