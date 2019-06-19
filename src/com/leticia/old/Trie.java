package com.leticia.old;

import java.util.*;

public class Trie {
    private TrieNode root;
    List<Integer> count;

    public Trie(){
        root = new TrieNode();
        count = new ArrayList<>();
    }

    public void insert(String word){
        HashMap<Character, TrieNode> current = root.children;
        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            TrieNode t;
            if (current.containsKey(c)) {
                t = current.get(c);
                t.count +=1;
                current.put(c, t);
            } else {
                t = new TrieNode(c);
                current.put(c, t);
            }
            current = t.children;
        }
    }

    public TrieNode searchNode(String word){
        HashMap<Character, TrieNode> current = root.children;
        TrieNode t = null;
        for (int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if (current.containsKey(c)){
                t = current.get(c);
                current = t.children;
            } else {
                return null;
            }
        }
        return t;
    }

    private void getCount(String word){
        TrieNode t = searchNode(word);
        if (t != null) {
            count.add(t.count);
        } else count.add(0);
    }

    private void manageOperation(String op, String name){
        switch (op) {
            case "add":
                insert(name);
                break;
            case "find" :
                getCount(name);
                break;
            default:
        }
    }

    private void printCount(){
        for (int i = 0; i < count.size(); i++){
            System.out.println(count.get(i));
        }
    }

    public static void main(String[] args) {
        Trie app = new Trie();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            app.manageOperation(op, contact);
        }
        app.printCount();
    }
}

class TrieNode {
    char c;
    int count;
    HashMap<Character, TrieNode> children;

    public TrieNode (){
        this.children = new HashMap<>();
    }

    public TrieNode(Character c) {
        this.c = c;
        this.count = 1;
        this.children = new HashMap<>();
    }

}
