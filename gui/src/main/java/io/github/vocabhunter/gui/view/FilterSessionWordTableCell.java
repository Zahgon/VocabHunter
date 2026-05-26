/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.gui.view;

import io.github.vocabhunter.analysis.marked.WordState;
import io.github.vocabhunter.gui.model.FilterSessionWord;
import javafx.beans.value.ObservableBooleanValue;
import javafx.scene.control.TableCell;

public class FilterSessionWordTableCell extends TableCell<FilterSessionWord, FilterSessionWord> {

    private final ObservableBooleanValue includeUnknown;

    public FilterSessionWordTableCell(final ObservableBooleanValue includeUnknown) {
        this.includeUnknown = includeUnknown;
    }

    @Override
    protected void updateItem(final FilterSessionWord item, final boolean empty) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private boolean isExcluded(final FilterSessionWord item) {
        return item.getState() == WordState.UNKNOWN && !includeUnknown.get();
    }
}
