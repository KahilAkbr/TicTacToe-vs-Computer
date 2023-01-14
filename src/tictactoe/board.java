/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author LAPTOP
 */
public class board extends javax.swing.JFrame {

    /**
     * Creates new form mainPage
     */
    
    int turn;
    int pTurn;
    int cTurn;
    int pWon [];
    int cWon [];
    int cSkor = 0;
    int pSkor = 0;
    
    
    int seri(){
        if(!"".equals(kotak1.getText()) || !"".equals(kotak2.getText()) || !"".equals(kotak3.getText()) || !"".equals(kotak4.getText()) || !"".equals(kotak5.getText()) || !"".equals(kotak6.getText()) || !"".equals(kotak7.getText()) || !"".equals(kotak8.getText()) || !"".equals(kotak9.getText())){
            if((kotak1.getText()=="X" || kotak2.getText()=="X" || kotak3.getText()=="X") && (kotak4.getText()=="X" || kotak5.getText()=="X" || kotak6.getText()=="X") && 
                    (kotak7.getText()=="X" || kotak8.getText()=="X" || kotak9.getText()=="X") && (kotak1.getText()=="X" || kotak4.getText()=="X" || kotak7.getText()=="X") && 
                    (kotak2.getText()=="X" || kotak5.getText()=="X" || kotak8.getText()=="X") && (kotak3.getText()=="X" || kotak6.getText()=="X" || kotak9.getText()=="X") && 
                    (kotak3.getText()=="X" || kotak5.getText()=="X" || kotak7.getText()=="X") && (kotak1.getText()=="X" || kotak5.getText()=="X" || kotak9.getText()=="X")){
                return 1;
            }
        }
        return 0;
    }
    
    int pWon (){
        if(kotak1.getText()=="X" && kotak2.getText()=="X" && kotak3.getText()=="X"){
            kotak1.setEnabled(true);
            kotak2.setEnabled(true);
            kotak3.setEnabled(true);
            kotak1.setBackground(Color.green);
            kotak2.setBackground(Color.green);
            kotak3.setBackground(Color.green);
            return 1;
        }
        if(kotak4.getText()=="X" && kotak5.getText()=="X" && kotak6.getText()=="X"){
            kotak4.setEnabled(true);
            kotak5.setEnabled(true);
            kotak6.setEnabled(true);
            kotak4.setBackground(Color.green);
            kotak5.setBackground(Color.green);
            kotak6.setBackground(Color.green);
            return 1;
        }
        if(kotak7.getText()=="X" && kotak8.getText()=="X" && kotak9.getText()=="X"){
            kotak7.setEnabled(true);
            kotak8.setEnabled(true);
            kotak9.setEnabled(true);
            kotak7.setBackground(Color.green);
            kotak8.setBackground(Color.green);
            kotak9.setBackground(Color.green);
            return 1;
        }
        if(kotak1.getText()=="X" && kotak4.getText()=="X" && kotak7.getText()=="X"){
            kotak1.setEnabled(true);
            kotak4.setEnabled(true);
            kotak7.setEnabled(true);
            kotak1.setBackground(Color.green);
            kotak4.setBackground(Color.green);
            kotak7.setBackground(Color.green);
            return 1;
        }
        if(kotak2.getText()=="X" && kotak5.getText()=="X" && kotak8.getText()=="X"){
            kotak2.setEnabled(true);
            kotak5.setEnabled(true);
            kotak8.setEnabled(true);
            kotak2.setBackground(Color.green);
            kotak5.setBackground(Color.green);
            kotak8.setBackground(Color.green);
            return 1;
        }
        if(kotak3.getText()=="X" && kotak6.getText()=="X" && kotak9.getText()=="X"){
            kotak3.setEnabled(true);
            kotak6.setEnabled(true);
            kotak9.setEnabled(true);
            kotak3.setBackground(Color.green);
            kotak6.setBackground(Color.green);
            kotak9.setBackground(Color.green);
            return 1;
        }
        if(kotak3.getText()=="X" && kotak5.getText()=="X" && kotak7.getText()=="X"){
            kotak3.setEnabled(true);
            kotak5.setEnabled(true);
            kotak7.setEnabled(true);
            kotak3.setBackground(Color.green);
            kotak5.setBackground(Color.green);
            kotak7.setBackground(Color.green);
            return 1;
        }
        if(kotak1.getText()=="X" && kotak5.getText()=="X" && kotak9.getText()=="X"){
            kotak1.setEnabled(true);
            kotak5.setEnabled(true);
            kotak9.setEnabled(true);
            kotak1.setBackground(Color.green);
            kotak5.setBackground(Color.green);
            kotak9.setBackground(Color.green);
            return 1;
        }
        return 0;
    }
    
