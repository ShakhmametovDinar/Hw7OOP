package observer;

public class Master implements Observer {

    private String name;
    private double salary;
    private Vacancy vacancy;

    public Master(String name) {
        this.name = name;
        salary = 80000;
        this.vacancy = Vacancy.MASTER;
    }

    @Override
    public void receiveOffer(String nameCompany, double salary) {
        if (this.salary < salary){
            System.out.printf("Специалист %s >>> Мне нужна эта работа! [%s - %f]\n",
                    name, nameCompany, salary);
            this.salary = salary;
        }
        else{
            System.out.printf("Специалист %s >>> Я найду работу получше! [%s - %f]\n",
                    name, nameCompany, salary);
        }
    }

    @Override
    public void receiveOfferVacancy(Vacancy_ vacancy){
        if (this.salary < vacancy.getSalary()){
            System.out.printf("Архитектор %s >>> Мне нужна эта вакансия! [%s - %f]\n",
                    name, vacancy, salary);
            this.salary = vacancy.getSalary();
        }
        else{
            System.out.printf("Архитектор %s >>> Я найду работу получше! [%s - %f]\n",
                    name, vacancy, salary);
        }
    }
}

