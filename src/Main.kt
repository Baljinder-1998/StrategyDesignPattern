import StrategyDesignPattern.PayWithCreditCard
import StrategyDesignPattern.PayWithDebitCard

fun main(args: Array<String>) {

    val shoppingCart = ShoppingCart()
    shoppingCart.addToCart(100)
    shoppingCart.addToCart(200)
    shoppingCart.addToCart(300)

    shoppingCart.paymentStrategy(PayWithDebitCard("1234567890"))
    shoppingCart.checkout()

    shoppingCart.paymentStrategy(PayWithCreditCard("1234567890"))
    shoppingCart.checkout()

}