/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.gui.controller;

import io.github.vocabhunter.gui.common.Placement;
import io.github.vocabhunter.gui.model.MainModel;
import io.github.vocabhunter.gui.services.ExternalEventBroker;
import io.github.vocabhunter.gui.services.PlacementManager;
import io.github.vocabhunter.gui.view.FxmlHandler;
import io.github.vocabhunter.gui.view.ViewFxml;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

@Singleton
public class MainStageHandler {

    private final FxmlHandler fxmlHandler;

    private final MainController mainController;

    private final LanguageController languageController;

    private final SessionStateHandler sessionStateHandler;

    private final PlacementManager placementManager;

    private final LanguageHandler languageHandler;

    private final MainModel mainModel;

    private final ExternalEventBroker externalEventBroker;

    private final ExitRequestHandler exitRequestHandler;

    private Stage stage;

    @Inject
    public MainStageHandler(final FxmlHandler fxmlHandler, final MainController mainController, final LanguageController languageController, final SessionStateHandler sessionStateHandler, final PlacementManager placementManager, final LanguageHandler languageHandler, final MainModel mainModel, final ExternalEventBroker externalEventBroker, final ExitRequestHandler exitRequestHandler) {
        this.fxmlHandler = fxmlHandler;
        this.mainController = mainController;
        this.languageController = languageController;
        this.sessionStateHandler = sessionStateHandler;
        this.placementManager = placementManager;
        this.languageHandler = languageHandler;
        this.mainModel = mainModel;
        this.externalEventBroker = externalEventBroker;
        this.exitRequestHandler = exitRequestHandler;
    }

    public void initialise(final Stage stage) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void applyNewScene() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private void positionScene(final boolean isLocaleDefined) {
        if (isLocaleDefined) {
            positionPrincipalScene();
        } else {
            stage.sizeToScene();
            stage.centerOnScreen();
        }
    }

    private void positionPrincipalScene() {
        Placement placement = placementManager.getMainWindow();
        stage.setWidth(placement.width());
        stage.setHeight(placement.height());
        if (placement.positioned()) {
            stage.setX(placement.x());
            stage.setY(placement.y());
        } else {
            stage.centerOnScreen();
        }
    }

    private void handleKeyEvent(final KeyEvent event) {
        sessionStateHandler.getSessionActions().map(SessionActions::getKeyPressHandler).ifPresent(k -> k.handle(event));
    }
}
