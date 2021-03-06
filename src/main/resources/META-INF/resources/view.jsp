<%--
/**
 * Copyright 2000-present Liferay, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
--%>

<%@ include file="/init.jsp" %>

<p>
	<b class="redBackground"><liferay-ui:message key="data_engine_example_DataEngineExamplePortlet.caption" /></b>

	<div>
		<liferay-data-engine:data-layout-builder
			contentType="data-engine-example"
			namespace="custom_namespace_DataEngineExamplePortlet"
		/>
	</div>

	<b class="redBackground">End of example</b>
</p>