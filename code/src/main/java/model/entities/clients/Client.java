package model.entities.clients;

import model.entities.Entity;

import javax.persistence.*;

@javax.persistence.Entity
@Table(name = "clients")
public class Client extends Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = true, unique = true)
    private String cpf;

   public Client(){

   }

   public Client(String name, String cpf){
      this.setCpf(cpf);
      this.setName(name);
   }

   private boolean validateCPF(String cpf){
       // TODO implementar função de validação com REGEX
       return true;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
       if (name != null && name.length() != 0){
           this.name = name;
       }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (validateCPF(cpf)){
            this.cpf = cpf;
        }
    }
}
