/* It implements a calculator using grid layout */

import java.awt.*;
import java.awt.Font.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class grid extends Frame implements ActionListener {
    Frame f;
    Panel p1,p2;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;
    TextField t1;
    String s1,s2;
    double result = 0.0;
    char op;
    grid() {
        f= new Frame();
        f.setBackground(Color.PINK);
        f.setSize(700, 800);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        p1 = new Panel();
        p1.setBounds(10,10,800,100);
        p1.setBackground(Color.CYAN);
        p1.setLayout(null);
        f.add(p1);
        p1.setVisible(true);

        p2 = new Panel();
        p2.setBounds(10,110,800,600);
        p2.setBackground(Color.RED);
        p2.setLayout(new GridLayout(4,5));
        f.add(p2);
        p2.setVisible(true);

        t1= new TextField();
        t1.setFont(new Font("TimesRoman", Font.PLAIN, 30));
        t1.setBounds(30,30,600,50);
        p1.add(t1);

        b1 = new Button("1");
        b1.addActionListener(this);
        p2.add(b1);
        b2 = new Button("2");
        b2.addActionListener(this);
        p2.add(b2);
        b3 = new Button("3");
        b3.addActionListener(this);
        p2.add(b3);
        b4 = new Button("4");
        b4.addActionListener(this);
        p2.add(b4);
        b5 = new Button("5");
        b5.addActionListener(this);
        p2.add(b5);
        b6 = new Button("6");
        b6.addActionListener(this);
        p2.add(b6);
        b7 = new Button("7");
        b7.addActionListener(this);
        p2.add(b7);
        b8 = new Button("8");
        b8.addActionListener(this);
        p2.add(b8);
        b9 = new Button("9");
        b9.addActionListener(this);
        p2.add(b9);
        b10 = new Button("0");
        b10.addActionListener(this);
        p2.add(b10);
        b11 = new Button("00");
        b11.addActionListener(this);
        p2.add(b11);
        b12 = new Button("+");
        b12.addActionListener(this);
        p2.add(b12);
        b13 = new Button("-");
        b13.addActionListener(this);
        p2.add(b13);
        b14 = new Button("*");
        b14.addActionListener(this);
        p2.add(b14);
        b15 = new Button("/");
        b15.addActionListener(this);
        p2.add(b15);
        b16 = new Button(".");
        b16.addActionListener(this);
        p2.add(b16);
        b17 = new Button("=");
        b17.addActionListener(this);
        p2.add(b17);
        b18 = new Button("ON");
        b18.addActionListener(this);
        p2.add(b18);
        b19 = new Button("CLEAR");
        b19.addActionListener(this);
        p2.add(b19);
        b20 = new Button("EXIT");
        b20.addActionListener(this);
        p2.add(b20);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            t1.setText(t1.getText()+"1");
        }
        if(e.getSource()==b2){
            t1.setText(t1.getText()+"2");
        }
        if(e.getSource()==b3){
            t1.setText(t1.getText()+"3");
        }
        if(e.getSource()==b4){
            t1.setText(t1.getText()+"4");
        }
        if(e.getSource()==b5){
            t1.setText(t1.getText()+"5");
        }
        if(e.getSource()==b6){
            t1.setText(t1.getText()+"6");
        }
        if(e.getSource()==b7){
            t1.setText(t1.getText()+"7");
        }
        if(e.getSource()==b8){
            t1.setText(t1.getText()+"8");
        }
        if(e.getSource()==b9){
            t1.setText(t1.getText()+"9");
        }
        if(e.getSource()==b10){
            t1.setText(t1.getText()+"0");
        }
        if(e.getSource()==b11){
            t1.setText(t1.getText()+"00");
        }
        if(e.getSource()==b12){
            s1 = t1.getText();
            t1.setText("");
            op = '+';
        }
        if(e.getSource()==b13){
            s1 = t1.getText();
            t1.setText("");
            op = '-';
        }
        if(e.getSource()==b14){
            s1 = t1.getText();
            t1.setText("");
            op = '*';
        }
        if(e.getSource()==b15){
            s1 = t1.getText();
            t1.setText("");
            op = '/';
        }
        if(e.getSource()==b16){
            t1.setText(t1.getText()+".");
        }
        if(e.getSource()==b17){
            s2 = t1.getText();
            switch (op){
                case '+': result = Double.parseDouble(s1)+Double.parseDouble(s2);
                    t1.setText(String.valueOf(result));
                    break;
                case '-': result = Double.parseDouble(s1)-Double.parseDouble(s2);
                    t1.setText(String.valueOf(result));
                    break;
                case '*': result = Double.parseDouble(s1)*Double.parseDouble(s2);
                    t1.setText(String.valueOf(result));
                    break;
                case '/': try{
                    int p = Integer.parseInt(s2);
                    if(p!=0){
                        result = Double.parseDouble(s1)/Double.parseDouble(s2);
                        t1.setText(String.valueOf(result));
                    }
                    else{
                        t1.setText("infinite");
                        break;
                    }
                }catch(Exception i){}
                    break;
            }
        }
        if(e.getSource()==b18){
        }
        if(e.getSource()==b19){
            t1.setText("");
            result = 0.0;
        }
        if(e.getSource()==b20) {
            System.exit(0);
        }
    }
}
class test{
    public static void main(String a[]){
        new grid();

    }
}
