package com.hp.design_pattern.acyclic_visitor;

/**
 * @author HP
 * @date 2022/8/15
 * @description
 */
public class App {

    public static void main(String[] args) {
        final var conDos = new ConfigureForDosVisitor();
        final var conUnix = new ConfigureForUnixVisitor();

        final Zoom zoom = new Zoom();
        final Hayes hayes = new Hayes();

        hayes.accept(conDos);
        hayes.accept(conUnix);

        zoom.accept(conDos);
        zoom.accept(conUnix);
    }
}
