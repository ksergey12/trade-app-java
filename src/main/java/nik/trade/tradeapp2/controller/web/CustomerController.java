package nik.trade.tradeapp2.controller.web;

import nik.trade.tradeapp2.forms.CustomerForm;
import nik.trade.tradeapp2.forms.GoodForm;
import nik.trade.tradeapp2.service.good.impl.CustomerServiceImpl;
import nik.trade.tradeapp2.service.good.impl.GoodServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerController {
    @Autowired
    CustomerServiceImpl customerService;

    @RequestMapping(value = "/customer/list", method = RequestMethod.GET)
    public String customerList(Model model){
        model.addAttribute("customers", customerService.getAll() );
        return "customerList";
    }
    /*
    @RequestMapping(value = "/customer/delete/{id}", method = RequestMethod.GET)
    public String deleteCustomer(Model model, @PathVariable("id") String id){
        customerService.delete(id);
        model.addAttribute("customers", customerService.getAll());
        return "customerdList";
    }


    @RequestMapping(value = "/customer/add", method = RequestMethod.GET)
    public String addCustomer(Model model
    ){
        CustomerForm customerForm= new CustomerForm();
        // Good newGood= new Good(goodForm.getId(),goodForm.getName(), goodForm.getPrice(), "",goodForm.getDescription());
        //goodService.create(newGood);
        model.addAttribute("customerForm", customerForm);
        return "addCustomer";

    }
    */
}
