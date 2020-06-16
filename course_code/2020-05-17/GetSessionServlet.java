package test0517;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class GetSessionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession();
        //取值
        String userName=(String)session.getAttribute("userName");
        Integer userAge=(Integer)session.getAttribute("userAge");

        response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();
        out.print("用户名:"+userName+"<br/>年龄："+userAge);
    }
}
