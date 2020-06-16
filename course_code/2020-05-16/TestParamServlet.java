package test0516;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TestParamServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userId=request.getParameter("userId");
        String userPwd=request.getParameter("userPwd");
        System.out.println(userId+"--"+userPwd);

        String[] hobbies=request.getParameterValues("hobbies");
        if (hobbies!=null){
            System.out.println("爱好:");
            for(String s:hobbies){
                System.out.println(s);
            }
        }


        String[] strs=request.getParameterValues("userInfo");
        if(strs!=null){
            System.out.println("测试:");
            for(String s:strs){
                System.out.println(s);
            }
        }

        //重定向跳转
        //response.sendRedirect("index.jsp");
        //请求转发
        //RequestDispatcher dispatcher=request.getRequestDispatcher("index.jsp");
        //dispatcher.forward(request,response);

        //设置响应的字符编码
        response.setContentType("text/html;charset=utf-8");

        //获取out对象
        PrintWriter out=response.getWriter();

        out.println("hello你好<br/>");
        out.print("<strong>222</strong>");
        out.print(userId+"--"+userPwd);
    }
}
