package controller;

import model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.CustomerService;

import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {
    CustomerService customerService = new CustomerService();

    @GetMapping("/customer")
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("list");
        List<Customer> customers = customerService.fillAll();
        modelAndView.addObject("listCustomer", customers);
        return modelAndView;
    }

@GetMapping("/search")
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String showFormEdit(@PathVariable int id, ModelMap modelMap){
        Customer customer  = customerService.findById(id);
        modelMap.addAttribute("customer", customer);
        return "edit";
    }


    @PostMapping("edit/{id}")
    public ModelAndView editStudent(@PathVariable int id, @RequestParam String name, String email,String address){
        Customer customer = new Customer(id, name,email, address);
        customerService.save(customer, id);
        return new ModelAndView("list", "listCustomer", customerService.fillAll());
    }
}
