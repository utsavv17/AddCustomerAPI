package controller;

import DAO.CustomerDAO;
import java.io.IOException;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Customer;

@WebServlet("/addCustomer")
public class AddCustomerServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve customer details from the request parameters
        String customerName = request.getParameter("customerName");
        String email = request.getParameter("email");
        String mobileNumber = request.getParameter("mobileNumber");
        String city = request.getParameter("city");
        System.out.println("heyyy");
         Random rand = new Random();
         int id = rand.nextInt(1000);
        
        // Create a new Customer object and set its properties
        Customer customer = new Customer();
        customer.setCustomerName(customerName);
        customer.setEmail(email);
        customer.setMobileNumber(mobileNumber);
        customer.setCity(city);
        customer.setCustomerId(id);

        
         CustomerDAO customerDAO = new CustomerDAO();
           customerDAO.CreateCustomer(customer);

        // Add the customer to the CustomerService
      //  CustomerService.addCustomer(customer);

        // Redirect to the homepage or another appropriate page
        response.sendRedirect("index.jsp");
    }

 
}
