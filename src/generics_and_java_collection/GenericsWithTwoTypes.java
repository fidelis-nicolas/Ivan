package generics_and_java_collection;

import java.util.Map;

public class GenericsWithTwoTypes<K, V> {
    private K key;
    private V value;

    public GenericsWithTwoTypes(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
