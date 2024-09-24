package com.anzcode.anzcart;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.anzcode.anzcart.models.Product;
import com.anzcode.anzcart.repository.ProductRepository;

@Component
public class DataSeeder implements CommandLineRunner {
	@Autowired
  private ProductRepository productRepository; 
	@Override
  public void run(String ...args) throws Exception{
	  if(productRepository.count()==0 ) {
		  List<Product> product = Arrays.asList(
				  new Product("Biryani",150.0,"This biryani taste is very good",4.5,"Food","Bismi Hotal",50, 10,Arrays.asList("https://picsum.photos/200/300")),
				  new Product("Biryani1",140.0,"This biryani taste is very good",4.5,"Food","Bismi Hotal",50, 10,Arrays.asList("https://picsum.photos/200/300")),
				  new Product("Biryani2",130.0,"This biryani taste is very good",4.5,"Food","Bismi Hotal",50, 10,Arrays.asList("https://picsum.photos/200/300")),
				  new Product("Biryani3",120.0,"This biryani taste is very good",4.5,"Food","Bismi Hotal",50, 10,Arrays.asList("https://picsum.photos/200/300")),
				  new Product("Biryani4",110.0,"This biryani taste is very good",5.0,"Food","Bismi Hotal",50, 10,Arrays.asList("https://picsum.photos/200/300")),
				  new Product("Biryani5",200.0,"This biryani taste is very good",4.5,"Food","Bismi Hotal",50, 10,Arrays.asList("https://picsum.photos/200/300")),
				  new Product("Biryani6 ",250.0,"This biryani taste is very good",4.5,"Food","Bismi Hotal",50, 10,Arrays.asList("https://picsum.photos/200/300")),
				  new Product("Biryani7",300.0,"This biryani taste is very good",4.5,"Food","Bismi Hotal",50, 10,Arrays.asList("https://picsum.photos/200/300"))
						  );
				  
		  productRepository.saveAll(product);
		  System.out.println("Demo data seeded ");
	  }
  }
}
