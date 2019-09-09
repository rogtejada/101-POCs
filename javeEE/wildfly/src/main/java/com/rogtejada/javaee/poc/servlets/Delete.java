package com.rogtejada.javaee.poc.servlets;

import com.rogtejada.javaee.poc.dao.ClientDao;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class Delete extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html");
        ClientDao clientDao = new ClientDao();
        clientDao.deleteClientById(Integer.parseInt(request.getParameter("id")));
    }
}
