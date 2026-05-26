/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.gui.search;

import io.github.vocabhunter.gui.common.SequencedWord;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public final class SearchResult<T extends SequencedWord> {

    private final String matchDescription;

    private final T previousMatch;

    private final T nextMatch;

    private final T wrapMatch;

    private final boolean isSearchFail;

    public SearchResult() {
        this("", null, null, null, false);
    }

    public SearchResult(final String matchDescription, final T previousMatch, final T nextMatch, final T wrapMatch, final boolean isSearchFail) {
        this.matchDescription = matchDescription;
        this.previousMatch = previousMatch;
        this.nextMatch = nextMatch;
        this.wrapMatch = wrapMatch;
        this.isSearchFail = isSearchFail;
    }

    public String getMatchDescription() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public T getPreviousMatch() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public T getNextMatch() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public T getWrapMatch() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isSearchFail() {
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
