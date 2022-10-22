package main;

import dao.PokemonDaoImpl;
import domain.Pokemon;

public class main {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon(1, "Pikachu",6, 'M', 1,
                "Electrico", "choques de electricidad estática" );
        Pokemon bulbasaur = new Pokemon(2, "Bulbasaur",6.9, 'M', 1,
                "Planta", "Látigo cepa");
        Pokemon charmander = new Pokemon(3, "Charmander",8.5, 'M', 1,
                "Fuego", "arañazo");
        Pokemon squirtle = new Pokemon(4, "Squirtle",9, 'M', 1,
                "Agua", "pistola agua");

        PokemonDaoImpl pokemonDao = new PokemonDaoImpl();
        pokemonDao.arañazo(charmander);
    }
}
