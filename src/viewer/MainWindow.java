package viewer;

import javax.swing.*;

public class MainWindow extends JFrame {
    private JButton a7Button;
    private JPanel MainPanel;
    private JButton a8Button;
    private JButton a9Button;
    private JButton divisao;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton multiplicacao;
    private JButton a1Button;
    private JButton a0Button;
    private JButton a2Button;
    private JButton virgula;
    private JButton a3Button;
    private JButton subtracao;
    private JButton igual;
    private JButton soma;
    private JTextArea visor;

    public MainWindow() {
        this.setContentPane(MainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Calculadora");
        this.pack();
        this.setLocationRelativeTo(null);
        visor.setEditable(false);
        this.setVisible(true);
    }
}
