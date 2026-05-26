/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.analysis.grid;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public final class GridCell {

    public static final GridCell EMPTY_CELL = new GridCell("", false);

    private final String content;

    private final boolean isRejected;

    public GridCell(final String content, final boolean isRejected) {
        this.content = content;
        this.isRejected = isRejected;
    }

    public String getContent() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isEmpty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isIncluded() {
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
