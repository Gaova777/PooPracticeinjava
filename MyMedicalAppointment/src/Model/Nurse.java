package Model;

public class Nurse extends  User{
    public String speciality;

    public Nurse(String name, String email){
        super(name,email);
    }

    @Override
    public void showData() {

    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
