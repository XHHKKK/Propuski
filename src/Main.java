class Pass {
    private String firstName;
    private String lastName;
    private String patronymic;
    private String faculty;

    public Pass(String firstName, String lastName, String patronymic, String faculty) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.faculty = faculty;
    }

    public String getFullName() {
        return lastName + " " + firstName + " " + patronymic;
    }

    public String getFaculty() {
        return faculty;
    }

    public void displayInfo() {
        System.out.println("ФИО: " + getFullName() + ", Факультет: " + faculty);
    }
}

class TeacherPass extends Pass {
    private String department;

    public TeacherPass(String firstName, String lastName, String patronymic, String faculty, String department) {
        super(firstName, lastName, patronymic, faculty);
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Кафедра: " + department);
    }
}

class StudentPass extends Pass {
    private int yearOfAdmission;

    public StudentPass(String firstName, String lastName, String patronymic, String faculty, int yearOfAdmission) {
        super(firstName, lastName, patronymic, faculty);
        this.yearOfAdmission = yearOfAdmission;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Год поступления: " + yearOfAdmission);
    }

    public int getYearOfAdmission() {
        return yearOfAdmission;
    }
}

