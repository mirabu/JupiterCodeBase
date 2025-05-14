package TrieDataStruct;

import java.util.*;

class TrieNode{
    TrieNode[] children;
    boolean flag;

    TrieNode(){
        children=new TrieNode[26];
        flag=false;
    }
}

class TrieMap{
    Map<Character, TrieMap> children = new HashMap<>();
    boolean isEnd=false;
}

class Trie{
   private TrieMap root;

   Trie(){
       root=new TrieMap();
   }


   public void insertData(String word){
       TrieMap node =root;
       for (char c: word.toLowerCase().toCharArray()){
           node.children.putIfAbsent(c, new TrieMap());
           node=node.children.get(c);
       }
       node.isEnd=true;
   }


   public boolean searchWord(String word){
       TrieMap node= root;
       for (char c: word.toLowerCase().toCharArray()){
           if (!node.children.containsKey(c)){
               return false;
           }
           node=node.children.get(c);
       }
       return node.isEnd;
   }

    public boolean searchPrefix(String prefix) {

       TrieMap node=root;
       for (char c: prefix.toLowerCase().toCharArray()){
           if (!node.children.containsKey(c)){
               return false;
           }
           node=node.children.get(c);
       }
       return true;
    }

   public List<String> autoComplete(String word){
       TrieMap node=root;
       for (char c: word.toLowerCase().toCharArray()){
           if (!node.children.containsKey(c)){
               return Collections.emptyList();
           }
           node=node.children.get(c);
       }

       List<String> stringList = new ArrayList<>();
       collect(node,word,stringList);
       return stringList;
   }



    private void collect(TrieMap node,String word, List<String>result){
       if (node.isEnd){
           result.add(word);
       }
       for(var entry: node.children.entrySet()){
           char c= entry.getKey();
           TrieMap nextNode= entry.getValue();


           collect(nextNode,word+c,result);
       }

    }
}


public class TrieImpl {
    public static void main(String[] args) {
      Trie trie=new Trie();
        // Insert test data
        trie.insertData("man");
        trie.insertData("manchester");
        trie.insertData("mango");
        trie.insertData("manage");
        trie.insertData("bat");
        trie.insertData("batch");
        trie.insertData("batman");

        // 1. Exact word search - true
        System.out.println(trie.searchWord("man")); // true
        System.out.println(trie.searchWord("bat")); // true

        System.out.println();
        // 2. Exact word search - false
        System.out.println(trie.searchWord("manc")); // false
        System.out.println(trie.searchWord("batc")); // false
        System.out.println();
        // 3. Prefix search - true
        System.out.println(trie.searchPrefix("man"));  // true
        System.out.println(trie.searchPrefix("bat"));  // true
        System.out.println();
        // 5. Auto-complete suggestions
        System.out.println("Auto-complete for 'man': " + trie.autoComplete("man"));
        // Expected: [man, manchester, mango, manage]





    }
}
