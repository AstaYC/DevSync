package org.JEEexemple.Util; // Adjust the package name if needed

public class HibernateTest {
    public static void main(String[] args) {
        try {
            // Attempt to initialize Hibernate
            HibernateUtil.getSessionFactory();
            System.out.println("Hibernate setup is successful!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
