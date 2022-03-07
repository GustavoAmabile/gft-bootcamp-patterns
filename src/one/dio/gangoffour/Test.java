package one.dio.gangoffour;

import one.dio.gangoffour.facade.Facade;
import one.dio.gangoffour.singleton.EagerSingleton;
import one.dio.gangoffour.singleton.LazyHolderSingleton;
import one.dio.gangoffour.singleton.LazySingleton;
import one.dio.gangoffour.strategy.AgressiveBehavior;
import one.dio.gangoffour.strategy.DefensiveBehavior;
import one.dio.gangoffour.strategy.NormalBehavior;
import one.dio.gangoffour.strategy.Robot;

public class Test {
    public static void main(String[] args) {

        //Singleton
        LazySingleton lazy = LazySingleton.getInstance();
        System.out.println(lazy);

        lazy = LazySingleton.getInstance();
        System.out.println(lazy);

        EagerSingleton eager = EagerSingleton.getInstance();
        System.out.println(eager);

        eager = EagerSingleton.getInstance();
        System.out.println(eager);

        LazyHolderSingleton lazyHolder =  LazyHolderSingleton.getInstance();
        System.out.println(lazyHolder);

        lazyHolder = LazyHolderSingleton.getInstance();
        System.out.println(lazyHolder);


        //Strategy
        NormalBehavior normalBehavior= new NormalBehavior();
        DefensiveBehavior defensiveBehavior = new DefensiveBehavior();
        AgressiveBehavior agressiveBehavior = new AgressiveBehavior();

        Robot robot = new Robot();
        robot.setBehavior(normalBehavior);
        robot.move();
        robot.move();
        robot.setBehavior(defensiveBehavior);
        robot.move();
        robot.move();
        robot.setBehavior(agressiveBehavior);
        robot.move();
        robot.move();

        //Facade
        Facade facade = new Facade();
        facade.clientTransfer("Gustavo", "30000-000");

    }
}
