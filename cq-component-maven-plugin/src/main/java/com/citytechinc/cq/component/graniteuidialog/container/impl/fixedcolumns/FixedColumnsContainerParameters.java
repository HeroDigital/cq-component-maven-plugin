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
package com.citytechinc.cq.component.graniteuidialog.container.impl.fixedcolumns;

import com.citytechinc.cq.component.graniteuidialog.container.GraniteUIContainer;
import com.citytechinc.cq.component.graniteuidialog.container.GraniteUIContainerParameters;
import com.citytechinc.cq.component.graniteuidialog.items.GraniteUIItems;
import com.citytechinc.cq.component.graniteuidialog.layout.GraniteUILayout;
import org.codehaus.plexus.util.StringUtils;

public class FixedColumnsContainerParameters extends GraniteUIContainerParameters {

    private GraniteUIItems items;
    private GraniteUILayout layout;

    @Override
    public String getResourceType() {
        return GraniteUIContainer.DEFAULT_RESOURCE_TYPE;
    }

    @Override
    public void setResourceType(String resourceType) {
        throw new UnsupportedOperationException("resourceType is Static for FixedColumnsContainer");
    }

    @Override
    public String getFieldName() {
        if (StringUtils.isBlank(super.getFieldName())) {
            return GraniteUIContainer.DEFAULT_FIELD_NAME;
        }

        return super.getFieldName();
    }

    public GraniteUIItems getItems() {
        return items;
    }

    public void setItems(GraniteUIItems items) {
        this.items = items;
    }

    public GraniteUILayout getLayout() {
        return layout;
    }

    public void setLayout(GraniteUILayout layout) {
        this.layout = layout;
    }
}
