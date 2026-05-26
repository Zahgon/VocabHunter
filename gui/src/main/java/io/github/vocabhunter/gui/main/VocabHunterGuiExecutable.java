/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.gui.main;

import com.gluonhq.ignite.guice.GuiceContext;
import com.google.inject.Module;
import jakarta.inject.Inject;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import org.slf4j.bridge.SLF4JBridgeHandler;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import static io.github.vocabhunter.gui.main.ExecutableLogTool.*;

public class VocabHunterGuiExecutable extends Application {

    private static final long STARTUP_NANOS = System.nanoTime();

    private static Collection<Module> modules;

    private final GuiceContext context = new GuiceContext(this, () -> modules);

    @Inject
    private VocabHunterGui vocabHunterGui;

    public static void setModules(final Module... m) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void start(final Stage stage) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void main(final String... args) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void installLogBridge() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected static void runApp(final String[] args, final Consumer<String[]> launcher, final Module... modules) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
