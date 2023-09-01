import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class MainFrame extends JFrame {
    
    final private Font mainfont = new Font("Segoe print", Font.BOLD, 18);
    JTextField tfFirstName, tfLastName;
    JLabel lbWelcome;

    public void  initialize() {
        JLabel lblFirstName = new JLabel("Nombre");
        lblFirstName.setFont(mainfont);

        tfFirstName = new JTextField();
        tfFirstName.setFont(mainfont);

        JLabel lblLastName = new JLabel("Apellido");
        lblLastName.setFont(mainfont);

        tfLastName = new JTextField();
        tfLastName.setFont(mainfont);

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 1,5,5));
        formPanel.setOpaque(false);
        formPanel.add(lblFirstName);
        formPanel.add(tfFirstName);
        formPanel.add(lblLastName);
        formPanel.add(tfLastName);

        lbWelcome = new JLabel();
        lbWelcome.setFont(mainfont);

        JButton btnOK = new JButton("OK");
        btnOK.setFont(mainfont);
        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = tfFirstName.getText();
                String lastName = tfLastName.getText();
                lbWelcome.setText("Bienvenido " + firstName + " " + lastName);
            }
        });

        JButton btnClear = new JButton("Limpiar");
        btnClear.setFont(mainfont);
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfFirstName.setText("");
                tfLastName.setText("");
                lbWelcome.setText("");
            }
        });
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2, 5, 5));
        buttonPanel.setOpaque(false);
        buttonPanel.add(btnOK);
        buttonPanel.add(btnClear);

        JPanel mainpanel = new JPanel();
        mainpanel.setLayout(new BorderLayout());
        mainpanel.setBackground(new Color(128, 128, 255)); 
        mainpanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainpanel.add(formPanel, BorderLayout.CENTER);
        mainpanel.add(lbWelcome, BorderLayout.NORTH);
        mainpanel.add(buttonPanel, BorderLayout.SOUTH);

        add(mainpanel);
        
        
        setTitle("Bienvenido");
        setSize(500, 600);
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);   
    }

    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.initialize();
    }
}