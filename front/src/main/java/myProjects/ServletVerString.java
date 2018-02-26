package myProjects;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;





@WebServlet(urlPatterns = "/verStr")
public class ServletVerString extends HttpServlet {

    protected void verify(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("UTF-8");

        String stringForVerify = req.getParameter("stringForVerify");
        req.setAttribute("msg1", stringForVerify);
        stringForVerify = VerString.testString(stringForVerify);
        req.setAttribute("msg2", stringForVerify);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/");
        dispatcher.forward(req,resp);
        return;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        verify(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    public void destroy() {
        super.destroy();
    }


}

