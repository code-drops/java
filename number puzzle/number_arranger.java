/* It implements simple number arranger game of 4*4 matrix */

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;

class number implements ActionListener{
    Frame f;
    Button[] b = new Button[16];
    String label="";
    ArrayList<Integer> array= new ArrayList<Integer>();
    number(){
        // Frame definition
        f= new Frame();
        f.setVisible(true);
        f.setSize(400,400);
        f.setLocation(300,300);
        f.setLayout(new GridLayout(4,4));
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        add_button();
    }
    void add_button(){
        // Creating array of integers
        for(int i=1;i<=15;i++){
            array.add(i);
        }
        // Shuffle array and assigning values to buttons
        Collections.shuffle(array);
        for(int i=0;i<15;i++){
            b[i] = new Button(String.valueOf(array.get(i)));
            b[i].setBackground(Color.lightGray);
            b[i].addActionListener(this);
            f.add(b[i]);
        }
        // blank button
        b[15] = new Button("");
        b[15].setBackground(Color.BLACK);
        b[15].addActionListener(this);
        f.add(b[15]);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b[0]){
            label = b[0].getLabel();
            if(b[1].getLabel().equals("")){
                b[0].setLabel("");
                b[0].setBackground(Color.BLACK);
                b[1].setLabel(label);
                b[1].setBackground(Color.lightGray);
            }
            if(b[4].getLabel().equals("")){
                b[0].setLabel("");
                b[0].setBackground(Color.BLACK);
                b[4].setLabel(label);
                b[4].setBackground(Color.lightGray);
            }
        }
        if(e.getSource()==b[1]){
            label = b[1].getLabel();
            if(b[0].getLabel().equals("")){
                b[1].setLabel("");
                b[1].setBackground(Color.BLACK);
                b[0].setLabel(label);
                b[0].setBackground(Color.lightGray);
            }
            if(b[2].getLabel().equals("")){
                b[1].setLabel("");
                b[1].setBackground(Color.BLACK);
                b[2].setLabel(label);
                b[2].setBackground(Color.lightGray);
            }
            if(b[5].getLabel().equals("")){
                b[1].setLabel("");
                b[1].setBackground(Color.BLACK);
                b[5].setLabel(label);
                b[5].setBackground(Color.lightGray);
            }
        }
        if(e.getSource()==b[2]){
            label = b[2].getLabel();
            if(b[1].getLabel().equals("")){
                b[2].setLabel("");
                b[2].setBackground(Color.BLACK);
                b[1].setLabel(label);
                b[1].setBackground(Color.lightGray);
            }
            if(b[3].getLabel().equals("")){
                b[2].setLabel("");
                b[2].setBackground(Color.BLACK);
                b[3].setLabel(label);
                b[3].setBackground(Color.lightGray);
            }
            if(b[6].getLabel().equals("")){
                b[2].setLabel("");
                b[2].setBackground(Color.BLACK);
                b[6].setLabel(label);
                b[6].setBackground(Color.lightGray);
            }
        }
        if(e.getSource()==b[3]){
            label = b[3].getLabel();
            if(b[2].getLabel().equals("")){
                b[3].setLabel("");
                b[3].setBackground(Color.BLACK);
                b[2].setLabel(label);
                b[2].setBackground(Color.lightGray);
            }
            if(b[7].getLabel().equals("")){
                b[3].setLabel("");
                b[3].setBackground(Color.BLACK);
                b[7].setLabel(label);
                b[7].setBackground(Color.lightGray);
            }
        }
        if(e.getSource()==b[4]){
            label = b[4].getLabel();
            if(b[0].getLabel().equals("")){
                b[4].setLabel("");
                b[4].setBackground(Color.BLACK);
                b[0].setLabel(label);
                b[0].setBackground(Color.lightGray);
            }
            if(b[5].getLabel().equals("")){
                b[4].setLabel("");
                b[4].setBackground(Color.BLACK);
                b[5].setLabel(label);
                b[5].setBackground(Color.lightGray);
            }
            if(b[8].getLabel().equals("")){
                b[4].setLabel("");
                b[4].setBackground(Color.BLACK);
                b[8].setLabel(label);
                b[8].setBackground(Color.lightGray);
            }
        }
        if(e.getSource()==b[5]){
            label = b[5].getLabel();
            if(b[1].getLabel().equals("")){
                b[5].setLabel("");
                b[5].setBackground(Color.BLACK);
                b[1].setLabel(label);
                b[1].setBackground(Color.lightGray);
            }
            if(b[4].getLabel().equals("")){
                b[5].setLabel("");
                b[5].setBackground(Color.BLACK);
                b[4].setLabel(label);
                b[4].setBackground(Color.lightGray);
            }
            if(b[6].getLabel().equals("")){
                b[5].setLabel("");
                b[5].setBackground(Color.BLACK);
                b[6].setLabel(label);
                b[6].setBackground(Color.lightGray);
            }
            if(b[9].getLabel().equals("")){
                b[5].setLabel("");
                b[5].setBackground(Color.BLACK);
                b[9].setLabel(label);
                b[9].setBackground(Color.lightGray);
            }
        }
        if(e.getSource()==b[6]){
            label = b[6].getLabel();
            if(b[2].getLabel().equals("")){
                b[6].setLabel("");
                b[6].setBackground(Color.BLACK);
                b[2].setLabel(label);
                b[2].setBackground(Color.lightGray);
            }
            if(b[5].getLabel().equals("")){
                b[6].setLabel("");
                b[6].setBackground(Color.BLACK);
                b[5].setLabel(label);
                b[5].setBackground(Color.lightGray);
            }
            if(b[7].getLabel().equals("")){
                b[6].setLabel("");
                b[6].setBackground(Color.BLACK);
                b[7].setLabel(label);
                b[7].setBackground(Color.lightGray);
            }
            if(b[10].getLabel().equals("")){
                b[6].setLabel("");
                b[6].setBackground(Color.BLACK);
                b[10].setLabel(label);
                b[10].setBackground(Color.lightGray);
            }
        }
        if(e.getSource()==b[7]){
            label = b[7].getLabel();
            if(b[3].getLabel().equals("")){
                b[7].setLabel("");
                b[7].setBackground(Color.BLACK);
                b[3].setLabel(label);
                b[3].setBackground(Color.lightGray);
            }
            if(b[6].getLabel().equals("")){
                b[7].setLabel("");
                b[7].setBackground(Color.BLACK);
                b[6].setLabel(label);
                b[6].setBackground(Color.lightGray);
            }
            if(b[11].getLabel().equals("")){
                b[7].setLabel("");
                b[7].setBackground(Color.BLACK);
                b[11].setLabel(label);
                b[11].setBackground(Color.lightGray);
            }
        }
        if(e.getSource()==b[8]){
            label = b[8].getLabel();
            if(b[4].getLabel().equals("")){
                b[8].setLabel("");
                b[8].setBackground(Color.BLACK);
                b[4].setLabel(label);
                b[4].setBackground(Color.lightGray);
            }
            if(b[9].getLabel().equals("")){
                b[8].setLabel("");
                b[8].setBackground(Color.BLACK);
                b[9].setLabel(label);
                b[9].setBackground(Color.lightGray);
            }
            if(b[12].getLabel().equals("")) {
                b[8].setLabel("");
                b[8].setBackground(Color.BLACK);
                b[12].setLabel(label);
                b[12].setBackground(Color.lightGray);
            }
        }
        if(e.getSource()==b[9]){
            label = b[9].getLabel();
            if(b[5].getLabel().equals("")){
                b[9].setLabel("");
                b[9].setBackground(Color.BLACK);
                b[5].setLabel(label);
                b[5].setBackground(Color.lightGray);
            }
            if(b[8].getLabel().equals("")){
                b[9].setLabel("");
                b[9].setBackground(Color.BLACK);
                b[8].setLabel(label);
                b[8].setBackground(Color.lightGray);
            }
            if(b[10].getLabel().equals("")){
                b[9].setLabel("");
                b[9].setBackground(Color.BLACK);
                b[10].setLabel(label);
                b[10].setBackground(Color.lightGray);
            }
            if(b[13].getLabel().equals("")){
                b[9].setLabel("");
                b[9].setBackground(Color.BLACK);
                b[13].setLabel(label);
                b[13].setBackground(Color.lightGray);
            }
        }
        if(e.getSource()==b[10]){
            label = b[10].getLabel();
            if(b[6].getLabel().equals("")){
                b[10].setLabel("");
                b[10].setBackground(Color.BLACK);
                b[6].setLabel(label);
                b[6].setBackground(Color.lightGray);
            }
            if(b[9].getLabel().equals("")){
                b[10].setLabel("");
                b[10].setBackground(Color.BLACK);
                b[9].setLabel(label);
                b[9].setBackground(Color.lightGray);
            }
            if(b[11].getLabel().equals("")){
                b[10].setLabel("");
                b[10].setBackground(Color.BLACK);
                b[11].setLabel(label);
                b[11].setBackground(Color.lightGray);
            }
            if(b[14].getLabel().equals("")){
                b[10].setLabel("");
                b[10].setBackground(Color.BLACK);
                b[14].setLabel(label);
                b[14].setBackground(Color.lightGray);
            }
        }
        if(e.getSource()==b[11]){
            label = b[11].getLabel();
            if(b[7].getLabel().equals("")){
                b[11].setLabel("");
                b[11].setBackground(Color.BLACK);
                b[7].setLabel(label);
                b[7].setBackground(Color.lightGray);
            }
            if(b[10].getLabel().equals("")){
                b[11].setLabel("");
                b[11].setBackground(Color.BLACK);
                b[10].setLabel(label);
                b[10].setBackground(Color.lightGray);
            }
            if(b[15].getLabel().equals("")){
                b[11].setLabel("");
                b[11].setBackground(Color.BLACK);
                b[15].setLabel(label);
                b[15].setBackground(Color.lightGray);
            }
        }
        if(e.getSource()==b[12]){
            label = b[12].getLabel();
            if(b[8].getLabel().equals("")){
                b[12].setLabel("");
                b[12].setBackground(Color.BLACK);
                b[8].setLabel(label);
                b[8].setBackground(Color.lightGray);
            }
            if(b[13].getLabel().equals("")){
                b[12].setLabel("");
                b[12].setBackground(Color.BLACK);
                b[13].setLabel(label);
                b[13].setBackground(Color.lightGray);
            }
        }
        if(e.getSource()==b[13]){
            label = b[13].getLabel();
            if(b[12].getLabel().equals("")){
                b[13].setLabel("");
                b[13].setBackground(Color.BLACK);
                b[12].setLabel(label);
                b[12].setBackground(Color.lightGray);
            }
            if(b[9].getLabel().equals("")){
                b[13].setLabel("");
                b[13].setBackground(Color.BLACK);
                b[9].setLabel(label);
                b[9].setBackground(Color.lightGray);
            }
            if(b[14].getLabel().equals("")){
                b[13].setLabel("");
                b[13].setBackground(Color.BLACK);
                b[14].setLabel(label);
                b[14].setBackground(Color.lightGray);
            }
        }
        if(e.getSource()==b[14]){
            label = b[14].getLabel();
            if(b[10].getLabel().equals("")){
                b[14].setLabel("");
                b[14].setBackground(Color.BLACK);
                b[10].setLabel(label);
                b[10].setBackground(Color.lightGray);
            }
            if(b[13].getLabel().equals("")){
                b[14].setLabel("");
                b[14].setBackground(Color.BLACK);
                b[13].setLabel(label);
                b[13].setBackground(Color.lightGray);
            }
            if(b[15].getLabel().equals("")){
                b[14].setLabel("");
                b[14].setBackground(Color.BLACK);
                b[15].setLabel(label);
                b[15].setBackground(Color.lightGray);
            }
        }
        if(e.getSource()==b[15]){
            label = b[15].getLabel();
            if(b[11].getLabel().equals("")){
                b[15].setLabel("");
                b[15].setBackground(Color.BLACK);
                b[11].setLabel(label);
                b[11].setBackground(Color.lightGray);
            }
            if(b[14].getLabel().equals("")){
                b[15].setLabel("");
                b[15].setBackground(Color.BLACK);
                b[14].setLabel(label);
                b[14].setBackground(Color.lightGray);
            }
        }
        if(b[0].getLabel().equals("1") && b[1].getLabel().equals("2") && b[2].getLabel().equals("3") && b[3].getLabel().equals("4") && b[4].getLabel().equals("5") && b[5].getLabel().equals("6") && b[6].getLabel().equals("7") && b[7].getLabel().equals("8") && b[8].getLabel().equals("9") && b[9].getLabel().equals("10") && b[10].getLabel().equals("11") && b[11].getLabel().equals("12") && b[12].getLabel().equals("13") && b[13].getLabel().equals("14") && b[14].getLabel().equals("15") && b[15].getLabel().equals("") ){
            Dialog dg = new Dialog(f,"",false);
            dg.setVisible(true);
            dg.setBounds(100,100,200,200);
            dg.setLayout(null);
            dg.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    dg.setVisible(false);
                }
            });
            Label warning = new Label("Game Over");
            warning.setBounds(45,50,150,20);
            Button ok = new Button("OK");
            dg.add(ok);
            ok.setBounds(70,100,50,50);
            ok.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    dg.setVisible(false);
                }
            });
            dg.add(warning);
        }
    }
}
public class number_arranger {
    public static void main(String[] a){
        new number();
    }
}
