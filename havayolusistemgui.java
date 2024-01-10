
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;


public class havayolusistemgui {
    private JFrame frame;
    private JButton ucuseklebutton;
    private JButton ucuslistelebutton;
    private JButton biletalbutton;
     public havayolusistemgui(){
         // JFrame oluşturulması ve ayarlanması
         frame=new JFrame("havayolu sistemi");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(400, 300);
         frame.setLayout(null);
         // "Uçuş Ekle" butonu
         ucuseklebutton=new JButton("ucus ekle");
         ucuseklebutton.setBounds(50, 50, 150, 30);
         frame.add(ucuseklebutton);
         // "Uçuşları Listele" butonu
         ucuslistelebutton=new JButton("ucuslari listele");
         ucuslistelebutton.setBounds(50, 100, 150, 30);
         frame.add(ucuslistelebutton);
         // "Bilet Al" butonu
         biletalbutton=new JButton("bilet al");
         biletalbutton.setBounds(50, 150, 150, 30);
         frame.add(biletalbutton);
         // "Uçuş Ekle" butonu için ActionListener
         ucuseklebutton.addActionListener(new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent e){
                 ucuseklegui ucuseklegui1=new ucuseklegui();
                 ucuseklegui1.setVisible(true);
             }
        });
         // "Uçuşları Listele" butonu için ActionListener
         ucuslistelebutton.addActionListener(new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent e){
                 ucuslistelemegui ucuslistelemegui1=new ucuslistelemegui();
                 ucuslistelemegui1.setVisible(true);
             }
         });
         // "Bilet Al" butonu için ActionListener
         biletalbutton.addActionListener(new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent e){
                 biletalmagui biletalgui1=new biletalmagui();
                 biletalgui1.setVisible(true);
             }
         });
         // JFrame'i görünür yap
         frame.setVisible(true);
     }

    void setVisible(boolean b) {
      
    } 
}
