import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/employee")
public class EmployeeServlet extends HttpServlet {
    private EmployeeDAO employeeDAO = new EmployeeDAO();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String department = request.getParameter("department");
        String email = request.getParameter("email");
        double salary = Double.parseDouble(request.getParameter("salary"));

        Employee employee = new Employee(0, name, department, email, salary);
        employeeDAO.addEmployee(employee);

        response.sendRedirect("success.jsp");
    }
}
