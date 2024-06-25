package StrategyDesignPattern

class PayUsingUPI : StrategyInterface {
    override fun pay(amount: Int) {
        println("Made payment using UPI of $amount")
    }
}