/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.analysis.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import static java.util.stream.Collectors.toCollection;

public final class WordUse implements AnalysisWord {

    private final String wordIdentifier;

    private final int useCount;

    private final List<Integer> lineNos;

    public WordUse(final String wordIdentifier, final int useCount, final Collection<Integer> lineNos) {
        this.wordIdentifier = wordIdentifier;
        this.useCount = useCount;
        this.lineNos = lineNos.stream().sorted().distinct().collect(toCollection(() -> new ArrayList<>(lineNos.size())));
    }

    @Override
    public String getWordIdentifier() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int getUseCount() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<Integer> getLineNos() {
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
