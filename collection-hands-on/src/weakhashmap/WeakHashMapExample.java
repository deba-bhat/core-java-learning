package weakhashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

public class WeakHashMapExample {

    public static void main(String[] args) {
        Map<Key, Value> myMap = new WeakHashMap<>();

        Key key1 = new Key(1);
        Key key2 = new Key(2);

        myMap.put(key1, new Value("Hello"));
        myMap.put(key2, new Value("World"));

        key1 = null;

        System.gc();

        System.out.println(myMap);
    }
}
class Key{
    private int id;

    public Key(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key = (Key) o;
        return id == key.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Key{" +
                "id=" + id +
                '}';
    }
}

class Value{

    private String data;

    public Value(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Value value = (Value) o;
        return Objects.equals(data, value.data);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(data);
    }

    @Override
    public String toString() {
        return "Value{" +
                "data='" + data + '\'' +
                '}';
    }


}