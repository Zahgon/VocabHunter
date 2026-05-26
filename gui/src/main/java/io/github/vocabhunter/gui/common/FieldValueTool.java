/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.gui.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.function.Consumer;
import java.util.function.Supplier;

public final class FieldValueTool {

    private static final Logger LOG = LoggerFactory.getLogger(FieldValueTool.class);

    private FieldValueTool() {
        // Prevent instantiation - all methods are static
    }

    public static int getAsInteger(final Supplier<String> fieldGetter, final int defaultValue) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void applyDefaultIfEmpty(final Consumer<String> fieldSetter, final Supplier<String> fieldGetter, final Supplier<Object> defaultGetter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void cleanNonNegativeInteger(final Consumer<String> fieldSetter, final String newValue, final String oldValue) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static String getAsCleanNonNegativeInteger(final String oldValue, final String newValue) {
        if (newValue.isEmpty()) {
            return newValue;
        } else {
            try {
                int n = Integer.parseInt(newValue);
                if (n >= 0) {
                    return Integer.toString(n);
                }
            } catch (final NumberFormatException e) {
                LOG.debug("Illegal field value", e);
            }
            return oldValue;
        }
    }
}
