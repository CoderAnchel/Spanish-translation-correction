package com.tommasoberlose.anotherwidget.components

/**
 * Created by tommaso on 08/10/17.
 */
class CalendarSelector(id: Int, name: String?, account_name: String?) {
    var id: Int = 0
    var name: String = ""
    var account_name: String = ""

    init {
        this.id = id
        this.name = name?: ""
        this.account_name = account_name?: ""
    }
}