package com.rogtejada.javaee.poc.servlets;

import com.rogtejada.javaee.poc.dao.ClientDao;
import com.rogtejada.javaee.poc.entity.Client;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/save/client")
public class Save extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html");
        Client client = new Client(
                request.getParameter("name"),
                request.getParameter("lastName"),
                request.getParameter("cpf")
        );
        ClientDao clientDao = new ClientDao();
        clientDao.saveClient(client);
    }
}
