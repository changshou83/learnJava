package TeamManageSystem.junit;

import TeamManageSystem.domain.employee.Employee;
import TeamManageSystem.service.*;
import org.junit.Test;

public class NameListServiceTest {
    @Test
    public void testGetAllEmployees() {
        NameListService listService = new NameListService();

        Employee[] employees = listService.getAllEmployees();

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    @Test
    public void testGetEmployee() {
        int id = 2;
        NameListService listService = new NameListService();

        try {
            Employee emp = listService.getEmployee(id);
            System.out.println(emp);
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }
    }
}
