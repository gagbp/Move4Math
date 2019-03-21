/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package move4math;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import jogo.Game_Classificacao;
import jogo.Game_Ordenacao;
import jogo.Game_Sequenciacao;
import org.opencv.videoio.VideoCapture;

/**
 *
 * @author Mayco, Matheus, Henrique
 */
public class MainWindow extends javax.swing.JFrame {

    public static KeyEvent tecla;

    Game_Classificacao gameWindow = new Game_Classificacao();
    Game_Ordenacao gameWindow2 = new Game_Ordenacao();
    Game_Sequenciacao gameWindowSequenciacao = new Game_Sequenciacao();

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);

    }

    MainWindow(String moviPensando) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMovi = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cmbPublico = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbTipoJogo = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cmbNome = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cmbFase = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        cmbNivel = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnComecar = new javax.swing.JButton();
        btnRelatorios = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblParceiro = new javax.swing.JLabel();
        lblUdesc = new javax.swing.JLabel();
        lblUdesc1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Move4Math");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setIconImages(null);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName("frmPrincipal"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblMovi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMovi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/logoMove4Math.png"))); // NOI18N

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setMaximumSize(new java.awt.Dimension(380, 100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbPublico.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmbPublico.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Crianca", "Crianca com Deficiencia" }));
        cmbPublico.setSelectedIndex(-1);
        cmbPublico.setName("cmbPublico"); // NOI18N
        cmbPublico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbPublicoMouseClicked(evt);
            }
        });
        cmbPublico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPublicoItemStateChanged(evt);
            }
        });
        cmbPublico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPublicoActionPerformed(evt);
            }
        });
        cmbPublico.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cmbPublicoPropertyChange(evt);
            }
        });
        jPanel1.add(cmbPublico, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 220, 25));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Tipo de Público:");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, 25));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Habilidade Cognitiva:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, 25));

        cmbTipoJogo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmbTipoJogo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Classificacao", "Ordenacao", "Sequenciacao" }));
        cmbTipoJogo.setSelectedIndex(-1);
        cmbTipoJogo.setToolTipText("");
        cmbTipoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoJogoActionPerformed(evt);
            }
        });
        jPanel1.add(cmbTipoJogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 220, 25));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Nome do Jogador:");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, 25));

        cmbNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmbNome.setEnabled(false);
        cmbNome.setName("cmbNome"); // NOI18N
        cmbNome.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbNomeItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 220, 25));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Fase:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, 25));

        cmbFase.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmbFase.setEnabled(false);
        cmbFase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFaseActionPerformed(evt);
            }
        });
        jPanel1.add(cmbFase, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 70, 25));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Nível:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 130, -1, 25));

        cmbNivel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmbNivel.setEnabled(false);
        jPanel1.add(cmbNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 70, 25));

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setMaximumSize(new java.awt.Dimension(380, 100));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(java.awt.Color.white);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnComecar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnComecar.setText("Começar o Jogo!");
        btnComecar.setToolTipText("");
        btnComecar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComecarActionPerformed(evt);
            }
        });
        jPanel3.add(btnComecar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 370, 70));

        btnRelatorios.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnRelatorios.setText("Relatórios");
        btnRelatorios.setPreferredSize(new java.awt.Dimension(150, 50));
        btnRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatoriosActionPerformed(evt);
            }
        });
        jPanel3.add(btnRelatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 370, 40));

        btnCadastrar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnCadastrar.setText("Cadastrar Jogador");
        btnCadastrar.setPreferredSize(new java.awt.Dimension(150, 50));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel3.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 370, 40));

        jPanel4.setBackground(java.awt.Color.white);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblParceiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/logoParceiro.jpg"))); // NOI18N
        jPanel4.add(lblParceiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 132, 150));

        lblUdesc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/logoUdesc.png"))); // NOI18N
        jPanel4.add(lblUdesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 132, 150));

        lblUdesc1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/logo_larva.png"))); // NOI18N
        jPanel4.add(lblUdesc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 132, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMovi, javax.swing.GroupLayout.DEFAULT_SIZE, 885, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblMovi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbPublicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPublicoActionPerformed
        cmbNome.removeAllItems();
        cmbNome.setEnabled(false);
        cmbNome.setSelectedIndex(-1);
        cmbFase.setEnabled(false);
        cmbFase.setSelectedIndex(-1);
        cmbNivel.setEnabled(false);
        cmbNivel.setSelectedIndex(-1);
        
        atualizaComboPlayers();
        
        if(cmbNome.getItemCount() != 0){
            atualizaComboFaseNivel();
            cmbNome.setEnabled(true);
            cmbFase.setEnabled(true);
            cmbNivel.setEnabled(true);   
        }else{
            JOptionPane.showMessageDialog(null, "Não há nenhum jogador desse público cadastrado. Por favor cadastre!");
            btnRelatorios.grabFocus();
        }
        
    }//GEN-LAST:event_cmbPublicoActionPerformed

    private void cmbPublicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPublicoItemStateChanged

    }//GEN-LAST:event_cmbPublicoItemStateChanged

    private void cmbPublicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbPublicoMouseClicked

    }//GEN-LAST:event_cmbPublicoMouseClicked
    
    private void cmbPublicoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cmbPublicoPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPublicoPropertyChange

    private void btnComecarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComecarActionPerformed
        // TODO add your handling code here:
        int indexPublico = 0;
        int indexPlayer = -1;
        int indexFase = 0;
        int indexNivel = 0;
        int i;
        int indexJogo = 0;

        indexJogo = Move4Math.jogos.get(cmbTipoJogo.getSelectedIndex()).getId();
        Move4Math.indiceJogoAtual = indexJogo;

        System.out.println("Atual " + Move4Math.indiceJogoAtual);

        indexPublico = Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getPublico().get(cmbPublico.getSelectedIndex()).getId();
        Move4Math.indicePublicoAtual = indexPublico;

        for (i = 0; i < Move4Math.players.size(); i++) {
            if (Move4Math.players.elementAt(i).getNome().equals(cmbNome.getSelectedItem().toString())) {
                indexPlayer = i;
                Move4Math.indicePlayerAtual = indexPlayer;
                break;
            }
        }

        indexFase = Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getPublico().elementAt(cmbPublico.getSelectedIndex()).getFases().get(cmbFase.getSelectedIndex()).getNumeroFase();
        Move4Math.indiceFaseAtual = indexFase;
        
        System.out.println("idxNivel --- 01: " + cmbNivel.getSelectedItem().toString());
        
        indexNivel = Integer.parseInt(cmbNivel.getSelectedItem().toString());
        Move4Math.indiceNivelAtual = indexNivel;
       
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();
        System.out.println("Move4Math.indiceJogoAtual: " + Move4Math.indiceJogoAtual);
        switch(Move4Math.indiceJogoAtual){
            case 1:
                gameWindow2.setSize(width, height);
                gameWindow2.dispose();
                gameWindow2.setUndecorated(true);
                gameWindow2.setVisible(true);
                gameWindow2.setExtendedState(JFrame.MAXIMIZED_BOTH);
                gameWindow2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                gameWindow2.addKeyListener(new KeyListener() {

                    @Override
                    public void keyTyped(KeyEvent e) {
                    }

                    @Override
                    public void keyPressed(KeyEvent e) {
                        tecla = e;
                    }

                    @Override
                    public void keyReleased(KeyEvent e) {
                    }
                });

                VideoCapture webSource2 = new VideoCapture(0);
                if (!webSource2.isOpened()) {
                    JOptionPane.showMessageDialog(null, "Webcam não encontrada!");
                    gameWindow2.dispose();
                } else {
                    webSource2.release();

                    System.out.println("Player: " + indexPlayer);

                    if (indexPlayer == -1) {
                        JOptionPane.showMessageDialog(null, "Jogador não selecionado!");
                        gameWindow2.dispose();
                    } else {

                        try {
                            /*
                            System.out.println(indexJogo+" "+ indexPublico+" "+ indexPlayer+" "+ indexFase+" "+ indexNivel);
                            System.out.println("GAME" + gameWindow);
                            System.out.println("JOGO"+ "" + Move4Math.jogos.elementAt(Move4Math.indiceJogoAtual).getId() + "" + Move4Math.jogos.elementAt(Move4Math.indiceJogoAtual).getNome());
                            System.out.println("PUBLICO"+Move4Math.getPublicoId(Move4Math.indicePublicoAtual).getNome());
                            System.out.println("PLAYER"+Move4Math.players.elementAt(Move4Math.indicePlayerAtual).getNome());
                            System.out.println("OUTROS"+Move4Math.conjuntosDeTrabalho +","+ indexFase +","+ indexNivel);
                            gameWindow.Iniciar(gameWindow,"Classificacao",1, 1, Move4Math.conjuntosDeTrabalho, indexFase, indexNivel);
                            gameWindow.Iniciar(gameWindow,Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getId(),Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getPublico().elementAt(cmbTipoJogo.getSelectedIndex()).getId(), Move4Math.players.elementAt(cmbNome.getSelectedIndex()).getId(), Move4Math.conjuntosDeTrabalho, indexFase, indexNivel);
                            */
                            //NOVO 
                            System.out.println("mainwindow: " + Move4Math.indiceNivelAtual + "     " + Move4Math.indiceJogoAtual);
                            gameWindow2.Iniciar(gameWindow2, Move4Math.jogos.elementAt(Move4Math.indiceJogoAtual), Move4Math.getPublicoId(Move4Math.indicePublicoAtual), Move4Math.players.elementAt(Move4Math.indicePlayerAtual), Move4Math.conjuntosDeTrabalho, Move4Math.indiceFaseAtual, Move4Math.indiceNivelAtual);
                            //gameWindow.Iniciar(gameWindow,Move4Math.jogos.elementAt(indexJogo),Move4Math.getPublicoId(indexPublico), Move4Math.players.elementAt(indexPlayer), Move4Math.conjuntosDeTrabalho, indexFase, indexNivel);
                            //gameWindow.Iniciar(gameWindow,Move4Math.jogos.elementAt(Move4Math.jogos.get(cmbTipoJogo.getSelectedIndex()).getId()),Move4Math.publicos.elementAt(Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getPublico().get(cmbPublico.getSelectedIndex()).getId()), Move4Math.players.elementAt(cmbNome.getSelectedIndex()), Move4Math.conjuntosDeTrabalho, indexFase, indexNivel);
                            //ANTIGO
                            //gameWindow.Iniciar(gameWindow,Move4Math.publicos.elementAt(indexPublico), Move4Math.players.elementAt(indexPlayer), Move4Math.conjuntosDeTrabalho, indexFase, indexNivel, tempo);
                        } catch (IOException | InterruptedException ex) {
                            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                            System.out.println(ex.getStackTrace());
                        }
                    }
                }
                break;
            case 2:
                gameWindowSequenciacao.setSize(width, height);
                gameWindowSequenciacao.dispose();
                gameWindowSequenciacao.setUndecorated(true);
                gameWindowSequenciacao.setVisible(true);
                gameWindowSequenciacao.setExtendedState(JFrame.MAXIMIZED_BOTH);
                gameWindowSequenciacao.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                gameWindowSequenciacao.addKeyListener(new KeyListener() {

                    @Override
                    public void keyTyped(KeyEvent e) {
                    }

                    @Override
                    public void keyPressed(KeyEvent e) {
                        tecla = e;
                    }

                    @Override
                    public void keyReleased(KeyEvent e) {
                    }
                });

                VideoCapture webSourceSequenciacao = new VideoCapture(0);
                if (!webSourceSequenciacao.isOpened()) {
                    JOptionPane.showMessageDialog(null, "Webcam não encontrada!");
                    gameWindowSequenciacao.dispose();
                } else {
                    webSourceSequenciacao.release();

                    System.out.println("Player: " + indexPlayer);

                    if (indexPlayer == -1) {
                        JOptionPane.showMessageDialog(null, "Jogador não selecionado!");
                        gameWindowSequenciacao.dispose();
                    } else {

                        try {
                            /*
                            System.out.println(indexJogo+" "+ indexPublico+" "+ indexPlayer+" "+ indexFase+" "+ indexNivel);
                            System.out.println("GAME" + gameWindow);
                            System.out.println("JOGO"+ "" + Move4Math.jogos.elementAt(Move4Math.indiceJogoAtual).getId() + "" + Move4Math.jogos.elementAt(Move4Math.indiceJogoAtual).getNome());
                            System.out.println("PUBLICO"+Move4Math.getPublicoId(Move4Math.indicePublicoAtual).getNome());
                            System.out.println("PLAYER"+Move4Math.players.elementAt(Move4Math.indicePlayerAtual).getNome());
                            System.out.println("OUTROS"+Move4Math.conjuntosDeTrabalho +","+ indexFase +","+ indexNivel);
                            gameWindow.Iniciar(gameWindow,"Classificacao",1, 1, Move4Math.conjuntosDeTrabalho, indexFase, indexNivel);
                            gameWindow.Iniciar(gameWindow,Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getId(),Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getPublico().elementAt(cmbTipoJogo.getSelectedIndex()).getId(), Move4Math.players.elementAt(cmbNome.getSelectedIndex()).getId(), Move4Math.conjuntosDeTrabalho, indexFase, indexNivel);
                            */
                            //NOVO 
                            System.out.println("mainwindow: " + Move4Math.indiceNivelAtual + "     " + Move4Math.indiceJogoAtual);
                            gameWindowSequenciacao.Iniciar(gameWindowSequenciacao, Move4Math.jogos.elementAt(Move4Math.indiceJogoAtual), Move4Math.getPublicoId(Move4Math.indicePublicoAtual), Move4Math.players.elementAt(Move4Math.indicePlayerAtual), Move4Math.conjuntosDeTrabalho, Move4Math.indiceFaseAtual, Move4Math.indiceNivelAtual);
                            //gameWindow.Iniciar(gameWindow,Move4Math.jogos.elementAt(indexJogo),Move4Math.getPublicoId(indexPublico), Move4Math.players.elementAt(indexPlayer), Move4Math.conjuntosDeTrabalho, indexFase, indexNivel);
                            //gameWindow.Iniciar(gameWindow,Move4Math.jogos.elementAt(Move4Math.jogos.get(cmbTipoJogo.getSelectedIndex()).getId()),Move4Math.publicos.elementAt(Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getPublico().get(cmbPublico.getSelectedIndex()).getId()), Move4Math.players.elementAt(cmbNome.getSelectedIndex()), Move4Math.conjuntosDeTrabalho, indexFase, indexNivel);
                            //ANTIGO
                            //gameWindow.Iniciar(gameWindow,Move4Math.publicos.elementAt(indexPublico), Move4Math.players.elementAt(indexPlayer), Move4Math.conjuntosDeTrabalho, indexFase, indexNivel, tempo);
                        } catch (IOException | InterruptedException ex) {
                            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                            System.out.println(ex.getStackTrace());
                        }
                    }
                }
                break;
            default:
                gameWindow.setSize(width, height);
                gameWindow.dispose();
                gameWindow.setUndecorated(true);
                gameWindow.setVisible(true);
                gameWindow.setExtendedState(JFrame.MAXIMIZED_BOTH);
                gameWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                gameWindow.addKeyListener(new KeyListener() {

                    @Override
                    public void keyTyped(KeyEvent e) {
                    }

                    @Override
                    public void keyPressed(KeyEvent e) {
                        tecla = e;
                    }

                    @Override
                    public void keyReleased(KeyEvent e) {
                    }
                });

                VideoCapture webSource = new VideoCapture(0);
                if (!webSource.isOpened()) {
                    JOptionPane.showMessageDialog(null, "Webcam não encontrada!");
                    gameWindow.dispose();
                } else {
                    webSource.release();

                    System.out.println("Player: " + indexPlayer);

                    if (indexPlayer == -1) {
                        JOptionPane.showMessageDialog(null, "Jogador não selecionado!");
                        gameWindow.dispose();
                    } else {

                        try {
                            /*
                            System.out.println(indexJogo+" "+ indexPublico+" "+ indexPlayer+" "+ indexFase+" "+ indexNivel);
                            System.out.println("GAME" + gameWindow);
                            System.out.println("JOGO"+ "" + Move4Math.jogos.elementAt(Move4Math.indiceJogoAtual).getId() + "" + Move4Math.jogos.elementAt(Move4Math.indiceJogoAtual).getNome());
                            System.out.println("PUBLICO"+Move4Math.getPublicoId(Move4Math.indicePublicoAtual).getNome());
                            System.out.println("PLAYER"+Move4Math.players.elementAt(Move4Math.indicePlayerAtual).getNome());
                            System.out.println("OUTROS"+Move4Math.conjuntosDeTrabalho +","+ indexFase +","+ indexNivel);
                            gameWindow.Iniciar(gameWindow,"Classificacao",1, 1, Move4Math.conjuntosDeTrabalho, indexFase, indexNivel);
                            gameWindow.Iniciar(gameWindow,Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getId(),Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getPublico().elementAt(cmbTipoJogo.getSelectedIndex()).getId(), Move4Math.players.elementAt(cmbNome.getSelectedIndex()).getId(), Move4Math.conjuntosDeTrabalho, indexFase, indexNivel);
                            */
                            //NOVO 
                            System.out.println("mainwindow: " + Move4Math.indiceNivelAtual + "     " + Move4Math.indiceJogoAtual);
                            gameWindow.Iniciar(gameWindow, Move4Math.jogos.elementAt(Move4Math.indiceJogoAtual), Move4Math.getPublicoId(Move4Math.indicePublicoAtual), Move4Math.players.elementAt(Move4Math.indicePlayerAtual), Move4Math.conjuntosDeTrabalho, Move4Math.indiceFaseAtual, Move4Math.indiceNivelAtual);
                            //gameWindow.Iniciar(gameWindow,Move4Math.jogos.elementAt(indexJogo),Move4Math.getPublicoId(indexPublico), Move4Math.players.elementAt(indexPlayer), Move4Math.conjuntosDeTrabalho, indexFase, indexNivel);
                            //gameWindow.Iniciar(gameWindow,Move4Math.jogos.elementAt(Move4Math.jogos.get(cmbTipoJogo.getSelectedIndex()).getId()),Move4Math.publicos.elementAt(Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getPublico().get(cmbPublico.getSelectedIndex()).getId()), Move4Math.players.elementAt(cmbNome.getSelectedIndex()), Move4Math.conjuntosDeTrabalho, indexFase, indexNivel);
                            //ANTIGO
                            //gameWindow.Iniciar(gameWindow,Move4Math.publicos.elementAt(indexPublico), Move4Math.players.elementAt(indexPlayer), Move4Math.conjuntosDeTrabalho, indexFase, indexNivel, tempo);
                        } catch (IOException | InterruptedException ex) {
                            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                            System.out.println(ex.getStackTrace());
                        }
                    }
                }
        }
    }//GEN-LAST:event_btnComecarActionPerformed

    private void cmbTipoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoJogoActionPerformed
        atualizaComboPublico();
    }//GEN-LAST:event_cmbTipoJogoActionPerformed

    private void cmbNomeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbNomeItemStateChanged
