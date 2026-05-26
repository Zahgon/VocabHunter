/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.gui.common;

public final class WordNoteTool {

    private final String cleaned;

    private final boolean isModified;

    public WordNoteTool(final String original, final String latest) {
        String cleanedOriginal = clean(original);
        cleaned = clean(latest);
        isModified = !cleanedOriginal.equals(cleaned);
    }

    public boolean isModified() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getCleaned() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private String clean(final String original) {
        if (original == null) {
            return "";
        } else {
            return original.trim();
        }
    }
}
