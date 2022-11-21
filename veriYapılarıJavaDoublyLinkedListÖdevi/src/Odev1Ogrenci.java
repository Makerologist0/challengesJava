public class Odev1Ogrenci extends DoublyLinkedList<Ilan> {
    /**
     * Bu metot bağlı listeye ekleme yaparken ilanların günlerinin küçükten büyüğe doğru sıralı olmasını sağlar
     * @param ilan Eklenecek ilan
     */
    public void guneGoreSiraliEkle(Ilan ilan) {

        if(isEmpty() ){
            addFirst(ilan);
        }
        else if(getHead().value.getGun() >= ilan.getGun()){
            addFirst(ilan);
        }
        else{
            Node<Ilan> current = getHead();
            int i = 0;
            while(current != null){
                if((current.value.getGun() >= ilan.getGun()) && i == 0  ){
                    i += 1;
                    Node<Ilan> newNode =  new Node<>(ilan,current,current.previous);
                    newNode.previous.next = newNode;
                    newNode.next.previous = newNode;
                    setSize(size()+1);
                    break;
                }
                current = current.next;
                if(current==null && i == 0){
                    addLast(ilan);
                    break;
                }
            }
        }
    }

    /**
     * Bu metot bağlı listeye ekleme yaparken ilanların fiyatlarının küçükten büyüğe doğru sıralı olmasını sağlar
     * @param ilan Eklenecek ilan
     */
    public void fiyataGoreSiraliEkle(Ilan ilan){
        if(isEmpty() ){
            addFirst(ilan);
        }
        else if(getHead().value.getFiyat() >= ilan.getFiyat()){
            addFirst(ilan);
        }
        else{
            Node<Ilan> current = getHead();
            int i = 0;
            while(current != null){


                if((current.value.getFiyat() >= ilan.getFiyat()) && i == 0  ){

                    i += 1;
                    Node<Ilan> newNode =  new Node<>(ilan,current,current.previous);
                    newNode.previous.next = newNode;
                    newNode.next.previous = newNode;
                    setSize(size()+1);
                    break;

                }

                current = current.next;

                if(current==null && i == 0){
                    addLast(ilan);
                    break;
                }
            }
        }
    }
    /**
     * Bu metot bağlı listeye ekleme yaparken ilanların günlerine göre sıralama yapar, eğer günleri aynı ise fiyatlarına göre kendi aralarında küçükten büyüğe sıralama yapar
     * @param ilan
     */
    public void guneVeFiyataGoreSiraliEkle(Ilan ilan) {
        Node<Ilan> head=getHead();
        Node<Ilan> tail=getTail();
        int size=size();
        if(size>0){
            if(head.value.getGun()>ilan.getGun()){
                addFirst(ilan);
            }
            else if(head.value.getGun()==ilan.getGun()){
                if(head.value.getFiyat()<ilan.getFiyat()){
                    Node<Ilan> yeni=new Node<Ilan>(ilan,null,null);
                    head.next.previous=yeni;
                    yeni.next=head.next;
                    head.next=yeni;
                    yeni.previous=head;
                }
                else{
                    addFirst(ilan);
                }
                setSize(size+1);
            }
            else if(tail.value.getGun()<ilan.getGun()){
                addLast(ilan);
            }
            else if(tail.value.getGun()==ilan.getGun()){
                if(tail.value.getFiyat()>ilan.getFiyat()){
                    Node<Ilan> yeni=new Node<Ilan>(ilan,null,null);
                    tail.previous.next=yeni;
                    yeni.previous=tail.previous;
                    yeni.next=tail;
                    tail.previous=yeni;
                    setSize(size+1);
                }
                else{
                    addLast(ilan);
                }

            }
            else{
                while(head.value.getGun()<ilan.getGun()){
                    head=head.next;
                }
                if(head.value.getGun()==ilan.getGun()){
                    if(head.value.getFiyat()>ilan.getFiyat()){
                        Node<Ilan> yeni=new Node<Ilan>(ilan,head,head.previous);
                        head.previous.next=yeni;
                        head.next.previous=yeni;
                    }
                    else{
                        Node<Ilan> yeni=new Node<Ilan>(ilan,head.next,head);
                        head.next.previous=yeni;
                        head.previous.next=yeni;
                    }
                }
                else{
                    Node<Ilan> yeni=new Node<Ilan>(ilan,head,head.previous);
                    head.previous.next=yeni;
                    head.next.previous=yeni;
                }
                setSize(size+1);
            }
        }
        else{
            addLast(ilan);
        }
    }
}