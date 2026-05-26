/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.analysis.session;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.nio.file.Path;
import java.util.Optional;

public class EnrichedSessionState {

    private final SessionState state;

    private final Path file;

    public EnrichedSessionState(final SessionState state) {
        this(state, null);
    }

    public EnrichedSessionState(final SessionState state, final Path file) {
        this.state = state;
        this.file = file;
    }

    public SessionState getState() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Optional<Path> getFile() {
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
