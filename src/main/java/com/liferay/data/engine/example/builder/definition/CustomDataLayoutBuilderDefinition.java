package com.liferay.data.engine.example.builder.definition;

import com.liferay.data.engine.taglib.servlet.taglib.definition.DataLayoutBuilderDefinition;

import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true, property = {"content.type=data-engine-example"},
	service = DataLayoutBuilderDefinition.class
)
public class CustomDataLayoutBuilderDefinition
	implements DataLayoutBuilderDefinition {

	@Override
	public boolean allowFieldSets() {
		return true;
	}

}