package springassignment6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;


@Configuration
@PropertySource("classpath:/spring/core/quest6/db.properties")
public class DBConfig {
	
	@Value("${db.driverClassName}")
    String dbDriverClass;
    
	@Value("${db.url}")
    String dbUrl;
    
	@Value("${db.username}")
    String dbUser;
    
	@Value("${db.password}")
    String dbPass;
    
	@Bean
    public BasicDataSource dataSource() {
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName(dbDriverClass);
        ds.setUrl(dbUrl);
        ds.setUsername(dbUser);
        ds.setPassword(dbPass);
        return ds;
    }
	
	@Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
        return new PropertySourcesPlaceholderConfigurer();
    }
	
}
