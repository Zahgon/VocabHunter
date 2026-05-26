/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.analysis.core;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public final class FileTool {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    private static final List<String> MINIMAL_JSON = List.of("{}");

    private FileTool() {
        // Prevent instantiation - all methods are static
    }

    public static void ensureDirectoryExists(final Path file, final String errorTemplate) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void writeMinimalJson(final Path file, final String errorTemplate) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void writeAsJson(final Path file, final Object v, final String errorTemplate) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T> T readFromJson(final Class<T> beanClass, final Path file, final String errorTemplate) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static VocabHunterException buildError(final Path file, final String errorTemplate, final Throwable e) {
        return new VocabHunterException(String.format(errorTemplate, file), e);
    }
}
