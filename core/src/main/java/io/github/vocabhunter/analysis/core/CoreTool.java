/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.analysis.core;

import java.util.List;
import java.util.OptionalInt;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public final class CoreTool {

    private CoreTool() {
        // Prevent instantiation - all methods are static
    }

    public static String toLowerCase(final String s) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T> OptionalInt findLast(final List<T> list, final Predicate<T> predicate) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static IntStream revRange(final int from, final int to) {
        return IntStream.range(from, to).map(i -> to - i + from - 1);
    }
}
