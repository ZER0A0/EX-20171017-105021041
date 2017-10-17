import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame{
    public LoginFrame(){
        initComp();
    }
    private Container cp;
    private JLabel jlbID = new JLabel("ID:");
    private JLabel jlbPW = new JLabel("Password:");
    private JTextField jtfID = new JTextField();
    private JPasswordField jpf = new JPasswordField();
    private JButton jbtEX = new JButton("Exit");
    private JButton jbtLG = new JButton("Login");
    private Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    int fw = 300 , fh = 150 , sw , sh;
    private void initComp(){
        sw = dim.width;
        sh = dim.height;
        this.setBounds(sw / 2 - fw / 2 ,sh / 2 - fh / 2 - 100 , fw , fh);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp = this.getContentPane();
        cp.setLayout(new GridLayout(3,2,3,3));
        jlbID.setHorizontalAlignment(JLabel.RIGHT);
        jlbPW.setHorizontalAlignment(JLabel.RIGHT);
        cp.add(jlbID);
        cp.add(jtfID);
        cp.add(jlbPW);
        cp.add(jpf);
        cp.add(jbtEX);
        cp.add(jbtLG);
        jbtEX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        jbtLG.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jtfID.getText().equals("h304") && new String(jpf.getPassword()).equals("23323456")){
                    MainFrame MF = new MainFrame();
                    MF.setVisible(true);
                    LoginFrame.this.setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(null,"Error");
                }
            }
        });
    }
}