package gui;

import java.awt.Cursor;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class AGGui extends javax.swing.JFrame {

    private int todos = 0;
    private int individuos = 0;
    private long inicio = 0,  fim = 0;

    public AGGui() {
        initComponents();
        //setExtendedState(MAXIMIZED_BOTH);
    }
    
    public String Data(){
        long data = System.currentTimeMillis();
        Date d = new Date(data);
        String atual = d.toString();
        return atual;
    }
    
    public void salvarLogExecucao(){
        
    }
    
    public void salvarDadosBancoPostgres(){
        try {
            postgres.Conexao con = postgres.Conexao.getBanco();
            ResultSet rs = con.getDados();
            while (rs.next()) {
                //tabela.a
                System.out.println(rs.getString("numero"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AGGui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void preencherTabelaDados(){
        tabelaDados.add(new postgres.DisplayQueryResults("select * from dependente"));
    }
    
    public void configuraBarraProgressao(){
        barra.setMinimum(0);
        barra.setMaximum(100);
        barra.setString("PROGRESSO DA EXECU��O");
        barra.setValue(0);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desempenho = new javax.swing.ButtonGroup();
        selecao = new javax.swing.ButtonGroup();
        tabelado = new javax.swing.JTabbedPane();
        panelEntrada = new javax.swing.JPanel();
        panelVariaveisEntrada = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        panelParada = new javax.swing.JPanel();
        jcbEstagnacaoPopulacao = new javax.swing.JCheckBox();
        jcbEstagnacaoMelhorIndividuo = new javax.swing.JCheckBox();
        jcbGeracaoMaxima = new javax.swing.JCheckBox();
        panelSelecao = new javax.swing.JPanel();
        jrbRoleta = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        panelReproducao = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfpopulacao = new javax.swing.JTextField();
        jtfgeracoes = new javax.swing.JTextField();
        jtfvezes = new javax.swing.JTextField();
        panelRoleta = new javax.swing.JPanel();
        jtfmutacao = new javax.swing.JTextField();
        jtfrotacao = new javax.swing.JTextField();
        jtfinversao = new javax.swing.JTextField();
        jtfrecombinacao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        panelCromossomo = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jtfPrecisao = new javax.swing.JTextField();
        jtfTamanho = new javax.swing.JTextField();
        jtfSemente = new javax.swing.JTextField();
        jtfInicio = new javax.swing.JTextField();
        jtfFim = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jtfCromossomo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        panelConfiguracoesSaida = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jcbAD = new javax.swing.JCheckBox();
        jcbADR = new javax.swing.JCheckBox();
        jcbCromossomo = new javax.swing.JCheckBox();
        jcbNCE = new javax.swing.JCheckBox();
        jcbVD = new javax.swing.JCheckBox();
        jcbGeracao = new javax.swing.JCheckBox();
        jcbDecimal = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jcbIndividuos = new javax.swing.JComboBox();
        jtbDetalhes = new javax.swing.JToggleButton();
        start = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        panelSaida2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaSaida = new javax.swing.JTextArea();
        barra = new javax.swing.JProgressBar();
        panelGraficos = new javax.swing.JPanel();
        tabeladoGraficos = new javax.swing.JTabbedPane();
        graf1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        tabelaDados = new javax.swing.JPanel();
        barraMenu = new javax.swing.JMenuBar();
        arquivo = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        configuracoes = new javax.swing.JMenu();
        jmiEntrada = new javax.swing.JMenuItem();
        jmiSaida = new javax.swing.JMenuItem();
        jmiEstatisticas = new javax.swing.JMenuItem();
        jmiBancoDeDados = new javax.swing.JMenuItem();
        jmDesempenho = new javax.swing.JMenu();
        jrbmiAlto = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jmIAeRNA = new javax.swing.JMenu();
        jmiIA = new javax.swing.JMenuItem();
        jmiRNA = new javax.swing.JMenuItem();
        ajuda = new javax.swing.JMenu();
        sobre = new javax.swing.JMenuItem();
        barraMenu1 = new javax.swing.JMenuBar();
        arquivo1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        configuracoes1 = new javax.swing.JMenu();
        jmiEntrada1 = new javax.swing.JMenuItem();
        jmiSaida1 = new javax.swing.JMenuItem();
        jmiEstatisticas1 = new javax.swing.JMenuItem();
        jmiBancoDeDados1 = new javax.swing.JMenuItem();
        jmDesempenho1 = new javax.swing.JMenu();
        jrbmiAlto1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem4 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem4 = new javax.swing.JCheckBoxMenuItem();
        jmIAeRNA1 = new javax.swing.JMenu();
        jmiIA1 = new javax.swing.JMenuItem();
        jmiRNA1 = new javax.swing.JMenuItem();
        ajuda1 = new javax.swing.JMenu();
        sobre1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ALGORITMO GENÉTICO FLEXÍVEL");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("AG"); // NOI18N

        tabelado.setToolTipText("");

        panelEntrada.setBorder(javax.swing.BorderFactory.createTitledBorder("Configurações da Execução Atual"));

        panelVariaveisEntrada.setBorder(javax.swing.BorderFactory.createTitledBorder("Configurações da Entrada"));
        panelVariaveisEntrada.setToolTipText("Configure as variáveis de entrada do programa de acordo com o problema.");

        panelParada.setBorder(javax.swing.BorderFactory.createTitledBorder("Critérios de Parada"));

        jcbEstagnacaoPopulacao.setText("Estagnação da População");
        jcbEstagnacaoPopulacao.setEnabled(false);

        jcbEstagnacaoMelhorIndividuo.setSelected(true);
        jcbEstagnacaoMelhorIndividuo.setText("Estagnação Melhor Indivíduo");
        jcbEstagnacaoMelhorIndividuo.setEnabled(false);

        jcbGeracaoMaxima.setSelected(true);
        jcbGeracaoMaxima.setText("Alcance da Geração Máxima");
        jcbGeracaoMaxima.setEnabled(false);

        javax.swing.GroupLayout panelParadaLayout = new javax.swing.GroupLayout(panelParada);
        panelParada.setLayout(panelParadaLayout);
        panelParadaLayout.setHorizontalGroup(
            panelParadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelParadaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelParadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbEstagnacaoPopulacao)
                    .addComponent(jcbEstagnacaoMelhorIndividuo)
                    .addComponent(jcbGeracaoMaxima))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        panelParadaLayout.setVerticalGroup(
            panelParadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelParadaLayout.createSequentialGroup()
                .addComponent(jcbEstagnacaoPopulacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbEstagnacaoMelhorIndividuo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jcbGeracaoMaxima))
        );

        panelSelecao.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleção"));

        selecao.add(jrbRoleta);
        jrbRoleta.setSelected(true);
        jrbRoleta.setText("Roleta");

        selecao.add(jRadioButton2);
        jRadioButton2.setText("Seleção2");
        jRadioButton2.setEnabled(false);

        selecao.add(jRadioButton3);
        jRadioButton3.setText("Seleção3");
        jRadioButton3.setEnabled(false);

        javax.swing.GroupLayout panelSelecaoLayout = new javax.swing.GroupLayout(panelSelecao);
        panelSelecao.setLayout(panelSelecaoLayout);
        panelSelecaoLayout.setHorizontalGroup(
            panelSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSelecaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbRoleta)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        panelSelecaoLayout.setVerticalGroup(
            panelSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSelecaoLayout.createSequentialGroup()
                .addComponent(jrbRoleta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton3))
        );

        panelReproducao.setBorder(javax.swing.BorderFactory.createTitledBorder("Reprodução"));

        jLabel1.setText("População");

        jLabel2.setText("Gerações");

        jLabel3.setText("Vezes");

        jtfpopulacao.setColumns(10);
        jtfpopulacao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfpopulacao.setText("100");
        jtfpopulacao.setToolTipText("Digite o valor desejado.");

        jtfgeracoes.setColumns(10);
        jtfgeracoes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfgeracoes.setText("100");
        jtfgeracoes.setToolTipText("Digite o valor desejado.");

        jtfvezes.setColumns(10);
        jtfvezes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfvezes.setText("20");
        jtfvezes.setToolTipText("Digite o valor desejado.");

        javax.swing.GroupLayout panelReproducaoLayout = new javax.swing.GroupLayout(panelReproducao);
        panelReproducao.setLayout(panelReproducaoLayout);
        panelReproducaoLayout.setHorizontalGroup(
            panelReproducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelReproducaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelReproducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(panelReproducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtfgeracoes)
                    .addComponent(jtfvezes)
                    .addComponent(jtfpopulacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        panelReproducaoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jtfgeracoes, jtfpopulacao, jtfvezes});

        panelReproducaoLayout.setVerticalGroup(
            panelReproducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReproducaoLayout.createSequentialGroup()
                .addGroup(panelReproducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfpopulacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelReproducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfgeracoes, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelReproducaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfvezes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        panelRoleta.setBorder(javax.swing.BorderFactory.createTitledBorder("Roleta"));

        jtfmutacao.setColumns(10);
        jtfmutacao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfmutacao.setText("25");
        jtfmutacao.setToolTipText("Digite o valor desejado.");

        jtfrotacao.setColumns(10);
        jtfrotacao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfrotacao.setText("25");
        jtfrotacao.setToolTipText("Digite o valor desejado.");

        jtfinversao.setColumns(10);
        jtfinversao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfinversao.setText("25");
        jtfinversao.setToolTipText("Digite o valor desejado.");

        jtfrecombinacao.setColumns(10);
        jtfrecombinacao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfrecombinacao.setText("25");
        jtfrecombinacao.setToolTipText("Digite o valor desejado.");

        jLabel4.setText("Mutação");

        jLabel5.setText("Rotação");

        jLabel6.setText("Inversão");

        jLabel7.setText("Recombinação");

        javax.swing.GroupLayout panelRoletaLayout = new javax.swing.GroupLayout(panelRoleta);
        panelRoleta.setLayout(panelRoletaLayout);
        panelRoletaLayout.setHorizontalGroup(
            panelRoletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoletaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRoletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRoletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfrecombinacao, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfinversao, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfrotacao, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfmutacao, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        panelRoletaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jtfinversao, jtfmutacao, jtfrecombinacao, jtfrotacao});

        panelRoletaLayout.setVerticalGroup(
            panelRoletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoletaLayout.createSequentialGroup()
                .addGroup(panelRoletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfrecombinacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRoletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfinversao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRoletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfrotacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRoletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfmutacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        panelRoletaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel4, jLabel5, jLabel6, jLabel7});

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelRoleta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelParada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelSelecao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelReproducao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelParada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelSelecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelReproducao, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(panelRoleta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelCromossomo.setBorder(javax.swing.BorderFactory.createTitledBorder("Cromossomo"));

        jLabel8.setText("Tamanho");

        jLabel9.setText("Semente");

        jLabel10.setText("Início");

        jLabel11.setText("Fim");

        jLabel18.setText("Precisão");

        jtfPrecisao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfPrecisao.setText("0.001");

        jtfTamanho.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfTamanho.setText("16");

        jtfSemente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfSemente.setText("2");

        jtfInicio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfInicio.setText("-12");

        jtfFim.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfFim.setText("12");

        javax.swing.GroupLayout panelCromossomoLayout = new javax.swing.GroupLayout(panelCromossomo);
        panelCromossomo.setLayout(panelCromossomoLayout);
        panelCromossomoLayout.setHorizontalGroup(
            panelCromossomoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCromossomoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCromossomoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel18)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCromossomoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtfPrecisao)
                    .addComponent(jtfFim)
                    .addComponent(jtfInicio)
                    .addComponent(jtfSemente)
                    .addComponent(jtfTamanho, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelCromossomoLayout.setVerticalGroup(
            panelCromossomoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCromossomoLayout.createSequentialGroup()
                .addGroup(panelCromossomoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtfTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCromossomoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfSemente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCromossomoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCromossomoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCromossomoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPrecisao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(162, 162, 162))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Exemplo"));

        jtfCromossomo.setEditable(false);
        jtfCromossomo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfCromossomo.setText("1110010101110101");

        jButton1.setText("Atualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtfCromossomo, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addComponent(jtfCromossomo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelCromossomo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(13, 13, 13))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCromossomo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(305, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelVariaveisEntradaLayout = new javax.swing.GroupLayout(panelVariaveisEntrada);
        panelVariaveisEntrada.setLayout(panelVariaveisEntradaLayout);
        panelVariaveisEntradaLayout.setHorizontalGroup(
            panelVariaveisEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVariaveisEntradaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelVariaveisEntradaLayout.setVerticalGroup(
            panelVariaveisEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVariaveisEntradaLayout.createSequentialGroup()
                .addGroup(panelVariaveisEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelConfiguracoesSaida.setBorder(javax.swing.BorderFactory.createTitledBorder("Configuração da Saída"));

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalhes na Saída"));

        jcbAD.setText("AD");
        jcbAD.setEnabled(false);

        jcbADR.setText("ADR");
        jcbADR.setEnabled(false);

        jcbCromossomo.setText("Cromossomo");
        jcbCromossomo.setEnabled(false);

        jcbNCE.setText("NCE");
        jcbNCE.setEnabled(false);

        jcbVD.setText("VD");
        jcbVD.setEnabled(false);

        jcbGeracao.setSelected(true);
        jcbGeracao.setText("Geração");
        jcbGeracao.setEnabled(false);

        jcbDecimal.setText("Decimal");
        jcbDecimal.setEnabled(false);

        jLabel13.setText("Indivíduos");

        jcbIndividuos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos os Indivíduos", "1 Indivíduo", "5 Indivíduos", "10 Indivíduos" }));
        jcbIndividuos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbIndividuosActionPerformed(evt);
            }
        });

        jtbDetalhes.setText("Todos os Detalhes");
        jtbDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbDetalhesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtbDetalhes, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(jcbVD)
                    .addComponent(jcbNCE)
                    .addComponent(jcbDecimal)
                    .addComponent(jcbGeracao)
                    .addComponent(jcbAD)
                    .addComponent(jcbADR)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(jcbIndividuos, 0, 128, Short.MAX_VALUE))
                    .addComponent(jcbCromossomo))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jtbDetalhes)
                .addGap(14, 14, 14)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jcbIndividuos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbAD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbADR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbNCE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbVD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbDecimal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbGeracao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbCromossomo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        start.setFont(new java.awt.Font("Tahoma", 1, 18));
        start.setForeground(new java.awt.Color(0, 204, 102));
        start.setText("START");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/uern.png"))); // NOI18N

        javax.swing.GroupLayout panelConfiguracoesSaidaLayout = new javax.swing.GroupLayout(panelConfiguracoesSaida);
        panelConfiguracoesSaida.setLayout(panelConfiguracoesSaidaLayout);
        panelConfiguracoesSaidaLayout.setHorizontalGroup(
            panelConfiguracoesSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConfiguracoesSaidaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelConfiguracoesSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConfiguracoesSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(start, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        panelConfiguracoesSaidaLayout.setVerticalGroup(
            panelConfiguracoesSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConfiguracoesSaidaLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );

        javax.swing.GroupLayout panelEntradaLayout = new javax.swing.GroupLayout(panelEntrada);
        panelEntrada.setLayout(panelEntradaLayout);
        panelEntradaLayout.setHorizontalGroup(
            panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEntradaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelVariaveisEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelConfiguracoesSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(178, 178, 178))
        );
        panelEntradaLayout.setVerticalGroup(
            panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEntradaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelConfiguracoesSaida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelVariaveisEntrada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabelado.addTab("Entrada", panelEntrada);

        panelSaida2.setBorder(javax.swing.BorderFactory.createTitledBorder("Saída"));

        areaSaida.setColumns(20);
        areaSaida.setEditable(false);
        areaSaida.setRows(5);
        areaSaida.setToolTipText("Área de saída dos dados do programa.");
        jScrollPane1.setViewportView(areaSaida);

        barra.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                barraStateChanged(evt);
            }
        });

        javax.swing.GroupLayout panelSaida2Layout = new javax.swing.GroupLayout(panelSaida2);
        panelSaida2.setLayout(panelSaida2Layout);
        panelSaida2Layout.setHorizontalGroup(
            panelSaida2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSaida2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSaida2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 902, Short.MAX_VALUE)
                    .addComponent(barra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 902, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelSaida2Layout.setVerticalGroup(
            panelSaida2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSaida2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabelado.addTab("Saida", panelSaida2);

        tabeladoGraficos.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tabeladoGraficosComponentShown(evt);
            }
        });

        javax.swing.GroupLayout graf1Layout = new javax.swing.GroupLayout(graf1);
        graf1.setLayout(graf1Layout);
        graf1Layout.setHorizontalGroup(
            graf1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 930, Short.MAX_VALUE)
        );
        graf1Layout.setVerticalGroup(
            graf1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
        );

        tabeladoGraficos.addTab("Atual", graf1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 930, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
        );

        tabeladoGraficos.addTab("Último", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 930, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
        );

        tabeladoGraficos.addTab("Estatísticas", jPanel4);

        tabelaDados.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabela Dados"));

        javax.swing.GroupLayout tabelaDadosLayout = new javax.swing.GroupLayout(tabelaDados);
        tabelaDados.setLayout(tabelaDadosLayout);
        tabelaDadosLayout.setHorizontalGroup(
            tabelaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 894, Short.MAX_VALUE)
        );
        tabelaDadosLayout.setVerticalGroup(
            tabelaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 531, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabelaDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabelaDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabeladoGraficos.addTab("Banco", jPanel6);

        javax.swing.GroupLayout panelGraficosLayout = new javax.swing.GroupLayout(panelGraficos);
        panelGraficos.setLayout(panelGraficosLayout);
        panelGraficosLayout.setHorizontalGroup(
            panelGraficosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabeladoGraficos, javax.swing.GroupLayout.DEFAULT_SIZE, 938, Short.MAX_VALUE)
        );
        panelGraficosLayout.setVerticalGroup(
            panelGraficosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabeladoGraficos, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
        );

        tabelado.addTab("Gráficos", panelGraficos);

        barraMenu.setPreferredSize(new java.awt.Dimension(200, 21));

        arquivo.setMnemonic('a');
        arquivo.setText("Arquivo");

        jMenuItem1.setText("Abrir Resultados Anteriores");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        arquivo.add(jMenuItem1);

        jMenuItem2.setText("Salvar Resultado Atual");
        arquivo.add(jMenuItem2);

        jMenuItem3.setText("Verificar Estatísticas");
        arquivo.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Sair");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        arquivo.add(jMenuItem4);

        barraMenu.add(arquivo);

        configuracoes.setMnemonic('c');
        configuracoes.setText("Configurações");

        jmiEntrada.setText("Entrada");
        configuracoes.add(jmiEntrada);

        jmiSaida.setText("Saída");
        configuracoes.add(jmiSaida);

        jmiEstatisticas.setText("Estatísticas");
        configuracoes.add(jmiEstatisticas);

        jmiBancoDeDados.setText("Banco de Dados");
        configuracoes.add(jmiBancoDeDados);

        jmDesempenho.setText("Desempenho");

        desempenho.add(jrbmiAlto);
        jrbmiAlto.setSelected(true);
        jrbmiAlto.setText("Alto");
        jmDesempenho.add(jrbmiAlto);

        desempenho.add(jRadioButtonMenuItem3);
        jRadioButtonMenuItem3.setText("Médio");
        jmDesempenho.add(jRadioButtonMenuItem3);

        desempenho.add(jRadioButtonMenuItem1);
        jRadioButtonMenuItem1.setText("Baixo");
        jmDesempenho.add(jRadioButtonMenuItem1);

        jCheckBoxMenuItem2.setText("Banco de Dados PostgreSQL");
        jCheckBoxMenuItem2.setEnabled(false);
        jmDesempenho.add(jCheckBoxMenuItem2);

        jCheckBoxMenuItem1.setText("Banco de Dados em Disco");
        jCheckBoxMenuItem1.setEnabled(false);
        jmDesempenho.add(jCheckBoxMenuItem1);

        configuracoes.add(jmDesempenho);

        barraMenu.add(configuracoes);

        jmIAeRNA.setMnemonic('i');
        jmIAeRNA.setText("IA & RNA");

        jmiIA.setText("IA");
        jmiIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiIAActionPerformed(evt);
            }
        });
        jmIAeRNA.add(jmiIA);

        jmiRNA.setText("RNA");
        jmIAeRNA.add(jmiRNA);

        barraMenu.add(jmIAeRNA);

        ajuda.setMnemonic('j');
        ajuda.setText("Ajuda");

        sobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        sobre.setText("Sobre o programa");
        sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobreActionPerformed(evt);
            }
        });
        ajuda.add(sobre);

        barraMenu.add(ajuda);

        barraMenu1.setPreferredSize(new java.awt.Dimension(200, 21));

        arquivo1.setMnemonic('a');
        arquivo1.setText("Arquivo");

        jMenuItem5.setText("Abrir Resultados Anteriores");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        arquivo1.add(jMenuItem5);

        jMenuItem6.setText("Salvar Resultado Atual");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        arquivo1.add(jMenuItem6);

        jMenuItem7.setText("Verificar Estatísticas");
        arquivo1.add(jMenuItem7);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setText("Sair");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        arquivo1.add(jMenuItem8);

        barraMenu1.add(arquivo1);

        configuracoes1.setMnemonic('c');
        configuracoes1.setText("Configurações");

        jmiEntrada1.setText("Entrada");
        configuracoes1.add(jmiEntrada1);

        jmiSaida1.setText("Saída");
        configuracoes1.add(jmiSaida1);

        jmiEstatisticas1.setText("Estatísticas");
        configuracoes1.add(jmiEstatisticas1);

        jmiBancoDeDados1.setText("Banco de Dados");
        configuracoes1.add(jmiBancoDeDados1);

        jmDesempenho1.setText("Desempenho");

        desempenho.add(jrbmiAlto1);
        jrbmiAlto1.setSelected(true);
        jrbmiAlto1.setText("Alto");
        jmDesempenho1.add(jrbmiAlto1);

        desempenho.add(jRadioButtonMenuItem4);
        jRadioButtonMenuItem4.setText("Médio");
        jmDesempenho1.add(jRadioButtonMenuItem4);

        desempenho.add(jRadioButtonMenuItem2);
        jRadioButtonMenuItem2.setText("Baixo");
        jmDesempenho1.add(jRadioButtonMenuItem2);

        jCheckBoxMenuItem3.setText("Banco de Dados PostgreSQL");
        jCheckBoxMenuItem3.setEnabled(false);
        jmDesempenho1.add(jCheckBoxMenuItem3);

        jCheckBoxMenuItem4.setText("Banco de Dados em Disco");
        jCheckBoxMenuItem4.setEnabled(false);
        jmDesempenho1.add(jCheckBoxMenuItem4);

        configuracoes1.add(jmDesempenho1);

        barraMenu1.add(configuracoes1);

        jmIAeRNA1.setMnemonic('i');
        jmIAeRNA1.setText("IA & RNA");

        jmiIA1.setText("IA");
        jmiIA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiIAActionPerformed(evt);
            }
        });
        jmIAeRNA1.add(jmiIA1);

        jmiRNA1.setText("RNA");
        jmIAeRNA1.add(jmiRNA1);

        barraMenu1.add(jmIAeRNA1);

        ajuda1.setMnemonic('j');
        ajuda1.setText("Ajuda");

        sobre1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        sobre1.setText("Sobre o programa");
        sobre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobreActionPerformed(evt);
            }
        });
        ajuda1.add(sobre1);

        barraMenu1.add(ajuda1);

        setJMenuBar(barraMenu1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabelado, javax.swing.GroupLayout.PREFERRED_SIZE, 946, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabelado, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        System.exit(EXIT_ON_CLOSE);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JFileChooser jfc = new JFileChooser();
        File f = jfc.getSelectedFile();
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void sobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobreActionPerformed
        Sobre s = new Sobre();
        s.setLocationRelativeTo(this);
        s.setVisible(true);
    }//GEN-LAST:event_sobreActionPerformed

    private void jmiIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiIAActionPerformed
    //TODO
    }//GEN-LAST:event_jmiIAActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        final int populacao = Integer.parseInt(jtfpopulacao.getText());
        final int geracoes = Integer.parseInt(jtfgeracoes.getText());
        final int vezes = Integer.parseInt(jtfvezes.getText());
        final double recombinacao = Double.parseDouble(jtfrecombinacao.getText());
        final double inversao = Double.parseDouble(jtfinversao.getText());
        final double rotacao = Double.parseDouble(jtfrotacao.getText());
        final double mutacao = Double.parseDouble(jtfmutacao.getText());
        final double precisao = Double.parseDouble(jtfPrecisao.getText());
        final int tamanhoCromossomo = Integer.parseInt(jtfTamanho.getText());
        final int semente = Integer.parseInt(jtfSemente.getText());
        final int inicioFuncao = Integer.parseInt(jtfInicio.getText());
        final int fimFuncao = Integer.parseInt(jtfFim.getText());

        tabelado.setSelectedIndex(1);
        
        inicio = System.currentTimeMillis();

        new Thread() {

            @Override
            public void run() {
                setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                areaSaida.setText("");
                new AG(populacao, geracoes, vezes, recombinacao, inversao,
                        rotacao, mutacao, precisao, tamanhoCromossomo, semente, inicioFuncao, fimFuncao);
                setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
        }.start();
    }//GEN-LAST:event_startActionPerformed

    private void jtbDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbDetalhesActionPerformed
        if (todos == 1) {
            todos = 0;
            jcbAD.setSelected(false);
            jcbADR.setSelected(false);
            jcbNCE.setSelected(false);
            jcbVD.setSelected(false);
            jcbDecimal.setSelected(false);
            jcbCromossomo.setSelected(false);
        } else {
            todos = 1;
            jcbAD.setSelected(true);
            jcbADR.setSelected(true);
            jcbNCE.setSelected(true);
            jcbVD.setSelected(true);
            jcbDecimal.setSelected(true);
            jcbCromossomo.setSelected(true);
        }
    }//GEN-LAST:event_jtbDetalhesActionPerformed

    private void jcbIndividuosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbIndividuosActionPerformed
        int escolha = jcbIndividuos.getSelectedIndex();

        switch (escolha) {
            case 0:
                individuos = 0;
                break;
            case 1:
                individuos = 1;
                break;
            case 2:
                individuos = 5;
                break;
            case 3:
                individuos = 10;
                break;
            default:
                break;
        }
    }//GEN-LAST:event_jcbIndividuosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Random ale = new Random();
        int semente = Integer.parseInt(jtfSemente.getText());
        int tamanho = Integer.parseInt(jtfTamanho.getText());

        String cromossomoDemo = "";
        for (int i = 0; i < tamanho; i++) {
            cromossomoDemo = cromossomoDemo + String.valueOf(ale.nextInt(semente));
        }

        jtfCromossomo.setText(cromossomoDemo);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void barraStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_barraStateChanged
    // TODO add your handling code here:
    }//GEN-LAST:event_barraStateChanged

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        salvarDadosBancoPostgres();
        preencherTabelaDados();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void tabeladoGraficosComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tabeladoGraficosComponentShown
       
    }//GEN-LAST:event_tabeladoGraficosComponentShown

    public static void main(String args[]) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException,
            UnsupportedLookAndFeelException {
        //UIManager.setLookAndFeel(new MetalLookAndFeel());
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    new AGGui().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(AGGui.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(AGGui.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(AGGui.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(AGGui.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ajuda;
    private javax.swing.JMenu ajuda1;
    private javax.swing.JTextArea areaSaida;
    private javax.swing.JMenu arquivo;
    private javax.swing.JMenu arquivo1;
    private javax.swing.JProgressBar barra;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuBar barraMenu1;
    private javax.swing.JMenu configuracoes;
    private javax.swing.JMenu configuracoes1;
    private javax.swing.ButtonGroup desempenho;
    private javax.swing.JPanel graf1;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox jcbAD;
    private javax.swing.JCheckBox jcbADR;
    private javax.swing.JCheckBox jcbCromossomo;
    private javax.swing.JCheckBox jcbDecimal;
    private javax.swing.JCheckBox jcbEstagnacaoMelhorIndividuo;
    private javax.swing.JCheckBox jcbEstagnacaoPopulacao;
    private javax.swing.JCheckBox jcbGeracao;
    private javax.swing.JCheckBox jcbGeracaoMaxima;
    private javax.swing.JComboBox jcbIndividuos;
    private javax.swing.JCheckBox jcbNCE;
    private javax.swing.JCheckBox jcbVD;
    private javax.swing.JMenu jmDesempenho;
    private javax.swing.JMenu jmDesempenho1;
    private javax.swing.JMenu jmIAeRNA;
    private javax.swing.JMenu jmIAeRNA1;
    private javax.swing.JMenuItem jmiBancoDeDados;
    private javax.swing.JMenuItem jmiBancoDeDados1;
    private javax.swing.JMenuItem jmiEntrada;
    private javax.swing.JMenuItem jmiEntrada1;
    private javax.swing.JMenuItem jmiEstatisticas;
    private javax.swing.JMenuItem jmiEstatisticas1;
    private javax.swing.JMenuItem jmiIA;
    private javax.swing.JMenuItem jmiIA1;
    private javax.swing.JMenuItem jmiRNA;
    private javax.swing.JMenuItem jmiRNA1;
    private javax.swing.JMenuItem jmiSaida;
    private javax.swing.JMenuItem jmiSaida1;
    private javax.swing.JRadioButton jrbRoleta;
    private javax.swing.JRadioButtonMenuItem jrbmiAlto;
    private javax.swing.JRadioButtonMenuItem jrbmiAlto1;
    private javax.swing.JToggleButton jtbDetalhes;
    private javax.swing.JTextField jtfCromossomo;
    private javax.swing.JTextField jtfFim;
    private javax.swing.JTextField jtfInicio;
    private javax.swing.JTextField jtfPrecisao;
    private javax.swing.JTextField jtfSemente;
    private javax.swing.JTextField jtfTamanho;
    private javax.swing.JTextField jtfgeracoes;
    private javax.swing.JTextField jtfinversao;
    private javax.swing.JTextField jtfmutacao;
    private javax.swing.JTextField jtfpopulacao;
    private javax.swing.JTextField jtfrecombinacao;
    private javax.swing.JTextField jtfrotacao;
    private javax.swing.JTextField jtfvezes;
    private javax.swing.JPanel panelConfiguracoesSaida;
    private javax.swing.JPanel panelCromossomo;
    private javax.swing.JPanel panelEntrada;
    private javax.swing.JPanel panelGraficos;
    private javax.swing.JPanel panelParada;
    private javax.swing.JPanel panelReproducao;
    private javax.swing.JPanel panelRoleta;
    private javax.swing.JPanel panelSaida2;
    private javax.swing.JPanel panelSelecao;
    private javax.swing.JPanel panelVariaveisEntrada;
    private javax.swing.ButtonGroup selecao;
    private javax.swing.JMenuItem sobre;
    private javax.swing.JMenuItem sobre1;
    private javax.swing.JButton start;
    private javax.swing.JPanel tabelaDados;
    private javax.swing.JTabbedPane tabelado;
    private javax.swing.JTabbedPane tabeladoGraficos;
    // End of variables declaration//GEN-END:variables
    class AG {

        private int POPULACAO = 50;
        private int TAMANHO_CROMOSSOMO = 16;
        private int CODIGO = 2;
        private int INICIO = -12;
        private int FIM = 12;
        private int GERACOES = 50;
        private int SEMENTE = 2;
        private double PRECISAO = 0.001;
        private int VEZES = 5;
        private int contadorGeracoes = 0;
        private int melhorIndividuo = 0;
        private double melhor = 0;
        private double ADs[];
        private double ADRs[];
        private double NCEs[];
        private double VDs[];
        private double Decimais[];
        private int populacao[][];
        private int geracoes[][];
        private Random aleatorio = new Random();
        private double SOMA_ADR[];
        private double RECOMBINACAO = 0;
        private double MUTACAO = 0;
        private double INVERSAO = 0;
        private double ROTACAO = 0;
        private double MAIOR_ADR = 0;
        private double MAIOR_AD = 0;

        public AG(int popu, int gera, int vezes, double recombinacao, double inversao,
                double rotacao, double mutacao, double precisao, int tamanhoCromossomo, int semente, int inicioFuncao, int fimFuncao) {

            POPULACAO = popu;
            GERACOES = gera;
            VEZES = vezes;
            RECOMBINACAO = recombinacao;
            INVERSAO = inversao;
            MUTACAO = mutacao;
            ROTACAO = rotacao;
            PRECISAO = precisao;
            TAMANHO_CROMOSSOMO = tamanhoCromossomo;
            SEMENTE = semente;
            INICIO = inicioFuncao;
            FIM = fimFuncao;

            System.out.println(precisao);

            populacao = new int[POPULACAO][TAMANHO_CROMOSSOMO];
            ADs = new double[POPULACAO];
            ADRs = new double[POPULACAO];
            NCEs = new double[POPULACAO];
            VDs = new double[POPULACAO];
            Decimais = new double[POPULACAO];
            SOMA_ADR = new double[POPULACAO];
            geracoes = new int[POPULACAO][TAMANHO_CROMOSSOMO];

            inicializaPopulacao();
            calculaTodosDecimais();
            calculaTodosVDs();
            calculaTodosADs();
            calculaTodosNCEs();
            calculaTodosADRs();

            //mostraValores();
            calculaLimitesADR();
            reproducao();
        }

        public void inicializaPopulacao() {
            for (int i = 0; i < POPULACAO; i++) {
                for (int j = 0; j < TAMANHO_CROMOSSOMO; j++) {
                    populacao[i][j] = geraGene();
                }
            }
        }

        public int geraGene() {
            return aleatorio.nextInt(SEMENTE);
        }

        public String getCromossomo(int posicaoPopulacao) {
            String cromossomo = "";
            for (int i = 0; i < TAMANHO_CROMOSSOMO; i++) {
                cromossomo += String.format("%d", populacao[posicaoPopulacao][i]);
            }

            return cromossomo;
        }

        public double funcaoTrabalho(double valorDeX) {
            double resultado1 = 0;
            double resultado2 = 0;
            double resultadoFinal = 0;
            double x = valorDeX;

            resultado1 = -Math.pow(x, 4) + (5 * Math.pow(x, 3)) - (17 * Math.pow(x, 2)) + x + 4000;

            resultado2 = Math.sin(1.7 * x - 200) * Math.exp(x / 250);

            return Math.abs((resultado1 * resultado2) + 5997);
        }

        public void calculaTodosDecimais() {
            for (int i = 0; i < POPULACAO; i++) {
                Decimais[i] = calculaDecimal(i);
            }
        }

        public void calculaTodosVDs() {
            for (int i = 0; i < POPULACAO; i++) {
                VDs[i] = calculaVD(Decimais[i]);
            }
        }

        public void calculaTodosADs() {
            for (int i = 0; i < POPULACAO; i++) {
                ADs[i] = calculaAD(VDs[i]);
            }
        }

        public void calculaTodosNCEs() {
            for (int i = 0; i < POPULACAO; i++) {
                NCEs[i] = calculaNCE(ADs[i]);
            }
        }

        public void calculaTodosADRs() {
            for (int i = 0; i < POPULACAO; i++) {
                ADRs[i] = calculaADR(ADs[i]);
            }
        }

        public void calculaLimitesADR() {
            double total = 0;

            for (int i = 0; i < POPULACAO; i++) {
                total = 0;
                for (int j = 0; j <= i; j++) {
                    total += ADRs[j];
                }
                SOMA_ADR[i] = total;
            }
        }

        public double calculaVD(double cromossomo) {
            double VD = INICIO + (FIM - INICIO) * cromossomo / calculaVDS();

            return VD;
        }

        public double calculaAD(double VD) {
            double AD = 1 / funcaoTrabalho(VD); //� A INVERSA!!!!!!!!!!!!!!!!!!!!!!!!

            return AD;
        }

        public double somatorioAD() {
            double total = 0;
            for (int i = 0; i < POPULACAO; i++) {
                total += ADs[i];
            }

            return total;
        }

        public int melhorAD() {
            int maiorI = 0;
            for (int i = 0; i < POPULACAO; i++) {
                if (ADs[i] > MAIOR_AD) {
                    MAIOR_AD = ADs[i];
                }
            }
            for (int i = 0; i < POPULACAO; i++) {
                if (ADs[i] == MAIOR_AD) {
                    maiorI = i;
                }
            }

            return maiorI;
        }

        public double calculaNCE(double AD) {
            double NCE = (double) AD / somatorioAD() / (FIM - INICIO);

            return NCE;
        }

        public double somatorioNCE() {
            double total = 0;
            for (int i = 0; i < POPULACAO; i++) {
                total += NCEs[i];
            }

            return total;
        }

        public double calculaADR(double AD) {
            double ADR = (double) AD / somatorioAD();

            return ADR;
        }

        public double somatorioADR() {
            double total = 0;
            for (int i = 0; i < POPULACAO; i++) {
                total += ADRs[i];
            }

            return total;
        }

        public double calculaDecimal(int cromossomo) {
            int expoente = TAMANHO_CROMOSSOMO - 1;
            int total = 0;

            for (int i = 0; i < TAMANHO_CROMOSSOMO; i++) {
                total += populacao[cromossomo][i] * Math.pow(CODIGO, expoente--);
            }

            return total;
        }

        public int calculaVDS() {
            int expoente = TAMANHO_CROMOSSOMO - 1;
            int VDS = 0;

            for (int i = 0; i < TAMANHO_CROMOSSOMO; i++) {
                VDS += Math.pow(CODIGO, expoente--);
            }

            return VDS;
        }

        public int calculaTamanhoCromossomo(int i, int f, double p) {
            int inicio = i;
            int fim = f;
            double precisao = p;
            double resultado = Math.log(1 + (fim - inicio) / precisao) / Math.log(2);
            int comprimento = (int) resultado;
            return 1 + comprimento;
        }

        public boolean criteriosDeParada() {
            if (contadorGeracoes == 0) {
                melhor = VDs[melhorAD()];
            } else if (VDs[melhorAD()] == melhor) {
                melhorIndividuo++;
            } else {
                melhorIndividuo = 0;
                melhor = VDs[melhorAD()];
            }

            if (melhorIndividuo == VEZES) {
                fim = System.currentTimeMillis();
                double segundos = (double) (fim - inicio) / 1000;
                String message = String.format("Melhor indiv�duo por %d gera��es �: %.3f \nTempo de execu��o: %.2f segundos", VEZES, melhor, segundos);
                JOptionPane.showMessageDialog(null, message, "FIM DO APLICATIVO", JOptionPane.ERROR_MESSAGE);
                return true;
            }
            return false;
        }

        public int selecao() {
            double seleciona = aleatorio.nextDouble();
            int melhorADR = selecionaMelhorADR(aleatorio.nextDouble());
            int melhorADR2 = selecionaMelhorADR(aleatorio.nextDouble());
            int retorno = 0;

            seleciona *= 100;

            if (seleciona <= RECOMBINACAO) {
                //	System.out.println("Recombinacao, de 0 a " + RECOMBINACAO);
                retorno = recombinacao(melhorADR, melhorADR2);
            }
            if ((seleciona <= (RECOMBINACAO + MUTACAO)) && (seleciona > RECOMBINACAO)) {
                //	System.out.printf("Mutacao, de %.2f a %.2f \n", RECOMBINACAO, RECOMBINACAO+MUTACAO);
                retorno = mutacao(melhorADR);
            }
            if ((seleciona <= (RECOMBINACAO + MUTACAO + INVERSAO)) && (seleciona > RECOMBINACAO + MUTACAO)) {
                //	System.out.printf("Inversao, de %.2f a %.2f \n", RECOMBINACAO+MUTACAO, RECOMBINACAO+MUTACAO+INVERSAO);
                retorno = inversao(melhorADR);
            }
            if (seleciona > (RECOMBINACAO + MUTACAO + INVERSAO)) {
                //	System.out.printf("Rotacao, de %.2f a %.2f \n", RECOMBINACAO+MUTACAO+INVERSAO, 100.00);
                retorno = rotacao(melhorADR);
            }

            //System.out.printf("Aleatorio gerado: %.2f \n", seleciona);

            return retorno;
        }

        public int selecionaMelhorADR(double porcentagem) {
            int i = 0;
            for (i = 0; i < POPULACAO; i++) {
                if (porcentagem < SOMA_ADR[i]) {
                    break;
                }
            }

            return i;
        }

        public int recombinacao(int adr, int adr2) {
            int P1 = aleatorio.nextInt(TAMANHO_CROMOSSOMO - 1);
            int P2 = aleatorio.nextInt(TAMANHO_CROMOSSOMO - 1);
            int maior = 0;
            int menor = 15;

            if (maior < P1) {
                maior = P1;
            }
            if (maior < P2) {
                maior = P2;
            }
            if (menor > P1) {
                menor = P1;
            }
            if (menor > P2) {
                menor = P2;
            }

            int temp[] = new int[TAMANHO_CROMOSSOMO];

            for (int i = menor; i <= maior; i++) {
                temp[i] = populacao[adr][i];
            }

            for (int i = menor; i <= maior; i++) {
                populacao[adr][i] = populacao[adr2][i];
            }

            for (int i = menor; i <= maior; i++) {
                populacao[adr2][i] = temp[i];
            }

            int retorno = 0;
            if (calculaDecimal(adr) > calculaDecimal(adr2)) {
                retorno = adr;
            } else {
                retorno = adr2;
            }

            return retorno;
        }

        public int mutacao(int adr) {
            int P1 = aleatorio.nextInt(TAMANHO_CROMOSSOMO - 1);

            if (populacao[adr][P1] == 1) {
                populacao[adr][P1] = 0;
            } else if (populacao[adr][P1] == 0) {
                populacao[adr][P1] = 1;
            }

            return adr;
        }

        public int inversao(int adr) {
            int P1 = aleatorio.nextInt(TAMANHO_CROMOSSOMO - 1);
            int P2 = aleatorio.nextInt(TAMANHO_CROMOSSOMO - 1);
            int maior = 0;
            int menor = 15;

            if (maior < P1) {
                maior = P1;
            }
            if (maior < P2) {
                maior = P2;
            }
            if (menor > P1) {
                menor = P1;
            }
            if (menor > P2) {
                menor = P2;
            }

            int temp[] = new int[TAMANHO_CROMOSSOMO];

            for (int i = menor; i <= maior; i++) {
                temp[i] = populacao[adr][i];
            }

            int inversor = maior;
            for (int j = menor; j <= maior; j++) {
                populacao[adr][j] = temp[inversor--];
            }

            return adr;
        }

        public int rotacao(int adr) {
            int P1 = aleatorio.nextInt(TAMANHO_CROMOSSOMO - 1);
            int P2 = aleatorio.nextInt(TAMANHO_CROMOSSOMO - 1);
            int maior = 0;
            int menor = 15;

            if (maior < P1) {
                maior = P1;
            }
            if (maior < P2) {
                maior = P2;
            }
            if (menor > P1) {
                menor = P1;
            }
            if (menor > P2) {
                menor = P2;
            }

            if (menor == 0) {
                menor++;
            }

            int temp[] = new int[TAMANHO_CROMOSSOMO];

            for (int j = menor; j <= maior; j++) {
                temp[j] = populacao[adr][j];
            }

            for (int j = menor; j <= maior; j++) {
                populacao[adr][j] = temp[j - 1];
            }

            populacao[adr][menor] = temp[maior];

            return adr;
        }

        public void reproducao() {
            int retorno = 0;

            for (int i = 0; i < GERACOES; i++) {
                if (!criteriosDeParada()) {
                    populacaoParaGeracao(0, melhorAD());


                    for (int j = 1; j < POPULACAO; j++) {
                        retorno = selecao();
                        populacaoParaGeracao(j, retorno);
                    }
                    preenchePopulacaoComGeracao();
                    calculaTodosDecimais();
                    calculaTodosVDs();
                    calculaTodosADs();
                    calculaTodosNCEs();
                    calculaTodosADRs();
                    calculaLimitesADR();
                    areaSaida.append("GERACAO: " + ++contadorGeracoes + "\n");
                    Double percentualBarra = (double) contadorGeracoes / GERACOES * 100;
                    int perc = percentualBarra.intValue();
                    barra.setValue(perc);
                    barra.setString("Porcentagem em rela��o � gera�ao m�xima = " + perc + " %");
                    barra.setStringPainted(rootPaneCheckingEnabled);
                    barra.updateUI();

                    mostraValores();

                    if (contadorGeracoes == GERACOES) {
                        areaSaida.append("GERA��O MAXIMA!!!");
                        fim = System.currentTimeMillis();
                        double segundos = (double) (fim - inicio) / 1000;
                        String message = String.format("Fim da execu��o por alcan�ar a gera��o m�xima! \nMelhor individuo: %.2f\nTempo de execu��o: %.2f segundos", melhor, segundos);
                        JOptionPane.showMessageDialog(null, message, "GERA��O MAXIMA!!!", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    break;
                }
            }
        }

        public void preenchePopulacaoComGeracao() {
            for (int i = 0; i < POPULACAO; i++) {
                for (int j = 0; j < TAMANHO_CROMOSSOMO; j++) {
                    populacao[i][j] = geracoes[i][j];
                }
            }
        }

        public void populacaoParaGeracao(int antigo, int novo) {
            for (int i = 0; i < TAMANHO_CROMOSSOMO; i++) {
                geracoes[antigo][i] = populacao[novo][i];
            }
        }

        public void mostraValores() {
            if (individuos == 0) {
                individuos = POPULACAO;
            }

            for (int i = 0; i < individuos; i++) {
                if (todos == 1) {
                    String str1 = String.format("Cromossomo %-3d %s %-5s %s %-5.0f %-5s %-7.3f", (i + 1), ": ", getCromossomo(i), " Decimal: ", calculaDecimal(i), " VD: ", VDs[i]);
                    String str2 = String.format("%3s %-10.3f %3s %-4.3f %3s %-4.5f \n", " AD: ", ADs[i], " ADR: ", ADRs[i], " NCE: ", NCEs[i]);
                    areaSaida.append(str1 + str2);
                }
                areaSaida.setCaretPosition(areaSaida.getText().length() - 1);
            }
        }//fim do m�todo mostra valores   
    }//fim da classe interna AG
}//fim da classe externa

