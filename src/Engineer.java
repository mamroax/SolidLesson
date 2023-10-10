//ISP
interface Working {
    void work();
}

interface Eating {
    void eat();
}

class Engineer implements Working, Eating {
    public void work() {
        // Реализация работы инженера
        System.out.println("Иженер инженерит");
    }

    public void eat() {
        // Реализация приема пищи
        System.out.println("Инженер кушает");
    }
}