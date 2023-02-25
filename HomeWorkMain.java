public class HomeWorkMain {
    public static void main(String[] args) {
        // Fruit <- Orange, Apple <- GoldenApple
        // Нужно реализовать хранение фруктов в коробке Box;
        // По - умолчанию коробка пустая. Можно класть фрукты какого-то видаж
        // Нужно уметь получать суммаррный вес всех фруктов в коробке;
        // нужно уметь пересыпать все фрукты из одной коробки в другую;

        Box<Apple> appleBox = new Box<>();
        appleBox.add(new Apple(3.0));
        appleBox.add(new Apple(2.0));
        appleBox.add(new GoldenApple(1.0));
        // appleBox.add(new Orange(2.0));

        System.out.println(appleBox.getWeight());

        // Box<GoldenApple> goldenAppleBox = new Box<>();
        // goldenAppleBox.add(new GoldenApple(2.0));
        // goldenAppleBox.add(new Apple(2.0));

    }
}
