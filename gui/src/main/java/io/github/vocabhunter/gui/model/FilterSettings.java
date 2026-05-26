/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.gui.model;

import io.github.vocabhunter.analysis.settings.BaseListedFile;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import java.util.List;

public final class FilterSettings {

    private final int minimumLetters;

    private final int minimumOccurrences;

    private final boolean allowInitialCapitals;

    private final List<BaseListedFile> filterFiles;

    public FilterSettings(final int minimumLetters, final int minimumOccurrences, final boolean allowInitialCapitals, final List<BaseListedFile> filterFiles) {
        this.minimumLetters = minimumLetters;
        this.minimumOccurrences = minimumOccurrences;
        this.allowInitialCapitals = allowInitialCapitals;
        this.filterFiles = List.copyOf(filterFiles);
    }

    public int getMinimumLetters() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getMinimumOccurrences() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isAllowInitialCapitals() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<BaseListedFile> getFilterFiles() {
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
