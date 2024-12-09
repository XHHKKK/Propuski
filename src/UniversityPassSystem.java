public class UniversityPassSystem {
    public static void main(String[] args) {
        Pass[] register = new Pass[5];
        register[0] = new TeacherPass("Роман", "Романюк", "Иванович", "Физика", "Механика");
        register[1] = new TeacherPass("Петр", "Гоноров", "Петрович", "Математика", "Алгебра");
        register[2] = new StudentPass("Сергей", "Соловьев", "Сергеевич", "Физика", 2020);
        register[3] = new StudentPass("Алексей", "Армянов", "Алексеевич", "Математика", 2019);
        register[4] = new StudentPass("Мария", "Марьясова", "Фёдоровна", "Физика", 2021);

        // Вывод информации о всех пропусках
        System.out.println("Информация о всех пропусках:");
        for (Pass pass : register) {
            pass.displayInfo();
            System.out.println("---------------------------------");
        }

        // Вывод информации о пропусках студентов
        System.out.println("Информация о пропусках студентов:");
        int numberOfCancelledPasses = 0;
        for (Pass pass : register) {
            if (pass instanceof StudentPass) {
                pass.displayInfo();
                // Проверка, нужно ли аннулировать пропуск согласно текущему году (2023)
                int yearOfAdmission = ((StudentPass) pass).getYearOfAdmission();
                if (2023 - yearOfAdmission >= 4) { // После 4 лет пропуска аннулируются
                    numberOfCancelledPasses++;
                }
                System.out.println("---------------------------------");
            }
        }

        // Вывод информации о количестве аннулируемых пропусков
        System.out.println("Количество аннулируемых пропусков: " + numberOfCancelledPasses);
    }
}