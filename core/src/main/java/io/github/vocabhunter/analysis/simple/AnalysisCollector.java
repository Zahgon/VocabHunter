/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.analysis.simple;

import io.github.vocabhunter.analysis.model.WordUse;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class AnalysisCollector implements Collector<AnalysisRecord, MutableWordUse, WordUse> {

    private static final Set<Characteristics> CHARACTERISTICS = Collections.unmodifiableSet(EnumSet.of(Characteristics.UNORDERED));

    @Override
    public Supplier<MutableWordUse> supplier() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public BiConsumer<MutableWordUse, AnalysisRecord> accumulator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public BinaryOperator<MutableWordUse> combiner() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Function<MutableWordUse, WordUse> finisher() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Set<Characteristics> characteristics() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
