/**
 *    Copyright 2013 CITYTECH, Inc.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.citytechinc.cq.component.annotations.widgets;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Represents a Widget of type CQ.form.PathField
 *
 */
@Retention(RetentionPolicy.CLASS)
@Target({ ElementType.FIELD, ElementType.METHOD })
public @interface PathField {

	public static final boolean ESCAPE_AMP_DEFAULT = false;
	public static final boolean HIDE_TRIGGER_DEFAULT = false;
	public static final boolean PAR_BROWSE_DEFAULT = false;
	public static final String ROOT_PATH_DEFAULT = "/";
	public static final String ROOT_TITLE_DEFAULT = "Websites";
	public static final boolean SHOW_TITLE_IN_TREE_DEFAULT = true;

    /*
     * Granite Specific Property Defaults
     */
    public static final String OPTION_LOADER_DEFAULT = "";
    public static final String OPTION_LOADER_ROOT_DEFAULT = "";
    public static final String OPTION_VALUE_READER_DEFAULT = "";
    public static final String OPTION_TITLE_READER_DEFAULT = "";

	/**
	 * True to url-encode the ampersand character (&amp;) to %26.
	 *
	 * @return boolean
	 */
	boolean escapeAmp() default ESCAPE_AMP_DEFAULT;

	/**
	 * True to disable the option to open the browse dialog
	 *
	 * @return boolean
	 */
	boolean hideTrigger() default HIDE_TRIGGER_DEFAULT;

	/**
	 * True to allow paragraph browsing and section in a grid next to the tree panel in the browse dialog. If this is enabled, it is recommended to use a predicate like 'hierarchy' to have pages as leaf nodes in the tree.
	 *
	 * @return boolean
	 */
	boolean parBrowse() default PAR_BROWSE_DEFAULT;

	/**
	 * The root path where completion and browsing starts. Use the empty string for the repository root
	 *
	 * @return String
	 */
	String rootPath() default ROOT_PATH_DEFAULT;

	/**
	 * Custom title for the root path
	 *
	 * @return String
	 */
	String rootTitle() default ROOT_TITLE_DEFAULT;

	/**
	 * Whether to show the (jcr:)titles as names of the tree nodes or the plain jcr node name
	 *
	 * @return boolean
	 */
	boolean showTitleInTree() default SHOW_TITLE_IN_TREE_DEFAULT;

    /*
     * Granite UI Specific Properties
     */

    /**
     * For use with Granite UI only - Indicates whether this field should be treated as disabled
     *
     * @return boolean
     */
    boolean disabled() default false;

    /**
     * For use with Granite UI only - The empty text to present when no value is present in this input
     *
     * @return boolean
     */
    String emptyText() default "";

    /**
     * For use with Granite UI only - Javascript source code for an option loader callback function.
     * Takes two arguments: (path, callback). See the default option loader implementation for more details
     * on how to use this. If not given, a default option loader will be used that just returns paths from the
     * current repository.
     *
     * @return String
     */
    String optionLoader() default OPTION_LOADER_DEFAULT;

    /**
     * For use with Granite UI only --- currently not implemented
     *
     * @return String
     */
    String optionLoaderRoot() default OPTION_LOADER_ROOT_DEFAULT;

    /**
     * For use with Granite UI only - Javascript source code for callback function that gets an option value
     * object as parameter and should return a stringified value for this option.
     *
     * @return String
     */
    String optionValueReader() default OPTION_VALUE_READER_DEFAULT;

    /**
     * For use with Granite UI only - Javascript source code for callback function that gets an option value
     * object as parameter and should return a stringified title for this option.
     *
     * @return String
     */
    String optionTitleReader() default OPTION_TITLE_READER_DEFAULT;
}
