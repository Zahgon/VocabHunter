/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.analysis.grid;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class GridWordsExtractorImpl implements GridWordsExtractor {

    @Override
    public List<String> words(final List<GridLine> lines, final Set<Integer> columns) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private Stream<String> wordStream(final List<GridLine> lines, final int index) {
        return lines.stream().map(l -> l.getCell(index)).filter(GridCell::isIncluded).map(GridCell::getContent);
    }
}
