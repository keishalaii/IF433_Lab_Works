package oop_00000128606_keishaarialai.week08

class OrderModels {
    class City(val name: String)
    class Address(val city: City?)
    class DeliveryDetails(val address: Address?)
    class Order(val deliveryDetails: DeliveryDetails?, val totalPrice: Int?)
}