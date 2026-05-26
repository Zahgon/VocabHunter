/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.gui.dialogues;

import io.github.vocabhunter.gui.i18n.I18nKey;
import io.github.vocabhunter.gui.i18n.I18nManager;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.nio.file.Path;
import static io.github.vocabhunter.gui.i18n.I18nKey.*;

@Singleton
public class DialogueTool {

    private static final Logger LOG = LoggerFactory.getLogger(DialogueTool.class);

    private final I18nManager i18nManager;

    @Inject
    public DialogueTool(final I18nManager i18nManager) {
        this.i18nManager = i18nManager;
    }

    public void setupModal(final Stage stage, final Parent root, final I18nKey titleKey) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void errorOnOpen(final Path file, final RuntimeException e) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void errorOnSave(final Path file, final RuntimeException e) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void errorOnExport(final Path file, final RuntimeException e) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private void handleFileError(final Path file, final RuntimeException e, final I18nKey titleKey, final I18nKey detailKey, final String log) {
        LOG.info(log, file, e);
        String message = i18nManager.text(detailKey, file.getFileName());
        ErrorDialogue dialogue = new ErrorDialogue(i18nManager, titleKey, e, message);
        dialogue.showError();
    }

    public void filterErrorAlert(final Exception e) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void filterErrorAlert() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public UnsavedChangesDialogue unsavedChangesDialogue(final Path file) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
