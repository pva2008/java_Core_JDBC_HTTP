package Patterns.strategy;

public class MiniDuckSimulator {

    public static void main(String[] args) {
//        Duck mallard = new MallardDuck();
//        mallard.performQuack();
//        mallard.performFly();
//
//        Duck model = new ModelDuck();
//        model.performFly();  //begins as a nofly duck
//        model.setFlyBehavior(new FlyRocketPowered());
//        model.performFly();

        Duck cuberDuck = new CuberDuck();
        cuberDuck.performFly();
        cuberDuck.performQuack();

    }

}
