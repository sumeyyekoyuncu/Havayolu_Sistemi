
import java.util.List;


public class ucuspersoneli extends personel{

    public ucuspersoneli(String isim, String gorev, List<ucus> ucuslarinlistesi) {
        super(isim, gorev, ucuslarinlistesi);
    }
   @Override
    public void bilgilerigoster(){
        System.out.println("personel adi: "+this.isim);
        System.out.println("gorevi: "+this.gorev);
        System.out.println("atandigi ucuslar: "+this.ucuslarinlistesi);
        
    }
    
}
