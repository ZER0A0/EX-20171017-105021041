import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    public MainFrame(){
        initComp();
    }
    private Container cp;
    private JButton jbtn[] = new JButton[9];
    private JTextField jtf = new JTextField();
    private JPanel jpn = new JPanel(new GridLayout(3,3));
    private Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    int fw = 300 , fh = 400 , sw , sh;
    private void initComp(){
        sw = dim.width;
        sh = dim.height;
        this.setBounds(sw / 2 - fw / 2 , sh / 2 - fh / 2 - 100 , fw , fh);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp = this.getContentPane();
        jtf.setEditable(false);
        for(int x = 0 ; x < 9 ; x++){
            jbtn[x] = new JButton(Integer.toString(x));
            jpn.add(jbtn[x]);
            jbtn[x].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton jbt = (JButton) e.getSource();
                    jtf.setText(jtf.getText() + jbt.getText());
                }
            });
        }
        cp.add(jtf,BorderLayout.NORTH);
        cp.add(jpn,BorderLayout.CENTER);

    }
}
