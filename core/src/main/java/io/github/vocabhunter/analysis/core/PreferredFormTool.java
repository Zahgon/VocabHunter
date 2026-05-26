/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.analysis.core;

public final class PreferredFormTool {

    private PreferredFormTool() {
        // Prevent instantiation - all methods are static
    }

    public static String preferredForm(final String s1, final String s2) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static String preferredForm(final String s1, final String s2, final boolean isFirst, final boolean isSecond) {
        if (isFirst) {
            return s1;
        } else if (isSecond) {
            return s2;
        } else {
            return CoreTool.toLowerCase(s1);
        }
    }
}
