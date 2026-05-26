/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.gui.controller;

import io.github.vocabhunter.analysis.marked.WordState;
import io.github.vocabhunter.gui.i18n.I18nKey;
import io.github.vocabhunter.gui.i18n.I18nManager;
import io.github.vocabhunter.gui.model.SessionModel;
import io.github.vocabhunter.gui.model.WordModel;
import io.github.vocabhunter.gui.view.StateClassTool;
import javafx.beans.binding.ObjectBinding;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import static javafx.beans.binding.Bindings.selectString;

public class MainWordHandler {

    private final I18nManager i18nManager;

    private final Label mainWord;

    private final Label useCountLabel;

    private final Pane mainWordPane;

    private final SessionModel sessionModel;

    private final ObjectBinding<WordState> wordStateProperty;

    public MainWordHandler(final I18nManager i18nManager, final Label mainWord, final Label useCountLabel, final Pane mainWordPane, final SessionModel sessionModel, final ObjectBinding<WordState> wordStateProperty) {
        this.i18nManager = i18nManager;
        this.mainWord = mainWord;
        this.useCountLabel = useCountLabel;
        this.mainWordPane = mainWordPane;
        this.sessionModel = sessionModel;
        this.wordStateProperty = wordStateProperty;
    }

    public void prepare() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void processWordUpdate(final WordModel word) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private void updateMainWordStateClasses() {
        StateClassTool.updateStateClasses(mainWordPane, sessionModel.getCurrentWord().getState());
    }
}
