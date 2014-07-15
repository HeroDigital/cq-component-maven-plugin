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
package com.citytechinc.cq.component.graniteuidialog.widget.dropdown;

import com.citytechinc.cq.component.annotations.config.GraniteUIWidget;
import com.citytechinc.cq.component.annotations.widgets.Selection;
import com.citytechinc.cq.component.graniteuidialog.widget.AbstractGraniteUIWidget;

@GraniteUIWidget(annotationClass = Selection.class, makerClass = GraniteUIDropdownWidgetMaker.class, resourceType = GraniteUIDropdownWidget.RESOURCE_TYPE)
public class GraniteUIDropdownWidget extends AbstractGraniteUIWidget {

    public static final String RESOURCE_TYPE = "granite/ui/components/foundation/form/dropdown";

    private final String type;
    private final boolean disabled;
    private final String emptyText;
    private final boolean translateOptions;

    public GraniteUIDropdownWidget(GraniteUIDropdownWidgetParameters parameters) {

        super(parameters);

        type = parameters.getType();
        disabled = parameters.isDisabled();
        emptyText = parameters.getEmptyText();
        translateOptions = parameters.isTranslateOptions();

    }

    public String getType() {
        return type;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public String getEmptyText() {
        return emptyText;
    }

    public boolean isTranslateOptions() {
        return translateOptions;
    }
}
