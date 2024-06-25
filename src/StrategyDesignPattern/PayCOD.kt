package StrategyDesignPattern

class PayCOD : StrategyInterface {
    override fun pay(amount: Int) {
        println("Made payment using COD of $amount")
    }
}