
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class yolcu {
    private String isim;
    private int biletno;
    private String dahilolduguucuslar;
    private String tip;
    private String koltuktipi;
    private List<ucus> yolcuucuslarilistesi;

    public yolcu(String isim, int biletno, String dahilolduguucuslar,List<ucus> yolcuucuslarilistesi,String tip,String koltuktipi) {
        this.isim = isim;
        this.biletno = biletno;
        this.dahilolduguucuslar = dahilolduguucuslar;
        this.yolcuucuslarilistesi=yolcuucuslarilistesi;
        this.tip=tip;
        this.koltuktipi=koltuktipi;
    }

    public String getKoltuktipi() {
        return koltuktipi;
    }

    public String getTip() {
        return tip;
    }

    public String getIsim() {
        return isim;
    }

    public int getBiletno() {
        return biletno;
    }

    public List<ucus> getYolcuucuslarilistesi() {
        return yolcuucuslarilistesi;
    }

    public String getDahilolduguucuslar() {
        return dahilolduguucuslar;
    }

    public void setDahilolduguucuslar(String dahilolduguucuslar) {
        this.dahilolduguucuslar = dahilolduguucuslar;
    }
     public void yolcucuslarinigoster(){
         if(yolcuucuslarilistesi.isEmpty()){
             System.out.println("yolcunun kayitli ucusu yok");
         }
         for(ucus ucus1 : yolcuucuslarilistesi){
             System.out.println("ucus no: "+ucus1.seferno);
             System.out.println("rota:"+ucus1.rota);
             System.out.println("kalkıs zamani:"+ucus1.kalkis_zamani);
         }
     }
     public void belirlitariharaligindaucuslar(String baslangictarihi,String bitistarihi,String rota){
         SimpleDateFormat tarih =new SimpleDateFormat("dd.MM.yyyy");
         try {
          Date baslangic=tarih.parse(baslangictarihi);
          Date bitis=tarih.parse(bitistarihi);
             System.out.println("belirli tarih araliginda ve yonde ucuslar:");
             for(ucus ucus1 : yolcuucuslarilistesi){
                 Date ucustarihi =tarih.parse(ucus1.kalkis_zamani);
                 if(ucustarihi.after(baslangic)&& ucustarihi.before(bitis)&& ucus1.getRota().equals(rota)){
                     System.out.println("ucus numarasi: "+ucus1.seferno);
                     System.out.println("rota: "+ucus1.rota);
                     System.out.println("kalkis zamani: "+ucus1.kalkis_zamani);
                 }
             }
         } catch (ParseException e) {
             e.printStackTrace();
         }
         
         
     }

    @Override
    public String toString() {
        return  "isim=" + isim ;
    }
    
}
