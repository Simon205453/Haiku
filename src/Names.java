public class Names {

    private String firstname;
    private String middlename;
    private String lastname;


    public Names(String fullname) {
        String[] fullName = fullname.split(" ");
        this.firstname = fullName[0];
        this.middlename = ((fullName.length > 2) ? fullName[1] : null);
        this.lastname = fullName[fullName.length-1];
    }

    @Override
    public String toString() {
        return "Names{" +
                "firstname='" + firstname + '\'' +
                ((middlename != null) ? ", middlename='" + middlename + '\'' : "") +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Names name = new Names("Simon Eriksen");
        System.out.println(name.toString());
    }
}
