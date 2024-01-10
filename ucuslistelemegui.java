
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;


public class ucuslistelemegui extends JFrame{
    private JTextArea textareaucuslar;
    private JButton listelebutton;
    
    public ucuslistelemegui(){
        setTitle("ucus ekleme");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300, 200);
        setLayout(null);
        
         // JTextArea oluşturulması
        textareaucuslar=new JTextArea();
        textareaucuslar.setBounds(10, 10, 250, 100);
        add(textareaucuslar);
         // "Uçuşları Listele" butonu
        listelebutton=new JButton("ucuslari listele");
        listelebutton.setBounds(10, 120, 150, 30);
        add(listelebutton);
        // "Uçuşları Listele" butonu için ActionListener
        listelebutton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                // Örnek nesnelerin oluşturulması
                personel personel1 = new personel("ayse hanim","hostes",new ArrayList<ucus>());
                yolcu yolcu1=new yolcu("osman",12,"ankara-istanbul ucuslari",new ArrayList<ucus>(),"vıp yolcu","ekonomi koltuk");
                ucus ucus1=new ucus(21, "antalya", "22-08-2024",new ucak("standart", 100, 50,20, 30,8), 250,new ArrayList<personel>(), new ArrayList<yolcu>());
                ucak ucak1=new ucak("business",100,20,70,10,8);
                ucus1.getPersonellistesi().add(personel1);
                ArrayList<personel> personellistesi=new ArrayList<>();
                personellistesi.add(personel1);
                ArrayList<yolcu> yolculistesi=new ArrayList<>();
                yolculistesi.add(yolcu1);
                // JTextArea'ya uçuş bilgilerinin yazdırılması
              textareaucuslar.setText("sefer no: "+ucus1.getSeferno()+"\n" + "kalkis zamani: "+ucus1.getKalkis_zamani()+"\n"+
                      "ucak bilgisi: "+ucak1.getTip()+"\n"+"ucagin kapasitesi"+ucak1.getToplam_kapasite()+"\n"+"personel listesi:"+ucus1.getPersonellistesi()+"\n"+"yolcu listesi: "+ucus1.getYolculistesi());
           // Personel listesini JTextArea'ya yazdırma
              for(personel p : ucus1.getPersonellistesi()){
              
                textareaucuslar.append(p.getIsim() + "\n");
           } 
              // Yolcu listesini JTextArea'ya yazdırma
           for(yolcu y : ucus1.getYolculistesi()){
               textareaucuslar.append(y.getDahilolduguucuslar()+"\n");
               
           }
               }
            
            
        });
    }
    
}
