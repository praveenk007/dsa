package com.pk.algos;

import com.pk.algos.models.trie.TrieNode;
import com.sun.org.apache.xml.internal.serialize.LineSeparator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author praveenkamath
 **/
public class Trie {

    private TrieNode root;

    public Trie() {
        root = new TrieNode(null, null, false);
    }

    public void addWord(final String word) {
        addChar(0, word, root);
    }

    private void addChar(int index, String word, TrieNode node) {
        if(word == null || word.isEmpty() || index == word.length()) {
            //End of word
            return;
        }
        Map<Character, TrieNode> childs = node.getChild();
        if(childs == null) {
            childs = new HashMap<>();
            node.setChild(childs);
        }
        TrieNode childNode = childs.get(word.charAt(index));
        if(childNode == null) {
            childNode = new TrieNode(word.charAt(index), null, false);
            childs.put(word.charAt(index), childNode);
        }
        if(index == word.length() -1) {
            childNode.setCompleteWord(true);
        }
        addChar(index+1, word, childNode);
    }

    public List<String> getAllWords() {
        return getAllWords(root, null, null);
    }

    private List<String> getAllWords(TrieNode node, String str, List<String> words) {
        if(node == null) {
            return words;
        }
        if(str == null) {
            str = "";
        }
        if(words == null) {
            words = new ArrayList<>();
        }
        if(node.getVaue() != null) {
            str = str + node.getVaue();
        }
        if(node.isCompleteWord()) {
            words.add(str);
        }
        if(node.getChild() == null) {
            return words;
        }
        for (Map.Entry<Character, TrieNode> entry : node.getChild().entrySet()) {
            getAllWords(entry.getValue(), str, words);
        }
        return words;
    }
}
