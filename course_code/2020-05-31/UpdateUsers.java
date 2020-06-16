package test0531;

import test0510.bean.Users;
import test0510.dao.UsersDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UpdateUsers extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String loginId=request.getParameter("userId");
        String loginPwd=request.getParameter("userPwd");
        String loginName=request.getParameter("userName");
        String loginTel=request.getParameter("userTel");

        Users u=new Users();
        u.setLoginId(loginId);
        u.setNickName(loginName);
        u.setTel(loginTel);
        u.setLoginPwd(loginPwd);
        UsersDao usersDao=new UsersDao();
        try {
            usersDao.update(u);
            response.sendRedirect("SelectAllUsers");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
