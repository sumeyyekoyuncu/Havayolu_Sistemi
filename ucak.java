
public class ucak {
    String tip;
    int toplam_kapasite;
    int ekonomi_koltuk;
    int business_koltuk;
    int standart_koltuk;
    int personel_sayisi;

    public ucak(String tip, int toplam_kapasite, int ekonomi_koltuk, int business_koltuk, int standart_koltuk, int personel_sayisi) {
        this.tip = tip;
        this.toplam_kapasite = toplam_kapasite;
        this.ekonomi_koltuk = ekonomi_koltuk;
        this.business_koltuk = business_koltuk;
        this.standart_koltuk = standart_koltuk;
        this.personel_sayisi = personel_sayisi;
    }

    public String getTip() {
        return tip;
    }

    public int getToplam_kapasite() {
        return toplam_kapasite;
    }

    public int getEkonomi_koltuk() {
        return ekonomi_koltuk;
    }

    public int getBusiness_koltuk() {
        return business_koltuk;
    }

    public int getStandart_koltuk() {
        return standart_koltuk;
    }

    public int getPersonel_sayisi() {
        return personel_sayisi;
    }
    
    
}
