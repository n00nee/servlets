package com.example.wykladyzadania;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

@WebServlet("/get1")
public class Get1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String startStr = req.getParameter("start");
        String endStr = req.getParameter("end");

        if (Objects.nonNull(startStr) && Objects.nonNull(endStr)) {
            int start = Integer.parseInt(startStr);
            int end = Integer.parseInt(endStr);

            for (int i = start; i <= end; i++) {
                resp.getWriter().println(i);
            }
        } else {
            resp.getWriter().println("<h1>BRAK</h1>");
        }
    }
}
