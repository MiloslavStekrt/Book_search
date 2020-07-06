import javax.swing.*;

public class BookInfo {
    private JTextPane discription;
    private JLabel bookName;
    private JLabel author;
    private JLabel genre;
    private JPanel mainPane;
    public BookInfo(int id){
        JFrame w = new JFrame();
        w.setContentPane(mainPane);
        w.pack();
        w.setSize(800,800);
        w.setVisible(true);
        w.setLocationRelativeTo(null);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
