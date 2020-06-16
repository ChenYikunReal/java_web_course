package test0517;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SetCookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //创建Cookie
        Cookie c1=new Cookie("info1","hello");
        Cookie c2=new Cookie("info2","nihao");
        //设置cookie的有效时间
        c1.setMaxAge(10);

        //存cookie
        response.addCookie(c1);
        response.addCookie(c2);

        response.sendRedirect("GetCookieServlet");
    }
}
