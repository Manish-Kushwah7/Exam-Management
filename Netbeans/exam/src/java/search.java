import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class search extends HttpServlet{

public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
	PrintWriter out=response.getWriter();
	out.println("<html>");
	out.println("<head>");
	out.println("<title> Search</title>");
	
	out.println("<link rel='stylesheet' href='seach.css'>");
	out.println("</head>");
	
	out.println("</head>");
	out.println("<body>");
        out.println("<center>");
	try{
		String s1=request.getParameter("u1");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql:///mk?useSSL=false","root","india");
		Statement st= con.createStatement();
		String q="select * from insmark where rno='"+s1+"' ";
		ResultSet rs=st.executeQuery(q);
	out.println("<table>");
        while(rs.next()){
            
	out.println("<form action='update'>");

        out.println("<tr>");
       out.println("<td>Roll No.</td>"); 
	out.println("<td><input type='text' name='u1' value="+rs.getString(1)+" ></td>");
           out.println("</tr>");
        
 out.println("<tr>");
       out.println("<td>Name</td>"); 
	out.println("<td><input type='text'  name='u2' value="+rs.getString(2)+" ></td>");
           out.println("</tr>");

         out.println("<tr>");
       out.println("<td>Physics</td>"); 
	out.println("<td><input type='text' name='u3' value="+rs.getString(3)+" ></td>");
           out.println("</tr>");
       
         out.println("<tr>");
       out.println("<td>Chemistry</td>"); 
	out.println("<td><input type='text'name='u4' value="+rs.getString(4)+" ></td>");
         out.println("</tr>");
       
         out.println("<tr>");
       out.println("<td>Maths</td>"); 
	out.println("<td><input type='text' name='u5' value="+rs.getString(5)+" ></td>");
        out.println("</tr>");
       
        
         out.println("<tr>");
       out.println("<th colspan='3'><input type='submit' class='sub1' value='Update' ></th>");
        out.println("</tr>");
       
	}   
con.close();
	}
catch(Exception e){
	out.println(e);
}
        
        
        
        
        	out.println("</form>");

out.println("</table>");
out.println("</center>");
out.println("</html>");

}

}