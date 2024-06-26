package ru.netology.ProdManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShopRepositoryTest {
    @Test
    public void addElement() {
        ShopRepository repo = new ShopRepository();
        Product item1 = new Product(1, "Телефон", 20_000);
        Product item2 = new Product(2, "Книга", 500);
        Product item3 = new Product(3, "Плвншет", 80_000);


        repo.add(item1);
        repo.add(item2);
        repo.add(item3);


        Product[] expected = {item1, item2, item3};
        Product[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void Test() {
        ShopRepository repo = new ShopRepository();
        Product item1 = new Product(1, "Телефон", 20_000);
        Product item2 = new Product(2, "Книга", 500);
        Product item3 = new Product(3, "Плвншет", 80_000);
        Product item4 = new Product(4, "Защитное стекло", 1000);
        Product item5 = new Product(4, "Чехол", 1000);

        repo.add(item1);
        repo.add(item2);
        repo.add(item3);
        repo.add(item4);
        try {
            repo.add(item5);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Assertions.assertThrows(AlreadyExistsException.class, () -> {
            repo.add(item5);
        });

    }
}