//        atualizaComboFaseNivel();
    }//GEN-LAST:event_cmbNomeItemStateChanged

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        System.exit(0);//Finaliza o processo.
    }//GEN-LAST:event_formWindowClosed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        setVisible(false);
        Cadastrar janelaCadastrar = new Cadastrar();
        janelaCadastrar.setLocationRelativeTo(null);
        janelaCadastrar.setVisible(true);
        janelaCadastrar.atualizaComboPublico();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatoriosActionPerformed
        try {
            Runtime.getRuntime().exec("explorer Users ");
        } catch (IOException ex) {
             
        }
    }//GEN-LAST:event_btnRelatoriosActionPerformed

    private void cmbFaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbFaseActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        System.exit(0);//Finaliza o processo.
    }//GEN-LAST:event_formWindowClosing

    public String getTipoJogo() {
        return cmbTipoJogo.getSelectedItem().toString();
    }

    public void atualizaComboJogos() {
        //cmbPublico.removeAllItems();
        //cmbPublico.addItem("");
        //*
        int i;
        for (i = 0; i < Move4Math.jogos.size(); i++) {
            cmbTipoJogo.addItem(Move4Math.jogos.elementAt(i).getNome());
        } // */
    }

    public void atualizaComboPublico() {
        Move4Math.publicos = new Vector();
        int i;
        for (i = 0; i < Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getPublico().size(); i++) {
            Move4Math.publicos.add(Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getPublico().elementAt(i));
        }
    }

    public void atualizaComboPlayers() {
        cmbNome.removeAllItems();
        int i;
        for (i = 0; i < Move4Math.players.size(); i++) {
            if (Move4Math.players.elementAt(i).getPublico().equals(cmbPublico.getSelectedItem())) {
                cmbNome.addItem(Move4Math.players.elementAt(i).getNome());
            }
        }
    }

    public void atualizaComboFaseNivel() {
        cmbFase.removeAllItems();
        cmbNivel.removeAllItems();
        int i, j;
        
        int aux = Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getPublico().elementAt(cmbPublico.getSelectedIndex()).getFases().size();
        System.out.println("A: " + aux + ", B: " + Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getPublico().elementAt(cmbPublico.getSelectedIndex()).getFases().size());
        for (i = 0; i < aux; i++) {
            cmbFase.addItem(Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getPublico().elementAt(cmbPublico.getSelectedIndex()).getFases().elementAt(i).getNumeroFase());
            //cmbFase.addItem(Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getPublico().elementAt(cmbPublico.getSelectedIndex()).getFases().elementAt(i).getNome());
        }

        for (j = 0; j < Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getPublico().elementAt(cmbPublico.getSelectedIndex()).getNiveis().size() / 4; j++) {
            cmbNivel.addItem(j + 1);            
        }

        /*
        for(j=0;j<Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getPublico().elementAt(cmbPublico.getSelectedIndex()).getNiveis().size();j++){
            cmbNivel.addItem(Move4Math.jogos.elementAt(cmbTipoJogo.getSelectedIndex()).getPublico().elementAt(cmbPublico.getSelectedIndex()).getNiveis().elementAt(j).getNumero());
        }
         */
        for (i = 0; i < Move4Math.players.size(); i++) {
            if (Move4Math.players.elementAt(i).getNome().equals(cmbNome.getSelectedItem())) { //Procura o jogador selecionado no vetor de players
                if (!Move4Math.players.elementAt(i).getSessoes().isEmpty()) {//se há pelo menos uma sessao jogada
                    if (!Move4Math.players.elementAt(i).getSessoes().lastElement().getRodadas().isEmpty()) { //se há pelo menos uma rodada jogada
                        cmbFase.setSelectedItem(Move4Math.players.elementAt(i).getSessoes().lastElement().getFase());
                        cmbNivel.setSelectedItem(Move4Math.players.elementAt(i).getSessoes().lastElement().getRodadas().lastElement().getNivel());
                    } else {
                        cmbFase.setSelectedItem(Move4Math.players.elementAt(i).getSessoes().lastElement().getFase());
                    }
                }
                break;
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnComecar;
    private javax.swing.JButton btnRelatorios;
    private javax.swing.JComboBox cmbFase;
    private javax.swing.JComboBox cmbNivel;
    private javax.swing.JComboBox cmbNome;
    private javax.swing.JComboBox cmbPublico;
    private javax.swing.JComboBox cmbTipoJogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblMovi;
    private javax.swing.JLabel lblParceiro;
    private javax.swing.JLabel lblUdesc;
    private javax.swing.JLabel lblUdesc1;
    // End of variables declaration//GEN-END:variables

}
