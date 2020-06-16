package test0531;

import test0510.bean.Users;
import test0510.dao.UsersDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PreUpdateUsers extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            //获取主键 dao selectById request存值 跳转
            String loginId=request.getParameter("loginId");

            UsersDao usersDao=new UsersDao();
            Users u=usersDao.selectById(loginId);

            request.setAttribute("updateUsers",u);
            request.getRequestDispatcher("usersUpdate.jsp").forward(request,response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
