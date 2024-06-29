import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

 public class delete extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		PrintWriter out=response.getWriter();
		String s1=request.getParameter("u1");
		out.println("<html>");
		out.println("<body>");
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///mk?useSSL=false","root","india");
			Statement st= con.createStatement();
            String s = "delete from insmark  where rno='" + s1 + "'  ";
            	st.executeUpdate(s);

response.sendRedirect("showall");
			
		}
	catch(Exception e){
		out.println(e);
	}
	out.println("</html>");
		out.println("</body>");
		
	}
}


//set classpath=C:\Program Files\Apache Software Foundation\Tomcat 9.0\lib\servlet-api.jar;.;%classpath%
