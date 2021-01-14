package com.mikepenz.aboutlibraries.plugin

import org.gradle.api.NamedDomainObjectCollection
import org.gradle.api.model.ObjectFactory

import javax.inject.Inject

class AboutLibrariesExtension {

    @Inject public AboutLibrariesExtension(ObjectFactory objectFactory) {
        additionalLicenses = objectFactory.domainObjectContainer(AboutLibrariesLicenseExtension.class)
    }

    /**
     * The path to your directory containing {@code custom_*.prop} files.
     */
    String configPath

    /**
     * Include all licenses
     *
     * Useful if you want to include all licenses even if they weren't detected by this plugin
     */
    boolean includeAllLicenses

    /**
     * Additional license names you want to include.
     *
     * Useful in case e.g. there's a license only used in an explicitly-added library.
     */
    NamedDomainObjectCollection<AboutLibrariesLicenseExtension> additionalLicenses
}
