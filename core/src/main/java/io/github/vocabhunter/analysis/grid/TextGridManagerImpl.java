/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.analysis.grid;

import jakarta.inject.Inject;
import java.nio.file.Path;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class TextGridManagerImpl implements TextGridManager {

    private static final Pattern FILTER_PATTERN = Pattern.compile("[^\\s]+\\s+[^\\s]+");

    public static final Predicate<String> FILTER = FILTER_PATTERN.asPredicate();

    private final DocumentGridReader documentGridReader;

    private final ExcelGridReader excelGridReader;

    private final TextGridBuilder textGridBuilder;

    @Inject
    public TextGridManagerImpl(final DocumentGridReader documentGridReader, final ExcelGridReader excelGridReader, final TextGridBuilder textGridBuilder) {
        this.documentGridReader = documentGridReader;
        this.excelGridReader = excelGridReader;
        this.textGridBuilder = textGridBuilder;
    }

    @Override
    public TextGrid readDocument(final Path file) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public TextGrid readExcel(final Path file) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
