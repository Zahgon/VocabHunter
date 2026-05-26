/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.gui.controller;

import io.github.vocabhunter.gui.i18n.I18nKey;
import io.github.vocabhunter.gui.model.MainModel;
import io.github.vocabhunter.gui.model.StatusModel;
import io.github.vocabhunter.gui.services.EnvironmentManager;
import io.github.vocabhunter.gui.services.WebPageTool;
import io.github.vocabhunter.gui.status.StatusManager;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import org.controlsfx.control.StatusBar;
import static javafx.beans.binding.Bindings.not;

@Singleton
public class MainController {

    @FXML
    private MenuItem menuNew;

    @FXML
    private MenuItem menuOpen;

    @FXML
    private MenuItem menuSave;

    @FXML
    private MenuItem menuSaveAs;

    @FXML
    private RadioMenuItem menuEditOn;

    @FXML
    private RadioMenuItem menuEditOff;

    @FXML
    private MenuItem menuExportWithNotes;

    @FXML
    private MenuItem menuExportWithoutNotes;

    @FXML
    private MenuItem menuSetupFilters;

    @FXML
    private CheckMenuItem menuEnableFilters;

    @FXML
    private MenuItem menuLanguage;

    @FXML
    private MenuItem menuWebsite;

    @FXML
    private MenuItem menuHowTo;

    @FXML
    private MenuItem menuIssue;

    @FXML
    private MenuItem menuAbout;

    @FXML
    private Button buttonNew;

    @FXML
    private Button buttonOpen;

    @FXML
    private Button buttonSave;

    @FXML
    private Button buttonExport;

    @FXML
    private Button buttonSetupFilters;

    @FXML
    private CheckBox buttonEnableFilters;

    @FXML
    private RadioButton buttonEditOn;

    @FXML
    private RadioButton buttonEditOff;

    @FXML
    private BorderPane mainBorderPane;

    @FXML
    private MenuBar menuBar;

    @FXML
    private StatusBar statusBar;

    @FXML
    private Pane maskerPane;

    @FXML
    private MenuItem menuCopy;

    @FXML
    private MenuItem menuFind;

    @FXML
    private MenuItem menuExit;

    @Inject
    private AboutHandler aboutHandler;

    @Inject
    private StatusManager statusManager;

    @Inject
    private MainModel model;

    @Inject
    private StatusModel statusModel;

    @Inject
    private EnvironmentManager environmentManager;

    @Inject
    private WebPageTool webPageTool;

    @Inject
    private SessionStateHandler sessionStateHandler;

    @Inject
    private GuiFileHandler guiFileHandler;

    @Inject
    private SettingsHandler settingsHandler;

    @Inject
    private LanguageHandler languageHandler;

    public void initialise(final Stage stage) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private void prepareFilterEnable() {
        buttonEnableFilters.selectedProperty().bindBidirectional(menuEnableFilters.selectedProperty());
        buttonEnableFilters.selectedProperty().bindBidirectional(model.enableFiltersProperty());
    }

    private void prepareStatusInformation() {
        statusBar.textProperty().bind(statusModel.textProperty());
        statusBar.progressProperty().bind(statusModel.activityProperty());
        statusBar.getRightItems().add(MiniGraphTool.miniGraph(statusModel));
        maskerPane.visibleProperty().bind(statusModel.busyProperty());
    }

    private void handler(final MenuItem menuItem, final Runnable action) {
        menuItem.setOnAction(e -> action.run());
    }

    private void handler(final Button button, final MenuItem menuItem, final Runnable action) {
        EventHandler<ActionEvent> handler = e -> action.run();
        button.setOnAction(handler);
        menuItem.setOnAction(handler);
    }

    private void buildToggleGroup(final Toggle editOn, final Toggle editOff) {
        ToggleGroup editGroup = new ToggleGroup();
        editOn.setToggleGroup(editGroup);
        editOff.setToggleGroup(editGroup);
    }

    private void processSetupFilters() {
        settingsHandler.show();
    }

    private void processAbout() {
        if (statusManager.beginAbout()) {
            try {
                aboutHandler.show();
                statusManager.markSuccess();
            } finally {
                statusManager.completeAction();
            }
        }
    }

    private void openFind() {
        sessionStateHandler.getSessionActions().map(SessionActions::getOpenSearchAction).ifPresent(Runnable::run);
    }

    private void copyWord() {
        sessionStateHandler.getSessionActions().map(SessionActions::getCopyWordAction).ifPresent(Runnable::run);
    }
}
