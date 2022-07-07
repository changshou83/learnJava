package ProjectMVC01.service;

import ProjectMVC01.bean.Customer;

public class CustomList {
    private Customer[] customers;
    private int totalCount;

    public CustomList(int limit) {
        customers = new Customer[limit];
    }

    public boolean addCustomer(Customer customer) {
        if (totalCount >= customers.length) {
            return false;
        }

        customers[totalCount] = customer;
        totalCount++;

        return true;
    }

    public boolean replaceCustomer(int id, Customer customer) {
        if (id < 0 || id >= totalCount) {
            return false;
        }
        customers[id] = customer;

        return true;
    }

    public boolean deleteCustomer(int id) {
        if (id < 0 || id >= totalCount) {
            return false;
        }
        System.arraycopy(customers, id + 1, customers, id, totalCount - id);
        customers[--totalCount] = null;

        return true;
    }

    public Customer[] getAllCustomers() {
        Customer[] currCustomers = new Customer[totalCount];
        if (totalCount >= 0) System.arraycopy(customers, 0, currCustomers, 0, totalCount);

        return currCustomers;
    }

    public Customer getCustomer(int id) {
        if (id < 0 || id >= totalCount) return null;

        return customers[id];
    }

    public int getTotalCount() {
        return totalCount;
    }
}
