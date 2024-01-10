
import java.util.List;


public class yonetici extends personel{
    String departman;
    public yonetici(String departman,String isim,String gorev,List<ucus> ucuslarinlistesi){
        super(isim, gorev,ucuslarinlistesi);
        this.departman=departman;
    }
    public void bilgilerigoster(){
        System.out.println("adı: "+this.isim);
        System.out.println("gorevi: "+this.gorev);
        System.out.println("departmanı: "+this.departman);
        System.out.println("atanan ucuslar: "+this.ucuslarinlistesi);
        
    }
    public void ucusata(ucus ucus1,personel personel1){ //istedigi personele ucus atayabilir.
        ucus1.personellistesi.add(personel1);
    }
    public void ucuslistesigoster(){
       super.ucuslarilistele();
        
    }
    public void yolcunun_ucuslarini_goster(yolcu yolcu1){
        yolcu1.getDahilolduguucuslar();
    }
}
