package com.example.java;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        float firstOperand = Integer.parseInt(request.getParameter("first-operand"));
        float secondOperand = Integer.parseInt(request.getParameter("second-operand"));
        String  operator = request.getParameter("operator");
        PrintWriter writer = response.getWriter();
        float result;
        switch (operator) {
            case "+":
                result = firstOperand + secondOperand;
                writer.println(result);
                break;
            case "-":
                result = firstOperand - secondOperand;
                writer.println(result);
                break;
            case "*":
                result = firstOperand * secondOperand;
                writer.println(result);
                break;
            case "/":
                result = firstOperand / secondOperand;
                writer.println(result);
                break;
        }
    }

    public void destroy() {
    }
}