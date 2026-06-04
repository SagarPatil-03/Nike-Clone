package hibernate.hib;

import javax.persistence.Persistence;

public class Example {

    public static void main(String[] args) {

        Persistence.createEntityManagerFactory("postgres");
    }
}
