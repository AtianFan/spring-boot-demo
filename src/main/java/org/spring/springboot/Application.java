package org.spring.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * <Description> 工程启动类 <br> 
 *  
 * @author atian <br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2017年11月12日 <br>
 * @see org.spring.springboot <br>
 */
@SpringBootApplication
public class Application {

	// 使用SpringBoot的SpringApplication的run方法启动
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
