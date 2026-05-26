/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.analysis.settings;

import jakarta.inject.Singleton;
import java.nio.file.Path;
import java.util.List;

@Singleton
public class FileListManagerImpl extends BaseSettingsManager<FileList> implements FileListManager {

    public static final String SETTINGS_JSON = "file-list.json";

    public FileListManagerImpl() {
        super(SETTINGS_JSON, FileList.class);
    }

    public FileListManagerImpl(final Path settingsFile) {
        super(settingsFile, FileList.class);
    }

    @Override
    public List<BaseListedFile> getFilterFiles() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void setFilterFiles(final List<BaseListedFile> files) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
