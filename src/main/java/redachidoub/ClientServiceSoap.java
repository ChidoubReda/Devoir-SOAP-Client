package redachidoub;

import java.util.List;

public class ClientServiceSoap {
    public static void main(String[] args) {
        StudentService wsdl = new ServiceWeb().getStudentServicePort();
        List<Student> liste = wsdl.listStudents();
        liste.forEach(elm -> {
            System.out.println(elm.getName()
                    + "----" + elm.getPrenom());
        });
    }
}