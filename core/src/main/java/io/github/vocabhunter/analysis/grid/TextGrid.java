/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.analysis.grid;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public final class TextGrid {

    private final List<GridLine> lines;

    private final List<GridColumn> columns;

    public TextGrid(final List<GridLine> lines, final List<GridColumn> columns) {
        this.lines = List.copyOf(lines);
        this.columns = List.copyOf(columns);
    }

    public List<GridColumn> getColumns() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<GridLine> getLines() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(final Object o) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private String toString(final int index, final GridColumn column) {
        return String.format("Column %s (%s accepted)", index + 1, column.getAcceptedCount());
    }
}
