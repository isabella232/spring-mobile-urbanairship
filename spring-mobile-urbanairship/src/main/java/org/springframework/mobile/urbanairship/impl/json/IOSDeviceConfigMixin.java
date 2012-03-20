/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.mobile.urbanairship.impl.json;

import java.util.List;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.springframework.mobile.urbanairship.IOSDeviceConfig.QuietTime;

abstract class IOSDeviceConfigMixin {
	
	@JsonCreator
	IOSDeviceConfigMixin(String deviceToken) {}

	@JsonIgnore
	String deviceToken;

	@JsonProperty("alias")
	@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
	String alias;
	
	@JsonProperty("tags")
	@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
	List<String> tags;

	@JsonProperty("badge")
	@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
	Integer badge;
	
	@JsonProperty("quiettime")
	@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
	QuietTime quietTime;
	
	@JsonProperty("tz")
	@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
	String timeZone;
	
	@JsonIgnore
	boolean empty;
}