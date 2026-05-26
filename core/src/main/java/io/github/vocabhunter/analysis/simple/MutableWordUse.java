/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.analysis.simple;

import io.github.vocabhunter.analysis.core.PreferredFormTool;
import io.github.vocabhunter.analysis.core.VocabHunterException;
import io.github.vocabhunter.analysis.model.WordUse;
import java.util.ArrayList;
import java.util.List;

public class MutableWordUse {

    private String wordIdentifier;

    private final List<Integer> lineNos = new ArrayList<>();

    public void accumulate(final AnalysisRecord record) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public MutableWordUse combine(final MutableWordUse that) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public WordUse toWordUse() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
