package com.maninformatic.tramite;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.maninformatic.tramite.dao.ITramiteDao;
import com.maninformatic.tramite.dao.TramiteDaoImp;
import com.maninformatic.tramite.service.ITramiteService;
import com.maninformatic.tramite.service.TramiteServiceImp;


@Configuration
//@EnableTransactionManagement

//@ComponentScan(basePackages = {"com.maninformatic.tramite"})
//@EnableWebMvc
public class Configuracion extends WebMvcConfigurerAdapter {
/*	@Bean
	public DataSource dataSource(){
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/tramite");
		dataSource.setUsername("root");
	    dataSource.setPassword("Pa$$w0rd");
	    return dataSource;
		
	}
	private Map<String,?> jpaProperties() {
		Map<String,String> jpaPropertiesMap = new HashMap<String,String>();
		jpaPropertiesMap.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        jpaPropertiesMap.put("hibernate.hbm2ddl.auto", "update");
        return jpaPropertiesMap;
	}
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
		factoryBean.setPersistenceProviderClass(HibernatePersistenceProvider.class);
		factoryBean.setDataSource(dataSource());
		factoryBean.setPackagesToScan("com.maninformatic.tramite.bean");
		factoryBean.setJpaPropertyMap(jpaProperties());
        return factoryBean;
	}
	@Bean
	@Autowired
	 public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
		JpaTransactionManager transactionManager=new JpaTransactionManager(); 
		transactionManager.setEntityManagerFactory(entityManagerFactory);
		return transactionManager;
		 
	 }
	@Bean
    public ITramiteDao tramiteDao() {
	 TramiteDaoImp tramiteDaoImp = new TramiteDaoImp();
        return tramiteDaoImp;
    }
	@Bean
	 @Autowired
	 public ITramiteService tramiteService(ITramiteDao tramiteDao) { 
	        TramiteServiceImp tramiteService = new TramiteServiceImp();
	        tramiteService.setTramiteDao(tramiteDao);	        
	        return tramiteService;
	 }*/
	/* @Override
	 public void addInterceptors(InterceptorRegistry registry) {
	        registry.addInterceptor(new CorsInterceptor());
	 }
	*/
}
