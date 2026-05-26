/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.gui.settings;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.github.vocabhunter.gui.i18n.SupportedLocale;
import java.nio.file.Path;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VocabHunterSettings {

    public static final int DEFAULT_MINIMUM_LETTERS = 2;

    public static final int DEFAULT_MINIMUM_OCCURRENCES = 2;

    public static final boolean DEFAULT_ALLOW_INITIAL_CAPITALS = true;

    private Path documentsPath;

    private Path sessionsPath;

    private Path exportPath;

    private Path wordListPath;

    private int filterMinimumLetters = DEFAULT_MINIMUM_LETTERS;

    private int filterMinimumOccurrences = DEFAULT_MINIMUM_OCCURRENCES;

    private boolean isAllowInitialCapitals = DEFAULT_ALLOW_INITIAL_CAPITALS;

    private WindowSettings windowSettings;

    private SupportedLocale locale;

    public Path getDocumentsPath() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setDocumentsPath(final Path documentsPath) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Path getSessionsPath() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setSessionsPath(final Path sessionsPath) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Path getExportPath() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setExportPath(final Path exportPath) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Path getWordListPath() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setWordListPath(final Path wordListPath) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getFilterMinimumLetters() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setFilterMinimumLetters(final int filterMinimumLetters) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getFilterMinimumOccurrences() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setFilterMinimumOccurrences(final int filterMinimumOccurrences) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isAllowInitialCapitals() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setAllowInitialCapitals(final boolean allowInitialCapitals) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public WindowSettings getWindowSettings() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setWindowSettings(final WindowSettings windowSettings) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SupportedLocale getLocale() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setLocale(final SupportedLocale locale) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
