/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.gui.controller;

import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;

public final class SessionActions {

    private final EventHandler<KeyEvent> keyPressHandler;

    private final Runnable openSearchAction;

    private final Runnable copyWordAction;

    public SessionActions(final EventHandler<KeyEvent> keyPressHandler, final Runnable openSearchAction, final Runnable copyWordAction) {
        this.keyPressHandler = keyPressHandler;
        this.openSearchAction = openSearchAction;
        this.copyWordAction = copyWordAction;
    }

    public EventHandler<KeyEvent> getKeyPressHandler() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Runnable getOpenSearchAction() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Runnable getCopyWordAction() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
