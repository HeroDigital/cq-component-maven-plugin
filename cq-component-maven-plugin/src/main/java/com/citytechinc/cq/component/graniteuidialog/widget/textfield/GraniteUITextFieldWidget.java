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
package com.citytechinc.cq.component.graniteuidialog.widget.textfield;

import com.citytechinc.cq.component.annotations.config.GraniteUIWidget;
import com.citytechinc.cq.component.annotations.widgets.TextField;
import com.citytechinc.cq.component.graniteuidialog.maker.impl.GraniteUIDefaultWidgetMaker;
import com.citytechinc.cq.component.graniteuidialog.widget.AbstractGraniteUIWidget;
import com.citytechinc.cq.component.graniteuidialog.widget.GraniteUIWidgetParameters;

@GraniteUIWidget(annotationClass = TextField.class, makerClass = GraniteUIDefaultWidgetMaker.class, resourceType = GraniteUITextFieldWidget.RESOURCE_TYPE)
public class GraniteUITextFieldWidget extends AbstractGraniteUIWidget {

    public static final String RESOURCE_TYPE = "granite/ui/components/foundation/form/textfield";

    public GraniteUITextFieldWidget(GraniteUIWidgetParameters parameters) {
        super(parameters);
    }

}
