package com.assignment.mycompany;

import com.assignment.mycompany.db.query.insert.InsertDepartment;
import com.assignment.mycompany.db.query.insert.InsertEmployee;
import com.assignment.mycompany.db.query.insert.InsertProject;
import com.assignment.mycompany.menu.MainMenu;

public class CompanyMain {

    public static void main(String[] args) throws Exception {
        new MainMenu().display();
    }

    private static void pdf_task2_execution() {
        //3 different departments.
        new InsertDepartment().insert( "Marketing", "Hyderabad");
        new InsertDepartment().insert( "Human Resources", "Pune");
        new InsertDepartment().insert( "IT", "Bangalore");

        //4 Employees per department.
        new InsertEmployee().insert( "Will Smith", 1, 3249.286, 1);
        new InsertEmployee().insert( "Tony Robbins", 2, 5321.280, 1);
        new InsertEmployee().insert( "Kary White", 3, 3431.243, 1);
        new InsertEmployee().insert( "Mary Kom", 1, 4423.209, 1);

        new InsertEmployee().insert( "Salman Khan", 2, 7124.238, 2);
        new InsertEmployee().insert("Williamson", 1, 4297.297, 2);
        new InsertEmployee().insert( "Henry White", 1, 1519.210, 2);
        new InsertEmployee().insert( "Johnathan Road", 3, 8954.131, 2);

        new InsertEmployee().insert( "Kelly Smith", 3, 8625.174, 3);
        new InsertEmployee().insert( "Paul", 2, 5898.246, 3);
        new InsertEmployee().insert( "Adam Jones", 2, 7914.132, 3);
        new InsertEmployee().insert( "John Doe", 1, 3581.274, 3);

        //5 Projects per department.
        new InsertProject().insert( 1, "Customer Promo coupons", 70131.182, 2010);
        new InsertProject().insert( 1, "Digital Trading", 83245.284, 2015);
        new InsertProject().insert( 1, "Search Engine Analysis", 65385.236, 2018);

        new InsertProject().insert( 2, "Recruitment Process", 62867.152, 2015);
        new InsertProject().insert( 2, "Resource Development", 45071.114, 2010);
        new InsertProject().insert( 2, "Organization Sales Productivity", 45275.139, 2016);

        new InsertProject().insert( 3, "Data Science", 74259.221, 2017);
        new InsertProject().insert( 3, "Retail Analysis using Big Data", 95298.196, 2017);
        new InsertProject().insert( 3, "Banking and Finance", 55529.229, 2010);
    }

}
