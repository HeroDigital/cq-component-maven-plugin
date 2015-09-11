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
package com.citytechinc.cq.component.xml;

public class NameSpacedAttribute<T> {
	private final String nameSpace;
	private final String nameSpacePrefix;
	private final String name;
	private final T value;

	public NameSpacedAttribute(String nameSpace, String nameSpacePrefix, T value) {
		this.nameSpace = nameSpace;
		this.nameSpacePrefix = nameSpacePrefix;
		this.name = null;
		this.value = value;
	}

	public NameSpacedAttribute(String nameSpace, String nameSpacePrefix, String name, T value) {
		this.nameSpace = nameSpace;
		this.nameSpacePrefix = nameSpacePrefix;
		this.name = name;
		this.value = value;
	}

	public String getNameSpace() {
		return nameSpace;
	}

	public String getNameSpacePrefix() {
		return nameSpacePrefix;
	}

	public String getName() {
		return name;
	}

	public T getValue() {
		return value;
	}
}
