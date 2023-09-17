import Model.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor("Anahí Salgado", "ani@c.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }

        User user = new Doctor("Anahi", "ana@ana.com");
        user.showData();

        /*
        * clases anonimas ->
        * */

        User user1 = new User("Juan", "Diego@gma.com") {
            @Override
            public void showData() {
                System.out.println("Doctor");
                System.out.println("\notra cosita");
            }
        };

        user1.showData();

        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };

        ISchedulable iSchedulable1 = new AppointmentDoctor(){

        };

        /*
        System.out.println();
        System.out.println();
        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        Patient patient2 = new Patient("Anahi", "anahi@mail.com");

        System.out.println(patient.getName());
        System.out.println(patient2.getName());
        patient2 = patient;

        System.out.println(patient.getName());
        System.out.println(patient2.getName());

        patient2.setName("Manuel");
        System.out.println(patient.getName());
        System.out.println(patient2.getName());
        */

    }
}



