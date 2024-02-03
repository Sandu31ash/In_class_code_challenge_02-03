package lk.ijse.inclasscodechallenge_02_03.api;

import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import lk.ijse.inclasscodechallenge_02_03.dto.SDTO;
import lombok.var;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "servlet",urlPatterns = "/servlet")

public class Servlet extends HttpServlet {

//    final static Logger logger = LoggerFactory.getLogger(Servlet.class);
    Connection connection;

    public void init(){
//        logger.info("Init the Customer Servlet");

//        try {
//            InitialContext ctx = new InitialContext();
////            DataSource pool = (DataSource) ctx.lookup("java:comp/env/jdbc/lavazza");
//            System.out.println(pool);
//            this.connection = pool.getConnection();
//
//        } catch (NamingException | SQLException e) {
//            e.printStackTrace();
//        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);

        String name = req.getParameter("name");
        var writer = resp.getWriter();
        resp.setContentType("text/html");
        System.out.println("Name : "+name);
        writer.println("Name : "+name);

    }


}
