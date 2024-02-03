package com.example.inclass;


import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.eclipse.yasson.internal.JsonBindingBuilder;

import java.io.IOException;

@WebServlet(name = "customer",urlPatterns = "/customer")
public class Customer extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getHeader("name");
        String age = req.getHeader("age");
        String location = req.getHeader("location");

        System.out.println(name);
        System.out.println(age);
        System.out.println(location);
    }
}
