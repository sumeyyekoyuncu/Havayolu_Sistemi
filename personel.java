
import java.util.ArrayList;
import java.util.List;


public class personel {
    String isim;
    String gorev;
    List<ucus> ucuslarinlistesi=new ArrayList<>();

    public personel(String isim, String gorev,List<ucus> ucuslarinlistesi) {
        this.isim = isim;
        this.gorev = gorev;
        this.ucuslarinlistesi=ucuslarinlistesi;
    }
    public void bilgilerigoster(){
        System.out.println("isim: "+isim);
        System.out.println("gorev: "+gorev);
    }
    public  List<ucus> ucuslarilistele(){
        return ucuslarinlistesi;
    }

    public String getIsim() {
        return isim;
    }

    @Override
    public String toString() {
        return  "isim=" + isim + ", gorev=" + gorev ;
    }

  
 
    
}

      