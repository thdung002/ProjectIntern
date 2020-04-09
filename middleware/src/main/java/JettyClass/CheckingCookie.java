package JettyClass;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import connectDB.*;

public class CheckingCookie extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Checking cookie - authentication");
        try{
            resp.addHeader("Access-Control-Allow-Origin", "http://localhost:8080");
            resp.addHeader("Access-Control-Allow-Credentials","true");
            HttpSession session=req.getSession(false);
            String id = req.getParameter("id");
            if(session.getId().equals(id) && session != null )
            {

                Object usr =  UserLogin.ck.get(id);
                resp.setContentType("application/json;charset=UTF-8");
                ServletOutputStream out = resp.getOutputStream();
                Gson gson = new GsonBuilder().create();
                JsonObject arr = gson.toJsonTree(usr).getAsJsonObject();
                out.print(arr.toString());
            }

            else{
                session.invalidate();
                ServletOutputStream out = resp.getOutputStream();
                Gson gson = new GsonBuilder().create();
                Map<String, Integer> res= new HashMap<>();
                res.put("AccountType", 0);
                JsonObject arr = gson.toJsonTree(res).getAsJsonObject();
                out.print(arr.toString());

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
