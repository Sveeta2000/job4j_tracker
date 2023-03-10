package ru.job4j.tracker;

/**
 * @author sveet
 * @date 10.03.2023
 */
public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "Find the Item by ID";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find item by id ===");
        int id = input.askInt("Enter id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Заявка с введенным id: " + id + " не найдена.");
        }
        return true;
    }
}
