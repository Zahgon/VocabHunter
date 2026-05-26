/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.analysis.grid;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import java.util.List;
import static java.util.stream.Collectors.joining;

public final class GridLine {

    private final List<GridCell> cells;

    public GridLine(final GridCell... cells) {
        this(List.of(cells));
    }

    public GridLine(final List<GridCell> cells) {
        this.cells = List.copyOf(cells);
    }

    public List<GridCell> getCells() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public GridCell getCell(final int index) {
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
}
