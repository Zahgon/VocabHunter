/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.gui.model;

import io.github.vocabhunter.analysis.core.VocabHunterException;
import io.github.vocabhunter.analysis.marked.WordState;
import java.util.List;

public final class InitialSelectionTool {

    private InitialSelectionTool() {
        // Prevent instantiation - all methods are static
    }

    public static WordModel nextWord(final List<WordModel> words) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static int getLastSeenIndex(final List<WordModel> words) {
        for (int i = words.size() - 1; i >= 0; i--) {
            if (isSeen(words, i)) {
                return i;
            }
        }
        return -1;
    }

    private static boolean isSeen(final List<WordModel> words, final int index) {
        return !words.get(index).getState().equals(WordState.UNSEEN);
    }
}
