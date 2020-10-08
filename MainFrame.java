import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends Frame{
    private Button btnexit = new Button("exit"); 
    private Button btnadd = new Button("add");
    private Button btnsub = new Button("sub"); 
    private JLabel jlb1 = new JLabel("0");
    int a = 0;

    public MainFrame(){
        init();
    }
    private void init(){
        this.setLayout(null);
        this.setLocation(500,300);
        this.setSize(500,500);
        this.setTitle(Integer.toString(a));
        this.add(jlb1);
        jlb1.setBounds(400,50,100,50);

        btnexit.setLocation(400,350);
        btnexit.setSize(50,30);
        this.add(btnexit);
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            } 
        });
        
        this.add(btnadd);
        btnadd.setBounds(400,250,50,30);
        btnadd.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                a+=1;
                fun1(a);
            }
        });

        this.add(btnsub);
        btnsub.setBounds(400,150,50,30);
        btnsub.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                a-=1;
                fun1(a);
            }
        });
        }
        private void fun1(int a){
            this.setTitle(Integer.toString(a));
            jlb1.setText(Integer.toString(a));
        }
    }
    
