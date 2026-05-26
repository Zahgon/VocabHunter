/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.gui.view;

import io.github.vocabhunter.analysis.grid.GridCell;
import io.github.vocabhunter.analysis.grid.GridLine;
import javafx.beans.property.BooleanProperty;
import javafx.scene.control.TableCell;

public class FilterGridWordTableCell extends TableCell<GridLine, GridCell> {

    private final BooleanProperty selectedProperty;

    public FilterGridWordTableCell(final BooleanProperty selectedProperty) {
        this.selectedProperty = selectedProperty;
    }

    @Override
    protected void updateItem(final GridCell cell, final boolean isEmpty) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private boolean isIncluded(final GridCell cell) {
        return selectedProperty.get() && cell.isIncluded();
    }
}
