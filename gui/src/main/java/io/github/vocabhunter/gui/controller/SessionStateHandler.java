/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.gui.controller;

import io.github.vocabhunter.analysis.core.VocabHunterException;
import io.github.vocabhunter.analysis.session.SessionState;
import io.github.vocabhunter.gui.common.ControllerAndView;
import io.github.vocabhunter.gui.common.GuiTaskHandler;
import io.github.vocabhunter.gui.i18n.I18nManager;
import io.github.vocabhunter.gui.model.MainModel;
import io.github.vocabhunter.gui.model.SessionModel;
import io.github.vocabhunter.gui.settings.SettingsManager;
import io.github.vocabhunter.gui.settings.WindowSettings;
import io.github.vocabhunter.gui.view.FxmlHandler;
import io.github.vocabhunter.gui.view.SessionTab;
import io.github.vocabhunter.gui.view.SessionViewTool;
import io.github.vocabhunter.gui.view.ViewFxml;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;
import java.util.Optional;

@Singleton
public class SessionStateHandler {

    @Inject
    private I18nManager i18nManager;

    @Inject
    private SettingsManager settingsManager;

    @Inject
    private MainModel model;

    @Inject
    private FxmlHandler fxmlHandler;

    @Inject
    private GuiTaskHandler guiTaskHandler;

    private BorderPane mainBorderPane;

    private SessionActions sessionActions;

    public void initialise(final BorderPane mainBorderPane) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SessionState getSessionState() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SessionModel addSession(final SessionState state) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private Node progressView(final SessionModel sessionModel) {
        ControllerAndView<ProgressController, Node> cav = fxmlHandler.loadControllerAndView(ViewFxml.PROGRESS);
        cav.getController().initialise(sessionModel.getProgress());
        return cav.getView();
    }

    public Optional<SessionActions> getSessionActions() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
