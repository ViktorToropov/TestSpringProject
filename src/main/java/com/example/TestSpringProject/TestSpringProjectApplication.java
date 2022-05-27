package com.example.TestSpringProject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootApplication
public class TestSpringProjectApplication {
//	private static final Logger log = LoggerFactory.getLogger(TestSpringProjectApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TestSpringProjectApplication.class, args);
	}
/*
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Bean
	public CommandLineRunner demo(SalesRepositoryJpa repository) {//jpa
		return (args) -> {

			log.info("JPA");
			repository.save(new Sales(450, "2022-05-15 00:00:00","2022-06-16 00:00:00",2));//добавляем запись через jpa
			log.info("Поиск по всем записям:");
			log.info("-------------------------------");
			for (Sales sales : repository.findAll()) {
				log.info(sales.toString());
			}
			log.info("");

			// поиск по идентификатору
			log.info("Сумма чека превышает 100:");
			log.info("--------------------------------------------");
			repository.findBySumGreaterThanEqual(100).forEach(sales1 -> {
				log.info(sales1.toString());
			});
			// for (Sales sales1 : repository.findByIdentif("1")) {
			//  log.info(sales1.toString());
			// }
			log.info("");

			log.info("JDBC");
			jdbcTemplate.update("INSERT INTO sys.sales(sum, datain, datasell, identif) VALUES (?,?,?,?)", 550, "2022-05-17 00:00:00","2022-06-17 00:00:00",2);//добавляем запись через jdbc
			log.info("Поиск по всем записям:");
			log.info("-------------------------------");
			List<SalesJdbc> salesJdbcList = jdbcTemplate.query("SELECT * FROM sys.sales;", new BeanPropertyRowMapper<>(SalesJdbc.class));
			salesJdbcList.forEach(sales2->{
				log.info(sales2.toString());
			});
			log.info("");

			salesJdbcList.clear();
			salesJdbcList = jdbcTemplate.query("SELECT * FROM sys.sales where sum>=100;", new BeanPropertyRowMapper<>(SalesJdbc.class));
			// поиск по идентификатору
			log.info("Продажа по запросу найдена:");
			log.info("--------------------------------------------");
			salesJdbcList.forEach(sales2 -> {
				log.info(sales2.toString());
			});
			log.info("");

		};
	}*/
}
