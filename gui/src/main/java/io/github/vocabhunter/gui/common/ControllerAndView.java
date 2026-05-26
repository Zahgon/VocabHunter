/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.gui.common;

import javafx.scene.Node;

public final class ControllerAndView<C, V extends Node> {

    private final C controller;

    private final V view;

    public ControllerAndView(final C controller, final V view) {
        this.controller = controller;
        this.view = view;
    }

    public C getController() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public V getView() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
