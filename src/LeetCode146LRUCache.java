/**
 * @author RuL
 */
public class LeetCode146LRUCache {

    //链表头指针
    private CacheNode head;
    //链表尾指针
    private CacheNode tail;
    //缓存容量
    private int capacity;
    //当前缓存大小
    private int size;


    public LeetCode146LRUCache(int capacity) {
        head = null;
        tail = null;
        this.capacity = capacity;
        this.size = 0;
    }

    public int get(int key) {
        CacheNode point = head;
        CacheNode pre = null;
        boolean exist = false;
        while (point != null) {
            if (point.key == key) {
                exist = true;
                break;
            }
            pre = point;
            point = point.next;
        }
        if (exist) {
            //不是头结点
            if (pre != null) {
                pre.next = point.next;

                point.next = null;
                this.tail.next = point;
                this.tail = point;
            } else {
                if (this.tail != this.head) {
                    this.head = point.next;
                    point.next = null;
                    this.tail.next = point;
                    this.tail = point;
                }
            }
            return point.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        CacheNode point = head;
        if (this.head == null && this.capacity > 0) {
            //当前链表还未初始化
            this.head = new CacheNode(key, value);
            this.tail = this.head;
            this.size++;
        } else {
            boolean exist = false;
            CacheNode pre = null;
            while (point != null) {
                if (point.key == key) {
                    exist = true;
                    break;
                }
                pre = point;
                point = point.next;
            }

            if (exist) {
                //key已经存在，将节点移动到链表尾部并更新节点的值

                //不是头结点
                if (pre != null) {
                    pre.next = point.next;

                    point.next = null;
                    this.tail.next = point;
                    this.tail = point;
                } else {
                    if (this.tail != this.head) {
                        this.head = point.next;
                        point.next = null;
                        this.tail.next = point;
                        this.tail = point;
                    }
                }
                point.value = value;
            } else {
                CacheNode cacheNode = new CacheNode(key, value);
                if (this.size < this.capacity) {
                    this.tail.next = cacheNode;
                    this.tail = cacheNode;
                } else {
                    //删除头结点
                    assert this.head != null;
                    CacheNode old = this.head;
                    this.head = this.head.next;
                    old.next = null;
                    if (size == 1) {
                        this.tail = cacheNode;
                        this.head = cacheNode;
                    } else {
                        this.tail.next = cacheNode;
                        this.tail = this.tail.next;
                    }
                }
            }

        }
    }

    /**
     * 链表节点
     */
    class CacheNode {
        int key;
        int value;

        CacheNode next;

        CacheNode(int key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }

        CacheNode(int key, int value, CacheNode next) {
            this(key, value);
            this.next = next;
        }
    }
}
