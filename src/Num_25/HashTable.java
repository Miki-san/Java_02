package Num_25;

import java.util.Iterator;

public class HashTable<K,V> implements HashMapInterface<K,V>{
    private final int capacity = 128;
    Entry<K,V>[] buckets;
    Entry<K,V> currentPart;
    int bucketIndex = 0;

    public HashTable() {
        buckets = new Entry[capacity];
    }

    public int keyHash(K key){
        return key.hashCode() >> 2;
    }

    @Override
    public void add(K key, V value) {
        int bucket = keyHash(key) % capacity;
        Entry<K,V> entry = buckets[bucket];
        if(entry != null){
            while(true) {
                if(entry.getKey().equals(key)){
                    entry.setValue(value);
                    return;
                }
                if(!entry.hasNext()){
                    break;
                }
                entry = entry.getNext();
            }
            entry.setNext(new Entry<>(key,value));
        } else {
            buckets[bucket] = new Entry<>(key,value);
        }
        int i = 0;
        while(buckets[i] == null){
            i++;
        }
        currentPart = buckets[i];
        bucketIndex = i;
    }

    @Override
    public V get(K key) {
        int bucket = keyHash(key) % capacity;
        Entry<K,V> part = buckets[bucket];
        if(part!=null){
            while(!key.equals(part.getKey())) {
                part = part.getNext();
                if(part == null){
                    break;
                }
            }
        }
        if(part != null){
            return part.getValue();
        }
        return null;
    }

    @Override
    public V remove(K key) {
        int bucket = keyHash(key) % capacity;
        Entry<K,V> part = buckets[bucket];
        if(part == null){
            return null;
        }
        if (key.equals(part.getKey())) {
            buckets[bucket] = part.getNext();
            return part.getValue();
        }
        while(!key.equals(part.getNext().getKey())) {
            part = part.getNext();
            if(part.getNext() == null){
                break;
            }
        }
        return part.getValue();
    }
    class HashIterator implements Iterator<Entry<K, V>> {
        private final HashTable<K,V> hashTable;
        HashIterator(HashTable<K,V> hashTable){
            this.hashTable = hashTable;
        }

        @Override
        public boolean hasNext() {
            if(currentPart !=null) {
                if (currentPart.getNext() != null) {
                    return true;
                } else if (bucketIndex < hashTable.capacity - 1) {
                    return buckets[bucketIndex] != null;
                }
            }
            int i = 0;
            while(i < capacity - 1 && buckets[i] == null){
                i++;
            }
            currentPart = buckets[i];
            bucketIndex = i;
            return false;
        }

        @Override
        public Entry<K, V> next() {
            if (currentPart.getNext() != null) {
                return currentPart = currentPart.getNext();
            } else {
                Entry k = buckets[bucketIndex];
                int i = bucketIndex+1;
                while(i < capacity - 1 && buckets[i] == null){
                    i++;
                }
                currentPart = buckets[i];
                bucketIndex = i;
                return k;
            }
        }
    }

    @Override
    public Iterator<Entry<K, V>> iterator() {
        return new HashIterator(this);
    }
}
