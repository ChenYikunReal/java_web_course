package test0517;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SetSessionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession();
       // String sessionId=session.getId();
        //System.out.println("sessionId:"+sessionId);
        //存值
        session.setAttribute("userName","jerry");
        session.setAttribute("userAge",22);

        //session.removeAttribute("userName");
        session.invalidate();

        response.sendRedirect("GetSessionServlet");
    }
}
