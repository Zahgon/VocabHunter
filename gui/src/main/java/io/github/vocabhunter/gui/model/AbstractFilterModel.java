/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.gui.model;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.StringBinding;
import javafx.beans.property.*;
import javafx.beans.value.ObservableNumberValue;
import java.nio.file.Path;
import static io.github.vocabhunter.analysis.session.FileNameTool.filename;

public abstract class AbstractFilterModel {

    private final SimpleObjectProperty<Path> file = new SimpleObjectProperty<>();

    private final SimpleStringProperty filename = new SimpleStringProperty();

    private final SimpleBooleanProperty error = new SimpleBooleanProperty();

    protected AbstractFilterModel(final Path file) {
        this.file.set(file);
    }

    protected void replaceContent(final Path file) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected void bindValues() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public abstract ObservableNumberValue wordCountProperty();

    public int getWordCount() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Path getFile() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ReadOnlyStringProperty filenameProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getFilename() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ReadOnlyBooleanProperty errorProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isError() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
