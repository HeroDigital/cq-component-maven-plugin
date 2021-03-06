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
package com.citytechinc.cq.component.touchuidialog.widget.richtexteditor;

import com.citytechinc.cq.component.annotations.config.TouchUIWidget;
import com.citytechinc.cq.component.annotations.widgets.RichTextEditor;
import com.citytechinc.cq.component.touchuidialog.widget.textarea.TextAreaWidget;
import com.citytechinc.cq.component.touchuidialog.widget.textarea.TextAreaWidgetParameters;

@TouchUIWidget(annotationClass = RichTextEditor.class, makerClass = RichTextEditorWidgetMaker.class,
	resourceType = RichTextEditorWidget.RESOURCE_TYPE)
public class RichTextEditorWidget extends TextAreaWidget {

	public RichTextEditorWidget(TextAreaWidgetParameters parameters) {
		super(parameters);
	}

}
