package org.example.aula18_16Out.aula18_atividadeSingleton16Out;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContadorVisitas {
    private static int total = 0;
    private static ContadorVisitas instance;

    private ContadorVisitas() {}

    public static ContadorVisitas getInstancia(){
        if(instance == null){
            instance = new ContadorVisitas();
        }
        return instance;
    }

    public void registrarVisita(){
        total++;
    }

    public int getTotal(){
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
