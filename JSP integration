<%@ page import="java.util.List" %>
<%@ page import="com.example.EmployeeDAO" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    EmployeeDAO dao = new EmployeeDAO();
    List<Employee> employees = dao.getAllEmployees();
%>
<html>
<body>
    <h2>Employee List</h2>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Department</th>
            <th>Email</th>
            <th>Salary</th>
        </tr>
        <c:forEach var="employee" items="${employees}">
            <tr>
                <td>${employee.id}</td>
                <td>${employee.name}</td>
                <td>${employee.department}</td>
                <td>${employee.email}</td>
                <td>${employee.salary}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
