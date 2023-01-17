package spring.project.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import spring.project.model.DataOfMarks;
import spring.project.model.User;

@EnableTransactionManagement
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "spring.project")
public class JavaConfig implements WebMvcConfigurer{
	
	@Bean
	public InternalResourceViewResolver getResolver() {
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/views/");
		vr.setSuffix(".jsp");
		
		return vr;
	}
	
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource data = new DriverManagerDataSource();
		data.setDriverClassName("com.mysql.cj.jdbc.Driver");
		data.setUrl("jdbc:mysql://localhost:3306/newlogin");
		data.setUsername("root");
		data.setPassword("root");
		
		return data;
	}
	
	@Bean 
	public LocalSessionFactoryBean getSessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(getDataSource());
		
		Properties properties = new Properties();
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL57Dialect");
		properties.setProperty("hibernate.hbm2ddl.auto", "update");
		
		sessionFactory.setHibernateProperties(properties);
		sessionFactory.setAnnotatedClasses(User.class, DataOfMarks.class);
		
		return sessionFactory;
	}
	
	@Bean
	public HibernateTransactionManager getTransactionManager() {
		HibernateTransactionManager tm = new HibernateTransactionManager();
		tm.setSessionFactory(getSessionFactory().getObject());
		return tm;
	}
	
	@Bean
	public HibernateTemplate getHibernateTemplate() {
		HibernateTemplate ht = new HibernateTemplate();
		ht.setSessionFactory(getSessionFactory().getObject());
		return ht;
	}
	
	@Bean
	public JavaMailSender getMailSender() {
		JavaMailSenderImpl mail = new JavaMailSenderImpl();
		
		mail.setHost("smtp.gmail.com");
		mail.setUsername("beastfake8@gmail.com");
		mail.setPassword("nnpdwxfuczezhlps");
		mail.setPort(587);
		
		Properties properties = new Properties();
		properties.put("mail.smtp.starttls.enable", true);
		properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
		properties.put("mail.smtp.auth", true);
		properties.put("mail.smtp.port", 25);
		
		mail.setJavaMailProperties(properties);
		
		return mail;
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry
		.addResourceHandler("/URLReachToMainFolder/**")
		.addResourceLocations("/resources/");
	}
	
}