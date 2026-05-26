/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.analysis.grid;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public final class GridColumn {

    private final int acceptedCount;

    public GridColumn(final int acceptedCount) {
        this.acceptedCount = acceptedCount;
    }

    public int getAcceptedCount() {
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
}
