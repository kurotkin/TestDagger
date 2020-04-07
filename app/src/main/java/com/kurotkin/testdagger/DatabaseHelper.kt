package com.kurotkin.testdagger

import javax.inject.Inject

class DatabaseHelper(var nameText: String) {
    fun getString() = nameText
}