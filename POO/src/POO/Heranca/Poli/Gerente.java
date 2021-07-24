package POO.Heranca.Poli;

public class Gerente extends Funcionario {


    @Override
    public Double salario(Double salario) {
        return super.salario(salario.doubleValue()) - (salario * 0.1);
    }
}
