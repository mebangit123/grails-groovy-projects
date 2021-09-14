package com.bridgelabz

class Payment {
    Integer amount
    String firstname
    static constraints = {
        amount min: 1000
        firstname size: 4..40
    }
    static mapping = {
        table "paymentdetails"
    }
}
