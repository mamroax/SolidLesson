//DIP
class LightBulb implements Switchable{
    private boolean status;
    public void turnOn() {
        // Включение лампочки
        status = true;
        System.out.println("Лампочка включена");
    }

    public void turnOff() {
        // Выключение лампочки
        status = false;
        System.out.println("Лампочка выключена");
    }
}

class Switch{
    LightBulb bulb = new LightBulb();
//    LightBulb bulb1 = new LightBulb();
//    LightBulb bulb2 = new LightBulb();
//    public Switch() {
//        this.bulb = new LightBulb();
//    }

    public void operate() {
        // Работа с выключателем
        bulb.turnOn();
//        bulb1.turnOff();
//        bulb2.turnOff();
    }

    public void switchAllOn(){
        bulb.turnOn();
//        bulb1.turnOff();
//        bulb2.turnOff();
    }
}
interface Switchable {
//    private LightBulb bulb;

    public void turnOn();
    public void turnOff();

}

