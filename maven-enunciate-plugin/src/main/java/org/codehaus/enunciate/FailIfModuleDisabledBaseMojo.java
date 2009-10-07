package org.codehaus.enunciate;

/**
 * Simple relocation of the {@link FailIfModuleDisabledMojo}.
 *
 * @author Ryan Heaton
 * @extendsPlugin maven-enunciate-slim-plugin
 * @goal failIfModuleDisabled
 * @requiresDependencyResolution compile
 * @executionStrategy once-per-session
 */
public class FailIfModuleDisabledBaseMojo extends FailIfModuleDisabledMojo {

}