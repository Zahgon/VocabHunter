/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.gui.model;

import io.github.vocabhunter.analysis.session.FileNameTool;
import javafx.beans.Observable;
import javafx.beans.property.SimpleObjectProperty;
import javafx.util.Callback;
import java.nio.file.Path;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class FilterFileModel {

    public static final Callback<FilterFileModel, Observable[]> PROPERTY_EXTRACTOR = m -> new Observable[] { m.file, m.modeProperty };

    private final SimpleObjectProperty<Path> file;

    private final SimpleObjectProperty<FilterFileMode> modeProperty;

    private Set<Integer> columns;

    public FilterFileModel(final Path file, final FilterFileMode mode) {
        this(file, mode, Set.of());
    }

    public FilterFileModel(final Path file, final FilterFileMode mode, final Set<Integer> columns) {
        this.file = new SimpleObjectProperty<>(file);
        this.modeProperty = new SimpleObjectProperty<>(mode);
        this.columns = new TreeSet<>(columns);
    }

    public FilterFileMode getMode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setMode(final FilterFileMode mode) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Path getFile() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setFile(final Path file) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Set<Integer> getColumns() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setColumns(final Set<Integer> columns) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
