package collections;

import java.util.*;

public class HashMapExample {

    public static void main(String[] args) {

        Map<Key,Value> myMap = new HashMap<>();

        myMap.put(new Key(1), new Value("Hello"));
        myMap.put(new Key(2), new Value("World"));

        Set<Key> keys = myMap.keySet();
        Collection<Value> values = myMap.values();

        for (Map.Entry<Key, Value> keyValueEntry : myMap.entrySet()) {

            System.out.println("KeyValueEntry:: "+ keyValueEntry);

        }


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
        return "collections.Key{" +
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
        return "collections.Value{" +
                "data='" + data + '\'' +
                '}';
    }


}
