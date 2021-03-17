import java.util.*;

public class LeetCode146 {

    class LRUCache {
        private LinkedHashMap<Integer,Integer> cache;
        private int capacity;

        public LRUCache(int capacity) {
            cache = new LinkedHashMap<>();
            this.capacity = capacity;
        }

        public int get(int key) {
            if(cache.containsKey(key)) {
                Integer value = cache.get(key);
                cache.remove(key);
                cache.put(key, value);
                return value;
            }
            return -1;
        }

        public void put(int key, int value) {
            if(cache.containsKey(key)){
                cache.remove(key);
            }else if(cache.size()==capacity){
                Iterator<Map.Entry<Integer, Integer>> iterator = cache.entrySet().iterator();
                iterator.next();
                iterator.remove();
            }
            cache.put(key,value);
        }
    }
}
