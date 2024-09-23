import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private Minuman kopi; 
    private JCheckBox susuCheckBox;
    private JCheckBox cokelatCheckBox;
    private JLabel hargaLabel;
    
    public Main() {
        setTitle("Pemesanan Kopi");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        kopi = new Kopi();

        susuCheckBox = new JCheckBox("Tambah Susu (Rp 2000)");
        susuCheckBox.setBounds(20, 20, 200, 30);
        add(susuCheckBox);

        cokelatCheckBox = new JCheckBox("Tambah Cokelat (Rp 5000)");
        cokelatCheckBox.setBounds(20, 60, 200, 30);
        add(cokelatCheckBox);

        JButton hitungButton = new JButton("Hitung Harga");
        hitungButton.setBounds(20, 100, 120, 30);
        add(hitungButton);

        hargaLabel = new JLabel("Total: Rp " + kopi.getHarga());
        hargaLabel.setBounds(20, 140, 200, 30);
        add(hargaLabel);

        hitungButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hitungHarga();  
            }
        });

        setVisible(true);
    }

    private void hitungHarga() {
        Minuman pesanan = new Kopi();

        if (susuCheckBox.isSelected()) {
            pesanan = new SusuDecorator(pesanan);
        }

        if (cokelatCheckBox.isSelected()) {
            pesanan = new CokelatDecorator(pesanan);
        }

        hargaLabel.setText("Total: Rp " + pesanan.getHarga());
    }

    public static void main(String[] args) {
        new Main();
    }
}
