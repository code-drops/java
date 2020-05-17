/* It implements 3 scrollbars RGB which changes the color of the textbox on the basis of RGB */

import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class scroll extends Frame implements ActionListener,AdjustmentListener{
    Frame f;
    TextField t1;
    Scrollbar s1,s2,s3;
    Button b1,b2;
    Label l1,l2,l3;
    int r=0,g=0,b=0;
    scroll(){
        f = new Frame();
        f.setSize(1000,700);
        f.setTitle("Color");
        f.setLocation(10,10);
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
    void add_textfield(){
        t1 = new TextField();
        t1.setBounds(150,50,255,70);
        f.add(t1);
    }
    void add_scrollbar(){
        s1 = new Scrollbar(Scrollbar.HORIZONTAL);
        s1.setBounds(150,150,255,80);
        s1.addAdjustmentListener(this);
        s1.setMaximum(255);
        f.add(s1);
        s2 = new Scrollbar(Scrollbar.HORIZONTAL);
        s2.setBounds(150,250,255,80);
        s2.addAdjustmentListener(this);
        s2.setMaximum(255);
        f.add(s2);
        s3 = new Scrollbar(Scrollbar.HORIZONTAL);
        s3.setBounds(150,350,255,80);
        s3.addAdjustmentListener(this);
        s3.setMaximum(255);
        f.add(s3);
    }
    void add_button(){
        b1= new Button("Clear");
        b2 = new Button("Exit");

        b1.setBounds(450,70,100,40);
        b2.setBounds(450,120,100,40);

        f.add(b1);
        f.add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    void add_label(){
        l1 = new Label("Red");
        l2 = new Label("Green");
        l3 = new Label("Blue");

        l1.setBounds(50,170,50,50);
        l2.setBounds(50,270,50,50);
        l3.setBounds(50,370,50,50);
        f.add(l1);
        f.add(l2);
        f.add(l3);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            s1.setValue(0);
            s2.setValue(0);
            s3.setValue(0);
        }
        if(e.getSource()==b2){
            System.exit(1);
        }
    }
    public void adjustmentValueChanged(AdjustmentEvent e){
        if(e.getSource()==s1){
            r = e.getValue();
        }
        if(e.getSource()==s2){
            g = e.getValue();
        }
        if(e.getSource()==s3){
            b = e.getValue();
        }
        Color c = new Color(r,g,b);
        t1.setBackground(c);
    }
}
class color_scroll{
    public static void main(String[] args){
        scroll p = new scroll();
        p.add_textfield();
        p.add_scrollbar();
        p.add_button();
        p.add_label();
    }
}
