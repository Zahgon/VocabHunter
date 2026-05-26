/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.analysis.session;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.github.vocabhunter.analysis.model.AnalysisResult;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SessionState {

    private int formatVersion = SessionFormatVersion.LATEST_VERSION;

    private String name;

    private List<SessionWord> orderedUses = List.of();

    private List<String> lines = List.of();

    public SessionState() {
        // No argument constructor to allow use as standard Java Bean
    }

    public SessionState(final AnalysisResult model) {
        this.name = model.getName();
        orderedUses = model.getOrderedUses().stream().map(SessionWord::new).toList();
        lines = List.copyOf(model.getLines());
    }

    public int getFormatVersion() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setFormatVersion(final int formatVersion) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setName(final String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<SessionWord> getOrderedUses() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setOrderedUses(final List<SessionWord> orderedUses) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<String> getLines() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setLines(final List<String> lines) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(final Object o) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isEquivalent(final SessionState that) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static boolean isEquivalentLines(final List<String> lhs, final List<String> rhs) {
        Set<String> lhsSet = new HashSet<>(lhs);
        Set<String> rhsSet = new HashSet<>(rhs);
        return lhsSet.equals(rhsSet);
    }

    private static boolean isEquivalentUses(final List<SessionWord> lhs, final List<SessionWord> rhs, final List<String> lhsLines, final List<String> rhsLines) {
        if (lhs.size() != rhs.size()) {
            return false;
        }
        Iterator<SessionWord> lhsI = lhs.iterator();
        Iterator<SessionWord> rhsI = rhs.iterator();
        while (lhsI.hasNext()) {
            SessionWord lhsWord = lhsI.next();
            SessionWord rhsWord = rhsI.next();
            Function<SessionWord, List<?>> lhsF = extractor(lhsLines);
            Function<SessionWord, List<?>> rhsF = extractor(rhsLines);
            if (!lhsWord.isEquivalent(rhsWord, lhsF, rhsF)) {
                return false;
            }
        }
        return true;
    }

    private static Function<SessionWord, List<?>> extractor(final List<String> lhsLines) {
        return w -> w.getLineNos().stream().map(lhsLines::get).toList();
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
