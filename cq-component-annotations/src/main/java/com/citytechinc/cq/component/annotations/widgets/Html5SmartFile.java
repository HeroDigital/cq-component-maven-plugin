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
 * Represents a Widget of type CQ.html5.form.SmartFile
 *
 */
@Retention(RetentionPolicy.CLASS)
@Target({ ElementType.FIELD, ElementType.METHOD })
public @interface Html5SmartFile {

    /**
     * The field's HTML name attribute
     *
     * @return String
     */
	public String name() default "";

	/**
	 * True if the name of an uploaded file is editable
	 *
	 * @return boolean
	 */
	public boolean allowFileNameEditing() default true;

	/**
	 * Flag if referencing a file is allowed
	 *
	 * @return boolean
	 */
	public boolean allowFileReference() default true;

	/**
	 * Flag if uploading a file is allowed
	 *
	 * @return boolean
	 */
	public boolean allowUpload() default true;

	/**
	 * MIME type definition of files that are allowed for referencing using drag & drop
	 *
	 * @return String
	 */
	public String ddAccept() default "*";

	/**
	 * Groups involved in drag & drop
	 *
	 * @return String[]
	 */
	public String[] ddGroups() default {};

	/**
	 * Name of the form field used for posting the file name. Be aware that you will have to specify a suitable value here, as there is no sensible default value available. Suitable values are dependant on their serverside counterpart and must be "./fileName" for CQ foundation's image and download components; use "./image/fileName" for the textimage component.
	 *
	 * @return String
	 */
	public String fileNameParameter();

	/**
	 * Name of the form field used for posting the file reference. Be aware that you will have to specify a suitable value here, as there is no sensible default value available. Suitable values are dependant on their serverside counterpart and must be "./fileReference" for CQ foundation's image and download components; use "./image/fileReference" for the textimage component.
	 *
	 * @return String
	 */
	public String fileReferenceParameter();

	// TODO: Consider implementing footPanel if we move forward with panel
	// support

	// TODO: Consider implementing headPanel if we move forward with panel
	// support

	/**
	 * MIME types allowed for uploading (each separated by a semicolon; wildcard * is allowed; for example: "*.*" or "*.jpg;*.gif;*.png" (defaults to "*.*".) Also support MIME type syntax; for example (image/jpg or image/*)
	 *
	 * @return String
	 */
	public String mimeTypes() default "*.*";

	/**
	 * A String that describes the allowed MIME types
	 *
	 * @return String
	 */
	public String mimeTypesDescription() default "All files";

	/**
	 * Maximum size of a file to be uploaded in Megabytes
	 *
	 * @return int
	 */
	public int sizeLimit() default 0;

    /**
     * Applicable to Granite UI Widgets only
     *
     * A title
     *
     * @return String
     */
    public String title() default "";

    /**
     * Applicable to Granite UI Widgets only
     *
     * The text of the button
     *
     * @return String
     */
    public String text() default "";

    /**
     * Applicable to Granite UI Widgets only
     *
     * The icon of the button
     *
     * @return String
     */
    public String icon() default "";

    /**
     * Applicable to Granite UI Widgets only
     *
     * The variant of the button: "secondary", "quiet"
     *
     * @return String[]
     */
    public String[] variant() default {};

    /**
     * Applicable to Granite UI Widgets only
     *
     * Indicates whether multiple files may be uploaded
     *
     * @return Boolean
     */
    public boolean multiple() default false;

    /**
     * Applicable to Granite UI Widgets only
     *
     * @return Boolean
     */
    public boolean disabled() default false;

    /**
     * Applicable to Granite UI Widgets only
     *
     * Placeholder attr for the underlying form field
     *
     * @return String
     */
    public String placeholder() default "";

    /**
     * Applicable to Granite UI Widgets only
     *
     * Same as placeholder
     *
     * @return String
     */
    public String emptyText() default "";

    /**
     * Applicable to Granite UI Widgets only
     *
     * URL where to upload the file, you can use <code>${suffix.path}</code>
     *
     * @return String
     */
    public String uploadUrl() default "${suffix.path}";

    /**
     * Applicable to Granite UI Widgets only
     *
     * Upload URL builder
     *
     * @return String
     */
    public String uploadUrlBuilder() default "";

    /**
     * Applicable to Granite UI Widgets only
     *
     * If <code>true</code>, upload starts automatically once the file is selected
     *
     * @return Boolean
     */
    public boolean autoStart() default false;

    /**
     * Applicable to Granite UI Widgets only
     *
     * Prefer HTML5 to upload files (if browser allows it)
     *
     * @return Boolean
     */
    public boolean useHTML5() default true;

    /**
     * Applicable to Granite UI Widgets only
     *
     * Drop zone selector to upload files from file system directly (if browser allows it)
     *
     * @return String
     */
    public String dropZone() default "";

}
