/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.analysis.filter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.function.Supplier;

public class FilterBuilder {

    private Executor executor;

    private WordFilter minimumLettersFilter;

    private WordFilter minimumOccurrencesFilter;

    private WordFilter excludeInitialCapitalFilter;

    private final List<Supplier<Collection<String>>> excludedWordsSuppliers = new ArrayList<>();

    public FilterBuilder executor(final Executor executor) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public FilterBuilder minimumLetters(final int count) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public FilterBuilder minimumOccurrences(final int count) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public FilterBuilder excludeInitialCapital() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public FilterBuilder addExcludedWords(final Collection<String> words) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public FilterBuilder addExcludedWordsSupplier(final Supplier<Collection<String>> wordsSupplier) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public WordFilter build() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private Executor getExecutor() {
        return Objects.requireNonNullElse(executor, Runnable::run);
    }

    private void addIfUsed(final List<WordFilter> filters, final WordFilter filter) {
        if (filter != null) {
            filters.add(filter);
        }
    }
}
