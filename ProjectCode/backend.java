import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AppointmentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Extracting form data
        String date = request.getParameter("date");
        String time = request.getParameter("time");

        // Here, you could add logic to store appointment details in a database
        // For now, let's just return a simple confirmation message
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Appointment Successfully Booked!</h2>");
        out.println("<p>Appointment Date: " + date + "</p>");
        out.println("<p>Appointment Time: " + time + "</p>");
        out.println("</body></html>");
    }
}
