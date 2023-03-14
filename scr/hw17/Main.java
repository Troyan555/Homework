package hw17;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
public class Main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList( // 4.1
                new Product("Food", 123, true,
                        LocalDateTime.of(2023, Month.JANUARY, 25, 0, 0, 0)),
                new Product("Book", 34, true,
                        LocalDateTime.of(2023, Month.JANUARY, 23, 0, 0, 0)),
                new Product("Household Items", 3456, false,
                        LocalDateTime.of(2023, Month.JANUARY, 27, 0, 0, 0)),
                new Product("Food", 36, false,
                        LocalDateTime.of(2023, Month.FEBRUARY, 10, 0, 0, 0)),
                new Product("Book", 45, true,
                        LocalDateTime.of(2023, Month.FEBRUARY, 14, 0, 0, 0)),
                new Product("Food", 567, true,
                        LocalDateTime.of(2023, Month.FEBRUARY, 12, 0, 0, 0)),
                new Product("Book", 678, false,
                        LocalDateTime.of(2023, Month.JANUARY, 29, 0, 0, 0)));

       // Stream<Product> stream = collection.stream();
        Stream<Product> stream = products.stream();

       /* try {
            Product result = stream.filter(p -> p.getType().equals("Book"))
                    .min(Comparator.comparing(Product::getPrice))
                    .orElseThrow(() -> new Exception("Продукт [категорія: Book] не знайдено"));

            System.out.println("Min price product: ");
            result.print();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        */

      //  stream.filter(p -> p.getType().equals("Book") && p.hasDiscount())
           //     .forEach(p -> p.setPrice(p.getPrice() * 0.9));

      /*  List<Product> sortedList = stream
                .sorted(Comparator.comparing(Product::getDate))
                .skip(products.stream().count() - 3)
                .toList();

        for (Product p : sortedList) {
            p.print();
        }

       */

       // List<Product> result = products.stream().toList();
      /*  List<Product> result = stream.filter(p -> p.getType().equals("Book") && p.getPrice() > 250)
                .toList();

        for (Product p : result) {
            p.print();
        }

       */

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime yearAgo = LocalDateTime.now().minusYears(1);

        double sum = stream.filter(o -> o.getType().equals("Book") &&
                o.getPrice() <= 75 &&
                o.getDate().isAfter(yearAgo) && o.getDate().isBefore(now)).
                mapToDouble(o -> o.getPrice()).sum();

        System.out.println("Total cost: " + sum + " UAH");

    }
}