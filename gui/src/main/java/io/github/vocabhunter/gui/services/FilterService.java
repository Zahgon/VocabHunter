/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.gui.services;

import io.github.vocabhunter.analysis.filter.WordFilter;
import io.github.vocabhunter.gui.model.FilterSettings;
import io.github.vocabhunter.gui.model.FilterSettingsTool;
import io.github.vocabhunter.gui.model.MainModel;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class FilterService {

    private static final WordFilter NOP_FILTER = w -> true;

    private final MainModel model;

    private final FilterSettingsTool tool;

    @Inject
    public FilterService(final MainModel model, final FilterSettingsTool tool) {
        this.model = model;
        this.tool = tool;
    }

    public void setFilterSettings(final FilterSettings settings) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public WordFilter getFilter(final boolean isEnableFilters) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
