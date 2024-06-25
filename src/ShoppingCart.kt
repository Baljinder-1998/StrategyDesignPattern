import StrategyDesignPattern.StrategyInterface

class ShoppingCart {
    private val cartItem = mutableListOf<Int>()
    private lateinit var strategyInterface: StrategyInterface

    fun addToCart(price: Int) {
        cartItem.add(price)
    }


    fun paymentStrategy(strategyInterface: StrategyInterface) {
        this.strategyInterface = strategyInterface
    }

    fun checkout(){
        val totalAmount= cartItem.sum()
        strategyInterface.pay(totalAmount)
    }
}