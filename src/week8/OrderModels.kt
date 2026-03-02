package week8

class OrderModels {

    class City(val name: String)
    class address(val city: City?)
    class DeliveryDetails(val address: address?)
    class Order(val deliveryDetails: DeliveryDetails?, val totalPrice: Double?)

}