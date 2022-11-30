public class QuadraticProbeHashing <T>{
    public HashEntry<T>[] dizi;
    public int elemanSayisi;

    public QuadraticProbeHashing() {
        dizi=new HashEntry[23];
    }
    public QuadraticProbeHashing(int boyut){
        dizi=new HashEntry[boyut];
    }
    public int hash(T deger) {
        return deger.hashCode()%dizi.length;
    }

    public void ekle(T eleman){
        //Karesel sondalama ekleme işlemini gerçekleştirin
        int h = hash(eleman);
        int i=0 ;
        while(dizi[(h+i*i)%dizi.length] != null
                && dizi[(h+i*i)%dizi.length].isActive){
            i++;
        }
        dizi[(h+i*i)%dizi.length] = new HashEntry(eleman);
        elemanSayisi++;
    }

    public boolean sil(T eleman){
        int h = hash(eleman);
        int i=0 ;
        while(true){
            if(dizi[(h+i*i)%dizi.length] != null
                    && dizi[(h+i*i)%dizi.length].isActive
                    && dizi[(h+i*i)%dizi.length].value.equals(eleman)){
                dizi[(h+i*i)%dizi.length].isActive = false;
                elemanSayisi--;
                return true;
            }
            i++;
        }

    }
}
