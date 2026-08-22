class TrieNode {
    TrieNode[] childern;
    boolean isWord;

    TrieNode(){
        childern = new TrieNode[26];
        isWord = false;
    }
}
class Trie {
    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode node = root;
        for(char ch: word.toCharArray()){
            int index = ch-'a';
            if(node.childern[index] == null){
                node.childern[index] = new TrieNode();
            }
            node = node.childern[index];
        }
        node.isWord = true;
    }
    
    public boolean search(String word) {
        TrieNode node = root;
        for(char ch: word.toCharArray()){
            int index = ch-'a';
            if(node.childern[index] == null){
                return false;
            }
            node = node.childern[index];
        }
        return node.isWord;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for(char ch: prefix.toCharArray()){
            int index = ch-'a';
            if(node.childern[index] == null){
                return false;
            }
            node = node.childern[index];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */