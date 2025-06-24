public class Conta {
    private Integer Numero_Conta;
    private String Agencia, Nome_Cliente;
    private Double Saldo = 0.00;

    public Conta(Integer numeroConta, String agencia, String nomeCliente){
        Numero_Conta = numeroConta;
        Agencia = agencia;
        Nome_Cliente = nomeCliente;
    }

    public String getConta(){
        return String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d", 
        Nome_Cliente, Agencia, Numero_Conta, Saldo);
    }

    public String getSaldo(){
        return String.format("Seu saldo atual R$%.2f", Saldo);
    }

    public void Depositar(Double quantDeposito){
        Saldo += quantDeposito;
    }
}
