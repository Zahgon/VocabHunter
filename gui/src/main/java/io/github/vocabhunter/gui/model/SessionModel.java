/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.gui.model;

import io.github.vocabhunter.analysis.marked.MarkTool;
import io.github.vocabhunter.analysis.marked.WordState;
import io.github.vocabhunter.gui.settings.WindowSettings;
import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableSet;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public final class SessionModel {

    private static final Comparator<WordModel> WORD_COMPARATOR = Comparator.comparing(WordModel::getSequenceNo);

    private final List<String> lines;

    private final List<WordModel> allWords;

    private final ObservableSet<WordModel> selectedWords = FXCollections.observableSet(new TreeSet<>(WORD_COMPARATOR));

    private final ObservableList<WordModel> wordList = FXCollections.observableArrayList(WordModel.PROPERTY_EXTRACTOR);

    private final ObservableList<String> useList = FXCollections.observableArrayList();

    private final SimpleObjectProperty<WordModel> currentWord;

    private final SimpleIntegerProperty useCount = new SimpleIntegerProperty();

    private final SimpleBooleanProperty editable = new SimpleBooleanProperty(true);

    private final SimpleBooleanProperty searchOpen = new SimpleBooleanProperty(false);

    private final SimpleStringProperty documentName;

    private final SimpleBooleanProperty changesSaved = new SimpleBooleanProperty(true);

    private final SimpleObjectProperty<FilterSettings> filterSettings;

    private final SimpleBooleanProperty enableFilters = new SimpleBooleanProperty();

    private final ProgressModel progress;

    private final PositionModel position;

    private final DoubleProperty splitUsePosition;

    private final DoubleProperty splitWordPosition;

    public SessionModel(final String documentName, final List<String> lines, final List<WordModel> words, final FilterSettings filterSettings, final ProgressModel progress, final PositionModel position, final WindowSettings windowSettings) {
        this.lines = new ArrayList<>(lines);
        this.documentName = new SimpleStringProperty(documentName);
        this.filterSettings = new SimpleObjectProperty<>(filterSettings);
        this.progress = progress;
        this.position = position;
        allWords = List.copyOf(words);
        selectedWords.addAll(words.stream().filter(w -> w.getState().equals(WordState.UNKNOWN)).toList());
        updateWordList(true, new MarkTool<>(words));
        currentWord = new SimpleObjectProperty<>(InitialSelectionTool.nextWord(allWords));
        splitUsePosition = new SimpleDoubleProperty(windowSettings.getSplitUsePosition());
        splitWordPosition = new SimpleDoubleProperty(windowSettings.getSplitWordPosition());
    }

    public void addSelectedWord(final WordModel word) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void removeDeselectedWord(final WordModel word) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void processWordUpdate(final WordModel word) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void updateWordList(final boolean isEditable, final MarkTool<WordModel> markTool) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ObservableSet<WordModel> getSelectedWords() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isSelected(final int index) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public WordModel getWord(final int index) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SimpleObjectProperty<WordModel> currentWordProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SimpleIntegerProperty useCountProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SimpleBooleanProperty editableProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SimpleBooleanProperty searchOpenProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setSearchOpen(final boolean isSearchOpen) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isSearchOpen() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isEditable() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public WordModel getCurrentWord() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ObservableList<WordModel> getWordList() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getWordListSize() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<WordModel> getAllWords() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getAllWordsSize() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ObservableList<String> getUseList() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SimpleStringProperty documentNameProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SimpleBooleanProperty changesSavedProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setChangesSaved(final boolean changesSaved) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SimpleObjectProperty<FilterSettings> filterSettingsProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public FilterSettings getFilterSettings() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SimpleBooleanProperty enableFiltersProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setEnableFilters(final boolean enableFilters) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isEnableFilters() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ProgressModel getProgress() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PositionModel getPosition() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public DoubleProperty splitUsePositionProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public double getSplitUsePosition() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public DoubleProperty splitWordPositionProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public double getSplitWordPosition() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
