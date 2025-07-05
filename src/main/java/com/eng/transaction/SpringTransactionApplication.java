package com.eng.transaction;

import com.eng.transaction.repository.ProductConfig;
import com.eng.transaction.repository.ProductService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringTransactionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(ProductConfig.class);
		context.registerShutdownHook();
		ProductService productService = context.getBean("productService", ProductService.class);
		productService.saveProduct();
		context.close();
	}

}
