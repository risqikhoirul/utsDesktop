import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*
Author: M. Khoirul Risqi
NIM: 221101023
Kelas: TI 2A
Github: Https://github.com/risqikhoirul/utsDesktop
*/
class Calculator extends JFrame implements ActionListener {
    
    JLabel bilangan1 = new JLabel("Masukan Angka Ke 1");
    JTextField input1 = new JTextField(15);
    JLabel bilangan2 = new JLabel("Masukan Angka Ke 2");
    JTextField input2 = new JTextField(15);
    JLabel bilangan3 = new JLabel("Hasil Perhitungan");
    JTextField output = new JTextField(15);
    JButton penjumlahan = new JButton("+");
    JButton pengurangan = new JButton("-");
    JButton pembagian = new JButton("/");
    JButton perkalian = new JButton("*");

    Calculator(){
        super("Calculator");
        setSize(200, 220);
        setLocation(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    void layar(){
        getContentPane().add(bilangan1);
        getContentPane().add(input1);
        getContentPane().add(bilangan2);
        getContentPane().add(input2);
        getContentPane().add(bilangan3);
        getContentPane().add(output);
        getContentPane().add(penjumlahan);
        getContentPane().add(pengurangan);
        getContentPane().add(pembagian);
        getContentPane().add(perkalian);

        penjumlahan.addActionListener(this);
        pengurangan.addActionListener(this);
        pembagian.addActionListener(this);
        perkalian.addActionListener(this);
        
        getContentPane().setBackground(Color.ORANGE); // warna latar belakang
        penjumlahan.setBackground (Color.RED);
        pengurangan.setBackground (Color.YELLOW);
        pembagian.setBackground (Color.GREEN);
        perkalian.setBackground (Color.BLUE);

        getContentPane().setLayout (new FlowLayout());
        setVisible(true);
    }

    public void actionPerformed(ActionEvent kal) {
        double angka1 = Double.parseDouble(input1.getText());
        double angka2 = Double.parseDouble(input2.getText());
        double hasil = 0;
        if(kal.getSource() == penjumlahan){
            hasil = angka1 + angka2;
        } else if(kal.getSource() == pengurangan){
            hasil = angka1 - angka2;
        } else if(kal.getSource() == perkalian){
            hasil = angka1 * angka2;
        } else if(kal.getSource() == pembagian){
            hasil = angka1 / angka2;
        }
        output.setText(Double.toString(hasil));
    }
}

public class tugasUtsDua {
    public static void main(String[] args) {
        Calculator clc = new Calculator();
        clc.layar();
    }
}
