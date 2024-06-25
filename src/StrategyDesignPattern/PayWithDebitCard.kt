package StrategyDesignPattern

class PayWithDebitCard(private val cardNumber: String):StrategyInterface {

    override fun pay(amount: Int) {
        println("Made payment using Debit card of card number : $cardNumber for amount: $amount")
    }
}