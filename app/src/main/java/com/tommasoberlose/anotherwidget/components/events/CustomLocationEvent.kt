package com.tommasoberlose.anotherwidget.components.events

import android.location.Address

/**
 * Created by tommaso on 14/10/17.
 */

class CustomLocationEvent(addresses: ArrayList<Address>) {
    var addresses: ArrayList<Address> = ArrayList()
    init {
        this.addresses = addresses
    }
}