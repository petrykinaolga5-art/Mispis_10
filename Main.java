import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Main {

    public static void main(String[] argv) {
        System.out.println("=== Университетская информационная система ===\n");

        // Создание института
        Institute institute = new Institute("Институт информационных технологий", "Москва, ул. Ленина, 1");
        System.out.println("Институт создан: " + institute.getName());

        // Создание факультета
        AdministrativeEmployee dean = new AdministrativeEmployee();
        dean.setName("Иванов Иван Иванович");
        dean.setEmail("dean@university.ru");
        dean.setSsNo(12345);

        Faculty faculty = new Faculty(dean, "Факультет компьютерных наук");
        System.out.println("Факультет создан: " + faculty.getName() + ", декан: " + faculty.getDean().getName());

        // Создание сотрудников
        ResearchAssociate researcher = new ResearchAssociate();
        researcher.setName("Петров Петр Петрович");
        researcher.setEmail("researcher@university.ru");
        researcher.setSsNo(23456);
        researcher.setFieldOfStudy("Машинное обучение");
        System.out.println("\nИсследователь создан: " + researcher.getName() + ", область: " + researcher.getFieldOfStudy());

        Lecturer lecturer = new Lecturer();
        lecturer.setName("Сидоров Сидор Сидорович");
        lecturer.setEmail("lecturer@university.ru");
        lecturer.setSsNo(34567);
        lecturer.setFieldOfStudy("Программирование");
        System.out.println("Лектор создан: " + lecturer.getName());

        // Создание курса
        Collection<Lecturer> lecturers = new ArrayList<>();
        lecturers.add(lecturer);
        Course course = new Course(lecturers, "Объектно-ориентированное программирование", 101, 72.0f);
        System.out.println("\nКурс создан: " + course.getName() + " (ID: " + course.getId() + ", часов: " + course.getHours() + ")");

        // Создание проекта
        Date startDate = new Date();
        Date endDate = new Date(System.currentTimeMillis() + 365L * 24 * 60 * 60 * 1000); // через год
        Project project = new Project("Исследование нейронных сетей", startDate, endDate);
        System.out.println("Проект создан: " + project.getName());

        // Создание участия в проекте
        Participation participation = new Participation(researcher, project, 40);
        researcher.addParticipation(participation);
        project.addParticipation(participation);
        System.out.println("\nУчастие в проекте создано: " + researcher.getName() + " участвует в проекте " + 
                          project.getName() + " (" + participation.getHours() + " часов)");

        // Демонстрация работы методов
        System.out.println("\n=== Демонстрация функциональности ===");
        lecturer.readLecture();
        System.out.println("Лектор провел лекцию");
        
        faculty.holdEvent();
        System.out.println("Факультет провел мероприятие");
        
        institute.showRating();
        System.out.println("Рейтинг института: " + institute.showRating());

        System.out.println("\n=== Система успешно работает ===");
    }
}
