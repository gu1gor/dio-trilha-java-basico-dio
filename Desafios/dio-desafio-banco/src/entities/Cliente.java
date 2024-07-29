package entities;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor

public class Cliente {

    private String nome;

    @Override
    public String toString() {
        return "Cliente " +
                "nome = " + getNome();
    }
}
