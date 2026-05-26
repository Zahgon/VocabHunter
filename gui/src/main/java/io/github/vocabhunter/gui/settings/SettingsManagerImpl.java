/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.gui.settings;

import io.github.vocabhunter.analysis.settings.BaseSettingsManager;
import io.github.vocabhunter.gui.i18n.SupportedLocale;
import jakarta.inject.Singleton;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;

@Singleton
public class SettingsManagerImpl extends BaseSettingsManager<VocabHunterSettings> implements SettingsManager {

    public static final String SETTINGS_JSON = "settings.json";

    public SettingsManagerImpl() {
        super(SETTINGS_JSON, VocabHunterSettings.class);
    }

    public SettingsManagerImpl(final Path settingsFile) {
        super(settingsFile, VocabHunterSettings.class);
    }

    @Override
    public Path getDocumentsPath() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void setDocumentsPath(final Path path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Path getSessionsPath() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void setSessionsPath(final Path path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Path getExportPath() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void setExportPath(final Path path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Path getWordListPath() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void setWordListPath(final Path path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int getFilterMinimumLetters() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void setFilterMinimumLetters(final int count) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int getFilterMinimumOccurrences() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void setFilterMinimumOccurrences(final int count) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean isAllowInitialCapitals() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void setAllowInitialCapitals(final boolean allow) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Optional<WindowSettings> getWindowSettings() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void setWindowSettings(final WindowSettings windowSettings) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Optional<SupportedLocale> getLocale() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void setLocale(final SupportedLocale locale) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private <T> T getValue(final Function<VocabHunterSettings, T> getter) {
        VocabHunterSettings settings = readSettings();
        return getter.apply(settings);
    }

    private <T> void setValue(final BiConsumer<VocabHunterSettings, T> setter, final T value) {
        VocabHunterSettings settings = readSettings();
        setter.accept(settings, value);
        writeSettings(settings);
    }

    private Path getPath(final Function<VocabHunterSettings, Path> getter) {
        VocabHunterSettings settings = readSettings();
        Path path = getter.apply(settings);
        if (path != null && Files.isDirectory(path)) {
            return path;
        }
        return Paths.get(System.getProperty("user.home"));
    }

    private void setPath(final BiConsumer<VocabHunterSettings, Path> setter, final Path path) {
        VocabHunterSettings settings = readSettings();
        setter.accept(settings, path);
        writeSettings(settings);
    }
}
