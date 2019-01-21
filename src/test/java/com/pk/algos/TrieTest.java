package com.pk.algos;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;


/**
 * @author praveenkamath
 **/
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TrieTest {

    @Test
    public void testAddPass() {
        Trie trie = new Trie();
        trie.addWord("hattrick");
        trie.addWord("hat");
        trie.addWord("hates");
        trie.addWord("hater");
        trie.addWord("men");
        trie.addWord("mess");
        List<String> words = trie.getAllWords();
        assertThat(words, containsInAnyOrder(
            "hattrick","hat","hater","hates","mess","men"
        ));
    }

    @Test
    public void testAddFail() {
        Trie trie = new Trie();
        trie.addWord("hattrick");
        trie.addWord("hat");
        trie.addWord("hates");
        trie.addWord("hater");
        trie.addWord("men");
        trie.addWord("mess");
        List<String> words = trie.getAllWords();
        assertThat(words, not(hasItem(
                "hatter"
        )));
    }
}
