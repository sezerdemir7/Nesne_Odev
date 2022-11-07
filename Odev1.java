package odev1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

//Nesne ogrenci.Java clasından oluşuyor
public class Odev1 {

    public static void main(String[] args) throws IOException {

        File file = new File("dosya.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        ogrenci ogr = new ogrenci();

        JFrame fr = new JFrame("Nesne Yönemli Programlama Ödev");
        JLabel l1, l2;
        JTextField t1, t2;

        l1 = new JLabel("AD:");
        l1.setBounds(50, 30, 20, 30);

        t1 = new JTextField();
        t1.setBounds(70, 30, 300, 30);

        l2 = new JLabel("NO:");
        l2.setBounds(50, 70, 30, 30);

        t2 = new JTextField();
        t2.setBounds(70, 70, 300, 30);

        JButton btn = new JButton("Kaydet");
        btn.setBounds(160, 130, 100, 30);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ogr.setAd(t1.getText());
                ogr.setNo(t2.getText());
                FileWriter fileWriter = null;
                try {
                    fileWriter = new FileWriter(file, true);
                } catch (IOException ex) {
                    Logger.getLogger(Odev1.class.getName()).log(Level.SEVERE, null, ex);
                }
                BufferedWriter bWriter = new BufferedWriter(fileWriter);
                try {
                    bWriter.write("-");

                    bWriter.write(ogr.getAd());
                    bWriter.write(" ");
                    bWriter.write(ogr.getNo());
                    bWriter.newLine();

                } catch (IOException ex) {
                    Logger.getLogger(Odev1.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    bWriter.close();
                } catch (IOException ex) {
                    Logger.getLogger(Odev1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        fr.add(l1);
        fr.add(t1);
        fr.add(l2);
        fr.add(t2);
        fr.add(btn);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(500, 500);
        fr.setLayout(null);
        fr.setVisible(true);
    }

}
