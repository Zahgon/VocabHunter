/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.gui.model;

import io.github.vocabhunter.analysis.core.DelayedExecutor;
import io.github.vocabhunter.analysis.core.ThreadPoolTool;
import io.github.vocabhunter.analysis.filter.FilterBuilder;
import io.github.vocabhunter.analysis.filter.WordFilter;
import io.github.vocabhunter.analysis.grid.FilterFileWordsExtractor;
import io.github.vocabhunter.analysis.settings.BaseListedFile;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class FilterSettingsTool {

    private final FilterFileWordsExtractor extractor;

    private final DelayedExecutor executor;

    @Inject
    public FilterSettingsTool(final FilterFileWordsExtractor extractor, final ThreadPoolTool threadPoolTool) {
        this.extractor = extractor;
        this.executor = threadPoolTool.filterThreadPool();
    }

    public WordFilter filter(final FilterSettings settings) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private FilterBuilder addFilter(final FilterBuilder builder, final BaseListedFile file) {
        return builder.addExcludedWordsSupplier(() -> extractor.extract(file));
    }

    public void beginAsyncFiltering() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
