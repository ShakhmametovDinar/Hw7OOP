package observer;

public class Vacancy_ {
    private Vacancy vacancy;
    private String company;
    private double salary;

    public Vacancy_(Vacancy vacancy, String company, double salary){
        this.vacancy = vacancy;
        this.company = company;
        this. salary = salary;
    }

    public Vacancy getVacancy() {
        return vacancy;
    }

    public String getCompany() {
        return company;
    }

    public double getSalary() {
        return salary;
    }
}
