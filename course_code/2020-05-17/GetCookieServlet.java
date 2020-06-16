package test0517;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class GetCookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();

        //获取cookie
        Cookie[] cs=request.getCookies();
        if(cs!=null){
            for(Cookie c:cs){
                String name=c.getName();
                String value=c.getValue();
                out.print(name+"--"+value+"<br/>");
            }
        }else{
            out.print("cookie中没数据");
        }
    }
}
