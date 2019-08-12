package com.rogtejada.javaee.poc.servlets;

import com.rogtejada.javaee.poc.dao.ClientDao;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/list")
public class ListAll extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        ClientDao clientDao = new ClientDao();
        PrintWriter printWriter = response.getWriter();
        printWriter.println(clientDao.findAll());

    }
}
