/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.executable.console;

import com.beust.jcommander.Parameter;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import static java.util.Collections.unmodifiableList;

public class VocabHunterConsoleArguments {

    @Parameter(names = "-input", description = "Text input file", required = true)
    private List<String> input;

    @Parameter(names = "-output", description = "Results output file")
    private String output;

    @Parameter(names = "-minletters", description = "Minimum number of letters in word for it to be shown")
    private int minLetters = 5;

    @Parameter(names = "-minoccurrences", description = "Minimum number of occurrences of word for it to be shown")
    private int minOccurrences = 3;

    @Parameter(names = "-ignoreinitialcapitals", description = "Ignore words that begin with a capital letter")
    private boolean isIgnoreInitialCapitals = false;

    @Parameter(names = "-hideuses", description = "Hide the lists of uses of each word")
    private boolean isHideUses = false;

    @Parameter(names = "-filterknown", description = "Words marked as known are filtered from these session files")
    private List<Path> filterKnown = List.of();

    @Parameter(names = "-filterseen", description = "Words marked as known or unknown are filtered from these session files")
    private List<Path> filterSeen = List.of();

    @Parameter(names = "-help", help = true, description = "Show command help")
    private boolean isHelpRequested = false;

    public List<String> getInput() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getMinLetters() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getMinOccurrences() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setInput(final List<String> input) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setMinLetters(final int minLetters) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setMinOccurrences(final int minOccurrences) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isIgnoreInitialCapitals() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setIgnoreInitialCapitals(final boolean ignoreInitialCapitals) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isHideUses() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setHideUses(final boolean hideUses) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<Path> getFilterKnown() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setFilterKnown(final List<Path> filterKnown) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<Path> getFilterSeen() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setFilterSeen(final List<Path> filterSeen) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isHelpRequested() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setHelpRequested(final boolean helpRequested) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getOutput() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setOutput(final String output) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
