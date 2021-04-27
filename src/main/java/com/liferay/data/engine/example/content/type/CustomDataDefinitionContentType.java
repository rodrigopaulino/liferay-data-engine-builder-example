package com.liferay.data.engine.example.content.type;

import com.liferay.data.engine.content.type.DataDefinitionContentType;
import com.liferay.portal.kernel.util.Portal;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
	immediate = true, property = {"content.type=data-engine-example"},
	service = DataDefinitionContentType.class
)
public class CustomDataDefinitionContentType
	implements DataDefinitionContentType {

	@Override
	public long getClassNameId() {
		return _portal.getClassNameId(CustomDataDefinitionContentType.class);
	}
	
	@Override
	public String getPortletResourceName() {
		return "com.liferay.data.engine.example";
	}

	@Reference
	Portal _portal;

}