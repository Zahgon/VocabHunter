/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.analysis.settings;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class FileList {

    private int formatVersion = FileListVersion.LATEST_VERSION;

    private List<BaseListedFile> filterFiles = List.of();

    public int getFormatVersion() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setFormatVersion(final int formatVersion) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<BaseListedFile> getFilterFiles() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setFilterFiles(final List<BaseListedFile> filterFiles) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
