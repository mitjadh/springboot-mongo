package io.springboot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	
	@Autowired
	private OrderRepository orderRepository;
	
	  @RequestMapping(value="/orders")
	  public List<Order> getAllOrders() {
		  return orderRepository.findAll();
	  }

	  @RequestMapping(value="/orders/{id}")
	  public Optional<Order> getOrder(@PathVariable int id) {
		return orderRepository.findById(id);
	  }

	  @RequestMapping(value="/orders",method=RequestMethod.POST)
	  public void addOrder(@RequestBody Order orders) {
		  orderRepository.insert(orders);
	  }

	  @RequestMapping(value="/orders/{id}",method=RequestMethod.PUT)
	  public void updateOrder(@PathVariable int id, @RequestBody Order orders) {
		  orderRepository.save(orders);
	  }

	  @RequestMapping(value="/orders/{id}",method=RequestMethod.DELETE)
	  public void deleteOrder(@PathVariable int id) {
	    orderRepository.deleteById(id);
	  }
}
