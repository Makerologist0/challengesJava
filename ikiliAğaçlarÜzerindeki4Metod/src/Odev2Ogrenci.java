public class Odev2Ogrenci {
    /**
     * maximum metodu kök düğümü verilen ikili ağacın içindeki en büyük değeri bulur.
     * Verilen ağaç arama ağacı olmayabilir. Bu nedenle sürekli sağa giderek en büyük
     * değeri bulamayabilirsiniz. Problemi özyineleme(recursion) kullanarak çözebilirsiniz,
     * sadece while döngüsü işe yaramayacaktır.
     * @param node Ağacın kök düğümü
     * @return Ağaçtaki en büyük değer
     */
    public static int maksimum(BTNode<Integer> node) {

        if (node == null)
            return Integer.MIN_VALUE;

        int deger = node.value;
        int sol = maksimum(node.left);
        int sag = maksimum(node.right);

        if (sol > deger)
            deger = sol;
        if (sag > deger)
            deger = sag;
        return deger;

    }
    /**
     * Ağacın düğümlerindeki değerlerin toplamını hesaplar
     * @param node Ağacın kök düğümü
     * @return Ağaçtaki düğümlerin değerlerinin toplamı
     */
    public static int toplam(BTNode<Integer> node) {
        if (node==null){
            return 0;
        }
        return (node.value+toplam(node.left)+toplam(node.right));
    }

    /**
     * Ağaçtaki düğüm sayısını verir.
     * @param node Ağacın kök düğümü
     * @return Düğüm sayısını döndürür
     */
    public static int dugumSayisi(BTNode<Integer> node) {
        if   (  node  ==  null){
            return 0;
        }
        return (1+dugumSayisi(node.left)+dugumSayisi(node.right));
    }

    /**
     * Ağacın yüksekliğini verir
     * @param node Ağacın kök düğümü
     * @return Ağacın yüksekliği
     */
    public static int yukseklik(BTNode<Integer> node) {
        if (node == null)
            return 0;
        else {
            int solDerinlik =   yukseklik(node.left);
            int sagDerinlik =   yukseklik(node.right);

            /* use the larger one */
            if (solDerinlik > sagDerinlik)
                return (solDerinlik + 1);
            else
                return (sagDerinlik + 1);
        }
    }
}