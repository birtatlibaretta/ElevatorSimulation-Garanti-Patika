import java.util.Random;

class Asansor {
    private int kapasite;
    private int kat;

    public Asansor(int kapasite) {
        this.kapasite = kapasite;
        this.kat = 0;
    }

    public void hedefKataGit(int hedefKat) {
        if (hedefKat >= 0 && hedefKat <= 12) {
            this.kat = hedefKat;
            System.out.println("Asansör " + hedefKat + ". kata gitti.");
        } else {
            System.out.println("Geçersiz hedef kat numarası.");
        }
    }
}

class AsansorSimulasyonu {
    public static void main(String[] args) {
        Random random = new Random();
        Asansor[] asansorler = new Asansor[5];
        for (int i = 0; i < 5; i++) {
            asansorler[i] = new Asansor(6);
        }

        for (int i = 0; i < 10; i++) {
            int kalkisKat = random.nextInt(13);
            int varisKat = random.nextInt(13);
            while (kalkisKat == varisKat) {
                varisKat = random.nextInt(13);
            }

            int secilenAsansor = random.nextInt(5);
            asansorler[secilenAsansor].hedefKataGit(kalkisKat);
            asansorler[secilenAsansor].hedefKataGit(varisKat);
        }
    }
}
