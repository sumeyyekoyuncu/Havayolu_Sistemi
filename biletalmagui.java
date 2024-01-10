
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class biletalmagui extends JFrame{
    private JLabel labelseferno;
    private JTextField textFieldseferno;
    private JLabel labelyolcuadi;
    private JTextField textfieldyolcuadi;
    private JComboBox<String> comboboxyolcutipi;
    private JComboBox<String> comboboxkoltuktipi;
    private JButton biletalmabutton;
    private JLabel biletbilgilabel;
    public biletalmagui(){
        setTitle("bilet alma");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300,200);
        setLayout(null);
        // Sefer No etiketi
        labelseferno=new JLabel("sefer no: ");
        labelseferno.setBounds(10, 10, 80, 20);
        add(labelseferno);
        // Sefer No giriş alanı
        textFieldseferno=new JTextField();
        textFieldseferno.setBounds(100, 10, 150, 20);
        add(textFieldseferno);
        
        // Yolcu Adı etiketi
        labelyolcuadi=new JLabel("yolcu adi: ");
        labelyolcuadi.setBounds(10, 40, 80, 20);
        add(labelyolcuadi);
        // Yolcu Adı giriş alanı
        textfieldyolcuadi=new JTextField();
        textfieldyolcuadi.setBounds(100, 40, 150, 20);
        add(textfieldyolcuadi);
         // Bilet Alma butonu
        biletalmabutton=new JButton("bilet alma");
        biletalmabutton.setBounds(100,130, 100, 30);
        add(biletalmabutton);
        
        // Yolcu Tipi ComboBox
        comboboxyolcutipi = new JComboBox<>(new String[]{"VIP yolcu", "Standart yolcu"});
        comboboxyolcutipi.setBounds(10, 70, 150, 20);
        add(comboboxyolcutipi);
        // Koltuk Tipi ComboBox
        comboboxkoltuktipi = new JComboBox<>(new String[]{"VIP koltuk", "ekonomik koltuk"});
        comboboxkoltuktipi.setBounds(10, 100, 150, 20);
        add(comboboxkoltuktipi);
        // Bilet Bilgi etiketi
        biletbilgilabel=new JLabel("");
        biletbilgilabel.setBounds(10, 190, 300, 20);
        add(biletbilgilabel);
       
        // Bilet Alma butonu için ActionListener        
        biletalmabutton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                // Kullanıcının girdiği bilgileri al
                String seferno=textFieldseferno.getText();
                String yolcuadi=textfieldyolcuadi.getText();
                String koltuktipi=comboboxkoltuktipi.getSelectedItem().toString();
                String yolcutipi=comboboxyolcutipi.getSelectedItem().toString();
                // Bilet bilgilerini oluştur
                String bilet="***bilet bilgileri***\nsefer no: "+seferno+"\nyolcu adi: "+yolcuadi+"\nkoltuk tipi: "+koltuktipi
                        +"\nyolcu tipi: "+yolcutipi;
                // Bilgileri kullanıcıya göster
                JOptionPane.showMessageDialog(null, bilet);
                setVisible(true);
                dispose();
              
            }
        });
       // setVisible(true);
    }
}
