
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class ucuseklegui extends JFrame{
     private JLabel labelseferno;
     private JTextField textfieldseferno;
     private JLabel labelrota;
     private JTextField textfieldrota;
     private JLabel labelkalkiszamani;
     private JTextField textfieldkalkiszamani;
     private JButton eklebutton;
     
     public ucuseklegui(){
         setTitle("ucus ekleme");
         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         setSize(300,200);
         setLayout(null);
          // Sefer No etiketi
         labelseferno=new JLabel("sefer no:");
         labelseferno.setBounds(10, 10, 80, 20);
         add(labelseferno);
         // Sefer No giriş alanı
         textfieldseferno=new JTextField();
         textfieldseferno.setBounds(100, 10, 150, 20);
         add(textfieldseferno);
         // Rota etiketi
         labelrota=new JLabel("rota:");
         labelrota.setBounds(10, 40, 80, 20);
         add(labelrota);
         // Rota giriş alanı
        textfieldrota=new JTextField();
        textfieldrota.setBounds(100, 40, 150, 20);
         add(textfieldrota);
          // Kalkış Zamanı etiketi
        labelkalkiszamani = new JLabel("kalkis zamani:");
        labelkalkiszamani.setBounds(10, 70, 80, 20);
        add(labelkalkiszamani);
        // Kalkış Zamanı giriş alanı
        textfieldkalkiszamani = new JTextField();
        textfieldkalkiszamani.setBounds(100, 70, 150, 20);
        add(textfieldkalkiszamani);
        // "Uçuş Ekle" butonu
        eklebutton = new JButton("ucus ekle");
        eklebutton.setBounds(100, 100, 100, 30);
        add(eklebutton);
        
         // "Uçuş Ekle" butonu için ActionListener
         eklebutton.addActionListener(new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent e){
                 // Kullanıcının girdiği bilgileri al
                 String seferno=textfieldseferno.getText();
                 String rota=textfieldrota.getText();
                 String kalkiszamani=textfieldkalkiszamani.getText();
                 // Bilgi mesajı göster
                 JOptionPane.showMessageDialog(null, "ucus eklendi");
                  // Pencereyi görünür yap ve kapat
                 setVisible(true);
                 dispose();
             }
         });
     }
     
}
