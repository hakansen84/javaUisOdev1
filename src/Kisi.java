class Kisi {
    private static long kimlik = 1;
    private long kn;
    private String ad, soyad;
    private int yas;

    public Kisi(String ad, String soyad, int yas) {
        this.ad=ad;
        this.soyad=soyad;
        this.yas=yas;
        this.kn=kimlik++;
    }

    public long getKn() {
        return kn;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public String getTamIsim() {
        return soyad + ", " + ad;
    }

    public int getYas() {
        return yas;
    }


    public static void adUzunlugunaGoreListele(Kisi[] kd, int a, int b) {
        for (Kisi k : kd)
            if (k != null && k.getAd().length() >= a && k.getAd().length() <= b) {
                System.out.println("Kimlik No:" + k.getKn() + " İsim: " + k.getTamIsim() + " Yaş:" + k.getYas());
            }

    }

    public static void main(String[] args) {
        Kisi[] kdizi = {
                new Kisi("Ahmet", "Sarı", 26),
                new Kisi("Mehmet", "Beyaz", 20),
                new Kisi("Ali Hüsnü", "Turuncu", 14),
                new Kisi("Veli", "Siyah", 46),
                new Kisi("Ayşe", "Gri", 38),
                new Kisi("Fatma", "Mavi", 32)};

        adUzunlugunaGoreListele(kdizi, 4, 6);

    }


}



