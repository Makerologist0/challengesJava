public class HashEntry<T> {
    T value;//Değeri tutar
    boolean isActive;//silinip silinmediğini gösterir
    public HashEntry(T value, boolean isActive) {
        this.value = value;
        this.isActive = isActive;
    }
    public HashEntry(T value) {
        this(value, true);
    }
}
