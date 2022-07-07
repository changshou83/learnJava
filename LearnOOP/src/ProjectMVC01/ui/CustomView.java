package ProjectMVC01.ui;

import ProjectMVC01.bean.Customer;
import ProjectMVC01.service.CustomList;
import ProjectMVC01.util.Utility;

public class CustomView {
    private CustomList customerList = new CustomList(10);

    public CustomView() {
        Customer customer = new Customer("changshou83", '男', 20, "15598164946", "foo@bar.com");
        customerList.addCustomer(customer);
    }

    public void enterMainMenu() {
        boolean running = true;
        while (running) {
            System.out.println("\n-----------------客户信息管理软件-----------------\n");
            System.out.println("                   1 添 加 客 户");
            System.out.println("                   2 修 改 客 户");
            System.out.println("                   3 删 除 客 户");
            System.out.println("                   4 客 户 列 表");
            System.out.println("                   5 退       出\n");
            System.out.print("                   请选择(1-5)：");

            char menu = Utility.readMenuSelection();
            switch (menu) {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.print("确认是否退出(Y/N)：");
                    char isExit = Utility.readConfirmSelection();
                    if (isExit == 'Y') {
                        running = false;
                    }
            }
        }
    }

    public void addNewCustomer() {
        System.out.println("---------------------添加客户---------------------");
        System.out.print("姓名：");
        String name = Utility.readString(20);
        System.out.print("性别：");
        char gender = Utility.readChar();
        System.out.print("年龄：");
        int age = Utility.readNumber();
        System.out.print("电话：");
        String phone = Utility.readString(13);
        System.out.print("邮箱：");
        String email = Utility.readString(30);

        Customer customer = new Customer(name, gender, age, phone, email);

        boolean isSuccess = customerList.addCustomer(customer);
        if (isSuccess) {
            System.out.println("---------------------添加完成---------------------");
        } else {
            System.out.println("-------------------客户目录已满，添加失败---------------");
        }
    }

    public void modifyCustomer() {
        System.out.println("---------------------修改客户---------------------");
        int id = findCustomer();
        if(id == -1) return;

        Customer customer = customerList.getCustomer(id - 1);
        System.out.print("姓名(" + customer.getName() + "):");
        String name = Utility.readString(20, customer.getName());
        System.out.print("性别(" + customer.getGender() + "):");
        char gender = Utility.readChar(customer.getGender());
        System.out.print("年龄(" + customer.getAge() + "):");
        int age = Utility.readNumber(customer.getAge());
        System.out.print("电话(" + customer.getPhone() + "):");
        String phone = Utility.readString(13, customer.getPhone());
        System.out.print("邮箱(" + customer.getEmail() + "):");
        String email = Utility.readString(30, customer.getEmail());

        Customer newCustomer = new Customer(name, gender, age, phone, email);

        boolean isReplaced = customerList.replaceCustomer(id - 1, newCustomer);
        if (isReplaced) {
            System.out.println("---------------------修改完成---------------------");
        } else {
            System.out.println("---------------------修改失败---------------------");
        }
    }

    public void deleteCustomer() {
        System.out.println("---------------------删除客户---------------------");
        int id = findCustomer();
        if(id == -1) return;

        System.out.print("确认是否删除(Y/N)：");
        char isDelete = Utility.readConfirmSelection();
        if (isDelete == 'Y') {
            boolean deleteSuccess = customerList.deleteCustomer(id - 1);
            if (deleteSuccess) {
                System.out.println("---------------------删除完成---------------------");
            } else {
                System.out.println("---------------------删除失败---------------------");
            }
        }
    }

    private int findCustomer() {
        Customer customer = null;
        int id;
        while (true) {
            System.out.print("请选择客户编号(-1退出)：");
            id = Utility.readNumber();

            if (id == -1) return -1;

            customer = customerList.getCustomer(id - 1);
            if (customer == null) {
                System.out.println("无法找到指定客户！");
            } else {
                break;
            }
        }
        return id;
    }

    public void listAllCustomers() {
        System.out.println("---------------------------客户列表---------------------------\n");
        int total = customerList.getTotalCount();

        if (total == 0) {
            System.out.println("没有客户记录！");
        } else {
            System.out.println("编号\t姓名\t\t\t性别\t年龄\t电话\t\t\t邮箱");

            Customer[] customers = customerList.getAllCustomers();
            for (int i = 0; i < customers.length; i++) {
                Customer customer = customers[i];
                customer.printInfo(i + 1);
            }
        }
        System.out.println("-------------------------客户列表完成-------------------------");
    }

    public static void main(String[] args) {
        CustomView view = new CustomView();
        view.enterMainMenu();
    }
}
