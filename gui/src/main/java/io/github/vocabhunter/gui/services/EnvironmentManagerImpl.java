/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.gui.services;

import io.github.vocabhunter.gui.common.Placement;
import jakarta.inject.Singleton;
import javafx.collections.ObservableList;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import org.apache.commons.lang3.SystemUtils;

@Singleton
public class EnvironmentManagerImpl implements EnvironmentManager {

    @Override
    public Placement getScreenSize() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean isVisible(final Placement placement) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private Rectangle2D rectangle(final Placement placement) {
        if (placement.positioned()) {
            return new Rectangle2D(placement.x(), placement.y(), placement.width(), placement.height());
        } else {
            return new Rectangle2D(0, 0, placement.width(), placement.height());
        }
    }

    @Override
    public boolean useSystemMenuBar() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean isExitOptionShown() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
