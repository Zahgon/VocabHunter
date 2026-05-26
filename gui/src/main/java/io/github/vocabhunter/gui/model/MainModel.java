/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.gui.model;

import io.github.vocabhunter.analysis.filter.WordFilter;
import io.github.vocabhunter.analysis.session.SessionState;
import io.github.vocabhunter.gui.i18n.SupportedLocale;
import jakarta.inject.Singleton;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import java.nio.file.Path;
import java.util.Optional;
import static javafx.beans.binding.Bindings.isNotEmpty;

@Singleton
public class MainModel {

    private final SimpleStringProperty title = new SimpleStringProperty();

    private SessionState sessionState;

    private SessionModel sessionModel;

    private final SimpleBooleanProperty sessionOpen = new SimpleBooleanProperty(false);

    private final SimpleBooleanProperty selectionAvailable = new SimpleBooleanProperty(false);

    private final SimpleBooleanProperty editMode = new SimpleBooleanProperty(true);

    private final SimpleObjectProperty<Path> sessionFile = new SimpleObjectProperty<>(null);

    private final SimpleStringProperty documentName = new SimpleStringProperty();

    private final SimpleBooleanProperty changesSaved = new SimpleBooleanProperty(true);

    private final SimpleObjectProperty<FilterSettings> filterSettings = new SimpleObjectProperty<>();

    private final SimpleBooleanProperty enableFilters = new SimpleBooleanProperty(true);

    private final SimpleObjectProperty<SupportedLocale> locale = new SimpleObjectProperty<>();

    private WordFilter filter;

    public void clearSessionModel() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void replaceSessionModel(final SessionState sessionState, final SessionModel sessionModel, final Path sessionFile) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private void resetSessionModel(final SessionState sessionState, final SessionModel sessionModel, final Path sessionFile, final boolean isSessionOpen) {
        unbindOldSession();
        this.sessionState = sessionState;
        this.sessionModel = sessionModel;
        this.sessionFile.set(sessionFile);
        sessionOpen.set(isSessionOpen);
    }

    private void unbindOldSession() {
        selectionAvailable.unbind();
        documentNameProperty().unbind();
        if (sessionState != null) {
            editMode.unbindBidirectional(sessionModel.editableProperty());
            changesSaved.unbindBidirectional(sessionModel.changesSavedProperty());
            sessionModel.filterSettingsProperty().unbindBidirectional(filterSettings);
            sessionModel.enableFiltersProperty().unbindBidirectional(enableFilters);
        }
    }

    public SimpleObjectProperty<Path> sessionFileProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SimpleStringProperty titleProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setTitle(final String title) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SimpleStringProperty documentNameProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getDocumentName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SimpleBooleanProperty changesSavedProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setChangesSaved(final boolean changesSaved) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isChangesSaved() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SimpleBooleanProperty sessionOpenProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isSessionOpen() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setSessionOpen(final boolean sessionOpen) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SimpleBooleanProperty selectionAvailableProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SimpleBooleanProperty editModeProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SimpleObjectProperty<FilterSettings> filterSettingsProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setFilterSettings(final FilterSettings filterSettings) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public FilterSettings getFilterSettings() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setFilter(final WordFilter filter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public WordFilter getFilter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SimpleBooleanProperty enableFiltersProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setEnableFilters(final boolean enableFilters) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setSessionFile(final Path sessionFile) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean hasSessionFile() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Path getSessionFile() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Optional<SessionState> getSessionState() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Optional<SessionModel> getSessionModel() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setLocale(final SupportedLocale locale) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isLocaleDefined() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SimpleObjectProperty<SupportedLocale> localeProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
