package com.example.tugas3;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import com.example.tugas3.model.Anjing;
import com.example.tugas3.model.Hewan;
import com.example.tugas3.model.Kucing;
import com.example.tugas3.model.Kupukupu;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing("Angora", "Turki",
                "Aslinya berasal dari Ankara, Turki dengan ciri khas berbulu panjang dan lembut", R.drawable.cat_angora));
        kucings.add(new Kucing("Bengal", "Inggris",
                "Merupakan hasil persilangan antara Kucing Leopard Asia dengan kucing domestik Inggris", R.drawable.cat_bengal));
        kucings.add(new Kucing("Birmani", "Birma/Myanmar",
                "Konon awalnya merupakan ras kucing yand biasa menemani para biksu yang menetap pada kuil di Birma", R.drawable.cat_birman));
        kucings.add(new Kucing("Persia", "Iran",
                "Kucing berbulu panjang dengan wajah bundar dan hidung pesek. Awalnya berasal dari Iran kemudian diimpor ke Italia", R.drawable.cat_persia));
        kucings.add(new Kucing("Siam", "Thailand",
                "Kucing hasil turunan dari Wichian Maat (Kucing Thailand) dengan ciri khas berbadan panjang dan langsing, wajah lonjong, telinga lebar, dan mata kebiruan", R.drawable.cat_siam));
        kucings.add(new Kucing("Siberia", "Rusia",
                "Kucing domestik Rusia dengan bulu lebat dan badan besar tapi sangat lincah dan terkenal dengan kemampuan melompatnya ", R.drawable.cat_siberian));
        return kucings;
    }

    private static List<Anjing> initDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing("Bulldog", "Inggris",
                "Anjing populer yang dikenal dengan badan yang gemuk berotot, wajah seperti kain kusut, dan hidung yang pesek", R.drawable.dog_bulldog));
        anjings.add(new Anjing("Husky", "Alaska,Siberia,Finlandia (daerah bersalju) ",
                "Anjing jenis khusus yang awalnya digunakan untuk menarik kereta salju", R.drawable.dog_husky));
        anjings.add(new Anjing("Kintamani", "Indonesia",
                "Ras anjing asli pulau Bali ", R.drawable.dog_kintamani));
        anjings.add(new Anjing("Samoyed", "Rusia",
                "Anjing yang berasal dari Siberia yang awalnya biasa digunakan untuk menjaga ternak oleh suku Samoyed", R.drawable.dog_samoyed));
        anjings.add(new Anjing("Shepherd", "Jerman",
                "Anjing pintar dan kuat, sekarang banyak digunakan sebagai anjing penjaga, pengawal, dan anjing polisi (K9)", R.drawable.dog_shepherd));
        anjings.add(new Anjing("Shiba", "Jepang",
                "Anjing dari daerah Shiba ini gesit dan lincah sehingga awalnya banyak digunakan untuk berburu ", R.drawable.dog_shiba));
        return anjings;
    }
    private static List<Kupukupu> initDataKupukupu(Context ctx) {
        List<Kupukupu> kupukupus = new ArrayList<>();
        kupukupus.add(new Kupukupu("The Blue Morpho", "Brasil dan Venezuela",
                "kupu-kupu ini memiliki sayap yang terbilang cukup besar. Pada sayapnya, Anda bisa melihat gradasi warna biru dan hitam.", R.drawable.morpho_blue));
        kupukupus.add(new Kupukupu("The Glasswing Butterfly", "Meksiko, Panama, Ekuador, Kosta Rika",
                "Kupu kupu ini memiliki sayap transparan alias bening seperti kaca. Bila terkena sinar matahari, sayap itu akan berkilau merah, hijau, oranye, dan kebiruan seperti gelembung sabun yang transparan.", R.drawable.butterfly_glasswing));
        kupukupus.add(new Kupukupu("Sapho Longwings", "Meksiko dan Ekuador",
                "Memiliki corak dengan dominasi warna biru navy serta dihiasi dengan warna putih di tengah sayap membuat tampilan kupu-kupu ini terlihat sangat memesona dan juga unik.", R.drawable.butterfly_longwings));
        kupukupus.add(new Kupukupu("Monarch Butterfly", "mencakup di seluruh dunia.",
                "Corak yang unik dan warna oranye dengan bintik-bintik putih pada bagian tepi sayapnya menjadi ciri khas jenis kupu-kupu ini.", R.drawable.butterfly_monarch));
        kupukupus.add(new Kupukupu("Spicebrush Swallowtails", "Amerika Serikat dan Ontario",
                "Rentang sayap kupu-kupu ini bisa mencapai 4 inchi. Kupu-kupu ini dihiasi dengan warna hitam dan sedikit warna putih sehingga membuatnya terkesan misterius dan unik.", R.drawable.butterfly_spicebrush));
        kupukupus.add(new Kupukupu("The Sri Lankan Ceylon Rose", "hutan Papua",
                "Bentuk sayap yang memanjang di bagian atas dekat dengan kepala serta memiliki beberapa lekukan-lekukan di bagian bawah sayap membuat bentuk kupu-kupu sangat khas dan unik. ", R.drawable.butterfly_srilankan));
        return kupukupus ;
    }


    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(initDataKupukupu(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}