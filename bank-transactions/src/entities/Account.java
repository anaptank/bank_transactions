package entities;

public class Account {
		// propriedades: 
		private int number;
		private String holder;
		private double balance;
		
		/* SOBRECARGA = � um recurso que uma classe possui de oferecer mais de um 
		 * opera��o com o mesmo nome, por�m com diferentes listas de
		 * par�metros.
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
		
		// N�o ser� criado o m�todo SET do saldo, pois ele s� pode variar por saque ou dep�sito

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
