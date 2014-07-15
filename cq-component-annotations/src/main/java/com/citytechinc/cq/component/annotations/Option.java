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
package com.citytechinc.cq.component.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * To be used when specifying an option for a selection property type.
 */
@Retention(RetentionPolicy.CLASS)
@Target({ ElementType.FIELD, ElementType.METHOD })
public @interface Option {

    /**
     * Author facing text for the selection option.
     *
     * @return String
     */
	String text() default "";

	/**
	 * Value of the selection option.
	 *
	 * @return String
	 */
	String value() default "";

	/**
	 * QTip of the selection option.
	 *
	 * @return String
	 */
	String qtip() default "";

    /**
     * Used for Granite UI only
     *
     * @return String
     */
    String title() default "";

    /**
     * Used for Granite UI only
     *
     * @return boolean
     */
    boolean disabled() default false;

    /**
     * Used for Granite UI only
     *
     * @return boolean
     */
    boolean selected() default false;

}