    int cWon (){
        if(kotak1.getText()=="O" && kotak2.getText()=="O" && kotak3.getText()=="O"){
            kotak1.setEnabled(true);
            kotak2.setEnabled(true);
            kotak3.setEnabled(true);
            kotak1.setBackground(Color.green);
            kotak2.setBackground(Color.green);
            kotak3.setBackground(Color.green);
            return 1;
        }
        if(kotak4.getText()=="O" && kotak5.getText()=="O" && kotak6.getText()=="O"){
            kotak4.setEnabled(true);
            kotak5.setEnabled(true);
            kotak6.setEnabled(true);
            kotak4.setBackground(Color.green);
            kotak5.setBackground(Color.green);
            kotak6.setBackground(Color.green);
            return 1;
        }
        if(kotak7.getText()=="O" && kotak8.getText()=="O" && kotak9.getText()=="O"){
            kotak7.setEnabled(true);
            kotak8.setEnabled(true);
            kotak9.setEnabled(true);
            kotak7.setBackground(Color.green);
            kotak8.setBackground(Color.green);
            kotak9.setBackground(Color.green);
            return 1;
        }
        if(kotak1.getText()=="O" && kotak4.getText()=="O" && kotak7.getText()=="O"){
            kotak1.setEnabled(true);
            kotak4.setEnabled(true);
            kotak7.setEnabled(true);
            kotak1.setBackground(Color.green);
            kotak4.setBackground(Color.green);
            kotak7.setBackground(Color.green);
            return 1;
        }
        if(kotak2.getText()=="O" && kotak5.getText()=="O" && kotak8.getText()=="O"){
            kotak2.setEnabled(true);
            kotak5.setEnabled(true);
            kotak8.setEnabled(true);
            kotak2.setBackground(Color.green);
            kotak5.setBackground(Color.green);
            kotak8.setBackground(Color.green);
            return 1;
        }
        if(kotak3.getText()=="O" && kotak6.getText()=="O" && kotak9.getText()=="O"){
            kotak3.setEnabled(true);
            kotak6.setEnabled(true);
            kotak9.setEnabled(true);
            kotak3.setBackground(Color.green);
            kotak6.setBackground(Color.green);
            kotak9.setBackground(Color.green);
            return 1;
        }
        if(kotak3.getText()=="O" && kotak5.getText()=="O" && kotak7.getText()=="O"){
            kotak3.setEnabled(true);
            kotak5.setEnabled(true);
            kotak7.setEnabled(true);
            kotak3.setBackground(Color.green);
            kotak5.setBackground(Color.green);
            kotak7.setBackground(Color.green);
            return 1;
        }
        if(kotak1.getText()=="O" && kotak5.getText()=="O" && kotak9.getText()=="O"){
            kotak1.setEnabled(true);
            kotak5.setEnabled(true);
            kotak9.setEnabled(true);
            kotak1.setBackground(Color.green);
            kotak5.setBackground(Color.green);
            kotak9.setBackground(Color.green);
            return 1;
        }
        return 0;
    }

    
    public board() {
        initComponents();
        matikanButton();
    }
    
    public void matikanButton(){
        kotak1.setEnabled(false);
        kotak2.setEnabled(false);
        kotak3.setEnabled(false);
        kotak4.setEnabled(false);
        kotak5.setEnabled(false);
        kotak6.setEnabled(false);
        kotak7.setEnabled(false);
        kotak8.setEnabled(false);
        kotak9.setEnabled(false);
    }
    
    public void nyalakanButton(){
        kotak1.setEnabled(true);
        kotak2.setEnabled(true);
        kotak3.setEnabled(true);
        kotak4.setEnabled(true);
        kotak5.setEnabled(true);
        kotak6.setEnabled(true);
        kotak7.setEnabled(true);
        kotak8.setEnabled(true);
        kotak9.setEnabled(true);
    }

    public void matikanButtonPilih(){
        startBtn.setEnabled(false);
    }
    
    public void nyalakanButtonPilih(){
        startBtn.setEnabled(true);
    }
    
    
    public void ulang(){
        kotak1.setText("");
        kotak2.setText("");
        kotak3.setText("");
        kotak4.setText("");
        kotak5.setText("");
        kotak6.setText("");
        kotak7.setText("");
        kotak8.setText("");
        kotak9.setText("");
    }
    
    public void reset(){
        ulang();
        nyalakanButtonPilih();
        matikanButton();
        turn = 2;
        pTurn = 2;
        cTurn = 3;
    }
    
    public void turnPlus(){
        turn++;
        pTurn++;
        cTurn++;
    }
    
