public class SistemaBanco {
    public static void main(String[] args) {
        boolean consegui;
        Conta minhaConta;
        minhaConta = new Conta();
        minhaConta.dono = "Maria";
        minhaConta.deposita(500.0);
        System.out.println("Saldo atual: " + minhaConta.saldo);
        consegui = minhaConta.saca(200.0);
        if (consegui == true) {
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
        System.out.println("Saldo atual: " + minhaConta.saldo);
    }
}
