package entities;

public class Account {
		// propriedades: 
		private int number;
		private String holder;
		private double balance;
		
		/* SOBRECARGA = É um recurso que uma classe possui de oferecer mais de um 
		 * operação com o mesmo nome, porém com diferentes listas de
		 * parâmetros.
		 * Ex disso (criados dois construtores a seguir):
		 */
		public Account(int number, String holder) {
			this.number = number;
			this.holder = holder;
		}
		
		public Account(int number, String holder, double initialDeposit) {
			this.number = number;
			this.holder = holder;
			deposit(initialDeposit);
		}

		public int getNumber() {
			return number;
		}

		public String getHolder() {
			return holder;
		}

		public void setHolder(String holder) {
			this.holder = holder;
		}

		public double getBalance() {
			return balance;
		}
		
		// Não será criado o método SET do saldo, pois ele só pode variar por saque ou depósito

		public void deposit(double amount) {
			balance += amount;
		}
		
		public void withdraw(double amount) {
			balance -= amount + 5.0;
		}
		
		public String toString() {
			return "Account "
					+ number
					+ ", Holder: "
					+ holder
					+ ", Balance: $ "
					+ String.format("%.2f", balance);
		}
}
