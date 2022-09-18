package com.example.wykladyzadania;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.Set;

@WebServlet("/get2")
public class Get2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String[]> parameterMap = req.getParameterMap();
        Set<Map.Entry<String, String[]>> parameterList = parameterMap.entrySet();
        for(Map.Entry<String, String[]> entry : parameterList) {
            resp.getWriter().println(entry.getKey());
            resp.getWriter().println(Arrays.toString(entry.getValue()));
        }


    }
}
