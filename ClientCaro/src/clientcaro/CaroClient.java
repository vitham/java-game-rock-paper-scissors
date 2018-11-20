package clientcaro;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Caro.java
 *
 * Created on Dec 26, 2011, 3:39:22 PM
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.TrayIcon;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

/**
 *
 * @author Kien
 */
public class CaroClient extends javax.swing.JFrame {

    /** Creates new form Caro */
    public CaroClient()
    {
        setVisible(true);
    }
    public CaroClient(String ip,final Integer port1,final Integer port2, String name) {
        initComponents();
        setTitle(name+ " (Client)");
        setVisible(true);
        host = ip;
        
        
        
        class ListenGame extends Thread {

            public ListenGame() {
                start();
            }

            @Override
            public void run() {
                listenSocketGame(port2);
            }
        }
        new ListenGame();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rbBua = new javax.swing.JRadioButton();
        rbKeo = new javax.swing.JRadioButton();
        rbBao = new javax.swing.JRadioButton();
        btnSend = new javax.swing.JButton();
        lbScorePlayer = new javax.swing.JLabel();
        lbScoreYou = new javax.swing.JLabel();
        lbTime = new javax.swing.JLabel();
        lbWin = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Caro");

        buttonGroup1.add(rbBua);
        rbBua.setSelected(true);
        rbBua.setText("Bua");

        buttonGroup1.add(rbKeo);
        rbKeo.setText("Keo");

        buttonGroup1.add(rbBao);
        rbBao.setText("Bao");

        btnSend.setText("Gửi");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        lbScorePlayer.setText("Player:");

        lbScoreYou.setText("You:");

        lbTime.setText("Thời gian");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbScoreYou)
                    .addComponent(lbScorePlayer))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbBua)
                                .addGap(48, 48, 48)
                                .addComponent(rbKeo))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbTime)
                                .addComponent(btnSend)))
                        .addGap(42, 42, 42)
                        .addComponent(rbBao))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(lbWin)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbTime)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbBua)
                    .addComponent(rbKeo)
                    .addComponent(rbBao))
                .addGap(51, 51, 51)
                .addComponent(btnSend)
                .addGap(18, 18, 18)
                .addComponent(lbWin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(lbScoreYou)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbScorePlayer)
                .addContainerGap())
        );

        fileMenu.setText("File");

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK));
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        jMenu2.setText("Options");
        menuBar.add(jMenu2);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        try {
            if(rbBua.isSelected()) {
                outGame.write(0);
                outGame.flush();
                youDanh = 0;
            } else if(rbKeo.isSelected()) {
                outGame.write(2);
                outGame.flush();
                youDanh = 2;
            } else {
                outGame.write(1);
                outGame.flush();
                youDanh = 1;
            }
            
            if (youDanh != -1) pointCalculator(youDanh, playerDanh);
        } catch (IOException ex) {}
    }//GEN-LAST:event_btnSendActionPerformed
   
    public void pointCalculator(int you, int player) {
        if((you + 1) % 3 == player) {
            playerScore += 1;
            lbWin.setText("Bạn thua");
        } else if(you == player) {
            playerScore += 0.5;
            yourScore += 0.5;
            lbWin.setText("Hòa");
        } else {
            yourScore += 1;
            lbWin.setText("Bạn thắng");
        }
        lbScoreYou.setText("You: " + yourScore);
        lbScorePlayer.setText("Player: " + playerScore);
    }
    
        public void listenSocketGame(Integer port2) {
        //Create socket connection
        try {
            socketGame = new Socket(host, port2);
            OutputStream o = socketGame.getOutputStream();
            outGame = new ObjectOutputStream(o);
            InputStream i = socketGame.getInputStream();
            inGame = new ObjectInputStream(i);
        } catch (UnknownHostException e) {
            System.err.println("Server không tồn tại");
        } catch (IOException e) {
            System.err.println("Server không mở");
        }
        while (true) {
            try {
                Point s = null;
                try {
                    playerDanh = inGame.read();
                    System.out.println("server danh " + playerDanh);
                    
                    s = (Point) inGame.readObject();
                    checked.add(s);
                    currentPoint = s;
                } catch (ClassNotFoundException ex) {
                    //Logger.getLogger(CaroServer.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.toFront();
//                if (isWin(true)) {//quân đen thắng
//                    JOptionPane.showMessageDialog(this, "Bạn đã thua");
//                    startUser = false;
//                    checked.removeAllElements();
//                }
                user = false;//quân đỏ
                isPause = false;
            } catch (IOException ex) {
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSend;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbScorePlayer;
    private javax.swing.JLabel lbScoreYou;
    private javax.swing.JLabel lbTime;
    private javax.swing.JLabel lbWin;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JRadioButton rbBao;
    private javax.swing.JRadioButton rbBua;
    private javax.swing.JRadioButton rbKeo;
    // End of variables declaration//GEN-END:variables
    private int X0 = 20;
    private int Y0 = 20;
    private int Width = 32;
    private int Size = 15;
    private int currentRow = -1;
    private int currentColumn = -1;
    private Point currentPoint = new Point();
    /**
     * true  là user 1(màu đen)
     * false là user 2(màu đỏ)
     */
    private boolean user = false;
    /**
     * Vị trí chẵn lưu các điểm đã đánh của user 1
     * Vị trí lẻ lưu các điểm đã đánh của user 2
     */
    private Vector<Point> checked = new Vector<Point>();

    Socket socketGame = null;
    ObjectInputStream inGame = null;
    ObjectOutputStream outGame = null;
    boolean isPause = true;
    /**
     * true : quân đen đi trước
     * false  quân đỏ đi trước
     */
    boolean startUser = true;//quân đen đi trước
    String host;
     int youDanh = -1;
    int playerDanh = -1;
    float playerScore = 0;
    float yourScore = 0;
}
