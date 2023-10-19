package ru.job4j.tracker;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import static org.assertj.core.api.Assertions.*;

class SqlTrackerTest {
    private static Connection connection;

    @BeforeAll
    public static void initConnection() {
        try (InputStream in = SqlTracker.class.getClassLoader().getResourceAsStream("db/liquibase_test.properties")) {
            Properties config = new Properties();
            config.load(in);
            Class.forName(config.getProperty("driver-class-name"));
            connection = DriverManager.getConnection(
                    config.getProperty("url"),
                    config.getProperty("username"),
                    config.getProperty("password")

            );
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @AfterAll
    public static void closeConnection() throws SQLException {
        connection.close();
    }

    @AfterEach
    public void wipeTable() throws SQLException {
        try (PreparedStatement statement = connection.prepareStatement("delete from items")) {
            statement.execute();
        }
    }

    @Test
    public void whenSaveItemAndFindByGeneratedIdThenMustBeTheSame() {
        SqlTracker tracker = new SqlTracker(connection);
        Item item = new Item("item");
        tracker.add(item);
        assertThat(tracker.findById(item.getId())).isEqualTo(item);
    }

    @Test
    public void whenSaveItemAndFindByNameThenMustBeTheSame() {
        SqlTracker tracker = new SqlTracker(connection);
        Item item = new Item("item");
        Item item1 = new Item("item1");
        tracker.add(item);
        tracker.add(item1);
        List<Item> expected = List.of(item1);
        assertThat(tracker.findByName("item1")).isEqualTo(expected);
    }

    @Test
    public void whenSaveItemsAndFindAllThenMustBeTheSame() {
        SqlTracker tracker = new SqlTracker(connection);
        Item item1 = new Item("item1");
        Item item2 = new Item("item2");
        Item item3 = new Item("item3");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        List<Item> items = List.of(item1, item2, item3);
        assertThat(tracker.findAll()).isEqualTo(items);
    }

    @Test
    public void whenReplaceItemAndFindByGeneratedIdThenMustBeReplaced() {
        SqlTracker tracker = new SqlTracker(connection);
        Item item = new Item("item");
        Item item1 = new Item("item1");
        tracker.add(item);
        tracker.replace(item.getId(), item1);
        assertThat(tracker.findById(item.getId()).getName()).isEqualTo(item1.getName());
    }

    @Test
    public void whenReplaceItemThenMustBeTrue() {
        SqlTracker tracker = new SqlTracker(connection);
        Item item = new Item("item");
        Item item1 = new Item("item1");
        tracker.add(item);
        assertThat(tracker.replace(item.getId(), item1)).isTrue();
    }

    @Test
    public void whenDeleteItemThenMustBeTrue() {
        SqlTracker tracker = new SqlTracker(connection);
        Item item = new Item("item");
        tracker.add(item);
        assertThat(tracker.delete(item.getId())).isTrue();
    }
}