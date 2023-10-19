package ru.job4j.tracker;

/**
 * @author sveet
 * @date 10.03.2023
 */
public class DeleteAction implements UserAction {
    private final Output out;

    public DeleteAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete the Item";
    }

    @Override
    public boolean execute(Input input, Store store) {
        out.println("=== Delete item ===");
        int id = input.askInt("Enter id: ");
        store.delete(id);
        if (store.findById(id) == null || store.findById(id).equals(new Item())) {
            out.println("Заявка удалена успешно.");
        } else {
            out.println("Ошибка удаления заявки.");
        }
        return true;
    }
}
