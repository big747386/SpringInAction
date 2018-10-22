package spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

public class SpittrWebAppInitializer extends
        AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected String[] getServletMappings(){
        return new String[] {"/"};
    }

    @Override
    protected Class<?>[] getRootConfigClasses(){
        return new Class<?>[] {RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses(){
        return new Class<?>[] {WebConfig.class};
    }

    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        registration.setMultipartConfig(new MultipartConfigElement(
                "D:\\ZOULAIZOUQU\\LearnSpring\\LearnMVC\\src\\main\\resources",
                2097152,4194304,0));
    }
}

