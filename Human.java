public class Human {
    int yearOfBirth;
    String name;
    String town;
    String job;

    Human(int yearOfBirth, String name, String town, String job) {
        if (name == null) {
            this.name = "информация не указана";
        } else {
            this.name = name;
        }
        if (town == null) {
            this.town = "информация не указана";
        } else {
            this.town = town;
        }
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
        if (job == null) {
            this.job = "информация не указана";
        } else {
            this.job = job;
        }
    }

    void greetings() {
        System.out.println(" Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился/лась в " + yearOfBirth + " году. Я работаю на должности " +  job + " . Будем знакомы! ");

    }

}
