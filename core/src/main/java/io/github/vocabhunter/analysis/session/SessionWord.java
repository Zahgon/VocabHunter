/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.analysis.session;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.vocabhunter.analysis.marked.MarkedWord;
import io.github.vocabhunter.analysis.marked.WordState;
import io.github.vocabhunter.analysis.model.WordUse;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.util.List;
import java.util.function.Function;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SessionWord implements MarkedWord {

    private String wordIdentifier;

    private List<String> uses;

    private List<Integer> lineNos;

    private int useCount;

    private WordState state = WordState.UNSEEN;

    private String note;

    public SessionWord() {
        // No argument constructor to allow use as standard Java Bean
    }

    public SessionWord(final WordUse use) {
        wordIdentifier = use.getWordIdentifier();
        lineNos = List.copyOf(use.getLineNos());
        useCount = use.getUseCount();
    }

    @Override
    public String getWordIdentifier() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setWordIdentifier(final String wordIdentifier) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<String> getUses() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<Integer> getLineNos() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int getUseCount() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setUseCount(final int useCount) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setUses(final List<String> uses) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setLineNos(final List<Integer> lineNos) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public WordState getState() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setState(final WordState state) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getNote() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setNote(final String note) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(final Object o) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isEquivalent(final SessionWord that, final Function<SessionWord, List<?>> thisExtractor, final Function<SessionWord, List<?>> thatExtractor) {
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
