package com.example.servlet;

import com.example.Warehouse;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet
public class GetUsersServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Warehouse warehouse = Warehouse.getInstance();
        request.setAttribute("users",warehouse.getUsers());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/users.jsp");
        dispatcher.forward(request, response);
    }
}
