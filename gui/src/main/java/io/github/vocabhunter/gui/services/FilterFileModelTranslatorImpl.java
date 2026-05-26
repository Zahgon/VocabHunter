/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.gui.services;

import io.github.vocabhunter.analysis.core.VocabHunterException;
import io.github.vocabhunter.analysis.settings.BaseListedFile;
import io.github.vocabhunter.analysis.settings.DocumentListedFile;
import io.github.vocabhunter.analysis.settings.ExcelListedFile;
import io.github.vocabhunter.analysis.settings.SessionListedFile;
import io.github.vocabhunter.gui.model.FilterFileMode;
import io.github.vocabhunter.gui.model.FilterFileModel;
import java.nio.file.Path;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

public class FilterFileModelTranslatorImpl implements FilterFileModelTranslator {

    private static final Map<Class<?>, Function<BaseListedFile, FilterFileModel>> MODE_MAP = buildModeMap();

    @Override
    public BaseListedFile fromModel(final FilterFileModel model) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public FilterFileModel toModel(final BaseListedFile file) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static Map<Class<?>, Function<BaseListedFile, FilterFileModel>> buildModeMap() {
        return Map.of(SessionListedFile.class, FilterFileModelTranslatorImpl::translateSession, ExcelListedFile.class, FilterFileModelTranslatorImpl::translateExcel, DocumentListedFile.class, FilterFileModelTranslatorImpl::translateDocument);
    }

    private static FilterFileModel translateSession(final BaseListedFile baseListedFile) {
        SessionListedFile file = (SessionListedFile) baseListedFile;
        FilterFileMode mode;
        if (file.isIncludeUnknown()) {
            mode = FilterFileMode.SESSION_SEEN;
        } else {
            mode = FilterFileMode.SESSION_KNOWN;
        }
        return new FilterFileModel(file.getFile(), mode, Set.of());
    }

    private static FilterFileModel translateExcel(final BaseListedFile baseListedFile) {
        ExcelListedFile file = (ExcelListedFile) baseListedFile;
        return new FilterFileModel(file.getFile(), FilterFileMode.EXCEL, file.getColumns());
    }

    private static FilterFileModel translateDocument(final BaseListedFile baseListedFile) {
        DocumentListedFile file = (DocumentListedFile) baseListedFile;
        return new FilterFileModel(file.getFile(), FilterFileMode.DOCUMENT, Set.of(0));
    }
}