    public void defaultColor(){
        kotak1.setBackground(Color.white);
        kotak2.setBackground(Color.white);
        kotak3.setBackground(Color.white);
        kotak4.setBackground(Color.white);
        kotak5.setBackground(Color.white);
        kotak6.setBackground(Color.white);
        kotak7.setBackground(Color.white);
        kotak8.setBackground(Color.white);
        kotak9.setBackground(Color.white);
    }
    
    public void randomButton(){
        JButton currentButton;
        JButton[] arr = {kotak1,kotak2,kotak3,kotak4,kotak5,kotak6,kotak7,kotak8,kotak9};
        Random r = new Random();
        currentButton = arr [r.nextInt(arr.length)];
        if(currentButton.getText() != ""){
            do{
                currentButton = arr [r.nextInt(arr.length)];
            }while(currentButton.getText() != "");
        }
        if(currentButton.getText()==""){
            currentButton.setText("O");
            currentButton.setForeground(Color.blue);
            currentButton.setEnabled(false);
            turnPlus();
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        exitBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        startBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        sPlayer = new javax.swing.JLabel();
        sComputer = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        kotak1 = new javax.swing.JButton();
        kotak2 = new javax.swing.JButton();
        kotak3 = new javax.swing.JButton();
        kotak6 = new javax.swing.JButton();
        kotak5 = new javax.swing.JButton();
        kotak4 = new javax.swing.JButton();
        kotak7 = new javax.swing.JButton();
        kotak8 = new javax.swing.JButton();
        kotak9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Courier New", 1, 46)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TIC TAC TOE");

        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sprite/icons8_close_window_50px.png"))); // NOI18N
        exitBtn.setContentAreaFilled(false);
        exitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        startBtn.setBackground(new java.awt.Color(0, 0, 0));
        startBtn.setFont(new java.awt.Font("DeVinne Txt BT", 1, 18)); // NOI18N
        startBtn.setForeground(new java.awt.Color(255, 255, 255));
        startBtn.setText("Start");
        startBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        startBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtnActionPerformed(evt);
            }
        });

        resetBtn.setBackground(new java.awt.Color(0, 0, 0));
        resetBtn.setFont(new java.awt.Font("DeVinne Txt BT", 0, 18)); // NOI18N
        resetBtn.setForeground(new java.awt.Color(255, 255, 255));
        resetBtn.setText("Reset");
        resetBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel3.setText("Player      :");

        jLabel4.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel4.setText("Computer :");

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("SKOR");

        sPlayer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sPlayer.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sPlayer.setText("0");

        sComputer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sComputer.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sComputer.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(sComputer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(sComputer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        kotak1.setFont(new java.awt.Font("Century725 Cn BT", 0, 36)); // NOI18N
        kotak1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kotak1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kotak1ActionPerformed(evt);
            }
        });

        kotak2.setFont(new java.awt.Font("Century725 Cn BT", 0, 36)); // NOI18N
        kotak2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kotak2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kotak2ActionPerformed(evt);
            }
        });

        kotak3.setFont(new java.awt.Font("Century725 Cn BT", 0, 36)); // NOI18N
        kotak3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kotak3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kotak3ActionPerformed(evt);
            }
        });

        kotak6.setFont(new java.awt.Font("Century725 Cn BT", 0, 36)); // NOI18N
        kotak6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kotak6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kotak6ActionPerformed(evt);
            }
        });

        kotak5.setFont(new java.awt.Font("Century725 Cn BT", 0, 36)); // NOI18N
        kotak5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kotak5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kotak5ActionPerformed(evt);
            }
        });

        kotak4.setFont(new java.awt.Font("Century725 Cn BT", 0, 36)); // NOI18N
        kotak4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kotak4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kotak4ActionPerformed(evt);
            }
        });

        kotak7.setFont(new java.awt.Font("Century725 Cn BT", 0, 36)); // NOI18N
        kotak7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kotak7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kotak7ActionPerformed(evt);
            }
        });

        kotak8.setFont(new java.awt.Font("Century725 Cn BT", 0, 36)); // NOI18N
        kotak8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kotak8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kotak8ActionPerformed(evt);
            }
        });

        kotak9.setFont(new java.awt.Font("Century725 Cn BT", 0, 36)); // NOI18N
        kotak9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kotak9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kotak9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(kotak4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kotak5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kotak6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(kotak1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kotak2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(kotak3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(kotak7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kotak8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kotak9, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kotak1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kotak2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kotak3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kotak4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kotak5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kotak6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kotak8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kotak7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kotak9, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 55, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(startBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(68, 68, 68))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_resetBtnActionPerformed

    private void startBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBtnActionPerformed
        // TODO add your handling code here:
        Object[] choices = {"Player", "Computer"};
        Object defaultChoice = choices[0];
        int pemain = JOptionPane.showOptionDialog(this,
            "Siapa yang Mulai Duluan?",
            "Pilih Pemain Pertama",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            null,
            choices,
            defaultChoice);
        
        if(pemain == JOptionPane.YES_OPTION){
            defaultColor();
            nyalakanButton();
            turn = 2;
            pTurn = turn;
            cTurn = turn+1;
            matikanButtonPilih();
        }
        if(pemain == JOptionPane.NO_OPTION){
            defaultColor();
            nyalakanButton();
            turn = 3;
            cTurn = turn;
            pTurn = turn -1;
            JButton currentButton;
            JButton[] arr = {kotak1,kotak2,kotak3,kotak4,kotak5,kotak6,kotak7,kotak8,kotak9};
            Random r = new Random();
            currentButton = arr [r.nextInt(arr.length)];
            currentButton.setText("O");
            currentButton.setForeground(Color.blue);
            currentButton.setEnabled(false);
            turnPlus();
            matikanButtonPilih();
        }
    }//GEN-LAST:event_startBtnActionPerformed

    private void kotak9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kotak9ActionPerformed
        // TODO add your handling code here:
        if(turn%2==0){
            turnPlus();
            kotak9.setText("X");
            kotak9.setForeground(Color.red);
            matikanButtonPilih();
            kotak9.setEnabled(false);

            int resultP = pWon();

            if((cTurn<12 || pTurn<10) && resultP!=1){
                randomButton();
            }
        }
        int resultP = pWon();
        int resultC = cWon();
        if(resultP == 1){
            try{
                ImageIcon icon = new ImageIcon("src/sprite/icons8_face_screaming_in_fear_50px.png");
                Image icons = icon.getImage();
                Image modifiedicons = icons.getScaledInstance(70,70,java.awt.Image.SCALE_SMOOTH);
                icon = new ImageIcon(modifiedicons);
                JOptionPane.showMessageDialog(null,"KAMU MENANG :O","Player Win",JOptionPane.INFORMATION_MESSAGE,icon);
                Thread.sleep(400);
            }catch(Exception e){
                
            }
            pSkor++;
            sPlayer.setText(String.valueOf(pSkor));
            reset();
        }else if(resultC == 1){
            try{
                ImageIcon icon = new ImageIcon("src/sprite/icons8_sad_50px.png");
                Image icons = icon.getImage();
                Image modifiedicons = icons.getScaledInstance(70,70,java.awt.Image.SCALE_SMOOTH);
                icon = new ImageIcon(modifiedicons);
                JOptionPane.showMessageDialog(null,"KAMU KALAH :(","Computer Win",JOptionPane.INFORMATION_MESSAGE,icon);
                Thread.sleep(400);
            }catch(Exception e){
                
            }
            cSkor++;
            sComputer.setText(String.valueOf(cSkor));
            reset();
        }
        int draw = seri();
        if((pTurn == 11 || cTurn == 12) && draw == 1){
            try{
                ImageIcon icon = new ImageIcon("src/sprite/icons8_clown_face_50px.png");
                Image icons = icon.getImage();
                Image modifiedicons = icons.getScaledInstance(70,70,java.awt.Image.SCALE_SMOOTH);
                icon = new ImageIcon(modifiedicons);
                JOptionPane.showMessageDialog(null,"KAMU SERI","Nobody Win",JOptionPane.INFORMATION_MESSAGE,icon);
                Thread.sleep(400);
            }catch(Exception e){
                
            }
            reset();
        }
    }//GEN-LAST:event_kotak9ActionPerformed

    private void kotak8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kotak8ActionPerformed
        // TODO add your handling code here:
        if(turn%2==0){
            turnPlus();
            kotak8.setText("X");
            kotak8.setForeground(Color.red);
            matikanButtonPilih();
            kotak8.setEnabled(false);

            int resultP = pWon();

            if((cTurn<12 || pTurn<10) && resultP!=1){
                randomButton();
            }
        }
        int resultP = pWon();
        int resultC = cWon();
        if(resultP == 1){
            try{
                ImageIcon icon = new ImageIcon("src/sprite/icons8_face_screaming_in_fear_50px.png");
                Image icons = icon.getImage();
                Image modifiedicons = icons.getScaledInstance(70,70,java.awt.Image.SCALE_SMOOTH);
                icon = new ImageIcon(modifiedicons);
                JOptionPane.showMessageDialog(null,"KAMU MENANG :O","Player Win",JOptionPane.INFORMATION_MESSAGE,icon);
                Thread.sleep(400);
            }catch(Exception e){
                
            }
            pSkor++;
            sPlayer.setText(String.valueOf(pSkor));
            reset();
        }else if(resultC == 1){
            try{
                ImageIcon icon = new ImageIcon("src/sprite/icons8_sad_50px.png");
                Image icons = icon.getImage();
                Image modifiedicons = icons.getScaledInstance(70,70,java.awt.Image.SCALE_SMOOTH);
                icon = new ImageIcon(modifiedicons);
                JOptionPane.showMessageDialog(null,"KAMU KALAH :(","Computer Win",JOptionPane.INFORMATION_MESSAGE,icon);
                Thread.sleep(400);
            }catch(Exception e){
                
            }
            cSkor++;
            sComputer.setText(String.valueOf(cSkor));
            reset();
        }
        int draw = seri();
        if((pTurn == 11 || cTurn == 12) && draw == 1){
            try{
                ImageIcon icon = new ImageIcon("src/sprite/icons8_clown_face_50px.png");
                Image icons = icon.getImage();
                Image modifiedicons = icons.getScaledInstance(70,70,java.awt.Image.SCALE_SMOOTH);
                icon = new ImageIcon(modifiedicons);
                JOptionPane.showMessageDialog(null,"KAMU SERI","Nobody Win",JOptionPane.INFORMATION_MESSAGE,icon);
                Thread.sleep(400);
            }catch(Exception e){
                
            }
            reset();
        }
    }//GEN-LAST:event_kotak8ActionPerformed

    private void kotak7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kotak7ActionPerformed
        // TODO add your handling code here:
        if(turn%2==0){
            turnPlus();
            kotak7.setText("X");
            kotak7.setForeground(Color.red);
            matikanButtonPilih();
            kotak7.setEnabled(false);

            int resultP = pWon();

            if((cTurn<12 || pTurn<10) && resultP!=1){
                randomButton();
            }
        }
        int resultP = pWon();
        int resultC = cWon();
        if(resultP == 1){
            try{
                ImageIcon icon = new ImageIcon("src/sprite/icons8_face_screaming_in_fear_50px.png");
                Image icons = icon.getImage();
                Image modifiedicons = icons.getScaledInstance(70,70,java.awt.Image.SCALE_SMOOTH);
                icon = new ImageIcon(modifiedicons);
                JOptionPane.showMessageDialog(null,"KAMU MENANG :O","Player Win",JOptionPane.INFORMATION_MESSAGE,icon);
                Thread.sleep(400);
            }catch(Exception e){
                
            }
            pSkor++;
            sPlayer.setText(String.valueOf(pSkor));
            reset();
        }else if(resultC == 1){
            try{
                ImageIcon icon = new ImageIcon("src/sprite/icons8_sad_50px.png");
                Image icons = icon.getImage();
                Image modifiedicons = icons.getScaledInstance(70,70,java.awt.Image.SCALE_SMOOTH);
                icon = new ImageIcon(modifiedicons);
                JOptionPane.showMessageDialog(null,"KAMU KALAH :(","Computer Win",JOptionPane.INFORMATION_MESSAGE,icon);
                Thread.sleep(400);
            }catch(Exception e){
                
            }
            cSkor++;
            sComputer.setText(String.valueOf(cSkor));
            reset();
        }
        int draw = seri();
        if((pTurn == 11 || cTurn == 12) && draw == 1){
            try{
                ImageIcon icon = new ImageIcon("src/sprite/icons8_clown_face_50px.png");
                Image icons = icon.getImage();
                Image modifiedicons = icons.getScaledInstance(70,70,java.awt.Image.SCALE_SMOOTH);
                icon = new ImageIcon(modifiedicons);
                JOptionPane.showMessageDialog(null,"KAMU SERI","Nobody Win",JOptionPane.INFORMATION_MESSAGE,icon);
                Thread.sleep(400);
            }catch(Exception e){
                
            }
            reset();
        }
    }//GEN-LAST:event_kotak7ActionPerformed

    private void kotak4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kotak4ActionPerformed
        // TODO add your handling code here:
        if(turn%2==0){
            turnPlus();
            kotak4.setText("X");
            kotak4.setForeground(Color.red);
            matikanButtonPilih();
            kotak4.setEnabled(false);

            int resultP = pWon();

            if((cTurn<12 || pTurn<10) && resultP!=1){
                randomButton();
            }
        }
        int resultP = pWon();
        int resultC = cWon();
        if(resultP == 1){
            try{
                ImageIcon icon = new ImageIcon("src/sprite/icons8_face_screaming_in_fear_50px.png");
                Image icons = icon.getImage();
                Image modifiedicons = icons.getScaledInstance(70,70,java.awt.Image.SCALE_SMOOTH);
                icon = new ImageIcon(modifiedicons);
                JOptionPane.showMessageDialog(null,"KAMU MENANG :O","Player Win",JOptionPane.INFORMATION_MESSAGE,icon);
                Thread.sleep(400);
            }catch(Exception e){
                
            }
            pSkor++;
            sPlayer.setText(String.valueOf(pSkor));
            reset();
        }else if(resultC == 1){
            try{
                ImageIcon icon = new ImageIcon("src/sprite/icons8_sad_50px.png");
                Image icons = icon.getImage();
                Image modifiedicons = icons.getScaledInstance(70,70,java.awt.Image.SCALE_SMOOTH);
                icon = new ImageIcon(modifiedicons);
                JOptionPane.showMessageDialog(null,"KAMU KALAH :(","Computer Win",JOptionPane.INFORMATION_MESSAGE,icon);
                Thread.sleep(400);
            }catch(Exception e){
                
            }
            cSkor++;
            sComputer.setText(String.valueOf(cSkor));
            reset();
        }
        int draw = seri();
        if((pTurn == 11 || cTurn == 12) && draw == 1){
            try{
                ImageIcon icon = new ImageIcon("src/sprite/icons8_clown_face_50px.png");
                Image icons = icon.getImage();
                Image modifiedicons = icons.getScaledInstance(70,70,java.awt.Image.SCALE_SMOOTH);
                icon = new ImageIcon(modifiedicons);
                JOptionPane.showMessageDialog(null,"KAMU SERI","Nobody Win",JOptionPane.INFORMATION_MESSAGE,icon);
                Thread.sleep(400);
            }catch(Exception e){
                
            }
            reset();
        }
    }//GEN-LAST:event_kotak4ActionPerformed

    private void kotak5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kotak5ActionPerformed
        // TODO add your handling code here:
        if(turn%2==0){
            turnPlus();
            kotak5.setText("X");
            kotak5.setForeground(Color.red);
            matikanButtonPilih();
            kotak5.setEnabled(false);

            int resultP = pWon();

            if((cTurn<12 || pTurn<10) && resultP!=1){
                randomButton();
            }
        }
        int resultP = pWon();
        int resultC = cWon();
        if(resultP == 1){
            try{
                ImageIcon icon = new ImageIcon("src/sprite/icons8_face_screaming_in_fear_50px.png");
                Image icons = icon.getImage();
                Image modifiedicons = icons.getScaledInstance(70,70,java.awt.Image.SCALE_SMOOTH);
                icon = new ImageIcon(modifiedicons);
                JOptionPane.showMessageDialog(null,"KAMU MENANG :O","Player Win",JOptionPane.INFORMATION_MESSAGE,icon);
                Thread.sleep(400);
            }catch(Exception e){
                
            }
            pSkor++;
            sPlayer.setText(String.valueOf(pSkor));
            reset();
        }else if(resultC == 1){
            try{
                ImageIcon icon = new ImageIcon("src/sprite/icons8_sad_50px.png");
                Image icons = icon.getImage();
                Image modifiedicons = icons.getScaledInstance(70,70,java.awt.Image.SCALE_SMOOTH);
                icon = new ImageIcon(modifiedicons);
                JOptionPane.showMessageDialog(null,"KAMU KALAH :(","Computer Win",JOptionPane.INFORMATION_MESSAGE,icon);
                Thread.sleep(400);
            }catch(Exception e){
                
            }
            cSkor++;
            sComputer.setText(String.valueOf(cSkor));
            reset();
        }
        int draw = seri();
        if((pTurn == 11 || cTurn == 12) && draw == 1){
            try{
                ImageIcon icon = new ImageIcon("src/sprite/icons8_clown_face_50px.png");
                Image icons = icon.getImage();
                Image modifiedicons = icons.getScaledInstance(70,70,java.awt.Image.SCALE_SMOOTH);
                icon = new ImageIcon(modifiedicons);
                JOptionPane.showMessageDialog(null,"KAMU SERI","Nobody Win",JOptionPane.INFORMATION_MESSAGE,icon);
                Thread.sleep(400);
            }catch(Exception e){
                
            }
            reset();
        }
    }//GEN-LAST:event_kotak5ActionPerformed

    private void kotak6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kotak6ActionPerformed
        // TODO add your handling code here:
        if(turn%2==0){
            turnPlus();
            kotak6.setText("X");
            kotak6.setForeground(Color.red);
            matikanButtonPilih();
            kotak6.setEnabled(false);

            int resultP = pWon();

            if((cTurn<12 || pTurn<10) && resultP!=1){
                randomButton();
            }
        }
        int resultP = pWon();
        int resultC = cWon();
        if(resultP == 1){
            try{
                ImageIcon icon = new ImageIcon("src/sprite/icons8_face_screaming_in_fear_50px.png");
                Image icons = icon.getImage();
                Image modifiedicons = icons.getScaledInstance(70,70,java.awt.Image.SCALE_SMOOTH);
                icon = new ImageIcon(modifiedicons);
                JOptionPane.showMessageDialog(null,"KAMU MENANG :O","Player Win",JOptionPane.INFORMATION_MESSAGE,icon);
                Thread.sleep(400);
            }catch(Exception e){
                
            }
            pSkor++;
            sPlayer.setText(String.valueOf(pSkor));
            reset();
        }else if(resultC == 1){
            try{
                ImageIcon icon = new ImageIcon("src/sprite/icons8_sad_50px.png");
                Image icons = icon.getImage();
                Image modifiedicons = icons.getScaledInstance(70,70,java.awt.Image.SCALE_SMOOTH);
                icon = new ImageIcon(modifiedicons);
                JOptionPane.showMessageDialog(null,"KAMU KALAH :(","Computer Win",JOptionPane.INFORMATION_MESSAGE,icon);
                Thread.sleep(400);
            }catch(Exception e){
                
            }
            cSkor++;
            sComputer.setText(String.valueOf(cSkor));
            reset();
        }
        int draw = seri();
        if((pTurn == 11 || cTurn == 12) && draw == 1){
            try{
                ImageIcon icon = new ImageIcon("src/sprite/icons8_clown_face_50px.png");
                Image icons = icon.getImage();
                Image modifiedicons = icons.getScaledInstance(70,70,java.awt.Image.SCALE_SMOOTH);
                icon = new ImageIcon(modifiedicons);
                JOptionPane.showMessageDialog(null,"KAMU SERI","Nobody Win",JOptionPane.INFORMATION_MESSAGE,icon);
                Thread.sleep(400);
            }catch(Exception e){
                
            }
            reset();
        }
    }//GEN-LAST:event_kotak6ActionPerformed

    private void kotak3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kotak3ActionPerformed
        // TODO add your handling code here:
        if(turn%2==0){
            turnPlus();
            kotak3.setText("X");
            kotak3.setForeground(Color.red);
            matikanButtonPilih();
            kotak3.setEnabled(false);

            int resultP = pWon();

            if((cTurn<12 || pTurn<10) && resultP!=1){
                randomButton();
            }
        }
        int resultP = pWon();
        int resultC = cWon();
        if(resultP == 1){
            try{
                ImageIcon icon = new ImageIcon("src/sprite/icons8_face_screaming_in_fear_50px.png");
                Image icons = icon.getImage();
                Image modifiedicons = icons.getScaledInstance(70,70,java.awt.Image.SCALE_SMOOTH);
                icon = new ImageIcon(modifiedicons);
                JOptionPane.showMessageDialog(null,"KAMU MENANG :O","Player Win",JOptionPane.INFORMATION_MESSAGE,icon);
                Thread.sleep(400);
            }catch(Exception e){
                
            }
            pSkor++;
            sPlayer.setText(String.valueOf(pSkor));
            reset();
        }else if(resultC == 1){
            try{
                ImageIcon icon = new ImageIcon("src/sprite/icons8_sad_50px.png");
                Image icons = icon.getImage();
                Image modifiedicons = icons.getScaledInstance(70,70,java.awt.Image.SCALE_SMOOTH);
                icon = new ImageIcon(modifiedicons);
                JOptionPane.showMessageDialog(null,"KAMU KALAH :(","Computer Win",JOptionPane.INFORMATION_MESSAGE,icon);
                Thread.sleep(400);
            }catch(Exception e){
                
            }
            cSkor++;
            sComputer.setText(String.valueOf(cSkor));
            reset();
        }
        int draw = seri();
        if((pTurn == 11 || cTurn == 12) && draw == 1){
            try{
                ImageIcon icon = new ImageIcon("src/sprite/icons8_clown_face_50px.png");
                Image icons = icon.getImage();
                Image modifiedicons = icons.getScaledInstance(70,70,java.awt.Image.SCALE_SMOOTH);
                icon = new ImageIcon(modifiedicons);
                JOptionPane.showMessageDialog(null,"KAMU SERI","Nobody Win",JOptionPane.INFORMATION_MESSAGE,icon);
                Thread.sleep(400);
            }catch(Exception e){
                
            }
            reset();
        }
    }//GEN-LAST:event_kotak3ActionPerformed

    private void kotak2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kotak2ActionPerformed
        // TODO add your handling code here:
        if(turn%2==0){
            turnPlus();
            kotak2.setText("X");
            kotak2.setForeground(Color.red);
            matikanButtonPilih();
            kotak2.setEnabled(false);

            int resultP = pWon();

            if((cTurn<12 || pTurn<10) && resultP!=1){
                randomButton();
            }
        }
        int resultP = pWon();
        int resultC = cWon();
        if(resultP == 1){
            try{
                ImageIcon icon = new ImageIcon("src/sprite/icons8_face_screaming_in_fear_50px.png");
                Image icons = icon.getImage();
                Image modifiedicons = icons.getScaledInstance(70,70,java.awt.Image.SCALE_SMOOTH);
                icon = new ImageIcon(modifiedicons);
                JOptionPane.showMessageDialog(null,"KAMU MENANG :O","Player Win",JOptionPane.INFORMATION_MESSAGE,icon);
                Thread.sleep(400);
            }catch(Exception e){
                
            }
            pSkor++;
            sPlayer.setText(String.valueOf(pSkor));
            reset();
        }else if(resultC == 1){
            try{
                ImageIcon icon = new ImageIcon("src/sprite/icons8_sad_50px.png");
                Image icons = icon.getImage();
                Image modifiedicons = icons.getScaledInstance(70,70,java.awt.Image.SCALE_SMOOTH);
                icon = new ImageIcon(modifiedicons);
                JOptionPane.showMessageDialog(null,"KAMU KALAH :(","Computer Win",JOptionPane.INFORMATION_MESSAGE,icon);
                Thread.sleep(400);
            }catch(Exception e){
                
            }
            cSkor++;
            sComputer.setText(String.valueOf(cSkor));
            reset();
        }
        int draw = seri();
        if((pTurn == 11 || cTurn == 12) && draw == 1){
            try{
                ImageIcon icon = new ImageIcon("src/sprite/icons8_clown_face_50px.png");
                Image icons = icon.getImage();
                Image modifiedicons = icons.getScaledInstance(70,70,java.awt.Image.SCALE_SMOOTH);
                icon = new ImageIcon(modifiedicons);
                JOptionPane.showMessageDialog(null,"KAMU SERI","Nobody Win",JOptionPane.INFORMATION_MESSAGE,icon);
                Thread.sleep(400);
            }catch(Exception e){
                
            }
            reset();
        }
    }//GEN-LAST:event_kotak2ActionPerformed

    private void kotak1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kotak1ActionPerformed
        // TODO add your handling code here:
        if(turn%2==0){
            turnPlus();
            kotak1.setText("X");
            kotak1.setForeground(Color.red);
            matikanButtonPilih();
            kotak1.setEnabled(false);

            int resultP = pWon();

            if((cTurn<12 || pTurn<10) && resultP!=1){
                randomButton();
            }
        }
        int resultP = pWon();
        int resultC = cWon();
        if(resultP == 1){
            try{
                ImageIcon icon = new ImageIcon("src/sprite/icons8_face_screaming_in_fear_50px.png");
                Image icons = icon.getImage();
                Image modifiedicons = icons.getScaledInstance(70,70,java.awt.Image.SCALE_SMOOTH);
                icon = new ImageIcon(modifiedicons);
                JOptionPane.showMessageDialog(null,"KAMU MENANG :O","Player Win",JOptionPane.INFORMATION_MESSAGE,icon);
                Thread.sleep(400);
            }catch(Exception e){
                
            }
            pSkor++;
            sPlayer.setText(String.valueOf(pSkor));
            reset();
        }else if(resultC == 1){
            try{
                ImageIcon icon = new ImageIcon("src/sprite/icons8_sad_50px.png");
                Image icons = icon.getImage();
                Image modifiedicons = icons.getScaledInstance(70,70,java.awt.Image.SCALE_SMOOTH);
                icon = new ImageIcon(modifiedicons);
                JOptionPane.showMessageDialog(null,"KAMU KALAH :(","Computer Win",JOptionPane.INFORMATION_MESSAGE,icon);
                Thread.sleep(400);
            }catch(Exception e){
                
            }
            cSkor++;
            sComputer.setText(String.valueOf(cSkor));
            reset();
        }
        int draw = seri();
        if((pTurn == 11 || cTurn == 12) && draw == 1){
            try{
                ImageIcon icon = new ImageIcon("src/sprite/icons8_clown_face_50px.png");
                Image icons = icon.getImage();
                Image modifiedicons = icons.getScaledInstance(70,70,java.awt.Image.SCALE_SMOOTH);
                icon = new ImageIcon(modifiedicons);
                JOptionPane.showMessageDialog(null,"KAMU SERI","Nobody Win",JOptionPane.INFORMATION_MESSAGE,icon);
                Thread.sleep(400);
            }catch(Exception e){
                
            }
            reset();
        }
    }//GEN-LAST:event_kotak1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new board().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton kotak1;
    private javax.swing.JButton kotak2;
    private javax.swing.JButton kotak3;
    private javax.swing.JButton kotak4;
    private javax.swing.JButton kotak5;
    private javax.swing.JButton kotak6;
    private javax.swing.JButton kotak7;
    private javax.swing.JButton kotak8;
    private javax.swing.JButton kotak9;
    private javax.swing.JButton resetBtn;
    private javax.swing.JLabel sComputer;
    private javax.swing.JLabel sPlayer;
    private javax.swing.JButton startBtn;
    // End of variables declaration//GEN-END:variables
}
