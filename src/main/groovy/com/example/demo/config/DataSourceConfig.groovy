import com.zaxxer.hikari.HikariDataSource
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.jdbc.DataSourceBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary

import javax.sql.DataSource

@Configuration
class DataSourceConfig {

	@Bean
	@Primary
	@ConfigurationProperties("spring.datasource") //
	DataSource datasource(){
		DataSourceBuilder.create().type(HikariDataSource).build()//
	}

}