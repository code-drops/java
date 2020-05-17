/* It contains a calculator using awt frame with three labels(two inputs and one output) with DMAS operations only*/

import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class cal extends Frame implements ActionListener{
    Frame f;
    Label l1,l2,l3;
    Button b1,b2,b3,b4,b5,b6;
    TextField t1,t2,t3;
    String s1,s2,s3;
    cal(){
        f = new Frame();
        f.setSize(1000,600);
        f.setTitle("Result");
        f.setLocation(100,100);
        f.setLayout(null);
        f.setBackground(Color.lightGray);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    void add_label(){
        l1 = new Label("Enter first number");
        l1.setBounds(150,100,200,50);
        this.f.add(l1);

        l2 = new Label("Enter second number");
        l2.setBounds(150,200,200,50);
        this.f.add(l2);

        l3 = new Label("Result");
        l3.setBounds(150,300,200,50);
        this.f.add(l3);
    }
    void add_button(){
        b1 = new Button("ADD");
        b1.setBounds(150,400,50,50);
        b1.addActionListener(this);
        this.f.add(b1);

        b2 = new Button("SUB");
        b2.setBounds(250,400,50,50);
        b2.addActionListener(this);
        this.f.add(b2);

        b3 = new Button("MUL");
        b3.setBounds(350,400,50,50);
        b3.addActionListener(this);
        this.f.add(b3);

        b4 = new Button("DIV");
        b4.setBounds(450,400,50,50);
        b4.addActionListener(this);
        this.f.add(b4);

        b5 = new Button("CLEAR");
        b5.setBounds(300,500,50,50);
        b5.addActionListener(this);
        this.f.add(b5);

        b6 = new Button("EXIT");
        b6.setBounds(400,500,50,50);
        b6.addActionListener(this);
        this.f.add(b6);
    }
    void text(){
        t1 = new TextField("");
        t1.setBounds(500,100,100,50);
        this.f.add(t1);

        t2 = new TextField("");
        t2.setBounds(500,200,100,50);
        this.f.add(t2);

        t3 = new TextField("");
        t3.setBounds(500,300,100,50);
        this.f.add(t3);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int n;
        if(e.getSource()==b1){
            s1 = t1.getText();
            s2 = t2.getText();
            n = Integer.parseInt(s1)+Integer.parseInt(s2);
            t3.setText(String.valueOf(n));
        }
        if(e.getSource()==b2){
            s1 = t1.getText();
            s2 = t2.getText();
            n = Integer.parseInt(s1)-Integer.parseInt(s2);
            t3.setText(String.valueOf(n));
        }
        if(e.getSource()==b3){
            s1 = t1.getText();
            s2 = t2.getText();
            n = Integer.parseInt(s1)*Integer.parseInt(s2);
            t3.setText(String.valueOf(n));
        }
        if(e.getSource()==b4){
            s1 = t1.getText();
            s2 = t2.getText();
            n = Integer.parseInt(s1)/Integer.parseInt(s2);
            t3.setText(String.valueOf(n));
        }
        if(e.getSource()==b5){
            t1.setText(null);
            t2.setText(null);
            t3.setText(null);
        }
        if(e.getSource()==b6){
            System.exit(1);
        }
    }
}
class test{
    public static void main(String[] args){
        cal p = new cal();
        p.add_label();
        p.add_button();
        p.text();
    }
}
