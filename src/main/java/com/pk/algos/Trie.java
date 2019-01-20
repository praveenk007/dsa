package com.pk.algos;

import com.pk.algos.models.trie.TrieNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author praveenkamath
 **/
public class Trie {

    private TrieNode root = null;

    public Trie() {
        root = new TrieNode(null, null, false);
    }

    public void addWord(final String word) {
        addChar(word, root);
    }

    private void addChar(Character character, TrieNode node) {
        Map<Character, TrieNode> childs = node.getChild();
        if(childs == null) {
            childs = new HashMap<>();
            node.setChild(childs);
        }
        TrieNode childNode = childs.get(character);
        if(childNode == null) {
            childs.put(character, new TrieNode())
        }
    }
}
