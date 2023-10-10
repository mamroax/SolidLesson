//LSP
class Bird implements CanFly{
    public void fly() {
        // Реализация полета птицы
        System.out.println("Птица летает");
    }
}

class Woodpecker extends Bird implements CanFly{
    @Override
    public void fly() {
        System.out.println("Дятел умеет летать");
    }
}

class Ostrich extends Bird implements Runnable{

    @Override
    public void run() {
        System.out.println();
    }
}