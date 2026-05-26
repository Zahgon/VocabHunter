/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.gui.dialogues;

import io.github.vocabhunter.analysis.session.FileNameTool;
import io.github.vocabhunter.gui.common.UnsavedResponse;
import io.github.vocabhunter.gui.i18n.I18nKey;
import io.github.vocabhunter.gui.i18n.I18nManager;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Map;
import static io.github.vocabhunter.gui.i18n.I18nKey.*;

public class UnsavedChangesDialogue {

    private static final String ALERT_ID = "unsavedChanges";

    private final Path file;

    private final I18nManager i18nManager;

    private UnsavedResponse result;

    public UnsavedChangesDialogue(final Path file, final I18nManager i18nManager) {
        this.file = file;
        this.i18nManager = i18nManager;
    }

    public void showDialogue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private String filename() {
        if (file == null) {
            return i18nManager.text(MAIN_WINDOW_UNTITLED);
        } else {
            return FileNameTool.filename(file);
        }
    }

    public UnsavedResponse getUserResponse() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private Map<ButtonType, UnsavedResponse> unsavedResponseMap() {
        Map<ButtonType, UnsavedResponse> map = new LinkedHashMap<>();
        addButton(map, FILE_BUTTON_SAVE, UnsavedResponse.SAVE);
        addButton(map, FILE_BUTTON_DISCARD, UnsavedResponse.DISCARD);
        addButton(map, FILE_BUTTON_CANCEL, UnsavedResponse.CANCEL);
        return map;
    }

    private void addButton(final Map<ButtonType, UnsavedResponse> map, final I18nKey key, final UnsavedResponse response) {
        map.put(new ButtonType(i18nManager.text(key)), response);
    }
}
