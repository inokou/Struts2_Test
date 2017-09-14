package com.tutorialspoint.struts2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Sample50013 extends HttpServlet {

        public void doGet(HttpServletRequest request,
                        HttpServletResponse response)
        throws IOException, ServletException {

                // プロパティファイルのパスを取得する
                ServletContext context = this.getServletContext();
                String path = context.getRealPath("/WEB-INF/init.properties");

                // プロパティファイルをロードする
                InputStream is = new FileInputStream(path);
                Properties properties = new Properties();
                properties.load(is);
                is.close();

                response.setContentType("text/html; charset=Windows-31J");
                PrintWriter out = response.getWriter();

                out.println("<html>");
                out.println("<head>");
                out.println("</head>");
                out.println("<body>");

                // プロパティの出力
                out.println("PATH:" + path + "<br />");
                properties.list(out);

                out.println("</body>");
                out.println("</html>");

        }
}