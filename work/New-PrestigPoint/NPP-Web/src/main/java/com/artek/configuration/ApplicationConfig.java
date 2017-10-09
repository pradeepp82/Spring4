package com.artek.configuration;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.artek")
public class ApplicationConfig extends WebMvcConfigurerAdapter
{
@Bean
public ViewResolver viewResolver()
{
	TilesViewResolver resolver = new TilesViewResolver();
	 resolver.setViewClass(TilesView.class);
	return  resolver ;
	}
@Bean
public TilesConfigurer getTilesConfig()
{
	TilesConfigurer tilesConfig = new TilesConfigurer();
	tilesConfig.setCheckRefresh(true);
	tilesConfig.setDefinitionsFactoryClass(TilesDefinitionsConfig.class);
	TilesDefinitionsConfig.addDefinitions();
return	tilesConfig;
}
@Bean
public MessageSource messageSource()
{
ReloadableResourceBundleMessageSource resourceMessage = new ReloadableResourceBundleMessageSource();
resourceMessage.setBasenames("classpath:messages","classpath:message");
resourceMessage.setDefaultEncoding("UTF-8");
return resourceMessage;

}
@Override
public void addInterceptors(InterceptorRegistry registry) {
LocaleChangeInterceptor interceptor = new LocaleChangeInterceptor();
interceptor.setParamName("lang");
registry.addInterceptor(interceptor);

}

@Bean
public SessionLocaleResolver localeResolver(){
SessionLocaleResolver resolver = new SessionLocaleResolver();
resolver.setDefaultLocale(new Locale("hi"));

return resolver;
}

}
