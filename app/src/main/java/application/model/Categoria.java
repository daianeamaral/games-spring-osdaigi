package application.model;

import java.lang.annotation.Inherited;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "categorias")
public class Categorias {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Colum(unique = true, nullable = false)
    private String nome;

    @OneToMany(mappedBy = "categoria")
    private Set<Jogo> jogos = nem HashSet<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        
    }
}