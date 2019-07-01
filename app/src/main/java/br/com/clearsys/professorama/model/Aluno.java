package br.com.clearsys.professorama.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Aluno implements Parcelable {

    private int id;
    private String nome;
    private String serie;
    private String perfil;
    private String usuario;
    private String senha;

    public Aluno(){}

    private Aluno(Parcel in) {
        id = in.readInt();
        nome = in.readString();
        serie = in.readString();
        perfil = in.readString();
        usuario = in.readString();
        senha = in.readString();
    }

    public static final Creator<Aluno> CREATOR = new Creator<Aluno>() {
        @Override
        public Aluno createFromParcel(Parcel in) {
            return new Aluno(in);
        }

        @Override
        public Aluno[] newArray(int size) {
            return new Aluno[size];
        }
    };

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSerie(){
        return serie;
    }

    public void setSerie(String serie){
        this.serie = serie;
    }

    public String getPerfil(){
        return perfil;
    }

    public void setPerfil(String perfil){
        this.perfil = perfil;
    }

    public String getUsuario(){
        return usuario;
    }

    public void setUsuario(String usuario){
        this.usuario = usuario;
    }

    public String getSenha(){
        return senha;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    @Override
    public String toString() {
        return " Aluno{" +
                "\n id:" + id +
                "\n nome:" + nome +
                "\n serie:" + serie +
                "\n perfil:" + perfil +
                "\n usuario:" + usuario +
                "\n senha:" + senha +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(nome);
        dest.writeString(serie);
        dest.writeString(perfil);
        dest.writeString(usuario);
        dest.writeString(senha);
    }
}
