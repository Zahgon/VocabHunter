/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.gui.model;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class PositionModel {

    private final SimpleIntegerProperty positionIndex = new SimpleIntegerProperty();

    private final SimpleIntegerProperty size = new SimpleIntegerProperty();

    private final SimpleBooleanProperty analysisMode = new SimpleBooleanProperty();

    private final SimpleBooleanProperty editable = new SimpleBooleanProperty(true);

    public SimpleIntegerProperty positionIndexProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getPositionIndex() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setPositionIndex(final int positionIndex) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SimpleIntegerProperty sizeProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getSize() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setSize(final int size) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SimpleBooleanProperty analysisModeProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setAnalysisMode(final boolean analysisMode) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isAnalysisMode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SimpleBooleanProperty editableProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isEditable() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setEditable(final boolean editable) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
