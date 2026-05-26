/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */
package io.github.vocabhunter.gui.common;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class BuildInfo {

    private static final Logger LOG = LoggerFactory.getLogger(BuildInfo.class);

    private static final String PROPERTIES_FILE = "properties/build-info.properties";

    private BuildInfo() {
        // Prevent instantiation - all methods are static
    }

    public static String version() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
