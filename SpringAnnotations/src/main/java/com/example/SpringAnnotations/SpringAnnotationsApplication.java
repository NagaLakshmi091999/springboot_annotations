package com.example.SpringAnnotations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.SpringAnnotations.controller.MyController;
import com.example.SpringAnnotations.controller.PizzaController;
import com.example.SpringAnnotations.lazy.LazyLoader;
import com.example.SpringAnnotations.repository.MyRepository;
import com.example.SpringAnnotations.scope.PrototypeBean;
import com.example.SpringAnnotations.scope.SingletonBean;
import com.example.SpringAnnotations.service.MyService;
import com.example.SpringAnnotations.service.VegPizza;

@SpringBootApplication
public class SpringAnnotationsApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(SpringAnnotationsApplication.class, args);
//		PizzaController pizza = context.getBean(PizzaController.class);
//		System.out.println(pizza.getPiza());
//		MyController mycontroller = context.getBean(MyController.class);
//		System.out.println(mycontroller.hello());
//		MyService myservice = context.getBean(MyService.class);
//		System.out.println(myservice.hello());
//		MyRepository repo = context.getBean(MyRepository.class);
//		System.out.println(repo.hello());
//		LazyLoader lay =context.getBean(LazyLoader.class);
//		VegPizza vegPizza = context.getBean(VegPizza.class);
//		System.out.println(vegPizza.getPizza());
		
		SingletonBean single1 = context.getBean(SingletonBean.class);
		SingletonBean single2 = context.getBean(SingletonBean.class);
		SingletonBean single3= context.getBean(SingletonBean.class);
		
		PrototypeBean proto1 = context.getBean(PrototypeBean.class);
		PrototypeBean proto2 = context.getBean(PrototypeBean.class);
		PrototypeBean proto3 = context.getBean(PrototypeBean.class);
	}

}
