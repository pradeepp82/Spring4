package com.artek.configuration;

import java.util.HashMap;
import java.util.Map;

import org.apache.tiles.Attribute;
import org.apache.tiles.Definition;
import org.apache.tiles.definition.DefinitionsFactory;
import org.apache.tiles.request.Request;
import org.springframework.context.annotation.Bean;

public class TilesDefinitionsConfig implements DefinitionsFactory {
	private static final Map<String, Definition> tilesDefination = new HashMap<String, Definition>();
	private static final Attribute BASE_TEMPLATE = new Attribute("/WEB-INF/layout/baseLayout.jsp");

	@Bean
	public static void addDefaultLayoutDef(String name, String body) {
		Map<String, Attribute> attribute = new HashMap<String, Attribute>();
		attribute.put("title", new Attribute(""));
		attribute.put("header", new Attribute("/WEB-INF/layout/header.jsp"));
		attribute.put("menu", new Attribute("/WEB-INF/layout/menu.jsp"));
		attribute.put("body", new Attribute(body));
		attribute.put("footer", new Attribute("/WEB-INF/layout/footer.jsp"));
		tilesDefination.put(name, new Definition(name, BASE_TEMPLATE, attribute));
	}

	@Bean
	public static void addDefinitions() {
		addDefaultLayoutDef("login", "/WEB-INF/jsp/login.jsp");
		addDefaultLayoutDef("registration", "/WEB-INF/jsp/Registration.jsp");
		addDefaultLayoutDef("empReg", "/WEB-INF/jsp/EmpRegister.jsp");
		addDefaultLayoutDef("local", "/WEB-INF/jsp/LocalFile.jsp");
		addDefaultLayoutDef("result", "/WEB-INF/jsp/Result.jsp");
		addDefaultLayoutDef("coureses", "/WEB-INF/jsp/CourseForm.jsp");
		addDefaultLayoutDef("CourseEdit", "/WEB-INF/jsp/CourseEdit.jsp");
	}

	public Definition getDefinition(String name, Request request) {

		return tilesDefination.get(name);
	}
}
