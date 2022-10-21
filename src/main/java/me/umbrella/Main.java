package me.umbrella;

import me.umbrella.facade.Facade;
import me.umbrella.singleton.SingletonEager;
import me.umbrella.singleton.SingletonLazy;
import me.umbrella.singleton.SingletonLazyHolder;
import me.umbrella.strategy.*;

public class Main {
    public static void main(String[] args) {

        //SINGLETON
        SingletonLazy singLazy = SingletonLazy.getInstancia();
        System.out.println(singLazy);
        singLazy = SingletonLazy.getInstancia();
        System.out.println(singLazy);
        System.out.println();

        SingletonEager singEager = SingletonEager.getInstancia();
        System.out.println(singEager);
        singEager = SingletonEager.getInstancia();
        System.out.println(singEager);
        System.out.println();

        SingletonLazyHolder singLazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(singLazyHolder);
        singLazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(singLazyHolder);
        System.out.println();

        //STRATEGY
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        System.out.println();

        //FACADE
        Facade facade = new Facade();
        facade.migrarCliente("Andre", "004445-020");

    }
}