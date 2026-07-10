class Trie {
    class TrieNode {
        TrieNode[] children;
        boolean eow;

        TrieNode() {
            children = new TrieNode[26];
            eow = false;
        }
    }
    
    TrieNode root;

    public Trie() {
        // Implement Trie
        root = new TrieNode();
    }

    // Insert a word into the Trie
    public void insert(String word) {
        TrieNode curr = root;

        for(int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null) {
                curr.children[idx] = new TrieNode();
            }

            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    // Search for a word in the Trie
    public boolean search(String word) {
        TrieNode curr = root;

        for(int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null) {
                return false;
            }

            curr = curr.children[idx];
        }

        return curr.eow == true;
    }

    // Check if a prefix exists in the Trie
    public boolean isPrefix(String word) {
        TrieNode curr = root;

        for(int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null) {
                return false;
            }

            curr = curr.children[idx];
        }

        return true;
    }
}