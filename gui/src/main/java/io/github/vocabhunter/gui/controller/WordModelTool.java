/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.gui.controller;

import io.github.vocabhunter.analysis.session.SessionState;
import io.github.vocabhunter.analysis.session.SessionWord;
import io.github.vocabhunter.gui.model.WordModel;
import java.util.List;
import java.util.stream.IntStream;
import static io.github.vocabhunter.gui.common.GuiNoteTool.toGuiNote;

public final class WordModelTool {

    private WordModelTool() {
        // Prevent instantiation - all methods are static
    }

    public static List<WordModel> wordModels(final SessionState raw) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static WordModel wordModel(final int n, final SessionWord word) {
        return new WordModel(n, word.getWordIdentifier(), word.getLineNos(), word.getUseCount(), word.getState(), toGuiNote(word.getNote()));
    }
}
