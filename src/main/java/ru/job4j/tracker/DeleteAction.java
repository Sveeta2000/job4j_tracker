package ru.job4j.tracker;

/**
 * @author sveet
 * @date 10.03.2023
 */
public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "Delete the Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Delete item ===");
        int id = input.askInt("Enter id: ");
        if (tracker.delete(id)) {
            System.out.println("Заявка удалена успешно.");
        } else {
            System.out.println("Ошибка удаления заявки.");
        }
        return true;
    }
}
