package com.pk.algos;

import com.pk.algos.models.trie.TrieNode;

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

    public List<String> startsWith(final String start) {
        List<String> words = new ArrayList<>();
        TrieNode child = getChildNode(0, start, root);
        if(child == null) {
            return words;
        } return getAllWords(child, start.substring(0, start.length()-1), words, null);
    }

    public List<String> contains(final String str) {
        List<String> words = new ArrayList<>();
        return getAllWords(root, null, words, str);
    }

    private TrieNode getChildNode(int index, final String start, TrieNode node) {
        if(node == null || node.getChild() == null || index > start.length() - 1) {
            return node;
        }
        TrieNode child = node.getChild().get(start.charAt(index));
        return getChildNode(index+1, start, child);
    }

    private void addChar(int index, String word, TrieNode node) {
        if(word == null || word.isEmpty() || index == word.length()) { //End of word
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
        return getAllWords(root, null, null, null);
    }

    private List<String> getAllWords(TrieNode node, String str, List<String> words, String strContains) {
        if(node == null) {
            return words;
        }
        str = initStr(str);
        words = initWords(words);
        if(node.getVaue() != null) {
            str = str + node.getVaue();
        }
        if(node.isCompleteWord()) {
            if(strContains == null || str.contains(strContains)) {
                words.add(str);
            }
        }
        if(node.getChild() != null) {
            for (Map.Entry<Character, TrieNode> entry : node.getChild().entrySet()) {
                getAllWords(entry.getValue(), str, words, strContains);
            }
        } return words;
    }

    private String initStr(String str) {
        if(str == null) {
            str = "";
        } return str;
    }

    private List<String> initWords(List<String> words) {
        if(words == null) {
            words = new ArrayList<>();
        } return words;
    }
}
