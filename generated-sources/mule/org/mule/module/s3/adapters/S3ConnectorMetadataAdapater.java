
package org.mule.module.s3.adapters;

import javax.annotation.Generated;
import org.mule.api.MetadataAware;
import org.mule.module.s3.S3Connector;


/**
 * A <code>S3ConnectorMetadataAdapater</code> is a wrapper around {@link S3Connector } that adds support for querying metadata about the extension.
 * 
 */
@Generated(value = "Mule DevKit Version 3.5.0-SNAPSHOT", date = "2014-03-06T08:16:30-06:00", comments = "Build UNKNOWN_BUILDNUMBER")
public class S3ConnectorMetadataAdapater
    extends S3ConnectorCapabilitiesAdapter
    implements MetadataAware
{

    private final static String MODULE_NAME = "Amazon S3";
    private final static String MODULE_VERSION = "2.6.3-SNAPSHOT";
    private final static String DEVKIT_VERSION = "3.5.0-SNAPSHOT";
    private final static String DEVKIT_BUILD = "UNKNOWN_BUILDNUMBER";
    private final static String MIN_MULE_VERSION = "3.5";

    public String getModuleName() {
        return MODULE_NAME;
    }

    public String getModuleVersion() {
        return MODULE_VERSION;
    }

    public String getDevkitVersion() {
        return DEVKIT_VERSION;
    }

    public String getDevkitBuild() {
        return DEVKIT_BUILD;
    }

    public String getMinMuleVersion() {
        return MIN_MULE_VERSION;
    }

}