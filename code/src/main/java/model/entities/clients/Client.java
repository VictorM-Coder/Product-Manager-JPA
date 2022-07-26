package model.entities.clients;

import model.entities.Entity;

public class Client extends Entity {
    private String name;
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
