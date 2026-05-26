/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.gui.model;

import io.github.vocabhunter.analysis.marked.MarkedWord;
import io.github.vocabhunter.analysis.marked.WordState;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ObservableValue;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class FilterSessionWord {

    private final String wordIdentifier;

    private final WordState state;

    private final ObservableValue<FilterSessionWord> self = new SimpleObjectProperty<>(this);

    public FilterSessionWord(final MarkedWord word) {
        this(word.getWordIdentifier(), word.getState());
    }

    public FilterSessionWord(final String wordIdentifier, final WordState state) {
        this.wordIdentifier = wordIdentifier;
        this.state = state;
    }

    public WordState getState() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getWordIdentifier() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ObservableValue<FilterSessionWord> selfProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(final Object o) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
