
public class Bilet {
    private ucus ucus1;
    private yolcu yolcu1;
    private double fiyat;

    public Bilet(ucus ucus1, yolcu yolcu1, double fiyat) {
        this.ucus1 = ucus1;
        this.yolcu1 = yolcu1;
        this.fiyat = fiyat;
    }

    public ucus getUcus1() {
        return ucus1;
    }

    public yolcu getYolcu1() {
        return yolcu1;
    }

    public double getFiyat() {
        return fiyat;
    }
    public void biletbilgileri(){
        System.out.println("***bilet detaylari***");
        System.out.println("yolcu adi: "+yolcu1.getIsim());
        System.out.println("yolcu tipi: "+yolcu1.getTip());
        System.out.println("koltuk tipi:"+yolcu1.getKoltuktipi());
        System.out.println("ucus bilgileri:"+ucus1.getRota()+"/"+ucus1.getKalkis_zamani());
        System.out.println("bilet fiyati"+fiyat+"tl");
    }
    public void biletfiyatihesapla(){
        if(yolcu1.getTip().equals("VIP")){
            fiyat=fiyat*20/100;
        }
        else{
            fiyat=fiyat;
        }
        
    }
}
