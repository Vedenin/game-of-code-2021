package eu.gameofcode.endgame.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/about").setViewName("about");
		registry.addViewController("/contact").setViewName("contact");
//		registry.addViewController("/home").setViewName("home");
		//registry.addViewController("/").setViewName("home");
		//registry.addViewController("/admin_panel").setViewName("admin_panel");
//		registry.addViewController("/game_of_code").setViewName("game_of_code");
//		registry.addViewController("/luxsearch").setViewName("luxsearch");
//		registry.addViewController("/luxsearch_access").setViewName("luxsearch_access");
//		registry.addViewController("/luxsearch_public").setViewName("luxsearch_public");
//		registry.addViewController("/map").setViewName("map");
//		registry.addViewController("/").setViewName("history");
//		registry.addViewController("/login").setViewName("login");
//		registry.addViewController("/wc").setViewName("wc");
	}

}
