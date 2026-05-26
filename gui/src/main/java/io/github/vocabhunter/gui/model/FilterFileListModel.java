/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.gui.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.util.List;

public class FilterFileListModel {

    private final ObservableList<FilterFileModel> files;

    public FilterFileListModel(final List<FilterFileModel> files) {
        this.files = FXCollections.observableArrayList(FilterFileModel.PROPERTY_EXTRACTOR);
        this.files.addAll(files);
    }

    public ObservableList<FilterFileModel> getFiles() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void removeIfExists(final FilterFileModel fileModel) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void addFile(final FilterFileModel fileModel) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void remove(final FilterFileModel file) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
