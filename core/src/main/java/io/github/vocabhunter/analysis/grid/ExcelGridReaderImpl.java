/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.analysis.grid;

import io.github.vocabhunter.analysis.core.CoreConstants;
import io.github.vocabhunter.analysis.core.VocabHunterException;
import jakarta.inject.Singleton;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.StreamSupport;

@Singleton
public class ExcelGridReaderImpl implements ExcelGridReader {

    @Override
    public List<GridLine> readGrid(final Path file, final Predicate<String> filter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private GridLine row(final Row row, final Predicate<String> filter, final DataFormatter dataFormatter) {
        List<GridCell> cells = IntStream.range(0, row.getLastCellNum()).mapToObj(i -> row.getCell(i, MissingCellPolicy.RETURN_BLANK_AS_NULL)).map(c -> cell(c, filter, dataFormatter)).toList();
        return new GridLine(cells);
    }

    private GridCell cell(final Cell original, final Predicate<String> filter, final DataFormatter dataFormatter) {
        String text;
        if (original == null) {
            text = "";
        } else {
            text = dataFormatter.formatCellValue(original).trim();
        }
        return new GridCell(text, filter.test(text));
    }
}
