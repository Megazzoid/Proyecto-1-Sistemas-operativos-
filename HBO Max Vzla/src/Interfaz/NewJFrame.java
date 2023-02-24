/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.Main;
import Clases.Productores_GOT;
import java.util.concurrent.Semaphore;
import javax.swing.JTextField;




/**
 *
 * @author kevin
 */
public class NewJFrame extends javax.swing.JFrame {
    private static NewJFrame newJFrame;
    public static int num_prod;
    public static int Productores;
    public static int num_prod2;
    public static int num_prod3;
    public static int num_prod4;
    public static int num_prod5;
    public static int num_ens;
    
    public static Semaphore semaforoMax = new Semaphore(200);
    public static Semaphore semaforoIntro = new Semaphore(30);
    public static Semaphore semaforoCredits = new Semaphore(25);
    public static Semaphore semaforoInicio = new Semaphore(50);
    public static Semaphore semaforoCierra = new Semaphore(55);
    public static Semaphore semaforoGiro = new Semaphore(40);
    
    public static Productores_GOT hilo1;
    public static Productores_GOT hilo2;
    public static Productores_GOT hilo3;
    public static Productores_GOT hilo4;
    public static Productores_GOT hilo5;
    public static Productores_GOT hilo6;
    /**
     * Creates new form NewJFrame
     */
    
    public NewJFrame() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.PausarRyM.setEnabled(false);
        this.Reanudar.setEnabled(false);

    }
    
    public static synchronized NewJFrame getInstance(){
        if (newJFrame ==null){
            newJFrame =  new NewJFrame();
        }
        return newJFrame;
    }
    
