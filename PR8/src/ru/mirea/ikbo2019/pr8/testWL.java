package ru.mirea.ikbo2019.pr8;
public class testWL {
    public static void main(String[] args) {
        BoundedWL<Double> bwl = new BoundedWL<>(5);
        UnfairWL<Integer> uwl = new UnfairWL<>();

        System.out.println("Тестирование класса BoundedWaitList...");
        System.out.println("Текущий размер: " + bwl.getCapacity());
        for(int i = 0; i < 6; i++) {
            double j = 2.3 * i;
            System.out.println("Добавляем элемент №" + (i+1) + " = " + j);
            bwl.add(j);
            System.out.println(bwl);
        }
        System.out.println("\nТекущий размер: " + bwl.getCapacity());
        System.out.println("Тестирование класса BoundedWaitList закончено!\n\n");

        System.out.println("Тестирование класса UnfairWaitList реализующий интерфейс IWaitList...");
        for(int i = 0; i < 10; i++) {
            System.out.println("Добавляем элемент " + i);
            uwl.add(i);
            System.out.println(uwl);
        }

        System.out.println("\nУдаляем элемент = 5 и 11");
        uwl.remove(5);
        uwl.remove(11);
        System.out.println(uwl);

        System.out.println("\nПроверим содержит ли объект число 6");
        if (uwl.contains(6))
            System.out.println("Объект содержит число 6!");
        else
            System.out.println("Объект не содержит число 6!");

        if (uwl.isEmpty())
            System.out.println("\nОбъект пуст!");
        else
            System.out.println("\nОбъект не пуст!");

        System.out.println("\n" + uwl);
        System.out.println("Переместим число 6 в конец.");
        uwl.moveToBack(6);
        System.out.println(uwl);

        System.out.println("Тестирование класса UnfairWaitList закончено!");
    }
}