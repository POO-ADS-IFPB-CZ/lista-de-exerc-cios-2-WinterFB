public class ContaCorrente {
    private int numero;
    private String titular;
    private float saldo;

    public ContaCorrente(int numero, String titular, float saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public boolean sacar(float valor) {
        if(valor > saldo) return false;
        if(saldo == 0) return false;
        if(valor > 10000){
            saldo -= 10000;
            System.out.println("Dos " + valor + " foram sacados apenas 10.000\n");
        }
        else {
            saldo -= valor;
        }
        return true;
    }

    public boolean depositar(float valor){
        if(valor > 10000) return false;
        if(valor < 0) return false;
        saldo += valor;
        return true;
    }

    public float consultarSaldo() {
        return saldo;
    }
}