public synchronized void introDisp(String info){
        introDis.setText(info);
    }
    
    public synchronized void credDisp(String info){
        creditoDis.setText(info);
    }
    
    public synchronized void iniDisp(String info){
        iniDis.setText(info);
    }
    
        public synchronized void cierreDisp(String info){
        cierreDis.setText(info);
    }
        
        public synchronized void plotDisp(String info){
        plotDis.setText(info);
    }
        
        public synchronized void capDisp(String info){
        capListo.setText(info);
    }

        public synchronized void TotalDias(String info){
            DiasGOT.setText(info);
        }
        
        public synchronized void pjvago(String info){
            pjGOT.setText(info);
        }
        
        public synchronized void DirectorGOT(String info){
            salarioDirector.setText(info);
        }

 public void Productores(int productores){
        this.num_prod = productores; 
    }
    
    public void Productores2(int productores2){
        this.num_prod2 = productores2; 
    }
    
    public void Productores3(int productores3){
        this.num_prod3 = productores3; 
    }
    
    public void Productores4(int productores4){
        this.num_prod4 = productores4; 
    }
    
    public void Productores5(int productores5){
        this.num_prod5 = productores5; 
    }
    
    public void ProductoresEnsambladores(int ensa){
        this.num_ens = ensa; 
    }
   public synchronized void getintroDisponibleRym (String info){
       introDisponible.setText(info);
   }
   
   public synchronized void getinicioDisponibleRym (String info){
       InicioRyM.setText(info);
       
   }
   public synchronized void getCreditoDisponibleRym (String info){
       CreditosRyM.setText(info);
         
   }
   
   public synchronized void getfinalDisponibleRym (String info){
       FinalesRyM.setText(info);
   }
   
   public synchronized void getPlotDisponibleRym (String info){
       PlotRyM.setText(info);
   }
   
   public synchronized void getCapituloRyM (String info){
       CapituloRyM.setText(info);
   }
   
   public synchronized void getCapituloPlotRyM (String info){
       CapituloPlotRyM.setText(info);
   }
   public synchronized void DiaRyM (String info){
       DiasFaltantesRyM.setText(info);
   }
   public synchronized void PjRyM (String info){
       PjRyM.setText(info);
   }
   
   public synchronized void DirectorRyM (String info){
       DirectorRyM.setText(info);
   }
   
   public synchronized void SalarioPMRyM(String info){
       SalarioPMRYM.setText(info);
   }
   
   public synchronized void SalarioMensual(String info){
       SalarioMensual.setText(info);
   }
   
   public synchronized void LoteRyM(String info){
       LoteRyM.setText(info);
   }
   
    public synchronized void GananciaRyM(String info){
       GananciaRyM.setText(info);
   }
    public synchronized void AudenciaPorLote(String info){
       AudenciaPorLote.setText(info);
   }
    
    
  
       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        introDisponible = new javax.swing.JLabel();
        InicioRyM = new javax.swing.JLabel();
        CreditosRyM = new javax.swing.JLabel();
        FinalesRyM = new javax.swing.JLabel();
        PlotRyM = new javax.swing.JLabel();
        CapituloRyM = new javax.swing.JLabel();
        CapituloPlotRyM = new javax.swing.JLabel();
        DiasFaltantesRyM = new javax.swing.JLabel();
        LoteRyM = new javax.swing.JLabel();
        PjRyM = new javax.swing.JLabel();
        GananciaRyM = new javax.swing.JLabel();
        SalarioPMRYM = new javax.swing.JLabel();
        DirectorRyM = new javax.swing.JLabel();
        SalarioMensual = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        prodPlot = new javax.swing.JTextField();
        prodCred = new javax.swing.JTextField();
        prodIntro = new javax.swing.JTextField();
        prodIni = new javax.swing.JTextField();
        prodCierre = new javax.swing.JTextField();
        delIntro = new javax.swing.JButton();
        addIntro = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        introDis = new javax.swing.JTextField();
        creditoDis = new javax.swing.JTextField();
        iniDis = new javax.swing.JTextField();
        cierreDis = new javax.swing.JTextField();
        sueldoGOT = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        plotDis = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        ensa = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        DiasGOT = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        salarioDirector = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        pjGOT = new javax.swing.JTextField();
        addCred = new javax.swing.JButton();
        delCred = new javax.swing.JButton();
        delIni = new javax.swing.JButton();
        addIni = new javax.swing.JButton();
        delCierre = new javax.swing.JButton();
        addCierre = new javax.swing.JButton();
        addPlot = new javax.swing.JButton();
        delPlot = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        DirectorGOT = new javax.swing.JTextField();
        addEnsa = new javax.swing.JButton();
        delEnsa = new javax.swing.JButton();
        ComenzarRyM = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        PausarRyM = new javax.swing.JButton();
        Reanudar = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        AudenciaPorLote = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        capListo = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        capPlot = new javax.swing.JTextField();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("INTROS DISPONIBLES:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("INICIOS DISPONIBLES");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel4.setText("CRÉDITOS DISPONIBLES");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 290, 245, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("FINALES PRODUCIDOS ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 340, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("PLOT TWIST PRODUCIDOS");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 400, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("CAPÍTULOS PRODUCIDOS");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 460, -1, 14));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("CAP. PLOT TWIST PRODUCIDOS");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 510, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("DÍAS PARA LA ENTREGA");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 560, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Que Hace ProjectManager");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 670, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Que hace el director");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 840, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("Salario PM");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 790, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Gasto por lote");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 880, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setText("Capitulos por lote");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 610, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setText("Ganancia por lote ");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 730, -1, -1));

        introDisponible.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        introDisponible.setText("0");
        jPanel1.add(introDisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 200, -1, -1));

        InicioRyM.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        InicioRyM.setText("0");
        jPanel1.add(InicioRyM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 260, -1, -1));

        CreditosRyM.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CreditosRyM.setText("0");
        jPanel1.add(CreditosRyM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 290, -1, -1));

        FinalesRyM.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        FinalesRyM.setText("0");
        jPanel1.add(FinalesRyM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 340, -1, -1));

        PlotRyM.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        PlotRyM.setText("0");
        jPanel1.add(PlotRyM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 400, -1, 19));

        CapituloRyM.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CapituloRyM.setText("0");
        jPanel1.add(CapituloRyM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 450, -1, -1));

        CapituloPlotRyM.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CapituloPlotRyM.setText("0");
        jPanel1.add(CapituloPlotRyM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 500, 14, -1));

        DiasFaltantesRyM.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        DiasFaltantesRyM.setText("30");
        jPanel1.add(DiasFaltantesRyM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 560, -1, -1));

        LoteRyM.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LoteRyM.setText("Waiting");
        jPanel1.add(LoteRyM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 610, -1, -1));

        PjRyM.setText("Viendo RyM");
        jPanel1.add(PjRyM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 680, -1, -1));

        GananciaRyM.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        GananciaRyM.setText("Waiting");
        jPanel1.add(GananciaRyM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 730, -1, -1));

        SalarioPMRYM.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        SalarioPMRYM.setText("7");
        jPanel1.add(SalarioPMRYM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 790, -1, -1));

        DirectorRyM.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        DirectorRyM.setText("Nada");
        jPanel1.add(DirectorRyM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 840, -1, -1));

        SalarioMensual.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        SalarioMensual.setText("Waiting");
        jPanel1.add(SalarioMensual, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 880, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel2.setText("Intro:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, 38));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel16.setText("Estudio Rick Y Morty");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 80, -1, 38));

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel17.setText("Estudio Game of Thrones");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 75, -1, 38));

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel18.setText("Partes realizadas:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, -1, 38));

        jLabel19.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel19.setText("Créditos:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, 38));

        jLabel20.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel20.setText("Plot twist:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, 38));

        jLabel21.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel21.setText("Inicio:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, 38));

        jLabel22.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel22.setText("Cierre:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, 38));

        prodPlot.setEditable(false);
        prodPlot.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        prodPlot.setText("0");
        jPanel1.add(prodPlot, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, -1, -1));

        prodCred.setEditable(false);
        prodCred.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        prodCred.setText("0");
        jPanel1.add(prodCred, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));

        prodIntro.setEditable(false);
        prodIntro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        prodIntro.setText("0");
        jPanel1.add(prodIntro, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        prodIni.setEditable(false);
        prodIni.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        prodIni.setText("0");
        jPanel1.add(prodIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, -1, -1));

        prodCierre.setEditable(false);
        prodCierre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        prodCierre.setText("0");
        jPanel1.add(prodCierre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, -1, -1));

        delIntro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        delIntro.setText("-");
        delIntro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delIntroActionPerformed(evt);
            }
        });
        jPanel1.add(delIntro, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 60, -1));

        addIntro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addIntro.setText("+");
        addIntro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addIntroActionPerformed(evt);
            }
        });
        jPanel1.add(addIntro, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 60, -1));

        jLabel23.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel23.setText("Director");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 670, -1, 38));

        jLabel24.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel24.setText("Intro:");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, -1, 38));

        jLabel25.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel25.setText("Sueldo:");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 770, -1, 38));

        jLabel26.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel26.setText("Inicio:");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, -1, 38));

        jLabel27.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel27.setText("Cierre:");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, -1, 38));

        jLabel28.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel28.setText("Plot twist:");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, -1, 38));

        introDis.setEditable(false);
        introDis.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        introDis.setText("0");
        jPanel1.add(introDis, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 100, -1));

        creditoDis.setEditable(false);
        creditoDis.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        creditoDis.setText("0");
        jPanel1.add(creditoDis, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 90, -1));

        iniDis.setEditable(false);
        iniDis.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        iniDis.setText("0");
        jPanel1.add(iniDis, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 100, -1));

        cierreDis.setEditable(false);
        cierreDis.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cierreDis.setText("0");
        jPanel1.add(cierreDis, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 390, 90, -1));

        sueldoGOT.setEditable(false);
        sueldoGOT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sueldoGOT.setText("0");
        sueldoGOT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sueldoGOTActionPerformed(evt);
            }
        });
        jPanel1.add(sueldoGOT, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 780, 120, -1));

        jLabel29.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel29.setText("Productores");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, 38));

        jLabel30.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel30.setText("Créditos:");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, -1, 38));

        plotDis.setEditable(false);
        plotDis.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        plotDis.setText("0");
        jPanel1.add(plotDis, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 440, 90, -1));

        jLabel31.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel31.setText("Ensambladores");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, -1, 38));

        jLabel32.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel32.setText("Project Manager");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 670, -1, 38));

        jLabel33.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel33.setText("Ensambladores:");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 550, -1, 38));

        ensa.setEditable(false);
        ensa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ensa.setText("0");
        jPanel1.add(ensa, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 560, -1, -1));

        jLabel34.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel34.setText("Dias restantes:");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 820, -1, 38));

        DiasGOT.setEditable(false);
        DiasGOT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DiasGOT.setText("0");
        jPanel1.add(DiasGOT, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 830, 90, -1));

        jLabel35.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel35.setText("Estado:");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 720, -1, 38));

        salarioDirector.setEditable(false);
        salarioDirector.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        salarioDirector.setText("0");
        salarioDirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salarioDirectorActionPerformed(evt);
            }
        });
        jPanel1.add(salarioDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 780, 100, -1));

        jLabel36.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel36.setText("Estado:");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 720, -1, 38));

        pjGOT.setEditable(false);
        pjGOT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pjGOT.setText("0");
        pjGOT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pjGOTActionPerformed(evt);
            }
        });
        jPanel1.add(pjGOT, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 720, 210, -1));

        addCred.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addCred.setText("+");
        addCred.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCredActionPerformed(evt);
            }
        });
        jPanel1.add(addCred, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 60, -1));

        delCred.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        delCred.setText("-");
        delCred.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delCredActionPerformed(evt);
            }
        });
        jPanel1.add(delCred, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 60, -1));

        delIni.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        delIni.setText("-");
        delIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delIniActionPerformed(evt);
            }
        });
        jPanel1.add(delIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 60, -1));

        addIni.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addIni.setText("+");
        addIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addIniActionPerformed(evt);
            }
        });
        jPanel1.add(addIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 60, -1));

        delCierre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        delCierre.setText("-");
        delCierre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delCierreActionPerformed(evt);
            }
        });
        jPanel1.add(delCierre, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 60, -1));

        addCierre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addCierre.setText("+");
        addCierre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCierreActionPerformed(evt);
            }
        });
        jPanel1.add(addCierre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 60, -1));

        addPlot.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addPlot.setText("+");
        addPlot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPlotActionPerformed(evt);
            }
        });
        jPanel1.add(addPlot, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 60, -1));

        delPlot.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        delPlot.setText("-");
        delPlot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delPlotActionPerformed(evt);
            }
        });
        jPanel1.add(delPlot, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 60, -1));

        jLabel37.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel37.setText("Capitulos generados:");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 610, -1, 38));

        DirectorGOT.setEditable(false);
        DirectorGOT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DirectorGOT.setText("0");
        DirectorGOT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DirectorGOTActionPerformed(evt);
            }
        });
        jPanel1.add(DirectorGOT, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 720, 180, -1));

        addEnsa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addEnsa.setText("+");
        addEnsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEnsaActionPerformed(evt);
            }
        });
        jPanel1.add(addEnsa, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 560, 60, -1));

        delEnsa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        delEnsa.setText("-");
        delEnsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delEnsaActionPerformed(evt);
            }
        });
        jPanel1.add(delEnsa, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 560, 60, -1));

        ComenzarRyM.setText("Iniciar");
        ComenzarRyM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComenzarRyMActionPerformed(evt);
            }
        });
        jPanel1.add(ComenzarRyM, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 140, -1, -1));

        jButton2.setText("Modificar empleados");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 140, -1, -1));

        PausarRyM.setText("Pausar");
        PausarRyM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PausarRyMActionPerformed(evt);
            }
        });
        jPanel1.add(PausarRyM, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 140, -1, -1));

        Reanudar.setText("Reanudar");
        Reanudar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReanudarActionPerformed(evt);
            }
        });
        jPanel1.add(Reanudar, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 140, -1, -1));

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel39.setText("Audiencia por lote");
        jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 930, -1, -1));

        AudenciaPorLote.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        AudenciaPorLote.setText("Waiting");
        jPanel1.add(AudenciaPorLote, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 930, -1, -1));

        jLabel40.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel40.setText("Capitulos generados:");
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, -1, 38));

        capListo.setEditable(false);
        capListo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        capListo.setText("0");
        jPanel1.add(capListo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 620, -1, -1));

        jLabel41.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel41.setText("Sueldo:");
        jPanel1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 780, -1, 38));

        capPlot.setEditable(false);
        capPlot.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        capPlot.setText("0");
        jPanel1.add(capPlot, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 620, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 974, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sueldoGOTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sueldoGOTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sueldoGOTActionPerformed

    private void salarioDirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salarioDirectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salarioDirectorActionPerformed

    private void pjGOTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pjGOTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pjGOTActionPerformed

    private void DirectorGOTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DirectorGOTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DirectorGOTActionPerformed

    private void addIntroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addIntroActionPerformed

        num_prod++;
        for (int i = 0; i < num_prod; i++) {
                String palabra = prodIntro.getText();
                int pal = Integer.parseInt(palabra);
                pal++;
                prodIntro.setText(String.valueOf(pal));
                break;
        }
    }//GEN-LAST:event_addIntroActionPerformed

    private void addCredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCredActionPerformed
        num_prod2++;
        for (int i = 0; i < num_prod2; i++) {
                String valor= prodCred.getText();
                int val = Integer.parseInt(valor);
                val++;
                prodCred.setText(String.valueOf(val));
                break;
        }
    }//GEN-LAST:event_addCredActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CambioProductores changeProductors = new CambioProductores();
        changeProductors.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ComenzarRyMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComenzarRyMActionPerformed
        // TODO add your handling code here:
        Main.Iniciar();
        this.ComenzarRyM.setEnabled(false);
        this.PausarRyM.setEnabled(true);
    }//GEN-LAST:event_ComenzarRyMActionPerformed

    private void PausarRyMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PausarRyMActionPerformed
        // TODO add your handling code here:
        Main.Pausar();
        this.PausarRyM.setEnabled(false);
        this.Reanudar.setEnabled(true);
    }//GEN-LAST:event_PausarRyMActionPerformed

    private void ReanudarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReanudarActionPerformed
        // TODO add your handling code here:
        Main.Reanudar();
        this.Reanudar.setEnabled(false);
        this.PausarRyM.setEnabled(true);
             
    }//GEN-LAST:event_ReanudarActionPerformed

    private void addIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addIniActionPerformed
         num_prod3++;
        for (int i = 0; i < num_prod3; i++) {
                String valor= prodIni.getText();
                int val = Integer.parseInt(valor);
                val++;
                prodIni.setText(String.valueOf(val));
                break;
        }
    }//GEN-LAST:event_addIniActionPerformed

    private void addCierreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCierreActionPerformed
         num_prod4++;
        for (int i = 0; i < num_prod4; i++) {
                String valor= prodCierre.getText();
                int val = Integer.parseInt(valor);
                val++;
                prodCierre.setText(String.valueOf(val));
                break;
        }
    }//GEN-LAST:event_addCierreActionPerformed

    private void addPlotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPlotActionPerformed
         num_prod5++;
        for (int i = 0; i < num_prod5; i++) {
                String valor= prodPlot.getText();
                int val = Integer.parseInt(valor);
                val++;
                prodPlot.setText(String.valueOf(val));
                break;
        }
    }//GEN-LAST:event_addPlotActionPerformed

    private void addEnsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEnsaActionPerformed
        num_ens++;
        for (int i = 0; i < num_ens; i++) {
                String valor= ensa.getText();
                int val = Integer.parseInt(valor);
                val++;
                ensa.setText(String.valueOf(val));
                break;
        }
    }//GEN-LAST:event_addEnsaActionPerformed

    private void delIntroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delIntroActionPerformed
         for (int i = num_prod ; i > 0; i--) {
            if (num_prod != 0) {
                String valor = prodIntro.getText();
                int val = Integer.parseInt(valor);
                val--;
                prodIntro.setText(String.valueOf(val));
                num_prod--;
                break;
            }
        }
    }//GEN-LAST:event_delIntroActionPerformed

    private void delCredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delCredActionPerformed
        for (int i = num_prod2 ; i > 0; i--) {
            if (num_prod2 != 0) {
                String valor = prodCred.getText();
                int val = Integer.parseInt(valor);
                val--;
                prodCred.setText(String.valueOf(val));
                num_prod2--;
                break;
            }
        }
    }//GEN-LAST:event_delCredActionPerformed

    private void delIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delIniActionPerformed
         for (int i = num_prod3 ; i > 0; i--) {
            if (num_prod3 != 0) {
                String valor = prodIni.getText();
                int val = Integer.parseInt(valor);
                val--;
                prodIni.setText(String.valueOf(val));
                num_prod3--;
                break;
            }
        }
    }//GEN-LAST:event_delIniActionPerformed

    private void delCierreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delCierreActionPerformed
        for (int i = num_prod4 ; i > 0; i--) {
            if (num_prod4 != 0) {
                String valor = prodCierre.getText();
                int val = Integer.parseInt(valor);
                val--;
                prodCierre.setText(String.valueOf(val));
                num_prod4--;
                break;
            }
        }
    }//GEN-LAST:event_delCierreActionPerformed

    private void delPlotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delPlotActionPerformed
        for (int i = num_prod5 ; i > 0; i--) {
            if (num_prod5 != 0) {
                String valor = prodPlot.getText();
                int val = Integer.parseInt(valor);
                val--;
                prodPlot.setText(String.valueOf(val));
                num_prod5--;
                break;
            }
        }
    }//GEN-LAST:event_delPlotActionPerformed

    private void delEnsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delEnsaActionPerformed
        for (int i = num_ens ; i > 0; i--) {
            if (num_ens != 0) {
                String valor = ensa.getText();
                int val = Integer.parseInt(valor);
                val--;
                ensa.setText(String.valueOf(val));
                num_ens--;
                break;
            }
        }
    }//GEN-LAST:event_delEnsaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AudenciaPorLote;
    private javax.swing.JLabel CapituloPlotRyM;
    private javax.swing.JLabel CapituloRyM;
    private javax.swing.JButton ComenzarRyM;
    private javax.swing.JLabel CreditosRyM;
    private javax.swing.JLabel DiasFaltantesRyM;
    private javax.swing.JTextField DiasGOT;
    private javax.swing.JTextField DirectorGOT;
    private javax.swing.JLabel DirectorRyM;
    private javax.swing.JLabel FinalesRyM;
    private javax.swing.JLabel GananciaRyM;
    private javax.swing.JLabel InicioRyM;
    private javax.swing.JLabel LoteRyM;
    private javax.swing.JButton PausarRyM;
    private javax.swing.JLabel PjRyM;
    private javax.swing.JLabel PlotRyM;
    private javax.swing.JButton Reanudar;
    private javax.swing.JLabel SalarioMensual;
    private javax.swing.JLabel SalarioPMRYM;
    private javax.swing.JButton addCierre;
    private javax.swing.JButton addCred;
    private javax.swing.JButton addEnsa;
    private javax.swing.JButton addIni;
    private javax.swing.JButton addIntro;
    private javax.swing.JButton addPlot;
    private javax.swing.JTextField capListo;
    private javax.swing.JTextField capPlot;
    private javax.swing.JTextField cierreDis;
    private javax.swing.JTextField creditoDis;
    private javax.swing.JButton delCierre;
    private javax.swing.JButton delCred;
    private javax.swing.JButton delEnsa;
    private javax.swing.JButton delIni;
    private javax.swing.JButton delIntro;
    private javax.swing.JButton delPlot;
    private javax.swing.JTextField ensa;
    private javax.swing.JTextField iniDis;
    private javax.swing.JTextField introDis;
    private javax.swing.JLabel introDisponible;
    private javax.swing.JButton jButton2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField pjGOT;
    private javax.swing.JTextField plotDis;
    private javax.swing.JTextField prodCierre;
    private javax.swing.JTextField prodCred;
    private javax.swing.JTextField prodIni;
    private javax.swing.JTextField prodIntro;
    private javax.swing.JTextField prodPlot;
    private javax.swing.JTextField salarioDirector;
    private javax.swing.JTextField sueldoGOT;
    // End of variables declaration//GEN-END:variables

    /**
     * @param prueba the prueba to set
     */
    
}
