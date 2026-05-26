/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.analysis.filter;

import io.github.vocabhunter.analysis.model.AnalysisWord;

public final class MinimumLettersFilter implements WordFilter {

    private final int minimum;

    public MinimumLettersFilter(final int minimum) {
        this.minimum = minimum;
    }

    @Override
    public boolean isShown(final AnalysisWord word) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
