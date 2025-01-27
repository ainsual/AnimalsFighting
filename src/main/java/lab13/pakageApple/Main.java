package lab13.pakageApple;

public class Main {

    public static void main(String[] args) {
        // Создаем экземпляр двусвязного списка
        List2Direction list2 = new List2Direction();

        // Добавляем яблоки в список
        list2.add(new Apple("Зеленый", 60, "Грени", 100));
        list2.add(new Apple("Желтый", 80, "Голден", 130));
        list2.add(new Apple("Алый", 75, "Гала", 150));
        list2.add(new Apple("Сливовый", 70, "Спартан", 90));
        list2.add(new Apple("Красно-белый", 65, "Башкирская красавица", 110));

        // Печатаем список
        System.out.println("Список яблок:");
        list2.print();

        // Добавляем новое яблоко по позиции
        list2.add(3, new Apple("Зеленый", 64, "Семеринская", 125));
        System.out.println("\nПосле добавления яблока на 3 позицию:");
        list2.print();

        // Сортируем список
        list2.sort();
        System.out.println("\nПосле сортировки:");
        list2.print();

        // Удаляем яблоко по позиции
        Apple removedApple = list2.remove(2);
        System.out.println("\nУдалено яблоко: " + removedApple);
        System.out.println("После удаления второго яблока:");
        list2.print();

        // Печатаем список в обратном порядке
        System.out.println("\nСписок в обратном порядке:");
        list2.printReverse();

        // Удаляем последнее яблоко и показываем оставшиеся
        Apple poppedApple = list2.pop();
        System.out.println("\nУдалено последнее яблоко: " + poppedApple);
        System.out.println("После удаления последнего яблока:");
        list2.print();
    }
}
