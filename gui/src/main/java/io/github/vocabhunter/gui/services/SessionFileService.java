/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.gui.services;

import io.github.vocabhunter.analysis.file.FileStreamer;
import io.github.vocabhunter.analysis.file.SelectionExportTool;
import io.github.vocabhunter.analysis.session.EnrichedSessionState;
import io.github.vocabhunter.analysis.session.SessionSerialiser;
import io.github.vocabhunter.analysis.session.SessionState;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import java.nio.file.Path;

@Singleton
public class SessionFileService {

    private final FileStreamer streamer;

    @Inject
    public SessionFileService(final FileStreamer streamer) {
        this.streamer = streamer;
    }

    public EnrichedSessionState createNewSession(final Path file) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EnrichedSessionState createOrOpenSession(final Path file) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EnrichedSessionState read(final Path file) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void write(final Path file, final SessionState state) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void exportSelection(final SessionState state, final Path file, final boolean isNoteIncluded) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
