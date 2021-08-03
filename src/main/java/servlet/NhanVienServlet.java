package servlet;

import model.NhanVien;
import service.NhanVienService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/nhanvien"})
public class NhanVienServlet extends HttpServlet {
    NhanVienService service=new NhanVienService();
    //vì đặt là tên class chứ kp của công cụ nền tảng java
    RequestDispatcher requestDispatcher;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                resp.sendRedirect("view/create.jsp");
                break;
            case "edit":
                int indexedit = Integer.parseInt(req.getParameter("index"));
                req.setAttribute("view/edit.jsp", NhanVienService.list.get(indexedit));
                resp.sendRedirect("/");
                break;
            case "delete":
                int index = Integer.parseInt(req.getParameter("index"));
                NhanVienService.delete(index);
                resp.sendRedirect("/");
                break;
            default:
                req.setAttribute("list", NhanVienService.list);
                requestDispatcher = req.getRequestDispatcher("show.jsp");
                requestDispatcher.forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                int id = Integer.parseInt(req.getParameter("id"));
                String name = req.getParameter("name");
                String date = req.getParameter("date");
                String address = req.getParameter("address");
                String phone = req.getParameter("phone");
                String email = req.getParameter("email");
                int idphongBan = Integer.parseInt(req.getParameter("idphongban"));
                NhanVien nhanVien = new NhanVien(id, name, date, address, phone, email, idphongBan);
                NhanVienService.save(nhanVien);
                resp.sendRedirect("/");
                break;
            case "edit":
                int idedit = Integer.parseInt(req.getParameter("id"));
                String nameedit = req.getParameter("name");
                String dateedit = req.getParameter("date");
                String addressedit = req.getParameter("address");
                String phoneedit = req.getParameter("phone");
                String emailedit = req.getParameter("email");
                int idphongBanedit = Integer.parseInt(req.getParameter("idphongban"));
                NhanVien nhanVienedit = new NhanVien(idedit, nameedit, dateedit, addressedit, phoneedit, emailedit, idphongBanedit);
                int index = Integer.parseInt(req.getParameter("index"));
                NhanVienService.edit(nhanVienedit, index);
        }
    }
}

