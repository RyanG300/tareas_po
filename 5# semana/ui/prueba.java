package ui;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;


public class prueba extends JFrame {
    private JPanel panel1;
    private JPasswordField passwordField1;
    private JButton validar;
    private JLabel titulos;

    public prueba() {

        setTitle("uwu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setLocationRelativeTo(null);
        setVisible(true);
        setContentPane(panel1);

        validar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Objects.equals(passwordField1.getText(), "pene")){
                    JOptionPane.showMessageDialog(validar,"Hola negro de mierda");
                }
                else{
                    JOptionPane.showMessageDialog(validar,"Fuera negro de mierda");
                }

            }
        });
    }
}
