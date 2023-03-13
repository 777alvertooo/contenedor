package PaqC01;

import javax.swing.*;

public class miPanel extends JFrame{
    private JPanel MiPanel;
    private JTextField txtnumid;
    private JTextField txtpeso;
    private JTextArea txtareadescripcion;
    private JTextField txtremitente;
    private JTextField txtreceptor;
    private JComboBox comboprocedencia;
    private JRadioButton RBoton1;
    private JRadioButton RBoton2;
    private JRadioButton RBoton3;
    private JCheckBox cBoxaduana;
    private JLabel lnumid;
    private JLabel lpeso;
    private JLabel ldescripcion;
    private JLabel lremirente;
    private JLabel lreceptor;
    private JLabel lprocedencia;
    private JLabel lprioridad;
    private JButton botonapilar;
    private JButton botondesapilar;
    private JButton Botonmostrar;
    private JButton botoncuantos;
    private JTextField txtnumcol;
    private JTextField txtIDCont;
    private JComboBox comboPais;
    private JTextField txtcuantos;
    private JTextArea txtAreaEstado;
    private JLabel txtEstado;
    private JPanel MiPanel2;

    public miPanel(){
        setTitle("Trabajo");
        setSize(1200,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setContentPane(MiPanel);

    }

    public static void main(String[] args) {
        new miPanel();
    }

}
