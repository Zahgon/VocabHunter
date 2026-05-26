/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.gui.view;

import io.github.vocabhunter.analysis.marked.WordState;
import javafx.css.PseudoClass;
import javafx.scene.Node;

public final class StateClassTool {

    private static final PseudoClass CLASS_UNSEEN = PseudoClass.getPseudoClass("unseen");

    private static final PseudoClass CLASS_KNOWN = PseudoClass.getPseudoClass("known");

    private static final PseudoClass CLASS_UNKNOWN = PseudoClass.getPseudoClass("unknown");

    private static final PseudoClass CLASS_EXCLUDED = PseudoClass.getPseudoClass("excluded");

    private StateClassTool() {
        // Prevent instantiation - all methods are private
    }

    public static void clearStateClasses(final Node node) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void updateStateClasses(final Node node, final WordState state) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void clearExtendedStateClasses(final Node node) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void updateExtendedStateClasses(final Node node, final WordState state, final boolean isExcluded) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void updatedExcludedClass(final Node node, final boolean isExcluded) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void clearExcludedClass(final Node node) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
