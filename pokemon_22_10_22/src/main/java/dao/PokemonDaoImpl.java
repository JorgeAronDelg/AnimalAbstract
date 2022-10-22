package dao;

import domain.Pokemon;

public class PokemonDaoImpl implements PokemonDao{
    @Override
    public void placaje(Pokemon pokemon) {
        System.out.println("Ejecutando placaje");
    }

    @Override
    public void arañazo(Pokemon pokemon) {
        System.out.println(pokemon);
        System.out.println("Ejecutando arañazo");
    }

    @Override
    public void mordisco(Pokemon pokemon) {
        System.out.println("Ejecutando mordisco");
    }
}
