/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.analysis.marked;

import io.github.vocabhunter.analysis.filter.WordFilter;
import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.*;

public final class MarkTool<T extends MarkedWord> {

    private final List<T> shownWords;

    private final int known;

    private final int unknown;

    private final int unseenUnfiltered;

    private final int unseenFiltered;

    public MarkTool(final List<T> words) {
        this(w -> true, words);
    }

    public MarkTool(final WordFilter filter, final List<T> words) {
        shownWords = words.stream().filter(w -> isShown(filter, w)).collect(toList());
        Map<WordState, Map<Boolean, Long>> groups = words.stream().collect(groupingBy(T::getState, groupingBy(filter::isShown, counting())));
        known = extractValues(groups, WordState.KNOWN);
        unknown = extractValues(groups, WordState.UNKNOWN);
        unseenUnfiltered = extractValues(groups, WordState.UNSEEN, true);
        unseenFiltered = extractValues(groups, WordState.UNSEEN, false);
    }

    private int extractValues(final Map<WordState, Map<Boolean, Long>> groups, final WordState state) {
        Map<Boolean, Long> subGroups = extractSubGroups(groups, state);
        return (int) subGroups.values().stream().mapToLong(l -> l).sum();
    }

    private int extractValues(final Map<WordState, Map<Boolean, Long>> groups, final WordState state, final boolean isShown) {
        Map<Boolean, Long> subGroups = extractSubGroups(groups, state);
        return subGroups.getOrDefault(isShown, 0L).intValue();
    }

    private Map<Boolean, Long> extractSubGroups(final Map<WordState, Map<Boolean, Long>> groups, final WordState state) {
        return groups.getOrDefault(state, Map.of());
    }

    public List<T> getShownWords() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isValidFilter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getKnown() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getUnknown() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getUnseenUnfiltered() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getUnseenFiltered() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <W extends MarkedWord> boolean isShown(final WordFilter filter, final W w) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
