package mta.ltnc.BookStore.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ResourceConfig implements
        WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/image/**").addResourceLocations("file:///F:/Downloads/Compressed/bookstore/bookstore/image/");
        registry
                .addResourceHandler("/resources/**")
                .addResourceLocations("/resources/");

    }
}
