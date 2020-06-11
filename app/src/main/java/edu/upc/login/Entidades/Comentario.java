package edu.upc.login.Entidades;

public class Comentario {

    public String comentario;

    public Comentario(){}

    public Comentario(String comentario){
        this();
        this.comentario=comentario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "Comentario{" +
                "comentario='" + comentario + '\'' +
                '}';
    }
}
