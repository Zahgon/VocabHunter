/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.gui.status;

import io.github.vocabhunter.analysis.session.FileNameTool;
import io.github.vocabhunter.gui.i18n.I18nKey;
import io.github.vocabhunter.gui.i18n.I18nManager;
import io.github.vocabhunter.gui.model.PositionModel;
import io.github.vocabhunter.gui.model.ProgressModel;
import io.github.vocabhunter.gui.model.StatusModel;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.nio.file.Path;
import java.util.concurrent.atomic.AtomicBoolean;
import static io.github.vocabhunter.gui.i18n.I18nKey.*;
import static javafx.beans.binding.Bindings.*;

@Singleton
public class StatusManagerImpl implements StatusManager {

    private static final Logger LOG = LoggerFactory.getLogger(StatusManagerImpl.class);

    private final I18nManager i18nManager;

    private final PositionDescriptionTool positionDescriptionTool;

    private I18nKey currentAction;

    private final SimpleBooleanProperty sessionAvailable = new SimpleBooleanProperty();

    private final SimpleBooleanProperty busy = new SimpleBooleanProperty();

    private final SimpleStringProperty positionDescription = new SimpleStringProperty();

    private final SimpleStringProperty actionDescription = new SimpleStringProperty();

    private final SimpleDoubleProperty markedPercentage = new SimpleDoubleProperty();

    private final SimpleStringProperty graphText = new SimpleStringProperty();

    private final AtomicBoolean gatekeeper = new AtomicBoolean();

    @Inject
    public StatusManagerImpl(final I18nManager i18nManager, final PositionDescriptionTool positionDescriptionTool) {
        this.i18nManager = i18nManager;
        this.positionDescriptionTool = positionDescriptionTool;
    }

    @Inject
    public void setStatusModel(final StatusModel model) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean beginNewSession() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean beginOpenSession() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean beginSaveSession() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean beginExport() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean beginExit() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean beginAbout() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private boolean begin(final I18nKey key) {
        if (gatekeeper.compareAndSet(false, true)) {
            currentAction = key;
            LOG.debug("Begin: {}", currentAction);
            actionDescription.setValue(i18nManager.text(key));
            busy.setValue(true);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void performAction(final Path file) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void markSuccess() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void completeAction() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void clearSession() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void replaceSession(final PositionModel position, final ProgressModel progress) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private void resetSession() {
        positionDescription.unbind();
        markedPercentage.unbind();
        graphText.unbind();
    }
}
