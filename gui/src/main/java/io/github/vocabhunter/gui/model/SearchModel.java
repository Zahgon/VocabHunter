/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.gui.model;

import io.github.vocabhunter.gui.common.SequencedWord;
import io.github.vocabhunter.gui.search.SearchResult;
import io.github.vocabhunter.gui.search.Searcher;
import javafx.beans.property.*;
import javafx.collections.ObservableList;

public class SearchModel<T extends SequencedWord> {

    private final StringProperty searchField;

    private final ObjectProperty<T> currentWord;

    private final ObservableList<T> wordList;

    private final StringProperty matchDescription = new SimpleStringProperty();

    private final ObjectProperty<T> previousMatch = new SimpleObjectProperty<>();

    private final ObjectProperty<T> nextMatch = new SimpleObjectProperty<>();

    private final ObjectProperty<T> wrapMatch = new SimpleObjectProperty<>();

    private final BooleanProperty previousButtonDisabled = new SimpleBooleanProperty();

    private final BooleanProperty nextButtonDisabled = new SimpleBooleanProperty();

    private final BooleanProperty searchFail = new SimpleBooleanProperty();

    public SearchModel(final StringProperty searchField, final ObjectProperty<T> currentWord, final ObservableList<T> wordList) {
        this.searchField = searchField;
        this.currentWord = currentWord;
        this.wordList = wordList;
    }

    public void resetValues() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void updateValues(final Searcher<T> searcher) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private void updateValues(final SearchResult<T> result) {
        matchDescription.set(result.getMatchDescription());
        previousMatch.set(result.getPreviousMatch());
        previousButtonDisabled.set(result.getPreviousMatch() == null);
        nextMatch.set(result.getNextMatch());
        wrapMatch.set(result.getWrapMatch());
        nextButtonDisabled.set(result.getNextMatch() == null);
        searchFail.set(result.isSearchFail());
    }

    public StringProperty matchDescriptionProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ObjectProperty<T> previousMatchProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ObjectProperty<T> nextMatchProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ObjectProperty<T> wrapMatchProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public BooleanProperty previousButtonDisabledProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public BooleanProperty nextButtonDisabledProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public BooleanProperty searchFailProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
