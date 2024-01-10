
import java.util.ArrayList;
import java.util.List;


public class ucus {
    int seferno;
    String rota;
    String kalkis_zamani;
    ucak ucak1;
    double seferucreti;
    List<personel> personellistesi;
    List<yolcu> yolculistesi;
    List<ucus> ucuslarinlistesi=new ArrayList<>();

    public ucus(int seferno, String rota, String kalkis_zamani, ucak ucak1,double seferucreti, List<personel> personellistesi, List<yolcu> yolculistesi) {
        this.seferno = seferno;
        this.rota = rota;
        this.kalkis_zamani = kalkis_zamani;
        this.ucak1 = ucak1;
        this.personellistesi = personellistesi;
        this.yolculistesi = yolculistesi;
        this.seferucreti=seferucreti;
    }
    public List<ucus> getucuslarinlistesi(){
        return ucuslarinlistesi;
        
    }

    public String getRota() {
        return rota;
    }

    public String getKalkis_zamani() {
        return kalkis_zamani;
    }

    public int getSeferno() {
        return seferno;
    }

    public ucak getUcak1() {
        return ucak1;
    }

    public double getSeferucreti() {
        return seferucreti;
    }

    public List<personel> getPersonellistesi() {
        return personellistesi;
    }

    public List<yolcu> getYolculistesi() {
        return yolculistesi;
    }

    public List<ucus> getUcuslarinlistesi() {
        return ucuslarinlistesi;
    }

    
    
}

