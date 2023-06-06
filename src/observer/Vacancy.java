package observer;

import java.util.ArrayList;
import java.util.Random;

public enum Vacancy {
    ARCHITECT("Архитектор"), MASTER("Мастер"), STUDENT("Студент");
    private static final Random random = new Random();
    private String ob;
    Vacancy(String ob){
        this.ob = ob;
    }
    public static Vacancy randomVacancy(){
        Vacancy[] vacancy = values();
        return vacancy[random.nextInt(vacancy.length)]
    }
}
