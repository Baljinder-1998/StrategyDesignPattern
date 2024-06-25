package StrategyDesignPattern

class PayWithCreditCard(private val cardNumber: String) : StrategyInterface {
    override fun pay(amount: Int) {
        println("Made payment using Credit card of card number : $cardNumber for amount: $amount")
    }
}