import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;

public class Book {
    private JTextField name;
    private JComboBox comboBox1;
    private JPanel mainPanel;
    private JButton Cancel;
    private JButton addButton;
    private JTextField author;
    private JTextArea disArea;
    private String[] ComboItem_Array = {"Not selected","Absurdist/surreal/whimsical","Action","Adventure","Comedy","Crime","Drama","Fantasy","Historical","Historical Fiction","Horror","Magical realism","Mystery","Paranoid fiction","Philosophical","Political","Romance","Saga","Satire","Science Fiction","Social","Speculative","Thriller","Urban","Western"};

    public Book(){
        JFrame w = new JFrame();
        w.setContentPane(mainPanel);
        w.pack();
        w.setSize(400,600);
        for (String x : ComboItem_Array) comboBox1.addItem(x);
        w.setVisible(true);
        w.setLocationRelativeTo(null);
        w.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    addBook(name.getText(),author.getText(),disArea.getText(), (String) comboBox1.getSelectedItem());
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
    }
    public static void addBook(String name,String author, String description, String genre) throws IOException {
        FileWriter fw = new FileWriter("Book_db.csv", true);
        fw.append(name+","+author+","+description+","+genre+"\n");
        fw.flush();
        fw.close();
    }
    public static void forName(String className)throws ClassNotFoundException{
        Class.forName("oracle.jdbc.driver.OracleDriver");
    }
}
