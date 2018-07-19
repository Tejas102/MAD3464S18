//
//  main.swift
//  Shopping
//
//  Created by Tejas Jadhav on 19/07/18.
//  Copyright © 2018 Tejas Jadhav. All rights reserved.
//

import Foundation

print("Hello, World!")

var tejas = Customer()
print(tejas.displayData())

var Cat = Customer(customerID: 101, customerName: "Cat", address: "Richmond", email: "cat@gmail.com", creditCardInfo: "4520-1234-1234-3456", shippingInfo: "Buy food")
print("\(Cat.displayData())")

tejas.CustomerID = 102
tejas.CustomerName = "Tejas"
tejas.Address = "Oshawa"
tejas.Email = "Tejas@mail.com"
tejas.CreditCardInfo = "4520-1234-1234-3456"
tejas.ShippingInfo = "Dont deliver after 9pm"
print(tejas.displayData())

var navdeep = Customer()
navdeep.registerUser()
print(navdeep.displayData())


