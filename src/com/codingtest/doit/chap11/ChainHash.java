package com.codingtest.doit.chap11;

public class ChainHash<K,V> {

    //버킷을 나타내기 위해 만든 클래스 즉, 노드==버킷
    class Node<K,V>{

        private K key;
        private V data;
        private Node<K,V> next;

        public Node(K key, V data, Node<K, V> next) {
            this.key = key;
            this.data = data;
            this.next = next;
        }


        public K getKey() {
            return key;
        }

        public V getValue() {
            return data;
        }

        public  int hashCode(){
            return key.hashCode();
        }
    }

    private int size;
    private Node<K,V>[] table;


    //생성자
    public ChainHash(int capacity) {
        try {
            table = new Node[capacity];
            this.size = capacity;

        }catch(OutOfMemoryError e){
            this.size=0;
        }
    }


    //해시값 구하기
    public int hashValue(Object key){
        return key.hashCode() % size;
    }

    public V search(K key){
        int hash = hashValue(key);
        Node<K,V> p = table[hash];

        while (p != null) {
            if(p.getKey().equals(key))
                return p.getValue();
            p = p.next;
        }
        return null;
    }

    public int add(K key, V data){
        int hash = hashValue(key);
        Node<K,V> p = table[hash];

        while(p!= null){
            if(p.getKey().equals(key))
                return 1;
            p = p.next;
        }
        Node<K,V> temp = new Node<K,V>(key, data, table[hash]);
        table[hash] = temp;
        return 0;
    }

    //키값 key를 갖는 요소의 삭제
    public int remove(K key){
        int hash = hashValue(key);
        Node<K,V> p = table[hash];
        Node<K,V> pp = null;

        while ( p != null){
            if(p.getKey().equals(key)){
                if(pp== null)
                    table[hash]= p.next;
                else
                    pp.next = p.next;
                return 0;
            }
            pp=p;
            p=p.next;
        }
        return 1;
    }

    public void dump(){
        for(int i =0; i < size; i++){
            Node<K,V> p = table[i];
            System.out.printf("%02d   ", i );
            while(p != null ){
                System.out.printf("-> %s (%s)    " , p.getKey(), p.getValue());
                p = p.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ChainHash<Integer,Integer> ch=new ChainHash<Integer, Integer>(13);
        for (int i =0 ; i<100; i++){
            ch.add(i,i);
        }

        ch.remove(18);
        ch.dump();


    }


}
