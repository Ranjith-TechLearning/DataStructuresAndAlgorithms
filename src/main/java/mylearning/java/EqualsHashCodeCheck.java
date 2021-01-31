package mylearning.java;

import java.util.HashMap;
import java.util.Map;

public class EqualsHashCodeCheck {
    public static void main(String arg[]){
        Employee emp1 = new Employee(1);
        Employee emp2 = new Employee(1);

        Map<Employee, String> empMap = new HashMap<>();
        empMap.put(emp1,"One");
        empMap.put(emp2,"two");
        System.out.println("Put over");
        System.out.println("Employee Map Size   : "+empMap.get(emp1));


        Integer int1 = new Integer(1);
        Integer int2 = new Integer(1);

        Map<Integer, String> intMap = new HashMap<>();
        intMap.put(int1,"One");
        intMap.put(int2,"two");
        System.out.println("Equality : ");
        System.out.println("Integer Map Size   : "+intMap.size());

    }

    private static class Employee {
        @Override
        public boolean equals(Object o) {
            System.out.println("Equals getting called...");
            if (this == o) return true;
            if (!(o instanceof Employee)) return false;
            Employee employee = (Employee) o;
            return id == employee.id;
        }

       /* @Override
        public int hashCode() {
            System.out.println("HashCode getting called.");
            return Objects.hash(id);
        }
*/
        private int id ;
        public Employee(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
}
