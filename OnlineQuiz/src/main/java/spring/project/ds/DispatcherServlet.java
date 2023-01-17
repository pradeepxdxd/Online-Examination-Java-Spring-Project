package spring.project.ds;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import spring.project.configuration.JavaConfig;

public class DispatcherServlet extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		Class<?>[] conf = {JavaConfig.class};
		return conf;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		String[] arr = {"/"};
		return arr;
	}

}
