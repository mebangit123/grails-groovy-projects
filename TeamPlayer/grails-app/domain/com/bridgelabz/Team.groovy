package com.bridgelabz

import java.time.LocalDate

class Team {
    String name
    String city
    String logo
    String manager
//    LocalDate date

    static hasMany = [player: Player]

    static constraints = {
        name size: 4..40, blank: false, unique: true
        city size: 4..40,blank: false
        logo size: 4..40,blank: false
        manager size: 4..40,blank: false
    }

    @Override
    String toString() {
        return name
    }
}
