package com.bridgelabz

class Player {
    String name
    Integer age
    String profile

    static belongsTo = [team: Team]

    static constraints = {
        name size: 4..40,unique: true,blank: false
        age min: 17,max: 51,blank:false
        profile size: 4..40,blank: false
    }
    @Override
    String toString() {
        return name
    }
}
