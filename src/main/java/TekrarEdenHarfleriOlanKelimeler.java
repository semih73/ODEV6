import java.util.*;

public class TekrarEdenHarfleriOlanKelimeler {

    public static String[] tekrarEdenHarfleriOlanKelimeleriBul(String[] kelimeler) {
        List<String> sonucListesi = new ArrayList<>();

        for (String kelime : kelimeler) {
            if (tekrarEdenHarfVarMi(kelime)) {
                sonucListesi.add(kelime);
            }
        }

        // Listeyi String dizisine çevirme
        String[] sonucDizisi = new String[sonucListesi.size()];
        sonucDizisi = sonucListesi.toArray(sonucDizisi);

        return sonucDizisi;

    }
    private static void yazdirTekrarlananHarfler(String yeniKelime) {
        // Kelimedeki her harfin bir kere yazıldığı bir Set kullanalım
        // böylece her harfi bir kere yazdırabiliriz
        java.util.Set<Character> kullanilanHarfler = new java.util.HashSet<>();
        for (Character sonKelime:kullanilanHarfler){
            System.out.print (sonKelime);
        }

         //Her harfi kontrol et ve daha önce yazılmışsa yazdırma
        //for (char harf : kullanilanHarfler.ChartoArray()) {
           //if (!kullanilanHarfler.contains(harf)) {
                //System.out.print(harf+" ");
              // kullanilanHarfler.add(harf);
        //for (String sonHarfler : kullanilanHarfler){
            //System.out.print(sonHarfler);
       // }
           //}
       //}
        System.out.println(kullanilanHarfler); // Bir satır atla
    }

    private static boolean tekrarEdenHarfVarMi(String kelime) {
        Map<Character, Integer> harfSayilari = new HashMap<>();

        for (char harf : kelime.toCharArray()) {
            harfSayilari.put(harf, harfSayilari.getOrDefault(harf, 0) + 1);
        }

        for (int sayi : harfSayilari.values()) {
            if (sayi > 1) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String[] kelimelerDizisi = {"elma", "armut", "lama", "mal", "tala", "kavak"};
        System.out.println("Tüm Metin: ");
        for (String tumMetin : kelimelerDizisi) {
            System.out.println(tumMetin);
        }

        String[] sonuclar = tekrarEdenHarfleriOlanKelimeleriBul(kelimelerDizisi);
        System.out.println("Aynı karakterden içeren eleman listesi: ");
        for (String kelime : sonuclar) {
            System.out.println(kelime);
        }
        if (sonuclar.length > 2) {
            String[] yeniDizi = new String[2];  // Yeni diziyi oluştur

            for (int i = 0; i < yeniDizi.length; i++) {
                if (i < sonuclar.length) {
                    yeniDizi[i] = sonuclar[i];
                }
            }
            System.out.println("Yeni Dizi: " + Arrays.toString(yeniDizi));
            for (String yeniKelime : yeniDizi) {
                yazdirTekrarlananHarfler(yeniKelime);
            }
        }
    }
}