package com.workapp.controller;

import com.workapp.entity.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;

/**
 * A simple servlet to welcome the user.
 * @author pwaite
 */

@WebServlet(
        urlPatterns = {"/welcome"}
)

public class Welcome extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User("Leischow", "Vang", "lv002");
        req.setAttribute("user", user);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/welcome.jsp");
        dispatcher.forward(req, resp);
    }
}