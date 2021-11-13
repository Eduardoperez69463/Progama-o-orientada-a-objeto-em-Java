package aula05;

public class Aula05 {

 
    public static void main(String[] args) {
        Conta contaCorrente = new Conta("João","cc");
         contaCorrente.abrirConta();
         contaCorrente.mostrarTudo();
         contaCorrente.depositar(500);
         contaCorrente.mostrarTudo();
         contaCorrente.sacar(200);
         contaCorrente.mostrarTudo();
         contaCorrente.sacar(350);
         contaCorrente.mostrarTudo();
         contaCorrente.fecharConta();
         contaCorrente.mensalidade();
         
         Conta contaPoupanca = new Conta("Lucia","cp");
         contaPoupanca.abrirConta();
         contaPoupanca.mostrarTudo();
         contaPoupanca.depositar(500);
         contaPoupanca.mostrarTudo();
         contaPoupanca.sacar(200);
         contaPoupanca.mostrarTudo();
         contaPoupanca.mensalidade();
         contaPoupanca.mostrarTudo();
         
         
         
    }
   
    
    
}
