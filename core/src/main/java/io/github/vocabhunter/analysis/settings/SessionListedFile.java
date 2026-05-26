/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.analysis.settings;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import java.nio.file.Path;

public final class SessionListedFile extends BaseListedFile {

    private final boolean isIncludeUnknown;

    @JsonCreator
    public SessionListedFile(@JsonProperty("file") final Path file, @JsonProperty("includeUnknown") final boolean isIncludeUnknown) {
        super(file);
        this.isIncludeUnknown = isIncludeUnknown;
    }

    public boolean isIncludeUnknown() {
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
