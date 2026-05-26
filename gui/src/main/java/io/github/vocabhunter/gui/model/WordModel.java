/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.gui.model;

import io.github.vocabhunter.analysis.marked.MarkedWord;
import io.github.vocabhunter.analysis.marked.WordState;
import io.github.vocabhunter.gui.common.SequencedWord;
import javafx.beans.Observable;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.util.Callback;
import java.util.List;

public class WordModel implements MarkedWord, SequencedWord {

    public static final Callback<WordModel, Observable[]> PROPERTY_EXTRACTOR = w -> new Observable[] { w.identifier, w.state };

    private final int sequenceNo;

    private final List<Integer> lineNos;

    private final int useCount;

    private final SimpleStringProperty identifier;

    private final SimpleObjectProperty<WordState> state;

    private final SimpleStringProperty note;

    public WordModel(final int sequenceNo, final String word, final List<Integer> lineNos, final int useCount, final WordState state, final String note) {
        this.lineNos = List.copyOf(lineNos);
        this.useCount = useCount;
        this.identifier = new SimpleStringProperty(word);
        this.sequenceNo = sequenceNo;
        this.state = new SimpleObjectProperty<>(state);
        this.note = new SimpleStringProperty(note);
    }

    @Override
    public int getSequenceNo() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getWordIdentifier() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public WordState getState() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setState(final WordState state) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SimpleObjectProperty<WordState> stateProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<Integer> getLineNos() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int getUseCount() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SimpleStringProperty noteProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getNote() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setNote(final String note) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
