import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class tic_tac_toe implements ActionListener{
    JFrame playFrame;
    JPanel scorePanel,playPanel;
    JLabel player1,player2,p1Score,p2Score,logo;
    JButton clear,exit;
    JButton[][] b;
    char turn;
    int count = 0;
    Font font = new Font("Arial", Font.BOLD, 50);
    tic_tac_toe(){
        addFrame();
        turn = 'X';
        addPanel();
        addButton();
    }
    void addFrame(){
        playFrame = new JFrame();
        playFrame.setVisible(true);
        playFrame.setSize(420,650);
        playFrame.setLocation(50,50);
        playFrame.setLayout(null);
        playFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    void addPanel(){
        scorePanel = new JPanel();
        scorePanel.setBounds(0,0,400,200);
        scorePanel.setLayout(null);
        scorePanel.setVisible(true);
        playFrame.add(scorePanel);
        player1 = new JLabel("Player 1");
        player1.setFont(new Font("Arial",Font.BOLD,20));
        player1.setBounds(50,70,100,50);
        scorePanel.add(player1);
        player2 = new JLabel("Player 2");
        player2.setBounds(250,70,100,50);
        player2.setFont(new Font("Arial",Font.BOLD,20));
        scorePanel.add(player2);

        p1Score = new JLabel("0");
        p1Score.setFont(new Font("Arial",Font.BOLD,20));
        p1Score.setBounds(80,110,100,50);
        scorePanel.add(p1Score);
        p2Score = new JLabel("0");
        p2Score.setBounds(280,110,100,50);
        p2Score.setFont(new Font("Arial",Font.BOLD,20));
        scorePanel.add(p2Score);
        clear = new JButton("Clear");
        clear.setBounds(0,0,100,50);
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p1Score.setText("0");
                p2Score.setText("0");
            }
        });
        scorePanel.setBackground(Color.cyan);
        scorePanel.add(clear);
        logo = new JLabel("Tic Tac Toe");
        logo.setBounds(130,0,220,50);
        logo.setFont(new Font("Arial",Font.BOLD,25));
        scorePanel.add(logo);
        exit= new JButton("Exit");
        exit.setBounds(300,0,100,50);
        scorePanel.add(exit);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.exit(0);
            }
        });

        playPanel = new JPanel();
        playPanel.setBounds(0,200,400,400);
        playPanel.setLayout(new GridLayout(3,3));
        playPanel.setVisible(true);
        playFrame.add(playPanel);
    }
    void addButton() {
        b = new JButton[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                b[i][j] = new JButton("");
                b[i][j].addActionListener(this);
                b[i][j].setFont(font);
                playPanel.add(b[i][j]);
            }
        }
    }
    void win(char turn){
        JDialog dg = new JDialog(playFrame,"Match over",false);
        dg.setVisible(true);
        dg.setBounds(150,400,200,200);
        dg.setLayout(null);
        dg.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dg.setVisible(false);
            }
        });
        JLabel warning = new JLabel(String.valueOf(turn) +" wins");
        dg.add(warning);
        warning.setBounds(45,50,150,20);
        JButton ok = new JButton("ok");
        dg.add(ok);
        ok.setBounds(70,100,50,50);
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count = 0;
                if(turn=='X'){
                    p1Score.setText(String.valueOf(Integer.valueOf(p1Score.getText())+1));
                }else{
                    p2Score.setText(String.valueOf(Integer.valueOf(p2Score.getText())+1));
                }
                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        b[i][j].setText("");
                        b[i][j].setEnabled(true);
                    }
                }
                dg.setVisible(false);
            }
        });
    }
    void checkForWin(){
        if(count==9){
            JDialog dg = new JDialog(playFrame,"Match over",false);
            dg.setVisible(true);
            dg.setBounds(100,100,200,200);
            dg.setLayout(null);
            dg.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });
            JLabel warning = new JLabel("Draw");
            dg.add(warning);
            warning.setBounds(45,50,150,20);
            JButton ok = new JButton("ok");
            dg.add(ok);
            ok.setBounds(70,100,50,50);
            ok.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    count = 0;
                    for(int i=0;i<3;i++){
                        for(int j=0;j<3;j++){
                            b[i][j].setText("");
                            b[i][j].setEnabled(true);
                        }
                    }
                    dg.setVisible(false);
                }
            });
        }
        // 1st row
        else if(b[0][0].getText().equals(String.valueOf('X')) && b[0][1].getText().equals(String.valueOf('X')) && b[0][2].getText().equals(String.valueOf('X'))){
            win('X');
        }
        else if(b[0][0].getText().equals(String.valueOf('O')) && b[0][1].getText().equals(String.valueOf('O')) && b[0][2].getText().equals(String.valueOf('O'))){
            win('O');
        }

        // 2nd row
        else if(b[1][0].getText().equals(String.valueOf('X')) && b[1][1].getText().equals(String.valueOf('X')) && b[1][2].getText().equals(String.valueOf('X'))){
            win('X');
        }
        else if(b[1][0].getText().equals(String.valueOf('O')) && b[1][1].getText().equals(String.valueOf('O')) && b[1][2].getText().equals(String.valueOf('O'))){
            win('O');
        }

        // 3rd row
        else if(b[2][0].getText().equals(String.valueOf('X')) && b[2][1].getText().equals(String.valueOf('X')) && b[2][2].getText().equals(String.valueOf('X'))){
            win('X');
        }
        else if(b[2][0].getText().equals(String.valueOf('O')) && b[2][1].getText().equals(String.valueOf('O')) && b[2][2].getText().equals(String.valueOf('O'))){
            win('O');
        }

        // 1st column
        else if(b[0][0].getText().equals(String.valueOf('X')) && b[1][0].getText().equals(String.valueOf('X')) && b[2][0].getText().equals(String.valueOf('X'))){
            win('X');
        }
        else if(b[0][0].getText().equals(String.valueOf('O')) && b[1][0].getText().equals(String.valueOf('O')) && b[2][0].getText().equals(String.valueOf('O'))){
            win('O');
        }

        // 2nd column
        else if(b[0][1].getText().equals(String.valueOf('X')) && b[1][1].getText().equals(String.valueOf('X')) && b[2][1].getText().equals(String.valueOf('X'))){
            win('X');
        }
        else if(b[0][1].getText().equals(String.valueOf('O')) && b[1][1].getText().equals(String.valueOf('O')) && b[2][1].getText().equals(String.valueOf('O'))){
            win('O');
        }

        // 3rd column
        else if(b[0][2].getText().equals(String.valueOf('X')) && b[1][2].getText().equals(String.valueOf('X')) && b[2][2].getText().equals(String.valueOf('X'))){
            win('X');
        }
        else if(b[0][2].getText().equals(String.valueOf('O')) && b[1][2].getText().equals(String.valueOf('O')) && b[2][2].getText().equals(String.valueOf('O'))){
            win('O');
        }

        // 1st diagonal
        else if(b[0][0].getText().equals(String.valueOf('X')) && b[1][1].getText().equals(String.valueOf('X')) && b[2][2].getText().equals(String.valueOf('X'))){
            win('X');
        }
        else if(b[0][0].getText().equals(String.valueOf('O')) && b[1][1].getText().equals(String.valueOf('O')) && b[2][2].getText().equals(String.valueOf('O'))){
            win('O');
        }

        // 2nd diagonal
        else if(b[0][2].getText().equals(String.valueOf('X')) && b[1][1].getText().equals(String.valueOf('X')) && b[2][0].getText().equals(String.valueOf('X'))){
            win('X');
        }
        else if(b[0][2].getText().equals(String.valueOf('O')) && b[1][1].getText().equals(String.valueOf('O')) && b[2][0].getText().equals(String.valueOf('O'))){
            win('O');
        }
    }
    char changeTurn(){
        if(turn=='X'){
            return 'O';
        }else{
            return  'X';
        }
    }
    @Override
    public void actionPerformed(ActionEvent e){
        count ++ ;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(e.getSource()==b[i][j]){
                    b[i][j].setText(String.valueOf(turn));
                    b[i][j].setEnabled(false);
                }
            }
        }
        checkForWin();
        turn = changeTurn();
    }
}
public class test{
    public static void main(String[] args){
        new tic_tac_toe();
    }
}
